package id.kataponcoe.rotabout.java;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import id.kataponcoe.rotabout.R;

/**
 * Created by Poncoe on 10/01/18.
 */


public class AboutActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_main);

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        changeStatusBarColor();

    }

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }

        TextView teks1,teks2;

        teks1=(TextView)findViewById(R.id.txtTentang);

        Typeface tampilan= Typeface.createFromAsset(getAssets(), "fonts/Back-to-School.ttf");
        teks1.setTypeface(tampilan);
    }

    private void tentang() {
        new AlertDialog.Builder(this).setTitle(R.string.tentang)
                .setMessage(R.string.tentang_isi)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                    }
                }).show();

    }
}