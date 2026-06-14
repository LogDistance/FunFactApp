package com.example.funfactsapp.ui.theme.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FunFactsNavigationGraph(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.USER_LOGIN_SCREEN){

        composable(Routes.USER_LOGIN_SCREEN){

            UserLoginScreen(navController)

        }
        composable(Routes.WELCOME_SCREEN){
            WelcomeScreen()
        }
    }

}
