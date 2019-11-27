
# React Native Exposed Utils

## Description

A wrapper around [XposedUtils.java](https://gist.github.com/jaredrummler/7b7a7667643f63fcf9e334d8c16ececa) by Jared Rummler that allows your application to detect the presence of Xposed Framework on the phone.

## Getting started

`$ npm install react-native-xposed-utils --save`

### Mostly automatic installation

`$ react-native link react-native-xposed-utils`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNXposedUtilsPackage;` to the imports at the top of the file
  - Add `new RNXposedUtilsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-xposed-utils'
  	project(':react-native-xposed-utils').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-xposed-utils/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-xposed-utils')
  	```


## Usage
```javascript
import RNXposedUtils from 'react-native-xposed-utils';

// TODO: What to do with the module?
RNXposedUtils;
```

## Credits
[XposedUtils.java](https://gist.github.com/jaredrummler/7b7a7667643f63fcf9e334d8c16ececa) by Jared Rummler
  
