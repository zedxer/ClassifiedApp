
package com.naqi.imageloader.cache.memory.impl;

import android.graphics.Bitmap;

import com.naqi.imageloader.cache.memory.MemoryCache;

import java.util.Collection;
import java.util.Comparator;

/**
 * Decorator for {@link MemoryCache}. Provides special feature for cache: some different keys are considered as
 * equals (using {@link Comparator comparator}). And when you try to put some value into cache by key so entries with
 * "equals" keys will be removed from cache before.<br />
 * <b>NOTE:</b> Used for internal needs. Normally you don't need to use this class.
 *
 *
 * @since 1.0.0
 */
public class FuzzyKeyMemoryCache implements MemoryCache {

	private final MemoryCache cache;
	private final Comparator<String> keyComparator;

	public FuzzyKeyMemoryCache(MemoryCache cache, Comparator<String> keyComparator) {
		this.cache = cache;
		this.keyComparator = keyComparator;
	}

	@Override
	public boolean put(String key, Bitmap value) {
		// Search equal key and remove this entry
		synchronized (cache) {
			String keyToRemove = null;
			for (String cacheKey : cache.keys()) {
				if (keyComparator.compare(key, cacheKey) == 0) {
					keyToRemove = cacheKey;
					break;
				}
			}
			if (keyToRemove != null) {
				cache.remove(keyToRemove);
			}
		}
		return cache.put(key, value);
	}

	@Override
	public Bitmap get(String key) {
		return cache.get(key);
	}

	@Override
	public Bitmap remove(String key) {
		return cache.remove(key);
	}

	@Override
	public void clear() {
		cache.clear();
	}

	@Override
	public Collection<String> keys() {
		return cache.keys();
	}
}
