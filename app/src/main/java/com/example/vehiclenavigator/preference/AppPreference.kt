package com.example.vehiclenavigator.preference

interface  AppPreference {

    companion object{
        const val TOKEN = "token"
        const val REFRESH_TOKEN = "refresh_token"
        const val PHONE = "phone"
        const val IS_LOGGED_IN = "is_logged_in"
        const val EMAIL = "email"
        const val NAME = "name"
        const val PROFESSION = "profession"
        const val PRESENT_ADDRESS = "present_address"
        const val PERMANENT_ADDRESS = "permanent_address"
        const val PROFILE_IMAGE = "profile_image"
        const val ALTERNATIVE_PHONE_NUMBER = "alternative_phone_number"
        const val IS_CAREER_PROFILE_CREATED = "is_career_profile_created"
        const val LAST_PRODUCT_FETCH_TIME = "last_product_fetch_time"
        const val SHARED_PREF_TABLE_NAME = "my_app_pref"
        const val FCM_TOKEN = "fcm_token"
        const val IS_FCM_TOKEN_SENT = "is_fcm_token_sent"
        const val NOTIFICATION_COUNT = "notification_count"
        const val NOTIFICATION_DATE_TIME = "notification_date_time"

    }

    fun getString(key: String): String?
    fun setString(key: String, value: String)
    fun getBoolean(key: String): Boolean?
    fun setBoolean(key: String, value: Boolean)
    //fun setUserData(data: User)
    fun setInt(key: String, value: Int)
    fun getInt(key: String): Int?

    fun clearAll()

}