package com.example.metrodataidlemanagementsystem.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.metrodataidlemanagementsystem.navigation.PostOfficeAppRouter
import com.example.metrodataidlemanagementsystem.navigation.Screen
import com.example.metrodataidlemanagementsystem.screens.HomeScreen
import com.example.metrodataidlemanagementsystem.screens.LoginScreen
import com.example.metrodataidlemanagementsystem.screens.SignUpScreen
import com.example.metrodataidlemanagementsystem.screens.TermsAndConditionScreen

@Composable
fun PostOfficeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = PostOfficeAppRouter.currentScreen.value, label = "") { screen ->
            when (screen) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screen.TermsAndConditionScreen -> {
                    TermsAndConditionScreen()
                }
                is Screen.LoginScreen -> {
                    LoginScreen()
                }
                is Screen.HomeScreen -> {
                    HomeScreen()
                }
            }
        }
    }
}