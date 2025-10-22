package com.example.frimuv_20.Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frimuv_20.ui.theme.Orange

@Composable
fun RegisterLinkText(onRegisterClick: () -> Unit) {

    val clickableText = "Regístrate"

    val annotatedText = buildAnnotatedString {

        withStyle(style = SpanStyle(
            color = Orange,
            textDecoration = TextDecoration.Underline,
            fontSize = 14.sp
        )) {
            pushStringAnnotation(tag = "REGISTER_CLICK", annotation = clickableText)
            append(clickableText)
            pop()
        }
    }

    // linea de texto mas link de registro
    Row (verticalAlignment = Alignment.CenterVertically) {

        Text(text = "¿No tienes cuenta?")

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = annotatedText,
            modifier = Modifier.clickable {
                onRegisterClick()
            }
        )

    }


}