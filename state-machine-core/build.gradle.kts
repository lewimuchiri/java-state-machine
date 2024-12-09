plugins {
    id("app-base")
    id("test-suites")
}

group = "io.myunen.libs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(springboot.bom))

    implementation("jakarta.annotation:jakarta.annotation-api")
}

