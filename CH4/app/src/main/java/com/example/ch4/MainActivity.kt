package com.example.ch4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                data?.extras?.let {
                    val drink = it.getString("drink")
                    val sugar = it.getString("sugar")
                    val ice = it.getString("ice")
                    if (drink != null && sugar != null && ice != null) {
                        updateUI(drink, sugar, ice)
                    } else {
                        Toast.makeText(this, "發生錯誤，無法讀取數據", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "使用者取消操作", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun updateUI(drink: String, sugar: String, ice: String) {
        val tvMeal = findViewById<TextView>(R.id.tv_meal)
        tvMeal.text = "飲料: $drink\n\n甜度: $sugar\n\n冰塊: $ice"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_choice).setOnClickListener {
            val intent = Intent(this, SecActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }
}
