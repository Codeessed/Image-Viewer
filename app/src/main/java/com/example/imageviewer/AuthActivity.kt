package com.example.imageviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val navHost = supportFragmentManager.findFragmentById(R.id.auth_navHost_Container)
                as NavHostFragment
        val navController = navHost.findNavController()
        val navGraph = navController.navInflater.inflate(R.navigation.auth_graph)
        navController.graph = navGraph

    }
}