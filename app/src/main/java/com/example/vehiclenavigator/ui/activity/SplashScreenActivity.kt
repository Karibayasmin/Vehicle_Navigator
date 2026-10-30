package com.example.vehiclenavigator.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vehiclenavigator.databinding.ActivitySplashScreenBinding
import com.example.vehiclenavigator.ui.MainActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    //lateinit var appPreference : AppPreference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        //appPreference = AppPreferenceImpl(this)

        /*if(appPreference.getBoolean(AppPreference.IS_LOGGED_IN) == true){
            val intent = Intent(this, FragmentActivity::class.java)
            startActivity(intent)
            finish()

        }else{
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }*/


    }
}