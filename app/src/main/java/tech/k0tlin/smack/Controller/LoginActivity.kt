package tech.k0tlin.smack.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import tech.k0tlin.smack.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginCreateUserBtnClicked(view: View) {
        val loginIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(loginIntent)
    }

    fun loginLoginBtnClicked(view: View) {

    }
}
