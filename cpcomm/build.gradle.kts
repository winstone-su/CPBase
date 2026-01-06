plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("cpcomm") {
            groupId = "com.cp.device"
            artifactId = "cpcomm"
            version = "1.0.2.9"
            artifact("libs/cpsdk.cpcomm.v1.0.2.9.aar")
        }
    }
}
