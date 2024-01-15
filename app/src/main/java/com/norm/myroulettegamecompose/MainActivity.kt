package com.norm.myroulettegamecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.norm.myroulettegamecompose.roulette_screen.RouletteScreen
import com.norm.myroulettegamecompose.ui.theme.MyLightGreen
import com.norm.myroulettegamecompose.ui.theme.MyRouletteGameComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyRouletteGameComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MyLightGreen
                ) {
                    RouletteScreen()
                }
            }
        }
    }
}