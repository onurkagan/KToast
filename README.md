# KToast

[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![](https://jitpack.io/v/onurkagan/ktoast.svg)](https://jitpack.io/#onurkagan/ktoast)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-KToast-green.svg?style=flat )]( https://android-arsenal.com/details/1/6827 )

Custom toast messages.

- You can create customizable toast messages with KToast. 
- Use `KToast.LENGTH_AUTO` for unnormally long texts.
- You can use `Gravity.BOTTOM`, `Gravity.TOP`, `Gravity.LEFT` or `Gravity.RIGHT` for toast position on screen.

*K is not kotlin.


## Cases :

<img src="https://raw.githubusercontent.com/onurkagan/KToast/master/KToast.png" width="100%">

## Examples :
```java
// Success
KToast.successToast(YourActivity.this, "This is a success toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO);

// Info
KToast.infoToast(YourActivity.this, "This is a info toast.", Gravity.BOTTOM, KToast.LENGTH_SHORT);

// Normal
KToast.normalToast(YourActivity.this, "This is a normal toast.", Gravity.BOTTOM, KToast.LENGTH_LONG, R.drawable.ic_infinite_white);

// Warning
KToast.warningToast(YourActivity.this, "This is a warning toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO);

// Error
KToast.errorToast(YourActivity.this, "This is a error toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO);

// Custom Color
KToast.customColorToast(YourActivity.this, "This is a custom color toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO, R.color.fuchsia, R.drawable.ic_infinite_white);

// Custom Drawable
KToast.customBackgroudToast(YourActivity.this, "This is a custom drawable toast.", Gravity.BOTTOM, KToast.LENGTH_AUTO, R.drawable.background_toast, null ,R.drawable.ic_infinite_white);
```

## Installation

Step 1. Add the JitPack repository to your build file. 
```gradle
allprojects {
    repositories {
      maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency
```gradle
dependencies {
  compile 'com.github.onurkagan:ktoast:1.0.2'
}
```
