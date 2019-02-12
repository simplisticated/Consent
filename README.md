<p align="center" >
	<img src="images/logo_2048_2048.png" alt="Consent" title="Consent" width="300" height="300">
</p>

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
    implementation 'com.github.igormatyushkin014:Consent:1.2'
}
```

## Requirements

* Android SDK 23 and later
* Android Studio 3.3 and later
* Kotlin 1.3.20 or later

## Usage

The main idea of `Consent` library is to keep all things as simple as possible. That's why all methods are available directly from `Activity` and `Context` instances.

You can use string permissions from `Manifest.permission` collection or special `Permission` type. Example:

```kotlin
val stringPermission = Manifest.permission.CAMERA
val permission = Permission.CAMERA
```

All public methods in the library give you a freedom to choose whether you want to use string values or built-in permissions. The `Permission` class gives you a little more flexibility, but you always can decide whether you need it.

### Check Permissions

Lambda syntax:

```kotlin
checkConsent(
    Permission.CAMERA,
    Permission.WRITE_EXTERNAL_STORAGE
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

Regular syntax:

```kotlin
val result = checkConsent(
    Permission.CAMERA,
    Permission.WRITE_EXTERNAL_STORAGE
).result

if (result.hasBlocked) {
    // Handle blocked permissions
} else {
    // All permissions are available
}
```

Another example of regular syntax:

```kotlin
val allowedAccess = !checkConsent(
    Manifest.permission.CAMERA,
    Manifest.permission.WRITE_EXTERNAL_STORAGE
).result.hasBlocked

if (allowedAccess) {
    // All permissions are available
} else {
    // Show warning to user
}
```

Both syntaxes are equivalent to each other and interchangeable. In other words, both of them return the same result. That's up to you which one to use.

### Request Permissions

The same as previous example but replace `checkConsent` with `getConsent`:

```kotlin
getConsent(
    Permission.CAMERA,
    Permission.WRITE_EXTERNAL_STORAGE
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

### Syntactic sugar

Since version `1.2` you can also check permissions directly from `Permission` object:

```kotlin
val result = Permission.CAMERA.checkConsent(
    this
).result
```

Also, from array:

```kotlin
val result = arrayOf(
    Permission.CAMERA,
    Permission.WRITE_EXTERNAL_STORAGE
).checkConsent(this).result
```

Lambda version:

```kotlin
arrayOf(
    Permission.CAMERA,
    Permission.WRITE_EXTERNAL_STORAGE
).checkConsent(this).whenFinished { result ->
    // Handle result
}
```

You can also request for single permission in similar way:

```kotlin
// Request single permission

Permission.CAMERA.getConsent(
    this
).whenFinished { result ->
    // Handle result
}
```

Request for multiple permissions:

```kotlin
arrayOf(
    Permission.CAMERA,
    Permission.WRITE_EXTERNAL_STORAGE
).getConsent(this).whenFinished { result ->
    // Handle result
}
```

## License

`Consent` is available under the Apache 2.0 license. See the [LICENSE](./LICENSE) file for more info.
