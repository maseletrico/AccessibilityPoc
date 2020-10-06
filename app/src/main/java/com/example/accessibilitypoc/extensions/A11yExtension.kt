package com.example.accessibilitypoc.extensions

import android.content.Context
import android.provider.Settings

fun Context.isAa11yServiceSelected(): Boolean {
    val prefString =
        Settings.Secure.getString(
            contentResolver,
            Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES
        )
    return !prefString.isNullOrEmpty()
}