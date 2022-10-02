package com.my2ndcoroutines

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun screen2(){
    Column(
        modifier = Modifier
            .background(Color.Black)
            .padding(top = 200.dp, start = 130.dp)
            .fillMaxWidth(1f)

    ) {
        Text(text = "Second page")

    }

        Box(
            contentAlignment = Alignment.Center,
        ){
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.padding()


            ) {
                Text(text = "Another One")

            }



        }
    }

