package com.example.recyclerview.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recyclerview.R

@Preview (showBackground = true)
@Composable

fun siu(){
        Box(modifier = Modifier
            .fillMaxSize())

    Image(painter = painterResource(id = R.drawable.lightning), contentDescription = "rayo", modifier = Modifier
        .padding(top = 30.dp, start = 80.dp)
        .height(450.dp)
    )

    Text(text = "El rayo makuin", modifier = Modifier
        .padding(top = 400.dp, start = 30.dp),
        fontSize = 50.sp,

    )
}