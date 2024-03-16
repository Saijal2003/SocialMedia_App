plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.miniproject1"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.miniproject1"
        minSdk = 21
        targetSdk = 33
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.1.2")
    implementation("com.google.firebase:firebase-database:20.2.2")
    implementation("com.google.firebase:firebase-firestore:24.8.1")
    implementation("com.google.firebase:firebase-storage:20.2.1")
    implementation("com.google.firebase:firebase-messaging:23.2.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



    // dependency for exoplayer
    implementation ("com.google.android.exoplayer:exoplayer:2.15.1")



    // for core support in exoplayer.
    implementation ("com.google.android.exoplayer:exoplayer-core:2.15.1")



    // for adding dash support in our exoplayer.
    implementation ("com.google.android.exoplayer:exoplayer-dash:2.15.1")

    // for generating default ui of exoplayer
    implementation ("com.google.android.exoplayer:exoplayer-ui:2.15.1")

    // for adding hls support in exoplayer.
    implementation ("com.google.android.exoplayer:exoplayer-hls:2.15.1")

    // for smooth streaming of video in our exoplayer.
    implementation ("com.google.android.exoplayer:exoplayer-smoothstreaming:2.15.1")

    //  Picasso Library
    implementation ("com.squareup.picasso:picasso:2.8")
}