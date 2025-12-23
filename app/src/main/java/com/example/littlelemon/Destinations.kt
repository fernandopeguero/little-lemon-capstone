package com.example.littlelemon

sealed interface Destinations {
    val route: String

    object Home : Destinations {
        override val route = "Home"
    }

    object Profile : Destinations {
        override val route = "Home"
    }

    object Settings : Destinations {
        override val route = "Home"
    }
}


