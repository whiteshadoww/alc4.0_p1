package me.snowshadow.andela.profile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profile.setOnClickListener { startActivity(Intent(this@MainActivity, ProfileActivity::class.java)) }
        alc.setOnClickListener { startActivity(Intent(this@MainActivity, AndelaActivity::class.java)) }

    }
}
