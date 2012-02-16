/*******************************************************************************
 * Copyright (C) 2011 Angelo Zerr <angelo.zerr@gmail.com>, Pascal Leclercq <pascal.leclercq@gmail.com>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo ZERR - initial API and implementation
 *     Pascal Leclercq - initial API and implementation
 *******************************************************************************/
package org.eclipse.nebula.widgets.picture;

/**
 * Enumeration of image filter.
 * 
 */
public enum ImageFilterExtension {

	bmp, dib, jpeg, jpg, jpe, jfif, gif, tif, tiff, png;

	private String filter;

	private ImageFilterExtension() {
		this.filter = "*." + name();
	}

	public String getFilter() {
		return filter;
	}

	public static String[] createFilterExtension(boolean all,
			ImageFilterExtension... extensions) {
		if (extensions == null) {
			return null;
		}
		String[] filters = new String[all ? extensions.length + 1
				: extensions.length];
		for (int i = 0; i < extensions.length; i++) {
			filters[i] = extensions[i].getFilter();
		}
		if (all) {
			filters[filters.length - 1] = "*.*";
		}
		return filters;
	}
}
