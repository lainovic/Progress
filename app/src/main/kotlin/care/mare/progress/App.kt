package care.mare.progress

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import care.mare.progress.screens.Main
import care.mare.progress.screens.Splash

@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash_screen") {
        composable("splash_screen") {
            Splash(navController = navController)
        }
        composable("main") {
            Main()
        }
    }
}