
package com.naqi.imageloader.cache.memory.impl;

import android.graphics.Bitmap;
import com.naqi.imageloader.cache.memory.BaseMemoryCache;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Memory cache with {@linkplain WeakReference weak references} to {@linkplain android.graphics.Bitmap bitmaps}<br />
 * <br />
 * <b>NOTE:</b> This cache uses only weak references for stored Bitmaps.
 *
 *
 * @since 1.5.3
 */
public class WeakMemoryCache extends BaseMemoryCache {
	@Override
	protected Reference<Bitmap> createReference(Bitmap value) {
		return new WeakReference<Bitmap>(value);
	}
}
