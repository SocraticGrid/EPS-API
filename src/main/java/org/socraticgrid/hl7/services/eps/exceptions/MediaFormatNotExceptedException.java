/* 
 * Copyright 2015 Cognitive Medical Systems, Inc (http://www.cognitivemedciine.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socraticgrid.hl7.services.eps.exceptions;

import java.io.Serializable;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 04-Jan-2014 6:15:19 PM
 */
public class MediaFormatNotExceptedException extends InvalidDataException
		implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String format;

	public MediaFormatNotExceptedException() {

	}

	public MediaFormatNotExceptedException(String string) {
		super(string);
	}

	public MediaFormatNotExceptedException(String string, String format) {
		super(string);
		this.format = format;
	}

	public String getFormatId() {
		return format;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFormatId(String newVal) {
		format = newVal;
	}

}