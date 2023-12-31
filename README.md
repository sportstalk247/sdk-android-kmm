# Sportstalk247 SDK - KMM

First, you need to register SportsTalk API with 'Appkey' and 'Token'.
You need to visit the dashboard with the following URL:

https://dashboard.sportstalk247.com

- Then click on ''Application Management'' link to generate the above

# Setup Gradle Repository

The SportsTalk SDK has been published into **jitpack.io**.

In order to use it in your application, do the following:

1. Add the following in root **build.gradle** file

```groovy
allprojects {
    repositories {
    // ...
       maven {
          url "https://jitpack.io"
       }
    }

}
```

2. Add the following lines in your module **build.gradle** file:

```groovy
implementation 'com.gitlab.sportstalk247.sdk-kmm:core:vX.Y.Z'
```

[![Release](https://jitpack.io/v/com.gitlab.sportstalk247/sdk-kmm.svg)](https://jitpack.io/#com.gitlab.sportstalk247/sdk-kmm)

Then sync again. The gradle build should now be successful.

# Documentation

Full Android SDK documentation found here: https://sportstalk247-sdk-kmm.readthedocs.io/en/latest/
