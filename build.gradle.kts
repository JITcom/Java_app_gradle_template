
plugins {
    java
    application
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.12")
}

java {
    withSourcesJar()
    withJavadocJar()
}

group = "TEMPLATE_GROUP"
version = "0.0.1"

application {
    mainClassName = "TEMPLATE_PATH"
}
sourceSets["main"].java {
    srcDir("src/main")
}

sourceSets["test"].java {
    srcDir("src/test")
}