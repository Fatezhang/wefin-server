group = "com.wefine"
version = "1.0"
description = "wefine-server"
java.sourceCompatibility = JavaVersion.VERSION_17

plugins {
    id("org.springframework.boot") version "2.7.12"
    id("io.spring.dependency-management") version "1.1.0"
    id("java")
    id("io.freefair.lombok") version "8.0.1"
}

repositories {
    maven {
        url = uri("https://mirrors.tencent.com/nexus/repository/maven-public/")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-configuration-processor")

    implementation("org.flywaydb:flyway-core:7.15.0")
    implementation("net.logstash.logback:logstash-logback-encoder:7.3")

    runtimeOnly("mysql:mysql-connector-java:8.0.32")

    compileOnly("org.springframework.boot:spring-boot-devtools")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}
