package com.bumba.contactsapp.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

expect class ImagePickerFactory {

    @Composable
    actual fun createPicker(): ImagePicker
}