package com.my2ndcoroutines

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.my2ndcoroutines.ui.theme.My2ndCoroutinesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My2ndCoroutinesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Coroutines")
                       screen()
                    screen2()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String


             ) {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .padding(top = 200.dp, start = 130.dp)
            .fillMaxWidth(1f)

    ) {
        Text(text = "Hello $name!")

    }


}

@Composable
fun screen(){
    Box(
        contentAlignment = Alignment.Center,
    ){
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.padding()


        ) {
            Text(text = "Next")
            
        }


        
    }
}
