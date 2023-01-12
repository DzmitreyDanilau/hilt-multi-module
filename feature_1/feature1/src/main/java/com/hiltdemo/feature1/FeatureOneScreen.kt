package com.hiltdemo.feature1

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun FeatureOneScreen(
  navController: NavController,
  viewModel: FeatureOneViewModel = hiltViewModel()
) {

  Column {
    Button(onClick = { viewModel.print() }) {
      Text(text = "Print Data to console")
    }

    Button(onClick = { viewModel.printValueFromBaseInterface() }) {
      Text(text = "Show popup, common")
    }

    Button(onClick = { navController.navigateUp() }) {
      Text(text = "Navigate back to Main")
    }
  }
}