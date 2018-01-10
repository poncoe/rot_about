package id.kataponcoe.rotabout.kotlin

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.TextView

import id.kataponcoe.rotabout.R

/**
 * Created by Poncoe on 10/01/18.
 */


class AboutActivity : Activity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_main)

        if (Build.VERSION.SDK_INT >= 21) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }

        changeStatusBarColor()

    }

    private fun changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }

        val teks1: TextView
        val teks2: TextView

        teks1 = findViewById<View>(R.id.txtTentang) as TextView

        val tampilan = Typeface.createFromAsset(assets, "fonts/Back-to-School.ttf")
        teks1.typeface = tampilan
    }

    private fun tentang() {
        AlertDialog.Builder(this).setTitle(R.string.tentang)
                .setMessage(R.string.tentang_isi)
                .setPositiveButton("OK") { dialoginterface, i -> }.show()

    }
}