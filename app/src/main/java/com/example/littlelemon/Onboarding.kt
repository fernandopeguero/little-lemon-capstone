package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Onboarding() {

    var firstName by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp) // fixed height
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Fit
                )
            }
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text(
                text = "Let's get to know you",
                textAlign = TextAlign.Center,
                fontSize = 28.sp,
                modifier = Modifier.fillMaxWidth()
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Personal Information",
                    style = MaterialTheme.typography.headlineSmall
                )

                TextField(
                    value = firstName,
                    onValueChange = {
                        firstName = it
                    },
                    label = {
                        Text(
                            text = "First Name"
                        )
                    },
                    maxLines = 1,

                )
                TextField(
                    value = firstName,
                    onValueChange = {
                        firstName = it
                    },
                    label = {
                        Text(
                            text = "Last Name"
                        )
                    },
                    maxLines = 1,

                    )

                TextField(
                    value = firstName,
                    onValueChange = {
                        firstName = it
                    },
                    label = {
                        Text(
                            text = "Email"
                        )
                    },
                    maxLines = 1,

                    )
            }

            Button(
                onClick = {}
            ) {
                Text(
                    text = "Register"
                )
            }
        }

    }
}



@Preview
@Composable
fun OnboardingPreview() {

    LittleLemonTheme {
        Onboarding()
    }

}