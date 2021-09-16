package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail : Array<String>
    private lateinit var dataPassword : Array<String>
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtEmail : EditText = findViewById(R.id.edt_email)
        val edtPass :EditText = findViewById(R.id.edt_password)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        val btnSign : Button = findViewById(R.id.btnSign)
        progressBar = findViewById(R.id.progressbar)
        val btnForget : TextView = findViewById(R.id.forget)
        val btnRemember : RadioButton = findViewById(R.id.remember)

        dataEmail = arrayOf("abdul", "Halim", "Lim")
        dataPassword = arrayOf("123", "neon")

        btnLogin.setOnClickListener{
            progressBar?.visibility = View.VISIBLE
            signIn(edtEmail.text.toString(), edtPass.text.toString())
        }

        btnSign.setOnClickListener {

            startActivity(Intent(this, Register::class.java))
        }


    }



    fun signIn(email : String, password: String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT ).show()
//                Snackbar.make(view, "Mulai", Snackbar.)
                progressBar?.visibility = View.GONE
                startActivity(Intent(this, Home::class.java))

            }else{
                progressBar?.visibility = View.GONE
                Toast.makeText(this, "Wrong Account", Toast.LENGTH_SHORT).show()
            }
        }
    }
}