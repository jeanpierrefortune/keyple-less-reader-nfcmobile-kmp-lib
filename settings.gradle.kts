rootProject.name = "keyple-less-reader-nfcmobile-kmp-lib"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
    }
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        classpath("org.eclipse.keyple:keyple-gradle:0.+")
        classpath("com.diffplug.spotless:spotless-plugin-gradle:6.25.0")

        classpath("javax.xml.bind:jaxb-api:2.3.1")
        classpath("com.sun.xml.bind:jaxb-impl:2.3.9")
    }
}