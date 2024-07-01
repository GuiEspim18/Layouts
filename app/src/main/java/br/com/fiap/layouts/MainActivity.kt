package br.com.fiap.layouts

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutsTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(Color(0xFFCECECE))
                ) {
                    LayoutScreen()
                }
            }
        }
    }
}

@Composable
fun LayoutScreen() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Button 1")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Button 2")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Button 3")
        }
        Column (
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        ) {
            Text(text = "Fiap")
            Text(text = "Android")
            Text(text = "Studio")
            Row (
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Bottom
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Button 4")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Button 5")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Button 6")
                }
                Column() {
                    Button(onClick = { /*TODO*/ }) {
                       Text(text = "Button 7")
                    }
                    Button(onClick = { /*TODO*/ }) {
                       Text(text = "Button 8")
                    }
                    Button(onClick = { /*TODO*/ }) {
                       Text(text = "Button 9")
                    }
                }
            }
            Row (
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Button 7")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Button 8")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Button 9")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LayoutScreenPreview() {
    LayoutScreen()
}