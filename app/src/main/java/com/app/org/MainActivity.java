package com.app.org;


import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import androidx.navigation.Navigation;

import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
//        NavController navController = Navigation.findNavController(this, R.id.nav_fragment);
//        NavigationUI.setupWithNavController(bottomNavigationView, navController);
//
//        navController.addOnDestinationChangedListener((navController1, navDestination, bundle) -> {
//            int id = navDestination.getId();
//
//            switch (id) {
//                case R.id.nav_home:
//                    Toast.makeText(MainActivity.this, "HOME", Toast.LENGTH_LONG).show();
//                    break;
//                case R.id.nav_profile:
//                    Toast.makeText(MainActivity.this, "PROFILE", Toast.LENGTH_SHORT).show();
//                    break;
//                case R.id.nav_settings:
//                    Toast.makeText(MainActivity.this, "SETTING", Toast.LENGTH_SHORT).show();
//                    break;
//                case R.id.nav_about_us:
//                    Toast.makeText(MainActivity.this, "ABOUT US", Toast.LENGTH_SHORT).show();
//                    break;
//            }
//        });
    }
}
