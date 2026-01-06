plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("cpbase") {
            groupId = "com.cp.device"
            artifactId = "cpbase"
            version = "1.0.0"
            artifact("libs/cpsdk.cpbase.v1.0.0.aar")
        }
    }
}
