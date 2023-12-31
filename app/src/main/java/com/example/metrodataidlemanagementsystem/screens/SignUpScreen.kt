package com.example.metrodataidlemanagementsystem.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.metrodataidlemanagementsystem.R
import com.example.metrodataidlemanagementsystem.components.ButtonComponent
import com.example.metrodataidlemanagementsystem.components.CheckboxComponent
import com.example.metrodataidlemanagementsystem.components.ClickableLoginTextComponent
import com.example.metrodataidlemanagementsystem.components.DividerTextComponent
import com.example.metrodataidlemanagementsystem.components.HeadingTextComponent
import com.example.metrodataidlemanagementsystem.components.MyTextFieldComponent
import com.example.metrodataidlemanagementsystem.components.NormalTextComponent
import com.example.metrodataidlemanagementsystem.components.PasswordTextFieldComponent
import com.example.metrodataidlemanagementsystem.navigation.PostOfficeAppRouter
import com.example.metrodataidlemanagementsystem.navigation.Screen

@Composable
fun SignUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {

            Spacer(modifier = Modifier.height(120.dp))

            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource = painterResource(id = R.drawable.profile)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile)
            )

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.message)
            )

            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.lock)
            )

            CheckboxComponent(
                value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionScreen)
                }
            )

            Spacer(modifier = Modifier.height(10.dp))

            ButtonComponent(
                value = stringResource(id = R.string.sign_up),
                onClick = {
                    PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            Spacer(modifier = Modifier.height(20.dp))

            ClickableLoginTextComponent(onTextSelected ={
                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })
        }
    }
}

@Preview
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}
