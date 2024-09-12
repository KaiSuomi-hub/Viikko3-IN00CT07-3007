package com.example.in00ct07_3007_week3_homework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.in00ct07_3007_week3_homework.ui.theme.IN00CT073007week3homeworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IN00CT073007week3homeworkTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginView()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginView() {
    TextFieldWithIcons()
}
@Composable
fun TextFieldWithIcons() {
    val nameState = remember { mutableStateOf(TextFieldValue("")) }
    val passwordState = remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier.padding(top=16.dp)
    ) {
        Text(
            text = "Login",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp, start = 50.dp)
        )
        Row(modifier = Modifier.padding(bottom = 16.dp, start = 50.dp)){
    OutlinedTextField(
        value = nameState.value,
        trailingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
        onValueChange = { newValue ->
            nameState.value = newValue
        },
        singleLine = true,
        label = { Text(text = "Email address") },
        placeholder = { Text(text = "Enter your e-mail") },
        modifier = Modifier.padding(bottom = 16.dp),
    )}
        Row(modifier = Modifier.padding(bottom = 16.dp, start = 50.dp)){
    OutlinedTextField(
        value = passwordState.value,
        trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "lockIcon") },
        onValueChange = { newValue ->
            passwordState.value = newValue
        },
        singleLine = true,
        label = { Text(text = "Password") },

        placeholder = { Text(text = "Enter your password") },
        visualTransformation = PasswordVisualTransformation(),
    )}
        Row(modifier = Modifier.padding(bottom = 16.dp, start = 150.dp)){
            Button(onClick = { /*TODO*/ }) {
                Text("Login")
            }
        }
}
}