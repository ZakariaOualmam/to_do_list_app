package com.example.to_do_list_app

import com.example.to_do_list_app.screen.Login
import com.example.to_do_list_app.screen.CreateAccount
import com.example.to_do_list_app.screen.HomeScreen
import com.example.to_do_list_app.screen.SplashScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "Splash"
            ) {
                composable("Splash") {
                    SplashScreen(navController)
                }

                composable("login") {
                    Login(navController)
                }
                composable("create") {
                    CreateAccount(navController)
                }
                composable("Home"){
                    HomeScreen(navController)
                }
            }
        }
    }
}