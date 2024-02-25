package com.rrjm.splashtutorial.navigation.NavigationScreen

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rrjm.splashtutorial.screens.SplashScreen
import com.rrjm.splashtutorial.screens.home.Home
import com.rrjm.splashtutorial.screens.login.LoginSplahScreen

//Para usar el NavController
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationScreens.SplashScreen.name
    ) {
        composable(NavigationScreens.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
        composable(NavigationScreens.LoginSplashScreen.name) {
            LoginSplahScreen(navController = navController)
        }
        composable(NavigationScreens.HomeScreen.name) {
            Home(navController = navController)
        }
    }
}