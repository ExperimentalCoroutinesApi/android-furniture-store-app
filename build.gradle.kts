buildscript {

    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
    dependencies {
        val nav_version = "2.9.0"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.50")
        classpath("com.google.gms:google-services:4.4.2")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.8.2" apply false
    id("org.jetbrains.kotlin.android") version "2.1.20" apply false
    id("com.google.dagger.hilt.android") version "2.56.2" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("com.google.devtools.ksp") version "2.1.20-2.0.1" apply false
    id("androidx.room") version "2.7.1" apply false
}