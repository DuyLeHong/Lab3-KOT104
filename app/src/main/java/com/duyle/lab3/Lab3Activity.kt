package com.duyle.lab3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lab3Activity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Color("#242121".toColorInt()),
                            titleContentColor = Color("#ffffff".toColorInt()),
                        ),
                        title = {
                            GetTextTitle("Thanh Toan")
                        }
                    )
                },
            ) {innerPadding ->
                GetLayout(innerPadding)
            }
        }
    }

    @Preview
    @Composable
    private fun GetLayout (innerPadding : PaddingValues = PaddingValues()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                top = innerPadding.calculateTopPadding() + 10.dp,
                start = 24.dp,
                bottom = 24.dp,
                end = 24.dp
            ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//            GetTextTitle("Trang chu")

            GetRowItem(color = Color.Blue)

            GetRowItem(color = Color.Cyan)

            GetRowItem(color = Color.Yellow)

            GetRowItem(color = Color.DarkGray)
        }
    }

    @Composable
    fun GetRowItem (color: Color = Color.Red) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(color, shape = RoundedCornerShape(15.dp))
                .height(60.dp),
            verticalAlignment = Alignment.CenterVertically,

            ) {

        }
    }

    @Composable
    fun GetTextTitle(title: String = "Trang chu") {
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(0.dp, 16.dp)
                .fillMaxWidth()
        )
    }
}