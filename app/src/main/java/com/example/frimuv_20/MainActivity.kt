package com.example.frimuv_20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.frimuv_20.Navigation.AppNavigation
import com.example.frimuv_20.ui.theme.FRIMUV_20Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FRIMUV_20Theme {
                AppNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FrimuvAppPreview() {
    AppNavigation()
}

