package com.bumba.contactsapp.di

import com.bumba.contactapp.database.ContactDatabase
import com.bumba.contactsapp.contacts.data.SqlDelightContactDataSource
import com.bumba.contactsapp.contacts.domain.ContactDataSource
import com.bumba.contactsapp.core.data.DataDriverFactory
import com.bumba.contactsapp.core.data.ImageStorage

actual class AppModule {

    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DataDriverFactory().create()
            ),
            imageStorage = ImageStorage()
        )
    }
}