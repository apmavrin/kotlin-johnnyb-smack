package tech.k0tlin.smack.Controller

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import tech.k0tlin.smack.R
import tech.k0tlin.smack.Services.AuthService
import java.util.*
import kotlin.math.round

class CreateUserActivity : AppCompatActivity() {

    //default user avatar image name
    var userAvatar = "profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatarClicked(view: View) {
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        if (color == 0) {
            userAvatar = "light$avatar"
        } else {
            userAvatar = "dark$avatar"
        }

        val resourceID = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceID)
    }

    fun generateColorClicked(view: View) {
        val random = Random()
        val red = random.nextInt(255)
        val green = random.nextInt(255)
        val blue = random.nextInt(255)

        createAvatarImageView.setBackgroundColor(Color.rgb(red, green, blue))

        val savedRed = red.toDouble() / 255
        val savedGreen = green.toDouble() / 255
        val savedBlue = blue.toDouble() / 255
        //convert to .3digit
        val rounded = round(savedBlue * 1000) / 1000

        avatarColor = "[$savedRed, $savedGreen, $savedBlue, 1]"

    }

    fun createUserClicked(view: View) {
        AuthService.registerUser(this, "j@j.com", "123456") { complete ->
            if (complete) {

            }
        }

    }
}
