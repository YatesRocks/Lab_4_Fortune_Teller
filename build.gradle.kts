plugins {
    id("java")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // application plugin
    implementation("com.google.guava:guava:32.1.1-jre")

    // testing
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // ui
    implementation("com.miglayout:miglayout:3.7.4")
    implementation("com.formdev:flatlaf:1.6.5")
}

tasks.test {
    useJUnitPlatform()
}


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("lab.four.Main")
}