
package com.naqi.imageloader.core.listener;

import android.graphics.Bitmap;
import android.view.View;
import com.naqi.imageloader.core.assist.FailReason;

/**
 * A convenient class to extend when you only want to listen for a subset of all the image loading events. This
 * implements all methods in the {@link com.naqi.imageloader.core.listener.ImageLoadingListener} but does
 * nothing.
 *
 *
 * @since 1.4.0
 */
public class SimpleImageLoadingListener implements ImageLoadingListener {
	@Override
	public void onLoadingStarted(String imageUri, View view) {
		// Empty implementation
	}

	@Override
	public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
		// Empty implementation
	}

	@Override
	public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
		// Empty implementation
	}

	@Override
	public void onLoadingCancelled(String imageUri, View view) {
		// Empty implementation
	}
}
