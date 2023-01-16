@file:Suppress("DSL_SCOPE_VIOLATION")

import com.thoughtworks.ark.androidLibrary

plugins {
    alias(libs.plugins.library)
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kapt)
    alias(libs.plugins.router)
    alias(libs.plugins.detekt)
}

apply(from = "../config/jacoco/modules.kts")

androidLibrary {
    namespace = "com.thoughtworks.ark.feature.home.api"
}

dependencies {
    implementation(libs.router)
    kapt(libs.router.compiler)

    testImplementation(libs.junit4)
    androidTestImplementation(libs.androidx.junit.ktx)

    detektPlugins(libs.detekt.formatting)
}