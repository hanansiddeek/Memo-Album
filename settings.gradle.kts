pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    repositories {
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Memo Album"
include(":app")
