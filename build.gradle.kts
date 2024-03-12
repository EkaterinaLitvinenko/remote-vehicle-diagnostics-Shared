plugins {
    kotlin("jvm") version "1.9.22"
    `java-library`
}

group = "sk.fiit.vdv.shared"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    jvmToolchain(21)
}