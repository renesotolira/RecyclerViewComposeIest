package com.example.recyclerview.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recyclerview.R

@Preview(showBackground = true)
@Composable

fun TheBox() {
    Box(
        modifier = Modifier
            .height(80.dp)
            .width(125.dp)
            .verticalScroll(rememberScrollState())
            .background(Color(0xFF7DA8C0))
    ) {
        Icon(painter = painterResource(id = R.drawable.lunaa_foreground),
            contentDescription = "icono",
            tint = Color(0xFFCECF83)
        )
        Text(
            text = "A dormir",
            modifier = Modifier.align(Alignment.TopStart)
        )

    }
}