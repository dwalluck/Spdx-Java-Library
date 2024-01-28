/**
 * Copyright (c) 2024 Source Auditor Inc.
 *
 * SPDX-License-Identifier: Apache-2.0
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
 
package org.spdx.library.model.v3.software;

import org.spdx.library.IndividualUriValue;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * This field provides information about the primary purpose of an Element. Software 
 * Purpose is intrinsic to how the Element is being used rather than the content of the 
 * Element. This field is a reasonable estimate of the most likely usage of the Element 
 * from the producer and consumer perspective from which both parties can draw conclusions 
 * about the context in which the Element exists. 
 */
public enum SoftwarePurpose implements IndividualUriValue {

	TEST("test"),
	EXECUTABLE("executable"),
	OPERATING_SYSTEM("operatingSystem"),
	DOCUMENTATION("documentation"),
	EVIDENCE("evidence"),
	INSTALL("install"),
	SPECIFICATION("specification"),
	MODULE("module"),
	FRAMEWORK("framework"),
	REQUIREMENT("requirement"),
	MODEL("model"),
	ARCHIVE("archive"),
	SOURCE("source"),
	CONFIGURATION("configuration"),
	CONTAINER("container"),
	FILE("file"),
	DATA("data"),
	MANIFEST("manifest"),
	LIBRARY("library"),
	BOM("bom"),
	OTHER("other"),
	DEVICE("device"),
	PATCH("patch"),
	FIRMWARE("firmware"),
	APPLICATION("application");
	
	private String longName;
	
	private SoftwarePurpose(String longName) {
		this.longName = longName;
	}
	
	@Override
	public String getIndividualURI() {
		return getNameSpace() + "/" + getLongName();
	}
	
	public String getLongName() {
		return longName;
	}
	
	public String getNameSpace() {
		return "https://spdx.org/rdf/v3/Software/SoftwarePurpose";
	}
}

