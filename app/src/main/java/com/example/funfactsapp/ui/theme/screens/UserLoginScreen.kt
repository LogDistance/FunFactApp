package com.example.funfactsapp.ui.theme.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun UserLoginScreen(navController: NavHostController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(modifier = Modifier

            .fillMaxSize()
            .clickable {
                navController.navigate(Routes.WELCOME_SCREEN)
            }
            .padding(16.dp)) {
            Text(
                text = "Login",
                fontSize = 25.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun UserLoginScreenPreview(){
    UserLoginScreen(rememberNavController())
}