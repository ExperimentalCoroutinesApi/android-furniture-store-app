pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        //noinspection JcenterRepositoryObsolete
        jcenter()
    }
}

rootProject.name = "koti"
include(":app")
 