package com.example.vehiclenavigator.preference

import android.content.Context

class AppPreferenceImpl(context: Context) : AppPreference {

    private val sharedPreferences = context.getSharedPreferences(AppPreference.SHARED_PREF_TABLE_NAME, Context.MODE_PRIVATE)
    private val editor = sharedPreferences.edit()

    override fun getString(key: String): String? {
        return sharedPreferences.getString(key, "")
    }

    override fun setString(key: String, value: String) {
        editor.putString(key, value)
        editor.apply()
    }

    override fun getBoolean(key: String): Boolean? {
        return sharedPreferences.getBoolean(key, false)
    }

    override fun setBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.apply()
    }

    override fun setInt(key: String, value: Int) {
        editor.putInt(key, value)
        editor.apply()
    }

    override fun getInt(key: String): Int? {
        return sharedPreferences.getInt(key, 0)
    }

    override fun clearAll() {
        editor.clear()
        editor.apply()
    }
}