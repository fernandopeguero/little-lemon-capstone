package com.example.littlelemon

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.data.UserPreferences
import kotlinx.coroutines.coroutineScope

@Composable
fun Navigation(modifier: Modifier){

    val context = LocalContext.current
    val userPrefs = remember { UserPreferences(context) }

    val navController = rememberNavController()

    val userConfig  = UserPreferences(context)

    val onboardingDone by userPrefs.onboardingCompleted.collectAsState(initial = null)
    Toast.makeText(context, "ONBOARDING:${onboardingDone}}", Toast.LENGTH_SHORT).show()
    val startDestination = if (onboardingDone == true) {
        Destinations.Home.route
    } else {
        Destinations.Onboarding.route
    }

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }



    NavHost(
        navController,
        startDestination = startDestination) {

        composable(route = Destinations.Onboarding.route) {
            Onboarding(
                firstName,
                {firstName = it},
                lastName,
                {lastName = it},
                email,
                { email = it},
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
            Profile(
            firstName,
            lastName,
            email,
                {
                navController.navigate(Destinations.Onboarding.route)
            }, modifier = Modifier)
        }

    }

}