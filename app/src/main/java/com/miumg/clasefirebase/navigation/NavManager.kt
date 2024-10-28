package com.miumg.clasefirebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.miumg.clasefirebase.view.login.BlankView
import com.miumg.clasefirebase.view.login.TabsView
import com.miumg.clasefirebase.view.notas.HomeView
import com.miumg.clasefirebase.viewmodel.LoginViewModel
import com.miumg.clasefirebase.viewmodel.NotesViewModel

@Composable
fun NavManager(loginViewModel: LoginViewModel, notesViewModel: NotesViewModel){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login"){
        composable("blank") {
            BlankView(navController = navController)
        }
        composable("login") {
            TabsView(navController = navController, loginViewModel = loginViewModel)
        }
        composable("home") {
            HomeView(navController = navController, viewModel = notesViewModel)
        }

    }
}