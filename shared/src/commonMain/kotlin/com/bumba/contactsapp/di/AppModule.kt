package com.bumba.contactsapp.di

import com.bumba.contactsapp.contacts.domain.ContactDataSource

expect class AppModule {
    val contactDataSource: ContactDataSource
}