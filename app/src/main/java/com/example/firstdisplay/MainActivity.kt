package com.example.firstdisplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstdisplay.ui.theme.FirstDisplayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstDisplayTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    )
    {
        Surface(
            color = Color.White,
            modifier = Modifier.wrapContentSize(),
            shape = RoundedCornerShape(15.dp)
        ) {
            RandomText("hehe")
        }
    }
}

@Composable
fun RandomText(txt: String) {
    Text(
        text = "This is dynamic text, kinda $txt",
        modifier = Modifier
            .size(270.dp, 45.dp)
            .padding(12.dp),
        textAlign = TextAlign.Center
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstDisplayTheme {
        MainScreen()
    }
}