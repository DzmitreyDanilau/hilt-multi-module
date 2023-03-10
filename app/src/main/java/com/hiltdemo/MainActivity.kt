package com.hiltdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hiltdemo.feature1.FeatureOneScreen
import com.hiltdemo.ui.theme.HiltDemoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      val controller = rememberNavController()
      HiltDemoTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          NavHost(
            modifier = Modifier, navController = controller, startDestination = "main"
          ) {

            composable("main") {
              MainScreen(navController = controller)
            }

            composable("featureOne") {
              FeatureOneScreen(navController = controller)
            }
          }
        }
      }
    }
  }
}

@Composable
fun MainScreen(navController: NavController) {
  Column {
    Text(text = "Main Screen")
    Button(onClick = { navController.navigate("featureOne") }) {
      Text(text = "Tap to navigate")
    }
  }
}
