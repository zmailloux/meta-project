Meta project Jenkins X demo repo based on https://github.com/Zebra/spring-boot-http-gradle

While the original example offers both Maven and Gradle the idea with this demo was to focus purely on Gradle, exercising a new Jenkins X Gradle build pack.

Run locally with `gradlew bootRun`

Test via http://localhost:9000/test

Health check at http://localhost:9001/actuator/health

Credit: thanks to https://github.com/Cervator for the contribution of this quickstart

GCR Setup can be done by following the steps here: https://github.com/jenkins-x/jx/issues/400#issuecomment-398304520