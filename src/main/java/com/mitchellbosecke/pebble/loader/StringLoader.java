/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Original work Copyright (c) 2009-2013 by the Twig Team
 * Modified work Copyright (c) 2013 by Mitchell Bösecke
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.mitchellbosecke.pebble.loader;

import com.mitchellbosecke.pebble.error.LoaderException;

public class StringLoader implements Loader {

	@Override
	public String getSource(String templateName) throws LoaderException {
		return templateName;
	}

	@Override
	public void setPrefix(String prefix) {

	}

	@Override
	public void setSuffix(String suffix) {

	}

	@Override
	public void setCharset(String charset) {

	}

}