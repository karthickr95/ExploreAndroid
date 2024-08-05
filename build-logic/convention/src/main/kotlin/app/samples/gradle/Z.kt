package app.samples.gradle

import org.gradle.api.JavaVersion

object BuildAttributeUtils {
    const val APPLICATION_GROUP_ID = "com.android.application"
    const val LIBRARY_GROUP_ID = "com.android.library"

    const val COMPILE_SDK = 34
    const val MIN_SDK = 24
    const val TARGET_SDK = 34
    val Java: JavaVersion = JavaVersion.VERSION_17
}