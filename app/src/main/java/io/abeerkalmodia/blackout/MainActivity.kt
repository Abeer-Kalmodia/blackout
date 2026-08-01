package io.abeerkalmodia.blackout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.abeerkalmodia.blackout.core.theme.BlackoutTheme
import io.abeerkalmodia.blackout.feature.home.HomeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BlackoutTheme {
                HomeScreen()
            }
        }
    }
}