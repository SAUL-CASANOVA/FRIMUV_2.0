package com.example.frimuv_20.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ChooseUserTypeScreen(
    onNavigateToDriver: () -> Unit,
    onNavigateToPassenger: () -> Unit,
    onNavigateBack: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "¿Qué tipo de cuenta quieres crear?",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(32.dp))

            Button(onClick = onNavigateToDriver, modifier = Modifier.fillMaxWidth().height(50.dp)) {
                Text("Soy Conductor")
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = onNavigateToPassenger, modifier = Modifier.fillMaxWidth().height(50.dp)) {
                Text("Soy Pasajero")
            }
            Spacer(modifier = Modifier.height(32.dp))

            TextButton(onClick = onNavigateBack) {
                Text("Cancelar y volver")
            }
        }
    }
}