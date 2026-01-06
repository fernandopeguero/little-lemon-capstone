package com.example.littlelemon

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.data.UserPreferences

@Composable
fun Navigation(modifier: Modifier){

    val context = LocalContext.current
    val userPrefs = remember { UserPreferences(context) }

    val navController = rememberNavController()

    val onboardingDone by userPrefs.onboardingCompleted.collectAsState(initial = null)
    val startDestination = if (onboardingDone == true) {
        Destinations.Home.route
    } else {
        Destinations.Onboarding.route
    }


    NavHost(
        navController,
        startDestination = startDestination) {

        composable(route = Destinations.Onboarding.route) {
            Onboarding(
                navigate = {
                 navController.navigate(Destinations.Home.route)
                }, modifier = Modifier)
        }

        composable(route = Destinations.Home.route) {
            Home({
                navController.navigate(Destinations.Profile.route)
            },modifier = Modifier)
        }

        composable(route = Destinations.Profile.route){
            Profile( {
                navController.navigate(Destinations.Onboarding.route)
            }, modifier = Modifier)
        }

    }

}