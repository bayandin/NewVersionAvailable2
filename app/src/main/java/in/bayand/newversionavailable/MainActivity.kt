package `in`.bayand.newversionavailable

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.drawable.GradientDrawable
import android.graphics.Color
import android.os.Build

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
