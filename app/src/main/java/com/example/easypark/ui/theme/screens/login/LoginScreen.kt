package com.example.easypark.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.easypark.R
import com.example.easypark.navigation.ROUT_HOME
import com.example.easypark.navigation.ROUT_SIGNUP


@Composable
fun LoginScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.background), contentScale = ContentScale.FillBounds),
                horizontalAlignment = Alignment . CenterHorizontally,

        )
    {

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.home),
            contentDescription ="home image",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "WELCOME BACK" ,
            fontSize = 40.sp ,
            fontFamily = FontFamily.SansSerif ,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Already have an account.please enter your credentials." ,
            fontSize = 17.sp ,
            fontFamily = FontFamily.SansSerif ,
            color = Color.Black,
            textAlign = TextAlign.Center
        )


        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(value = email,
            onValueChange = {email= it } ,
            label = { Text("emailaddress")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Person",tint = Color.Cyan) } ,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = password,
            onValueChange = {password = it } ,
            label = { Text("password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Person",tint = Color.Cyan)} ,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)


        )


        Spacer(modifier = Modifier.height(10.dp))



        Button(onClick = {navController.navigate(ROUT_HOME)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp)
        )
        { Text(text = "LOGIN") }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Do not have an account? Sign up." ,
            fontSize = 17.sp ,
            fontFamily = FontFamily.SansSerif ,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.clickable { navController.navigate(ROUT_SIGNUP) }
        )









    }



}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())

}
