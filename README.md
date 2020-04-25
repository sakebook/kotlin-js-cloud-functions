# kotlin-js-cloud-functions

Cloud Functions with Kotlin/JS

## Requirement
- Kotlin v1.3.72
- dukat v0.0.28
- Node.js v13.3.0
- Google Cloud SDK v290.0.0
- Gradle v6.3

## Setup

```shell script
$ git clone git@github.com:sakebook/kotlin-js-cloud-functions.git
```

## Debug
```shell script
$ cd build/js/packages/kotlin-js-cloud-functions
$ npx @google-cloud/functions-framework --target=helloHttp
```

Running local server

```shell script
$ curl -X POST -H "Content-Type: application/json" "http://localhost:8080/"
Hello World
```

## Deploy

Please set up your GCP before running.

```shell script
$ ./gradlew clean compileKotlinJs 
$ ./gradlew packaging
$ cd functions
functions$ gcloud functions deploy helloHttp --region=asia-northeast1 --trigger-http --runtime=nodejs8 --allow-unauthenticated 
```

## [LICENSE](https://github.com/sakebook/kotlin-js-cloud-functions/blob/master/LICENSE)
Copyright (c) 2020 sakebook Licensed under the [Apache License](https://github.com/sakebook/kotlin-js-cloud-functions/blob/master/LICENSE).
