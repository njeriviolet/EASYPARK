package com.example.easypark.ui.theme.screens.home

import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.easypark.R
import com.example.easypark.navigation.ROUT_ADDS_PACE
import com.example.easypark.navigation.ROUT_HOME
import com.example.easypark.navigation.ROUT_PARKINGSPACES
import com.example.easypark.navigation.ROUT_TERMSANDCONDITIONS
import com.example.easypark.ui.theme.blue
import com.example.easypark.ui.theme.yellow


@Composable
fun HomeScreen(navController: NavController)
{
    Column(modifier = Modifier
        .fillMaxSize()
        .background(blue) ,
        verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Spacer(modifier = Modifier.height(10.dp))
        Row {Image(
            painter = painterResource(id = R.drawable.white),
            contentDescription ="home image",
            modifier = Modifier
                .size(11.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


         )
            Image(
                painter = painterResource(id = R.drawable.white),
                contentDescription ="home image",
                modifier = Modifier
                    .size(11.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop


            )

            Image(
                painter = painterResource(id = R.drawable.white),
                contentDescription ="home image",
                modifier = Modifier
                    .size(11.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop


            )



        }





        Text(
            text = "EASYPARK" ,
            fontSize = 50.sp ,
            fontFamily = FontFamily.Default ,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Parking Made Easy" ,
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp ,
            color = Color.White
        )



        Row {Image(
            painter = painterResource(id = R.drawable.white),
            contentDescription ="home image",
            modifier = Modifier
                .size(11.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


        )
            Image(
                painter = painterResource(id = R.drawable.white),
                contentDescription ="home image",
                modifier = Modifier
                    .size(11.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop


            )

            Image(
                painter = painterResource(id = R.drawable.white),
                contentDescription ="home image",
                modifier = Modifier
                    .size(11.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop


            )



        }
        Spacer(modifier = Modifier.height(140.dp))



        Button(onClick = {
            navController.navigate(ROUT_PARKINGSPACES)
                         },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp)
        )
        { Text(text = "Get started !") }

        Spacer(modifier = Modifier.height(10.dp))












        Row(modifier = Modifier.padding(start = 10.dp)) {

            Text(
                text = "By clicking Get started you agree to  our : " ,
                fontSize = 15.sp ,
                color = Color.White)

            Text(
                text = "Terms and conditions " ,
                fontSize = 15.sp ,
                color = Color.Black,
                modifier = Modifier.clickable {navController.navigate(ROUT_TERMSANDCONDITIONS) }
            )

        }












    }


}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

