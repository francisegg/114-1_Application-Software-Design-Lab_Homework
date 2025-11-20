package com.example.kotlin_homework2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sec)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Step6：定義元件變數，並通過 findViewById 取得元件
        val edDrink = findViewById<EditText>(R.id.edDrink)
        val rgSugar = findViewById<RadioGroup>(R.id.rgSugar)
        val rgIce = findViewById<RadioGroup>(R.id.rgIce)
        val btnSend = findViewById<Button>(R.id.btnSend)
        // Step7：設定 btnSend 的點擊事件
        btnSend.setOnClickListener {
            val drinkName = edDrink.text.toString()
            val sugarRadioButtonId = rgSugar.checkedRadioButtonId
            val iceRadioButtonId = rgIce.checkedRadioButtonId

            if (drinkName.isEmpty()) {
                Toast.makeText(this, "請輸入飲料名稱", Toast.LENGTH_SHORT).show()
            } else if (sugarRadioButtonId == -1) {
                Toast.makeText(this, "請選擇甜度", Toast.LENGTH_SHORT).show()
            } else if (iceRadioButtonId == -1) {
                Toast.makeText(this, "請選擇冰塊", Toast.LENGTH_SHORT).show()
            } else {
                val sugar = findViewById<RadioButton>(sugarRadioButtonId).text.toString()
                val ice = findViewById<RadioButton>(iceRadioButtonId).text.toString()

                val b = bundleOf(
                    "drink" to drinkName,
                    "sugar" to sugar,
                    "ice" to ice
                )
                val i = Intent().putExtras(b)
                setResult(Activity.RESULT_OK, i)
                finish()
            }
        }
    }
}