plugins {
    id ("org.springframework.boot" version "2.4.2 RELEASE")
    id ("org.spring.dependency-management" version "1.0.11.RELEASE")
    id ('java')
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation 'org.springframework.boot:spring-boot-starter-data-rest'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'



    annotationProcessor("org.projectlombok:lombok")
    compileOnly("org.projectlombok:lombok")
}

tasks.test {
    useJUnitPlatform()
}