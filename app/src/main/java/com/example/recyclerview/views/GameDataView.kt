package com.example.recyclerview.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun GameDataView(modificador: Modifier = Modifier.fillMaxWidth(),
                 console:String = "Juego",
                 price: Int = 140){
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = modificador) {
        Text(text = console)
        Text(text = "$$price MXN" )
    }
}
