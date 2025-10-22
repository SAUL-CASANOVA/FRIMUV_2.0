package com.example.frimuv_20.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.frimuv_20.Screens.*

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.LOGIN
    ) {
        composable(Screen.LOGIN) {
            LoginScreen(
                // La acción del LoginScreen navega a la pantalla de elección
                onNavigateToRegister = {
                    navController.navigate(Screen.CHOOSE_USER_TYPE)
                },
                //loginSuccess navega a la pantalla del perfil
                onLoginSuccess = { navController.navigate(Screen.PROFILE) }
            )
        }

        composable(Screen.PROFILE) {
            ProfileScreen(
                onLogout = { navController.popBackStack(Screen.LOGIN, inclusive = true) }
            )
        }

        composable(Screen.CHOOSE_USER_TYPE) {
            // La pantalla intermedia decide el siguiente destino
            ChooseUserTypeScreen(
                onNavigateToDriver = { navController.navigate(Screen.REGISTER_DRIVER) },
                onNavigateToPassenger = { navController.navigate(Screen.REGISTER_PASSENGER) },
                onNavigateBack = { navController.popBackStack() }
            )
        }

        composable(Screen.REGISTER_DRIVER) {
            // Pantalla final de registro de conductor
            RegisterDriverScreen(onNavigateBack = { navController.popBackStack() })
        }

        composable(Screen.REGISTER_PASSENGER) {
            // Pantalla final de registro de pasajero
            RegisterPassengerScreen(onNavigateBack = { navController.popBackStack() })
        }
    }
}