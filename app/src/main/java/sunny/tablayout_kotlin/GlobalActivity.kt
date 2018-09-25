package sunny.tablayout_kotlin

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by Wayan-MECS on 9/24/2018.
 */
open class GlobalActivity : AppCompatActivity() {

    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }
}