package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Onboarding() {

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp) // fixed height
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier
                        .size(250.dp)
                    ,
                    contentScale = ContentScale.Fit
                )
            }
        }
    ) { innerPadding ->

        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxHeight()
                .padding(innerPadding)
        ) {
            Surface(
                color = colorResource(R.color.primary_green),
                
            ) {
                Text(
                    text = "Let's get to know you",
                    textAlign = TextAlign.Center,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(36.dp)
                )

            }


            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
            ) {


                Text(

                    text = "Personal Information",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 28.dp,
                            bottom = 28.dp)

                )

                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                ) {

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
                        placeholder = {
                            Text(
                                text = "Tilly"
                            )
                        },
                        maxLines = 1,
                        modifier = Modifier.fillMaxWidth()

                    )
                    TextField(
                        value = lastName,
                        onValueChange = {
                            lastName = it
                        },
                        label = {
                            Text(
                                text = "Last Name"
                            )
                        },
                        placeholder = {
                            Text(
                                text = "Jhons"
                            )
                        },
                        maxLines = 1,
                        modifier = Modifier.fillMaxWidth().padding(top = 28.dp)

                    )

                    TextField(
                        value = email,
                        onValueChange = {
                            email = it
                        },
                        label = {
                            Text(
                                text = "Email"
                            )
                        },
                        placeholder = {
                            Text(
                                text = "tillyjohns@gmail.com"
                            )
                        },
                        maxLines = 1,
                        modifier = Modifier.fillMaxWidth().padding(top = 28.dp)

                    )

                }

                }

            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.primary_yellow)
                ),
                modifier = Modifier.fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 28.dp)
            ) {
                Text(
                    text = "Register",
                    color = colorResource(R.color.secondary_dark_gray)
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