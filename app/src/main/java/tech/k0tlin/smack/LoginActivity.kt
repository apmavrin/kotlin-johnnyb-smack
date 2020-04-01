package tech.k0tlin.smack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

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
