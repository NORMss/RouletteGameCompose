package com.norm.myroulettegamecompose.roulette_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.norm.myroulettegamecompose.R

@Composable
fun RouletteScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "0",
            modifier = Modifier
                .fillMaxWidth()
                .height(128.dp)
                .wrapContentHeight()
                .wrapContentWidth(),
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            color = Color.White
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.roulette_512),
                contentDescription = "roulette",
                modifier = Modifier.fillMaxSize()
            )
            Image(
                painter = painterResource(id = R.drawable.arrow_512),
                contentDescription = "arrow",
                modifier = Modifier.fillMaxSize()
            )
        }
        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                text = "Start",
                color = Color.White
            )
        }
    }
}