package ie.dorset.lucasbandeira23884.ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        setSupportActionBar(myToolbar)

        val addButton = findViewById<Button>(R.id.Hobbiesbutton)
        addButton.setOnClickListener {
            val intent = Intent (this, FourthActivity::class.java)
            startActivity(intent)
        }
        val addButton1 = findViewById<Button>(R.id.Educationbutton)
        addButton1.setOnClickListener {
            val intent = Intent (this, SecondActivity::class.java)
            startActivity(intent)
        }
        val addButton2 = findViewById<Button>(R.id.Homebutton)
        addButton2.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}