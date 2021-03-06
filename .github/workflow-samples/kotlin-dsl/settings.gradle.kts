plugins {
    id("com.gradle.enterprise") version "3.10.2"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.7.2"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishAlways()
        isUploadInBackground = false
    }
}

rootProject.name = "kotlin-dsl"

