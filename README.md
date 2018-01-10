# rot_about
This repository learns about how to create a about. about example is taken from the "Republic of Telesandi" Application project

indonesia : 
repositori ini mempelajari tentang cara membuat sebuah about. contoh about di ambil dari projek Aplikasi "Republic of Telesandi"

# How To Build

here I create 2 examples in the form about dialog and about activity || disini saya membuat 2 contoh dalam bentuk about dialog dan about activity

1. How to make Bar Transparant || Cara Membuat bar menjadi transparan

- Kotlin (put code in onCreate below setContentView || taro kode ini dibawah setContentView)

```javascript

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
        
```             
- Java (put code in OnCreate below setContentView || taro kode ini dibawah setContentView)

```javascript

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

```

2. Setting Font

- Java

```javascript

TextView teks1,teks2;

        teks1=(TextView)findViewById(R.id.txtTentang);

        Typeface tampilan= Typeface.createFromAsset(getAssets(), "fonts/Back-to-School.ttf");
        teks1.setTypeface(tampilan);
    }

```

- Kotlin

```javascript

val teks1: TextView
        val teks2: TextView

        teks1 = findViewById<View>(R.id.txtTentang) as TextView

        val tampilan = Typeface.createFromAsset(assets, "fonts/Back-to-School.ttf")
        teks1.typeface = tampilan
    }

```

3. Configure Dialog

- Kotlin

```javascript

private fun tentang() {
        AlertDialog.Builder(this).setTitle(R.string.title) or setTitle("title")
                .setMessage(R.string.message) or setTitle("message")
                .setPositiveButton("OK") { dialoginterface, i -> }.show()

    }

```

- Java

```javascript

 private void tentang() {
        new AlertDialog.Builder(this).setTitle(R.string.title) or setTitle("title")
                .setMessage(R.string.message) or setTitle("message")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialoginterface, int i) {
                    }
                }).show();

    }

```

4. Configure build.gradl (Module: app) --> Optional

```javascript

    implementation 'com.flaviofaria:kenburnsview:1.0.7'
    implementation 'com.daimajia.easing:library:1.0.1@aar'
    
```

# Output
*please wait, output in gif || tunggu sebentar, output dalam gif

![alt text](https://github.com/kataponcoe/rot_about/blob/master/screenshoot/about.gif?raw=true)
