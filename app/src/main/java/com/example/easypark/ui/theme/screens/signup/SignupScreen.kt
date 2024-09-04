package com.example.easypark.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.easypark.R
import com.example.easypark.data.AuthViewModel
import com.example.easypark.navigation.ROUT_LOGIN
import com.example.easypark.ui.theme.blue

@Composable
fun SignupScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.blue2), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(10.dp))


        Image(
            painter = painterResource(id = R.drawable.parkingh),
            contentDescription ="home image",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "EASYPARK" ,
            fontSize = 30.sp ,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold
        )


        Card(
            modifier = Modifier
            .fillMaxWidth()
            .height(700.dp),
            shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),){
            Spacer(modifier = Modifier.height(10.dp))

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Do not have an account? CREATE ACCOUNT" ,
                fontSize = 17.sp ,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            var name by remember { mutableStateOf("") }
            var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            var confpassword  by remember { mutableStateOf("") }

            OutlinedTextField(value = name,
                onValueChange = {name = it } ,
                label = { Text("Fullname")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person")} ,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(value = email,
                onValueChange = {email = it } ,
                label = { Text("Email Address")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Person")} ,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(value = password,
                onValueChange = {password = it } ,
                label = { Text("Password")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Person")} ,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)


            )
            Spacer(modifier = Modifier.height(10.dp))


            OutlinedTextField(value = confpassword,
                onValueChange = {confpassword =it} ,
                label = { Text("Confirm Password")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Person")} ,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)


            )
            Spacer(modifier = Modifier.height(10.dp))


            val context = LocalContext.current
            val authViewModel = AuthViewModel(navController, context)

            Button(onClick = {
                authViewModel.signup(name, email, password,confpassword)
                             },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(blue),
                shape = RoundedCornerShape(10.dp)
            )
            { Text(text = "CREATE AN ACCOUNT") }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = { navController.navigate(ROUT_LOGIN) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(blue),
                shape = RoundedCornerShape(10.dp)
            )
            { Text(text = "LOGIN") }



        }







    }




}







@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())

}
