
package com.naqi.imageloader.cache.disc.naming;

/**
 * Names image file as image URI {@linkplain String#hashCode() hashcode}
 *
 *
 * @since 1.3.1
 */
public class HashCodeFileNameGenerator implements FileNameGenerator {
	@Override
	public String generate(String imageUri) {
		return String.valueOf(imageUri.hashCode());
	}
}
