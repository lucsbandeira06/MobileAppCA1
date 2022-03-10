package ie.dorset.lucasbandeira23884.ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(myToolbar)

        val addButton = findViewById<Button>(R.id.Educationbutton)
        addButton.setOnClickListener {
            val intent = Intent (this, SecondActivity::class.java)
            startActivity(intent)
        }
        val addButton2 = findViewById<Button>(R.id.Homebutton)
        addButton2.setOnClickListener {
            val intent1 = Intent (this, MainActivity::class.java)
            startActivity(intent1)
        }
    }
}