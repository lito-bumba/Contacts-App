package com.bumba.contactsapp.di

import android.content.Context
import com.bumba.contactapp.database.ContactDatabase
import com.bumba.contactsapp.contacts.data.SqlDelightContactDataSource
import com.bumba.contactsapp.contacts.domain.ContactDataSource
import com.bumba.contactsapp.core.data.DataDriverFactory
import com.bumba.contactsapp.core.data.ImageStorage

actual class AppModule(
    private val context: Context
) {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DataDriverFactory(context).create()
            ),
            imageStorage = ImageStorage(context)
        )
    }
}