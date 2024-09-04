package com.example.easypark.ui.theme.screens.intent

import android.annotation.SuppressLint
import android.content.Intent
import android.media.audiofx.BassBoost
import android.provider.MediaStore
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.easypark.R
import com.example.easypark.navigation.ROUT_HOME
import com.example.easypark.ui.theme.blue
import com.example.easypark.ui.theme.blue

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TermsAndConditionsscreen(navController: NavController){


    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(

            topBar = {
                TopAppBar(
                    title = { Text(text = "Terms and conditions ", fontFamily = FontFamily.SansSerif, color = Color.White)},
                    colors = TopAppBarDefaults.mediumTopAppBarColors(blue)
                )
            },



            //Content Section
            content = @Composable{





           //start of terms code
            Column {


                Spacer(modifier = Modifier.height(50.dp))




                Text(text = "    \n" +
                        "    These General Terms & Conditions (referred to as “General Conditions”) govern Your use of the service that You have registered for and in conjunction with any other specific terms and conditions relate to the services provided by GoParkit Technologies Limited and GoParkit Technologies Inc. (GoParkit). In these General Conditions You in relation to the services shall be referred to as “You”, “Your” or the “User” (as appropriate) who will be either: (i) a private individual, or (ii) a company or business, which makes use of the GoParkit vehicle parking payment and management system. GoParkit is the provider of a parking payment system (the “Service” or “Services”).\n" +
                        "    When/where applicable GoParkit may provide You with a GoParkit car sticker or card that can be used by You to assist in making an enforcement officer aware that you may be using GoParkit for parking payment.\n" +
                        "    These General Conditions are legally binding on You if You register for the Services. You as a potential user of the Services must agree to them prior to being accepted as a User. If You do not agree to accept and be bound by these General Terms & Conditions please cancel Your registration / membership.\n" +
                        "    GoParkit reserves the right to make changes to these General Conditions, which are published on the website, www.GoParkit.com (the “Website”) and are available to be viewed from the Website. If any provision of these General Conditions is null and void or is overturned, the other provisions of these General Conditions shall continue to remain in force. The User is not permitted to transfer its rights and/or obligations arising from the Services and these General Conditions to third parties, without GoParkit’s prior consent in writing.\n  ",



                )

                Spacer(modifier = Modifier.height(40.dp))









                Button(onClick = {navController.navigate(ROUT_HOME)},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors( Color.Black),
                    shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "back to homepage !",

                    color = Color.White) }





                    








                }









            }

        )

    }






}




@Composable
@Preview(showBackground = true)
fun TermsAndConditionsscreenPreview(){
    TermsAndConditionsscreen(rememberNavController())

}









