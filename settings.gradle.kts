pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PMDM_2425_Segundo_Parcial"
include(":coroutinedemo")
include(":bmi")
include(":booksroomdemo")
include(":APIServicesDemo")
include(":movieapp")
include(":cancelingcoroutines")
