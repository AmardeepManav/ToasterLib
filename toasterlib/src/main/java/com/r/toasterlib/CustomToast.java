package com.r.toasterlib;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {

    public static void toaster(Context c, String message){
        Toast.makeText(c, message,Toast.LENGTH_SHORT).show();
    }

    public static void randomToast(Context context , String message) {
        Toast.makeText(context, "hello..." + message,Toast.LENGTH_SHORT).show();
    }
}
