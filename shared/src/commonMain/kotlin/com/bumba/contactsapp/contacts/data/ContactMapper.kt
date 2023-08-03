package com.bumba.contactsapp.contacts.data

import com.bumba.contactsapp.contacts.domain.Contact
import com.bumba.contactsapp.core.data.ImageStorage
import database.ContactEntity

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(it)}
    )
}
