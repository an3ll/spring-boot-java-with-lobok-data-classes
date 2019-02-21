group = "se.inera.intyg"
version = "0.0.1-SNAPSHOT"

plugins {
  id("org.springframework.boot").version("2.1.3.RELEASE")

  application
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {

  // Lombok
  annotationProcessor("org.projectlombok:lombok:1.18.6")
  implementation("org.projectlombok:lombok:1.18.6")

  // Spring Boot starters
  implementation("org.springframework.boot:spring-boot-starter-web:2.1.3.RELEASE")

  // Spring Boot test starters
  testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.3.RELEASE")

}

application {
  // Define the main class for the application.
  mainClassName = "se.inera.intyg.intygsbestallning.IntygsbestallningApplication"
}

tasks {
  withType<JavaCompile> {
    sourceCompatibility = "11"
    targetCompatibility = "11"
  }
}
