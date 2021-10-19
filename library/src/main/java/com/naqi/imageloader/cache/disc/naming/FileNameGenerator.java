
package com.naqi.imageloader.cache.disc.naming;

/**
 * Generates names for files at disk cache
 *
 *
 * @since 1.3.1
 */
public interface FileNameGenerator {

	/** Generates unique file name for image defined by URI */
	String generate(String imageUri);
}
