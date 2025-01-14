import com.ivy.buildsrc.Hilt
import com.ivy.buildsrc.Networking
import com.ivy.buildsrc.RoomDB

apply<com.ivy.buildsrc.IvyPlugin>()

plugins {
    `android-library`
    id("dagger.hilt.android.plugin")
}

dependencies {
    Hilt()
    implementation(project(":common"))
    implementation(project(":data-model"))
    RoomDB(api = true)
    Networking(api = false)
}