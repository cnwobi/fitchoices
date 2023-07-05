package com.ebony.fitchoices.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun WelcomeScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.primary) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp, bottom = 50.dp,start = 16.dp, end = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(text = "FitChoices", fontSize = 30.sp, fontWeight = FontWeight.ExtraBold)
                Text(text = "\u00AE")
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(), border = BorderStroke(width = 2.dp, color = MaterialTheme.colorScheme.onPrimary)) {
                    Text(text = "Sign Up")

                }

                OutlinedButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(
                    containerColor =  MaterialTheme.colorScheme.onPrimary,
                    contentColor = MaterialTheme.colorScheme.primary
                )) {
                    Text(text = "Log In")
                }

            }

        }
    }
}