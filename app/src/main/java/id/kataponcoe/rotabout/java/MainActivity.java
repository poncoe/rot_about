package id.kataponcoe.rotabout.java;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import id.kataponcoe.rotabout.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_aboutactivity).setOnClickListener(this);
        findViewById(R.id.btn_aboutdialog).setOnClickListener(this);
    }

    private void aboutDialog() {
        new AlertDialog.Builder(this).setTitle(R.string.tentang)
                .setMessage(R.string.tentang_isi)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                    }
                }).show();

    }

    public void onClick(View v) {
        // TODO Auto-generated method stub

        //Func Pengaturan Akun
        if (v.getId() == R.id.btn_aboutactivity) {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
        if (v.getId() == R.id.btn_aboutdialog) {
            aboutDialog();
        }

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
