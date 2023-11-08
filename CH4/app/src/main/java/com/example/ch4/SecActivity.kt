package com.example.ch4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        val btn_send = findViewById<Button>(R.id.btn_send)
        val ed_drink = findViewById<EditText>(R.id.ed_drink)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioGroup2 = findViewById<RadioGroup>(R.id.radioGroup2)

        btn_send.setOnClickListener {
            val drink = ed_drink.text.toString()
            val selectedSugarId = radioGroup.checkedRadioButtonId
            val selectedIceId = radioGroup2.checkedRadioButtonId

            if (drink.isNotEmpty() && selectedSugarId != -1 && selectedIceId != -1) {
                val sugarRadioButton = findViewById<RadioButton>(selectedSugarId)
                val iceRadioButton = findViewById<RadioButton>(selectedIceId)

                val b = Bundle()
                b.putString("drink", drink)
                b.putString("sugar", sugarRadioButton.text.toString())
                b.putString("ice", iceRadioButton.text.toString())

                val resultIntent = Intent()
                resultIntent.putExtras(b)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            } else {
                Toast.makeText(this, "請填寫所有選項", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
