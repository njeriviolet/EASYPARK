package com.example.easypark.data


import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController
import com.example.easypark.models.Book
import com.example.easypark.navigation.ROUT_HOME
import com.example.easypark.navigation.ROUT_LOGIN
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class BookViewModel(var navController: NavController, var context: Context) {
    var authViewModel:AuthViewModel
    var progress: ProgressDialog
    init {
        authViewModel = AuthViewModel(navController, context)
        if (!authViewModel.isLoggedIn()){
            navController.navigate(ROUT_LOGIN)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun addBooking(name:String, email:String, space:String, filePath: Uri){
        val accountId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("Books/$accountId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var account = Book(name,space,email,imageUrl,accountId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("Books/$accountId")
                    databaseRef.setValue(account).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this.context, "Successfully booked a space", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }else{
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun ViewBookings(account: MutableState<Book>, accounts: SnapshotStateList<Book>):SnapshotStateList<Book>{
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Books")
        ref.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                accounts.clear()
                for (snap in snapshot.children){
                    var retrievedAccount = snap.getValue(Book::class.java)
                    account.value = retrievedAccount!!
                    accounts.add(retrievedAccount)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return accounts
    }

    fun updateBooking(accountId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Book/$accountId")
        ref.removeValue()
        navController.navigate(ROUT_HOME)
    }


    fun deleteBooking(accountId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Books/$accountId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}