package com.example.easypark.ui.theme.screens.parkingspaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.easypark.R
import com.example.easypark.navigation.ROUT_ADD_BOOKING
import com.example.easypark.navigation.ROUT_HOME
import com.example.easypark.navigation.ROUT_VIEW_SPACES
import com.example.easypark.ui.theme.blue
import com.example.easypark.ui.theme.yellow

//code to display parking spaces available in that building
@Composable
fun ParkingSpacesScreen(navController: NavController){

//start of code


    Column (modifier = Modifier.background(blue).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "PARKING MADE EASY" ,
        fontSize = 45.sp ,
        color = Color.White,
            textAlign = TextAlign.Center

        )







        //start of row1
        Row {
            Column {


                Image(
                    painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape)


                )

                Spacer(modifier = Modifier.height(5.dp))



                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking A " ,
                    fontSize = 12.sp,
                    color = Color.Black)
                }






            }

            Spacer(modifier = Modifier.width(10.dp))

            Column {


                Image(painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape)


                )
                Spacer(modifier = Modifier.height(5.dp))

                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking B " ,
                    fontSize = 12.sp,
                    color = Color.Black
                    )

                }





            }

            Spacer(modifier = Modifier.width(10.dp))
            Column {



                Image(
                    painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape)
                )

                Spacer(modifier = Modifier.height(5.dp))




                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking B " ,
                    fontSize = 12.sp ,
                    color = Color.Black)

                }









            }











        }
        //end of row1
        Spacer(modifier = Modifier.height(10.dp))

        //start of row 2
        Row {

            Column {
                Image(
                    painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape)



                )

                Spacer(modifier = Modifier.height(5.dp))


                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking A " ,
                    fontSize = 12.sp,
                    color = Color.Black)
                }





            }


            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Image(
                    painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape)

                )


                Spacer(modifier = Modifier.height(5.dp))



                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking A " ,
                    fontSize = 12.sp,
                    color = Color.Black)
                }




            }


            Spacer(modifier = Modifier.width(10.dp))

            Column {

                Image(
                    painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape)

                )

                Spacer(modifier = Modifier.height(5.dp))



                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking A " ,
                    fontSize = 12.sp,
                    color = Color.Black)
                }





            }



            Spacer(modifier = Modifier.width(10.dp))

            
        }
        //end of row2
        Spacer(modifier = Modifier.height(10.dp))


        //start of row3
        Row {
            Column {

                Image(
                    painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape)


                )

                Spacer(modifier = Modifier.height(5.dp))

                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking A " ,
                    fontSize = 12.sp,
                    color = Color.Black)
                }





            }

            Spacer(modifier = Modifier.width(10.dp))

            Column {

                Image(
                    painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape))

                Spacer(modifier = Modifier.height(10.dp))

                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking A " ,
                    fontSize = 12.sp,
                    color = Color.Black)
                }





            }





            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Image(
                    painter = painterResource(id = R.drawable.carparking),
                    contentDescription ="space image",
                    modifier = Modifier
                        .size(105.dp)
                        .clip(shape = RectangleShape)


                )

                Spacer(modifier = Modifier.height(5.dp))

                Button(onClick = { navController.navigate(ROUT_HOME) },
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp),
                    colors = ButtonDefaults.buttonColors(yellow),
                    shape = RoundedCornerShape(5.dp)

                )
                { Text(text = "parking A " ,
                    fontSize = 12.sp,
                    color = Color.Black)
                }



            }


            Spacer(modifier = Modifier.width(10.dp))





        }
        //end of row3

        Spacer(modifier = Modifier.height(50.dp))

        //end of row4


        Button(onClick = {
            navController.navigate(ROUT_VIEW_SPACES)
                         },
            modifier = Modifier
                .height(35.dp)
                .padding(start = 40.dp , end = 40.dp)
                .width(305.dp),
            colors = ButtonDefaults.buttonColors(Color.White),
            shape = RoundedCornerShape(5.dp)

        )
        { Text(text = "View Available Spaces" ,
            fontSize = 10.sp,
            color = Color.Black)
        }

        Spacer(modifier = Modifier.height(30.dp))















    }

















    //end of code


}

@Composable
@Preview(showBackground = true)
fun ParkingSpacesScreenPreview(){
    ParkingSpacesScreen(rememberNavController())

}

