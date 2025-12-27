package com.example.littlelemon

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){

    val navController = rememberNavController()

    NavHost(
        navController,
        startDestination = Destinations.Onboarding.route) {

        composable(route = Destinations.Onboarding.route) {
            Onboarding()
        }

        composable(route = Destinations.Home.route) {
            Home(modifier = Modifier)
        }

        composable(route = Destinations.Profile.route){

            Profile(modifier = Modifier)
        }

    }

}