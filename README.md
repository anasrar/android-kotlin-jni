Example using JNI on Kotlin using Android NDK (`ndk-build`).

## Build Libs

Install Android NDK, add to PATH (optional, because you can directly execute `ndk-build` using absolute path). Command to build shared object:

```bash
NDK_PROJECT_PATH="app" ndk-build
```

Resulting `app/libs` and `app/obj`

## Gradle

On `app/build.gradle.kts`, set `android.sourceSets.jniLibs.srcDirs` to `libs`:

> [!IMPORTANT]
> This repo using Gradle DSL.

```kotlin
android {
    sourceSets {
        getByName("main") {
            jniLibs.srcDirs("libs")
        }
    }
}
```

## Demo

https://github.com/anasrar/android-kotlin-jni/assets/38805204/c3d5bb9f-981d-4463-9c3e-cf6dccf2bd99

## References

- https://developer.android.com/ndk/guides/ndk-build
- https://developer.android.com/ndk/guides/android_mk
- https://developer.android.com/ndk/guides/application_mk
