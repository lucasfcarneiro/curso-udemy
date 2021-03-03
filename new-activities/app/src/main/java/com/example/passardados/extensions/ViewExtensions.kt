package com.example.passardados.extensions

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

fun Activity.showSnackBar (view: View, text: String, context: Context) {
    Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("Action", View.OnClickListener {
        Toast.makeText(context, "Its toast!", Toast.LENGTH_SHORT).show()
    }).show()
}