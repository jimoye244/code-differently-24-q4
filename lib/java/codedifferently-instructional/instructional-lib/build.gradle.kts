/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.6/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    `eclipse`
    id("com.diffplug.spotless") version "6.25.0"
    id("com.adarshr.test-logger") version "4.0.0"
}

group = "com.codedifferently.instructional"

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.2.2")
    testImplementation("org.assertj:assertj-core:3.25.1")

    // This dependency is used by the application.
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.0")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.0")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.guava:guava:31.1-jre")
    implementation("commons-cli:commons-cli:1.6.0")
    implementation("org.projectlombok:lombok:1.18.30")
    implementation("org.springframework.boot:spring-boot-starter:3.2.2")
    implementation("at.favre.lib:bcrypt:0.10.2")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {

    format("misc", {
      // define the files to apply `misc` to
      target("*.gradle", ".gitattributes", ".gitignore")
  
      // define the steps to apply to those files
      trimTrailingWhitespace()
      indentWithTabs() // or spaces. Takes an integer argument if you don't like 4
      endWithNewline()
    })
  
    java {
      // don't need to set target, it is inferred from java
  
      // apply a specific flavor of google-java-format
      googleJavaFormat()
      // fix formatting of type annotations
      formatAnnotations()
    }
  }