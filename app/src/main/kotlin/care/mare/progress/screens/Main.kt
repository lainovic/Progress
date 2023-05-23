package care.mare.progress.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Main() {
    Text(
        text = "Hello there!"
    )
}

@Composable
@Preview(showBackground = true)
fun MainPreview() {
    Main()
}
