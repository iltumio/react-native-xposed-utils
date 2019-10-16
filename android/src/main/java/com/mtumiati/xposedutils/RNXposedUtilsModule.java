
package com.mtumiati.xposedutils;

import android.content.pm.PackageInfo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;
import com.mtumiati.xposedutils.XposedUtils;

import java.util.ArrayList;

public class RNXposedUtilsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNXposedUtilsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNXposedUtils";
  }

  @ReactMethod
  public void getXposedVersion(Promise promise){
    try{
      Integer result = XposedUtils.getXposedVersion(this.reactContext.getApplicationContext());
      promise.resolve(result);
    }catch(Exception ex){
      ex.printStackTrace();
      promise.reject(null, ex.getMessage());
    }
  }

  @ReactMethod
  public void isXposedInstallerAvailable(Promise promise){
    try{
      Boolean result = XposedUtils.isXposedInstallerAvailable(this.reactContext.getApplicationContext());
      promise.resolve(result);
    }catch(Exception ex){
      ex.printStackTrace();
      promise.reject(null, ex.getMessage());
    }
  }

  @ReactMethod
  public void isXposedActive(Promise promise){
    try{
      Boolean result = XposedUtils.isXposedActive();
      promise.resolve(result);
    }catch(Exception ex){
      ex.printStackTrace();
      promise.reject(null, ex.getMessage());
    }
  }

  @ReactMethod
  public void getInstalledXposedPackages(Promise promise){
    try{
      ArrayList<PackageInfo> xposedPackages = XposedUtils.getInstalledXposedPackages(this.reactContext.getApplicationContext());
      WritableArray result = Arguments.fromList(xposedPackages);
      promise.resolve(result);
    }catch(Exception ex){
      ex.printStackTrace();
      promise.reject(null, ex.getMessage());
    }
  }

}