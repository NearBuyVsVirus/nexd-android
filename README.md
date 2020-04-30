# Nexd Android App

![Android CI](https://github.com/NexdApp/nexd-android/workflows/Android%20CI/badge.svg?branch=master)

## Build

In order to build the application following Gradle command can be used:

```
./gradlew assembleDebug
```

You can also simply use Android Studio to build, debug and test the project.


## Api client

Api client is being generated by using [OpenAPI Generator](https://openapi-generator.tech/) and the [OpenAPI Generator Gradle Plugin](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin) and **should not be modified by hand**. The configuration is included in the root [build.gradle](https://github.com/NexdApp/nexd-android/blob/develop/build.gradle) file.

Swagger Api documentaion used for generation is available [here](https://nexd-backend-staging.herokuapp.com/api/v1/docs/).

Use following command to trigger a new generation (if e.g. api has changed):

```
./gradlew generateApiClient
```
Please optimize imports on the :api module after a fresh client generation.

## Architecture

The code is structured based on MVVM architeccture and clean architecture with the goal of easier testability and maintainablity. 

### Core technologies and architectures
- [Kotlin](https://github.com/JetBrains/kotlin)
- MVVM as proposed in [Official Android Documentation](https://developer.android.com/jetpack/docs/guide)

## Used libraries
- [RxJava](https://github.com/ReactiveX/RxJava)
- [Retrofit](https://github.com/square/retrofit)
- [Jetpack Navigation](https://developer.android.com/jetpack/)
- [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator)
- TODO

## Localization

We are using [POEditor](https://poeditor.com/) for localization management. Newly introduced strings have to be provided there and after that an automatic push has to be triggered. Contact [andre-stefanov](https://github.com/andre-stefanov) for further details.

## Continous integration/delivery

Github actions are used as CI/CD. 
