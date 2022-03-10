package ie.dorset.lucasbandeira23884.ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        setSupportActionBar(myToolbar)

        val addButton = findViewById<Button>(R.id.Achievementsbutton)
        addButton.setOnClickListener {
            val intent = Intent (this, FifthActivity::class.java)
            startActivity(intent)
        }
        val addButton1 = findViewById<Button>(R.id.Homebutton)
        addButton.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
        val addButton2 = findViewById<Button>(R.id.Skillsbutton)
        addButton.setOnClickListener {
            val intent = Intent (this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}