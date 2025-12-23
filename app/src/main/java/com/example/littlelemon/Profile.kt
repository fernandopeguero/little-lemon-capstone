package com.example.littlelemon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemon.ui.theme.LittleLemonTheme

@Composable
fun Profile(modifier: Modifier) {
    Text(
        text = "Profile Component"
    )
}


@Preview(showBackground = true)
@Composable
fun ProfilePreview() {

    LittleLemonTheme(
        darkTheme = false
    ) {
        Profile(modifier = Modifier)
    }

}