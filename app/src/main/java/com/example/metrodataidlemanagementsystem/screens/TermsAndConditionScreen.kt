package com.example.metrodataidlemanagementsystem.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.metrodataidlemanagementsystem.R
import com.example.metrodataidlemanagementsystem.components.HeadingTextComponent
import com.example.metrodataidlemanagementsystem.navigation.PostOfficeAppRouter
import com.example.metrodataidlemanagementsystem.navigation.Screen
import com.example.metrodataidlemanagementsystem.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
    ) {

        HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions_header))

        SystemBackButtonHandler {
            PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
        }
    }
}

@Preview
@Composable
fun PreviewTermsAndConditionScreen() {
    TermsAndConditionScreen()
}
