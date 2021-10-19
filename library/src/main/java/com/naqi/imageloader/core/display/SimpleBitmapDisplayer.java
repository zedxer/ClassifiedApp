
package com.naqi.imageloader.core.display;

import android.graphics.Bitmap;
import com.naqi.imageloader.core.assist.LoadedFrom;
import com.naqi.imageloader.core.imageaware.ImageAware;

/**
 * Just displays {@link Bitmap} in {@link com.naqi.imageloader.core.imageaware.ImageAware}
 *
 *
 * @since 1.5.6
 */
public final class SimpleBitmapDisplayer implements BitmapDisplayer {
	@Override
	public void display(Bitmap bitmap, ImageAware imageAware, LoadedFrom loadedFrom) {
		imageAware.setImageBitmap(bitmap);
	}
}