pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        // Репозиторий Maven Central
        mavenCentral()

        // Репозиторий Google Maven
        google()

        // Другие репозитории Maven, если необходимо
        maven {
            url = uri("https://мой_репозиторий_maven.com")
        }
    }
}

rootProject.name = "SamsungFinalProject"
include(":app")
 