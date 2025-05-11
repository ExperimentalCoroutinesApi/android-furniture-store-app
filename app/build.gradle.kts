plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-parcelize")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("com.google.gms.google-services")
    id("androidx.navigation.safeargs")
}

android {
    namespace = "com.example.koti"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.koti"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

}

dependencies {


    implementation("androidx.core:core-ktx:1.16.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    //Navigation Component
    val nav_version = "2.7.6"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    //Hilt
    implementation("com.google.dagger:hilt-android:2.56.2")
    ksp("com.google.dagger:hilt-android-compiler:2.56.2")

    //Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))

    //Firebase SDK for Google Analytics
    implementation("com.google.firebase:firebase-analytics")

    //Firebase
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-firestore")
    implementation("com.google.firebase:firebase-storage")
    implementation("com.google.android.gms:play-services-auth:21.3.0")

    //Coroutines with firebase
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.3")

    //Room database
    implementation ("androidx.room:room-runtime:2.7.1")
    annotationProcessor ("androidx.room:room-compiler:2.7.1")
    ksp("androidx.room:room-compiler:2.7.1")
    implementation("androidx.room:room-ktx:2.7.1")

    //Android Ktx
    implementation("androidx.navigation:navigation-fragment-ktx:2.9.0")

    //Loading button
    implementation("io.writeopia:loading-button:3.0.0")

    //Circular image
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.13.0")

    //Viewpager indicator
    implementation ("it.xabaras.android:viewpagerindicator:2.0")
    //implementation ("com.github.vejei:ViewPagerIndicator:Tag")

    //StepView
    implementation ("com.github.shuhart:stepview:1.5.1")

}
