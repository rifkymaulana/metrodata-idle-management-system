package com.example.metrodataidlemanagementsystem.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen(val route: String) {
    object SignUpScreen : Screen("sign_up_screen")
    object LoginScreen : Screen("login")
    object HomeScreen : Screen("home_screen")
    object TermsAndConditionScreen : Screen("terms_and_condition_screen")
}

object PostOfficeAppRouter  {
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)

    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}