package `in`.bayand.newversionavailable

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        versionName.text = BuildConfig.VERSION_NAME

        val colors = intArrayOf(
            Color.parseColor(BuildConfig.START_COLOR),
            Color.parseColor(BuildConfig.END_COLOR)
        )
        (layout.background as GradientDrawable).colors = colors
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            this.window.statusBarColor = colors[0]
            this.window.navigationBarColor = colors[1]
        }
    }
}
