
package com.naqi.imageloader.core;

import com.naqi.imageloader.core.listener.ImageLoadingListener;
import com.naqi.imageloader.core.listener.ImageLoadingProgressListener;
import com.naqi.imageloader.core.assist.ImageSize;
import com.naqi.imageloader.core.imageaware.ImageAware;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Information for load'n'display image task
 *
 *
 * @see com.naqi.imageloader.utils.MemoryCacheUtils
 * @see DisplayImageOptions
 * @see ImageLoadingListener
 * @see com.naqi.imageloader.core.listener.ImageLoadingProgressListener
 * @since 1.3.1
 */
final class ImageLoadingInfo {

	final String uri;
	final String memoryCacheKey;
	final ImageAware imageAware;
	final ImageSize targetSize;
	final DisplayImageOptions options;
	final ImageLoadingListener listener;
	final ImageLoadingProgressListener progressListener;
	final ReentrantLock loadFromUriLock;

	public ImageLoadingInfo(String uri, ImageAware imageAware, ImageSize targetSize, String memoryCacheKey,
			DisplayImageOptions options, ImageLoadingListener listener,
			ImageLoadingProgressListener progressListener, ReentrantLock loadFromUriLock) {
		this.uri = uri;
		this.imageAware = imageAware;
		this.targetSize = targetSize;
		this.options = options;
		this.listener = listener;
		this.progressListener = progressListener;
		this.loadFromUriLock = loadFromUriLock;
		this.memoryCacheKey = memoryCacheKey;
	}
}
