apply<com.ivy.buildsrc.IvyPlugin>()

plugins {
    `android-library`
}

android {
    compileSdk = com.ivy.buildsrc.Project.compileSdkVersion
}

dependencies {
    implementation(project(":item-transactions"))
}