package com.example.curriculoportfolio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.curriculoportfolio.ui.theme.CurriculoPortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurriculoPortfolioTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("details") { DetailsScreen(navController) }
        composable("experience") { ExperienceScreen(navController) }
        composable("projects") { ProjectsScreen(navController) }
        composable("contact") { ContactScreen(navController) }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Currículo") })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Nedson Bomman", style = MaterialTheme.typography.h4)
            Text(text = "Desenvolvedor Backend", style = MaterialTheme.typography.subtitle1)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("details") }) {
                Text("Ver Detalhes")
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Detalhes Pessoais") })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Nome: Nedson Nogueira Bomman Junior", style = MaterialTheme.typography.h6)
            Text(text = "Telefone: (81) 997627189", style = MaterialTheme.typography.h6)
            Text(text = "Endereço: Peixinhos, PE, Brasil", style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("experience") }) {
                Text("Experiência Profissional")
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ExperienceScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Experiência Profissional") })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Empresa BM - Desenvolvedor Mobile", style = MaterialTheme.typography.h6)
            Text(text = "Período: Janeiro - Junho 20224", style = MaterialTheme.typography.body1)
            Text(text = "Descrição: Trabalhei em projetos de aplicativos para Android e iOS.", style = MaterialTheme.typography.body2)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("projects") }) {
                Text("Ver Projetos")
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProjectsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Projetos") })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Projeto PIDA - App para entrega de Delivery, usando flutter", style = MaterialTheme.typography.h6)
            Text(text = "Descrição: Aplicativo desenvolvido para facilitar o pedido por alimentos nos interiores.", style = MaterialTheme.typography.body2)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("contact") }) {
                Text("Contato")
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ContactScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Contato") })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Email: nedson.junior9@gmail.com", style = MaterialTheme.typography.h6)
            Text(text = "GitHub: https://github.com/Nedsonjr10", style = MaterialTheme.typography.h6)
        }
    }
}