<p align="center">
	<a href="https://http://www.android.com">
		<img src="https://img.shields.io/badge/android-23-green.svg?style=flat">
	</a>
	<a href="https://jitpack.io/#igormatyushkin014/Consent">
		<img src="https://jitpack.io/v/igormatyushkin014/Consent.svg">
	</a>
	<a href="https://tldrlegal.com/license/apache-license-2.0-(apache-2.0)">
		<img src="https://img.shields.io/badge/License-Apache 2.0-blue.svg?style=flat">
	</a>
</p>

## At a Glance

`Consent` is a library that makes permissions management in Android significantly easier.

## How to Get Started

Add `jitpack.io` repository to your project:

```javascript
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

Then add `Consent` to dependencies list:

```javascript
dependencies {
    implementation 'com.github.igormatyushkin014:Consent:<LATEST_VERSION_ON_JITPACK>'
}
```

## Requirements

* Android SDK 23 and later
* Android Studio 3.3 and later
* Kotlin 1.3.20 or later

## Usage

The main idea of `Consent` library is to keep all things as simple as possible. That's why all methods are available from the activity.

### Check Permissions

```kotlin
checkConsent(
    Manifest.permission.CAMERA,
    Manifest.permission.WRITE_EXTERNAL_STORAGE
).whenFinished { result ->
    if (result.hasBlocked) {
        /*
         * Some permissions are blocked.
         * Let's learn how to retrieve them.
         */
        result.blocked // Contains blocked permissions
        result.allowed // Contains available permissions
    } else {
        // All permissions are available
    }
}
```

### Request Permissions

The same as previous example but replace `checkConsent` with `getConsent`:

```kotlin
getConsent(
    Manifest.permission.CAMERA,
    Manifest.permission.WRITE_EXTERNAL_STORAGE
).whenFinished { result ->
    // Handle the result
}
```

Also, you have to override activity's `onRequestPermissionsResult()` method:

```kotlin
override fun onRequestPermissionsResult(
    requestCode: Int,
    permissions: Array<out String>,
    grantResults: IntArray
) {
    handleConsent(
        requestCode,
        permissions,
        grantResults
    )
}
```

Now, you're all set 🎉🎉🎉

## License

`Consent` is available under the Apache 2.0 license. See the [LICENSE](./LICENSE) file for more info.
