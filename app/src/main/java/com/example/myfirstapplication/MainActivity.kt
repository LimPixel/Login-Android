package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var dataEmail : Array<String>
    private lateinit var dataPassword : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail : EditText = findViewById(R.id.edt_email)
        val edtPass :EditText = findViewById(R.id.edt_password)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        val btnSign : Button = findViewById(R.id.btnSign)
        val btnForget : TextView = findViewById(R.id.forget)
        val btnRemember : RadioButton = findViewById(R.id.remember)

        dataEmail = arrayOf("abdul", "Halim", "Lim")
        dataPassword = arrayOf("123", "neon")

    }

    fun signIn(email : String, password: String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT ).show()
            }else{
                Toast.makeText(this, "Wrong Account", Toast.LENGTH_SHORT).show()
            }
        }
    }
}