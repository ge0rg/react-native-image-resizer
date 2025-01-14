package com.reactnativeimageresizer;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

public class ImageResizerModule extends NativeImageResizerSpec {
  public static final String NAME = ImageResizerModuleImpl.NAME;
  private Context context;

  public ImageResizerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.context = reactContext;
  }

  @Override
  @NonNull
  public String getName() {
    return ImageResizerModuleImpl.NAME;
  }

  @Override
  public void createdResizedImage(String uri, double width, double height, String format, double quality, Double rotation, @Nullable String outputPath, Boolean keepMeta, @Nullable String mode, Boolean onlyScaleDown, Promise promise) {
    ImageResizerModuleImpl.createdResizedImage(uri, width, height, format, quality, rotation, outputPath, keepMeta, mode, onlyScaleDown, promise, this.context, getReactApplicationContext());
  }
}
