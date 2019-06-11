plugins {
    java
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}