buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        classpath("com.android.tools.build:gradle:4.0.1")
    }
}

allprojects {
    group = "com.marcovalentino"
    version = "0.0.1"

    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}