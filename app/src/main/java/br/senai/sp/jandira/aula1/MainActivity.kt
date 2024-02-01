package br.senai.sp.jandira.aula1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.aula1.ui.theme.Aula1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column {
                        Cartao("Ryan é legal?", Color.Red)
                        Cartao("Gabriela é chata?", Color.Blue)
                    }
                }
            }
        }
    }
}

@Composable
fun Cartao(titulo: String, corTitulo: Color) {
    Column {
        Text(text = titulo, fontSize = 32.sp, textAlign = TextAlign.Center, color = corTitulo)
        Row(horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff000000)
                )
            ) {
                Text(text = "Sim",
                    color = Color(0xFF6CBEA4),
                    fontSize = 16.sp
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF000000)
                )
            ){
                Text(
                    text = "Não",
                    color = Color(0xFFDFA95B),
                    fontSize = 16.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(height = 16.dp))
    }
}