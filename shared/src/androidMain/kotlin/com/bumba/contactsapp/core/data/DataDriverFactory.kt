package com.bumba.contactsapp.core.data

import android.content.Context
import com.bumba.contactapp.database.ContactDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DataDriverFactory(
    private val context: Context
) {

    actual fun create(): SqlDriver {
        return AndroidSqliteDriver(
            ContactDatabase.Schema,
            context,
            "contact.db"
        )
    }
}