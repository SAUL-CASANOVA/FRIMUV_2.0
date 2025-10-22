package com.example.frimuv_20.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.frimuv_20.R



@Composable
fun RegisterDriverScreen(onNavigateBack: () -> Unit) {

    var name by remember { mutableStateOf("") }


    Surface(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp),
        color = MaterialTheme.colorScheme.background,

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(modifier = Modifier.fillMaxWidth(),
                text = "Registro de Conductor", style = MaterialTheme.typography.headlineLarge)
            Spacer(modifier = Modifier.height(8.dp))

            Text(modifier = Modifier.fillMaxWidth(),
                text = "Crea tu cuenta de conductor", style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.height(24.dp))


            Text(modifier = Modifier.fillMaxWidth(),
                text = "Nombre Completo", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(24.dp))


            OutlinedTextField(
                value = name,
                onValueChange = { name = it},
                label = {Text(stringResource(R.string.name))},
                modifier = Modifier.fillMaxWidth()
            )





            // Botón para regresar
            Button(onClick = onNavigateBack) {
                Text("Volver")
            }
        }
    }
}