val packageGroup by extra { "com.gitlab.sportstalk247.sdk-kmm" }
val packageVersion by extra { "2.0.0-beta02" }
val nativeFrameworkName by extra { "Sportstalk247Kit" }

// https://youtrack.jetbrains.com/issue/KTIJ-19369
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinSerialization) apply false
    alias(libs.plugins.googleKsp) apply false
    alias(libs.plugins.kmpNativeCoroutines) apply false
    alias(libs.plugins.kmmBridge) apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
