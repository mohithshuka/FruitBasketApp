package com.ms.jetpackcomposelearning

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.ms.jetpackcomposelearning.screens.AppNavigation
import com.ms.jetpackcomposelearning.screens.HomeScreen
import com.ms.jetpackcomposelearning.screens.SplashScreen
import com.ms.jetpackcomposelearning.screens.WelcomeScreen
import com.ms.jetpackcomposelearning.ui.theme.JetPackComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetPackComposeLearningTheme {

             AppNavigation()
////                CounterExample()
//                ToggleExample()
            }
        }
    }
}

