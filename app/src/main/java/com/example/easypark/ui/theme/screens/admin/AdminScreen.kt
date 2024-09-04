package com.example.easypark.ui.theme.screens.admin
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.easypark.R
import com.example.easypark.navigation.ROUT_ADDS_PACE
import com.example.easypark.navigation.ROUT_ADD_BOOKING
import com.example.easypark.navigation.ROUT_HOME
import com.example.easypark.navigation.ROUT_LOGIN
import com.example.easypark.navigation.ROUT_PARKINGSPACES
import com.example.easypark.navigation.ROUT_VIEW_BOOKINGS
import com.example.easypark.navigation.ROUT_VIEW_SPACE
import com.example.easypark.navigation.ROUT_VIEW_SPACES


@Composable
fun AdminScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Spacer(modifier = Modifier.height(10.dp))



        Image(
            painter = painterResource(id = R.drawable.parkingh),
            contentDescription ="home image",
            modifier = Modifier
                .size(100.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Parking  with ease " ,
            fontSize = 25.sp ,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            //main card

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(Color.Blue)
            ) {

                //row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_ADDS_PACE) }
                        .height(180.dp)
                        .width(160.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.addicon),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "ADD SPACE " ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card
                    Spacer(modifier = Modifier.width(15.dp))

                    //Card2
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_VIEW_SPACE) }
                        .height(180.dp)
                        .width(160.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.carparking),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "VIEW SPACE" ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card


                }
                //end of row 1

                //row2

                Row (modifier = Modifier.padding(20.dp)){
                    //Card3
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_VIEW_BOOKINGS) }
                        .height(180.dp)
                        .fillMaxWidth()) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.addicon),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "VIEW BOOKINGS " ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card
                    Spacer(modifier = Modifier.width(15.dp))


                }
                //end of row 2

                Row (modifier = Modifier.padding(20.dp)){

                    Spacer(modifier = Modifier.width(15.dp))

                    Button(onClick = {
                        navController.navigate(ROUT_LOGIN)
                    },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
                    { Text(text = "BACK TO LOGIN") }

                    Spacer(modifier = Modifier.height(10.dp))










                }
                //end of row 3






            }
            //end of  main card

        }




    }
}

@Composable
@Preview(showBackground = true)
fun AdminScreenPreview(){
    AdminScreen(rememberNavController())

}

