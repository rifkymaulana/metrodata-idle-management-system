package com.example.metrodataidlemanagementsystem.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.metrodataidlemanagementsystem.screens.Item

sealed class Screen(val route: String) {
    object SignUpScreen : Screen("sign_up_screen")
    object LoginScreen : Screen("login")
    object HomeScreen : Screen("home_screen")
    object TermsAndConditionScreen : Screen("terms_and_condition_screen")
    object DetailScreen : Screen("detail_screen")
}

object PostOfficeAppRouter  {
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)
    var item: Item = Item(1, "Title", 0, "Description")

    fun navigateTo(destination: Screen, item: Item = this.item) {
        currentScreen.value = destination
        this.item = item
    }
}