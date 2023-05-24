package care.mare.progress.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import care.mare.progress.R
import care.mare.progress.ui.theme.ProgressTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Splash(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painterResource(id = R.drawable.progress_logo),
            contentDescription = "logo",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .align(Alignment.Center)
                .size(200.dp)
        )
    }

    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            delay(2000)
            navController.navigate("main")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SplashPreview() {
    val navController = rememberNavController()
    ProgressTheme() {
        Splash(navController)
    }
}