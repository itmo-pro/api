plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.6"
    id("org.openapi.generator") version "7.8.0"
}

group = "ru.itmo"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

val gen = "$projectDir/src/main/gen"
val openapiGeneratorPluginVer = "7.8.0"
val springDocVer = "1.7.0"
val swaggerAnnotationsVer = "2.2.23"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    implementation("jakarta.validation:jakarta.validation-api")
    implementation("org.openapitools:openapi-generator-gradle-plugin:$openapiGeneratorPluginVer")
    implementation("org.springdoc:springdoc-openapi-ui:$springDocVer")
    implementation("io.swagger.core.v3:swagger-annotations:$swaggerAnnotationsVer")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

sourceSets["main"].java.srcDir(file(gen))

tasks.withType<Test> {
    useJUnitPlatform()
}

