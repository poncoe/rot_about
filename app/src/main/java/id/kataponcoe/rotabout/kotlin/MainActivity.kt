package id.kataponcoe.rotabout.kotlin

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import id.kataponcoe.rotabout.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btn_aboutactivity).setOnClickListener(this)
        findViewById<View>(R.id.btn_aboutdialog).setOnClickListener(this)
    }

    private fun aboutDialog() {
        AlertDialog.Builder(this).setTitle(R.string.tentang)
                .setMessage(R.string.tentang_isi)
                .setPositiveButton("OK") { dialoginterface, i -> }.show()

    }

    override fun onClick(v: View) {
        // TODO Auto-generated method stub

        //Func Pengaturan Akun
        if (v.id == R.id.btn_aboutactivity) {
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }
        if (v.id == R.id.btn_aboutdialog) {
            aboutDialog()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}
