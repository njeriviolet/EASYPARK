package com.example.easypark.data


import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController
import com.example.easypark.models.Space
import com.example.easypark.navigation.ROUT_HOME
import com.example.easypark.navigation.ROUT_LOGIN
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class SpaceViewModel(var navController: NavController, var context: Context) {
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

    fun uploadSpace(name:String,no:String, price:String, phone: String,filePath: Uri){
        val spaceId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("Spaces/$spaceId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var space = Space(name,no,price,phone,imageUrl,spaceId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("Spaces/$spaceId")
                    databaseRef.setValue(space).addOnCompleteListener {
                        if (it.isSuccessful){

                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
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

    fun allSpaces(
        space: MutableState<Space>,
        spaces: SnapshotStateList<Space>):SnapshotStateList<Space>{
        progress.show()
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Spaces")
        ref.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                spaces.clear()
                for (snap in snapshot.children){
                    var retrievedSpace = snap.getValue(Space::class.java)
                    space.value = retrievedSpace!!
                    spaces.add(retrievedSpace)
                }
                progress.dismiss()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return spaces
    }

    fun updateSpace(spaceId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Spaces/$spaceId")
        ref.removeValue()
        navController.navigate(ROUT_HOME)
    }


    fun deleteSpace(spaceId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Spaces/$spaceId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }

}