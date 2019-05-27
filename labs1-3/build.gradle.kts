plugins {
    java
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("org.junit.jupiter:junit-jupiter:5.5.0-M1")
    testCompile("org.junit.jupiter:junit-jupiter-params:5.5.0-M1")
    testCompile("org.mockito:mockito-core:2.+")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
