
package com.naqi.imageloader.core.imageaware;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.naqi.imageloader.core.assist.ViewScaleType;

/**
 * Represents image aware view which provides all needed properties and behavior for image processing and displaying
 * through {@link com.naqi.imageloader.core.ImageLoader ImageLoader}.
 * It can wrap any Android {@link android.view.View View} which can be accessed by {@link #getWrappedView()}. Wrapped
 * view is returned in {@link com.naqi.imageloader.core.listener.ImageLoadingListener ImageLoadingListener}'s
 * callbacks.
 *
 *
 * @see ViewAware
 * @see ImageViewAware
 * @see NonViewAware
 * @since 1.9.0
 */
public interface ImageAware {
	/**
	 * Returns width of image aware view. This value is used to define scale size for original image.
	 * Can return 0 if width is undefined.<br />
	 * Is called on UI thread if ImageLoader was called on UI thread. Otherwise - on background thread.
	 */
	int getWidth();

	/**
	 * Returns height of image aware view. This value is used to define scale size for original image.
	 * Can return 0 if height is undefined.<br />
	 * Is called on UI thread if ImageLoader was called on UI thread. Otherwise - on background thread.
	 */
	int getHeight();

	/**
	 * Returns {@linkplain com.naqi.imageloader.core.assist.ViewScaleType scale type} which is used for
	 * scaling image for this image aware view. Must <b>NOT</b> return <b>null</b>.
	 */
	ViewScaleType getScaleType();

	/**
	 * Returns wrapped Android {@link android.view.View View}. Can return <b>null</b> if no view is wrapped or view was
	 * collected by GC.<br />
	 * Is called on UI thread if ImageLoader was called on UI thread. Otherwise - on background thread.
	 */
	View getWrappedView();

	/**
	 * Returns a flag whether image aware view is collected by GC or whatsoever. If so then ImageLoader stop processing
	 * of task for this image aware view and fires
	 * {@link com.naqi.imageloader.core.listener.ImageLoadingListener#onLoadingCancelled(String,
	 * android.view.View) ImageLoadingListener#onLoadingCancelled(String, View)} callback.<br />
	 * Mey be called on UI thread if ImageLoader was called on UI thread. Otherwise - on background thread.
	 *
	 * @return <b>true</b> - if view is collected by GC and ImageLoader should stop processing this image aware view;
	 * <b>false</b> - otherwise
	 */
	boolean isCollected();

	/**
	 * Returns ID of image aware view. Point of ID is similar to Object's hashCode. This ID should be unique for every
	 * image view instance and should be the same for same instances. This ID identifies processing task in ImageLoader
	 * so ImageLoader won't process two image aware views with the same ID in one time. When ImageLoader get new task
	 * it cancels old task with this ID (if any) and starts new task.
	 * <p/>
	 * It's reasonable to return hash code of wrapped view (if any) to prevent displaying non-actual images in view
	 * because of view re-using.
	 */
	int getId();

	/**
	 * Sets image drawable into this image aware view.<br />
	 * Displays drawable in this image aware view
	 * {@linkplain com.naqi.imageloader.core.DisplayImageOptions.Builder#showImageForEmptyUri(
	 *android.graphics.drawable.Drawable) for empty Uri},
	 * {@linkplain com.naqi.imageloader.core.DisplayImageOptions.Builder#showImageOnLoading(
	 *android.graphics.drawable.Drawable) on loading} or
	 * {@linkplain com.naqi.imageloader.core.DisplayImageOptions.Builder#showImageOnFail(
	 *android.graphics.drawable.Drawable) on loading fail}. These drawables can be specified in
	 * {@linkplain com.naqi.imageloader.core.DisplayImageOptions display options}.<br />
	 * Also can be called in {@link com.naqi.imageloader.core.display.BitmapDisplayer BitmapDisplayer}.< br />
	 * Is called on UI thread if ImageLoader was called on UI thread. Otherwise - on background thread.
	 *
	 * @return <b>true</b> if drawable was set successfully; <b>false</b> - otherwise
	 */
	boolean setImageDrawable(Drawable drawable);

	/**
	 * Sets image bitmap into this image aware view.<br />
	 * Displays loaded and decoded image {@link android.graphics.Bitmap} in this image view aware.
	 * Actually it's used only in
	 * {@link com.naqi.imageloader.core.display.BitmapDisplayer BitmapDisplayer}.< br />
	 * Is called on UI thread if ImageLoader was called on UI thread. Otherwise - on background thread.
	 *
	 * @return <b>true</b> if bitmap was set successfully; <b>false</b> - otherwise
	 */
	boolean setImageBitmap(Bitmap bitmap);
}
