package com.example.frimuv_20.Screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.frimuv_20.R // Importa tus recursos
import com.example.frimuv_20.ui.theme.Orange // Importa tu color
import com.example.frimuv_20.Components.RegisterLinkText //



@Composable
fun LoginScreen(onNavigateToRegister: () -> Unit,
                onLoginSuccess: () -> Unit,
                modifier: Modifier = Modifier
) {

    var email by remember { mutableStateOf("") }
    var password by remember {mutableStateOf("")}


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {


            Image(
                painter = painterResource(R.drawable.frimuv_logo),
                contentDescription = "Frimuv"
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "\"Luz, ciencia y verdad \"",
                modifier = Modifier.fillMaxWidth(),
                color = Orange)

            Text(text = "Universidad Autónoma de Yucatán",
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Correo electrónico",
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(8.dp))


            OutlinedTextField(
                value = email,
                onValueChange = { email = it},
                label = {Text(stringResource(R.string.email))},
                modifier = modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(text = "Contraseña",
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = password,
                onValueChange = {password = it},
                label = { Text(stringResource(R.string.password)) },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                // Ejecuta la función de navegación al hacer clic
                onClick = onLoginSuccess,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Orange)
            ) {
                Text(stringResource(R.string.login))
            }

            Spacer(modifier = Modifier.height(16.dp))

            //se añade el texto con enlace a otra pantalla
            RegisterLinkText(onRegisterClick = onNavigateToRegister)

        }
    }
}
