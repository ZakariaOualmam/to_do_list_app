package com.example.to_do_list_app

import com.example.to_do_list_app.screen.Login
import com.example.to_do_list_app.screen.CreateAccount
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
                startDestination = "login"
            ) {
                composable("login") {
                    Login(navController)
                }
                composable("create") {
                    CreateAccount(navController)
                }
            }
        }
    }
}