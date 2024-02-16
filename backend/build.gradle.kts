import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
application{
    mainClass.set("com.example.backend.ServerKT")
}

plugins {
    kotlin("jvm")
    application
    id("com.github.johnrengelman.shadow") version Versions.SHADOW_JAR_VERSION
}

dependencies {
    // Ktor
    implementation(Versions.Jvm.KTOR_CLIENT_APACHE)
    implementation(Versions.Jvm.KTOR_SERIALIZATION)
    implementation(Versions.Jvm.KTOR_SERVER_NETTY)
    implementation(Versions.Jvm.KTOR_AUTH)
    implementation(Versions.Jvm.KTOR_WEB_SOCKETS)
    implementation(Versions.Jvm.KTOR_CLIENT_APACHE)
}

tasks.withType<ShadowJar> {
    archiveBaseName.set("Backend")
    archiveClassifier.set("")
    dependsOn("distTar", "distZip")
    archiveVersion.set("")
    isZip64 = true
}