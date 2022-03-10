package ie.dorset.lucasbandeira23884.ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_fifth.*

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        setSupportActionBar(myToolbar)

        val addButton = findViewById<Button>(R.id.Homebutton)
        addButton.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
        val addButton1 = findViewById<Button>(R.id.Hobbiesbutton)
        addButton1.setOnClickListener {
            val intent = Intent (this, FourthActivity::class.java)
            startActivity(intent)
        }
    }
}