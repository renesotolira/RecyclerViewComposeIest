package com.example.recyclerview.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun nose() {
    Column(modifier = Modifier.
            fillMaxSize()){
        Text(
            text  = "Esta es una prueba tonoto",
            modifier = Modifier.padding(top = 8.dp),
            color = Color(0xEDFF5722)
        )
    }
}

