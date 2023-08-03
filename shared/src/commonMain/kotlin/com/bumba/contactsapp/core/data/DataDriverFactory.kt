package com.bumba.contactsapp.core.data

import com.squareup.sqldelight.db.SqlDriver

expect class DataDriverFactory {
    fun create(): SqlDriver
}