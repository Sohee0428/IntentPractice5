package com.example.intentpractice5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        DIAL 액션 예제

        dialBnt.setOnClickListener {

//            phoneNumEdt에 입력한 전화번호를 받아서 => 해당 번호에 연결

            val inputPhoneNum = phoneNumEdt.text.toString()


            val myUri = Uri.parse("tel : ${inputPhoneNum}")


            val myIntent = Intent(Intent.ACTION_DIAL, myUri)


            startActivity(myIntent)
        }
    }
}