package com.example.littlelemon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemon.ui.theme.LittleLemonTheme


@Composable
fun Home(modifier: Modifier) {
    Text(
        text = "Home Composable"

    )
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {

    LittleLemonTheme() {

        Home(modifier = Modifier)
    }
}