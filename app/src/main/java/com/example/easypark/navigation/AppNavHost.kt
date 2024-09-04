package com.example.easypark.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easypark.ui.theme.screens.admin.AdminScreen
import com.example.easypark.ui.theme.screens.book.AddBooking
import com.example.easypark.ui.theme.screens.book.ViewBookingScreen
import com.example.easypark.ui.theme.screens.book.ViewBookings
import com.example.easypark.ui.theme.screens.home.HomeScreen
import com.example.easypark.ui.theme.screens.intent.TermsAndConditionsscreen
import com.example.easypark.ui.theme.screens.login.LoginScreen
import com.example.easypark.ui.theme.screens.parkingspaces.ParkingSpacesScreen
import com.example.easypark.ui.theme.screens.payment.PaymentScreen
import com.example.easypark.ui.theme.screens.signup.SignupScreen
import com.example.easypark.ui.theme.screens.spaces.AddSpaceScreen
import com.example.easypark.ui.theme.screens.spaces.ViewSpaceScreen
import com.example.easypark.ui.theme.screens.spaces.ViewSpacesScreen
import com.example.easypark.ui.theme.screens.splash.splashscreen


import com.example.easypark.ui.theme.ticket.GenerateTicketScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_LOGIN
) {
    NavHost(
        navController = navController,
        startDestination = ROUT_SPLASH,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }


        composable(ROUT_SPLASH) {
            splashscreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ROUT_GENERATETICKET) {
            GenerateTicketScreen(navController = navController)
        }
        composable(ROUT_PARKINGSPACES) {
            ParkingSpacesScreen(navController = navController)
        }
        composable(ROUT_TERMSANDCONDITIONS) {
            TermsAndConditionsscreen(navController = navController)
        }
        composable(ROUT_PAYMENT) {
            PaymentScreen(navController = navController)
        }

        composable(ROUT_ADDS_PACE) {
            AddSpaceScreen(navController = navController)
        }

        composable(ROUT_VIEW_SPACE) {
            ViewSpaceScreen(navController = navController)
        }

        composable(ROUT_VIEW_SPACES) {
            ViewSpacesScreen(navController = navController)
        }

        composable(ROUT_ADD_BOOKING) {
            AddBooking(navController = navController)
        }

        composable(ROUT_VIEW_BOOKING) {
            ViewBookingScreen(navController = navController)
        }
        composable(ROUT_VIEW_BOOKINGS) {
            ViewBookings(navController = navController)
        }
        composable(ROUT_ADMIN) {
            AdminScreen(navController = navController)
        }























    }


}


