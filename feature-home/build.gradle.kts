@file:Suppress("DSL_SCOPE_VIOLATION", "UnstableApiUsage")

import com.thoughtworks.ark.androidLibrary
import com.thoughtworks.ark.autoImplementation
import com.thoughtworks.ark.enableCompose

plugins {
    alias(libs.plugins.library)
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kapt)
    alias(libs.plugins.hilt)
    alias(libs.plugins.router)
    alias(libs.plugins.detekt)
}

apply(from = "../config/jacoco/modules.kts")

androidLibrary {
    namespace = "com.thoughtworks.ark.feature.home"

    enableCompose()
}

dependencies {
    api(project(":feature-home-api"))

    autoImplementation("feature-dashboard-api", "1.0.0")

    implementation(libs.core.ktx)
    implementation(libs.material)
    implementation(libs.bundles.compose)
    implementation(libs.accompanist.permission)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.router)
    kapt(libs.router.compiler)

    api(libs.ark.ui)

    testImplementation(libs.junit4)

    androidTestImplementation(libs.androidx.junit.ktx)

    detektPlugins(libs.detekt.formatting)
}