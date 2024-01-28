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
 
package org.spdx.library.model.v3.security;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.library.DefaultModelStore;
import org.spdx.library.InvalidSPDXAnalysisException;
import org.spdx.library.ModelCopyManager;
import org.spdx.library.model.ModelObject;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Optional;
import org.spdx.library.SpdxConstants;
import org.spdx.library.model.v3.core.ProfileIdentifierType;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * VexVulnAssessmentRelationship is an abstract subclass that defined the common 
 * properties shared by all the SPDX-VEX status relationships. **Constraints** When 
 * linking elements using a VexVulnAssessmentRelationship, the following requirements 
 * must be observed: - The from: end must be a /Security/Vulnerability classed element 
 * - The to: end must point to elements representing the VEX _products_. To specify a 
 * different element where the vulnerability was detected, the VEX relationship can 
 * optionally specify _subcomponents_ using the assessedElement property. VEX inherits 
 * information from the document level down to its statements. When a statement is missing 
 * information it can be completed by reading the equivalent field from the containing 
 * document. For example, if a VEX relationship is missing data in its createdBy property, 
 * tools must consider the entity listed in the CreationInfo section of the document 
 * as the VEX author. In the same way, when a VEX relationship does not have a created property, 
 * the document's date must be considered as authoritative. 
 */
public class VexVulnAssessmentRelationship extends VulnAssessmentRelationship  {

	
	/**
	 * Create the VexVulnAssessmentRelationship with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the VexVulnAssessmentRelationship
	 */
	public VexVulnAssessmentRelationship() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous, null));
	}

	/**
	 * @param objectUri URI or anonymous ID for the VexVulnAssessmentRelationship
	 * @throws InvalidSPDXAnalysisException when unable to create the VexVulnAssessmentRelationship
	 */
	public VexVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), true);
	}

	/**
	 * @param modelStore Model store where the VexVulnAssessmentRelationship is to be stored
	 * @param objectUri URI or anonymous ID for the VexVulnAssessmentRelationship
	 * @param copyManager Copy manager for the VexVulnAssessmentRelationship - can be null if copying is not required
	 * @param create true if VexVulnAssessmentRelationship is to be created
	 * @throws InvalidSPDXAnalysisException when unable to create the VexVulnAssessmentRelationship
	 */
	public VexVulnAssessmentRelationship(IModelStore modelStore, String objectUri, @Nullable ModelCopyManager copyManager,
			boolean create)	throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create);
	}

	/**
	 * Create the VexVulnAssessmentRelationship from the builder - used in the builder class
	 * @param builder Builder to create the VexVulnAssessmentRelationship from
	 * @throws InvalidSPDXAnalysisException when unable to create the VexVulnAssessmentRelationship
	 */
	protected VexVulnAssessmentRelationship(VexVulnAssessmentRelationshipBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		setStatusNotes(builder.statusNotes);
		setVexVersion(builder.vexVersion);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.model.ModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Security.VexVulnAssessmentRelationship";
	}
	
	// Getters and Setters
	

		/**
	 * @return the statusNotes
	 */
	public Optional<String> getStatusNotes() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstants.SECURITY_PROP_STATUS_NOTES);
	}
	/**
	 * @param statusNotes the statusNotes to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public VexVulnAssessmentRelationship setStatusNotes(@Nullable String statusNotes) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstants.SECURITY_PROP_STATUS_NOTES, statusNotes);
		return this;
	}

		/**
	 * @return the vexVersion
	 */
	public Optional<String> getVexVersion() throws InvalidSPDXAnalysisException {
		return getStringPropertyValue(SpdxConstants.SECURITY_PROP_VEX_VERSION);
	}
	/**
	 * @param vexVersion the vexVersion to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public VexVulnAssessmentRelationship setVexVersion(@Nullable String vexVersion) throws InvalidSPDXAnalysisException {
		setPropertyValue(SpdxConstants.SECURITY_PROP_VEX_VERSION, vexVersion);
		return this;
	}
	
	
	@Override
	public String toString() {
		return "VexVulnAssessmentRelationship: "+getObjectUri();
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.ModelObject#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<ProfileIdentifierType> profiles) {
		List<String> retval = new ArrayList<>();
		retval.addAll(super._verify(verifiedIds, specVersionForVerify, profiles));
		try {
			@SuppressWarnings("unused")
			Optional<String> statusNotes = getStatusNotes();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting statusNotes for VexVulnAssessmentRelationship: "+e.getMessage());
		}
		try {
			@SuppressWarnings("unused")
			Optional<String> vexVersion = getVexVersion();
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting vexVersion for VexVulnAssessmentRelationship: "+e.getMessage());
		}
		return retval;
	}
	
	public static class VexVulnAssessmentRelationshipBuilder extends VulnAssessmentRelationshipBuilder {
	
		/**
		 * Create an VexVulnAssessmentRelationshipBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public VexVulnAssessmentRelationshipBuilder(ModelObject from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous, null));
		}
	
		/**
		 * Create an VexVulnAssessmentRelationshipBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @param objectUri
		 */
		public VexVulnAssessmentRelationshipBuilder(ModelObject from, String objectUri) {
			this(from.getModelStore(), objectUri, from.getCopyManager());
			setStrict(from.isStrict());
		}
		
		/**
		 * Creates a VexVulnAssessmentRelationshipBuilder
		 * @param modelStore model store for the built VexVulnAssessmentRelationship
		 * @param objectUri objectUri for the built VexVulnAssessmentRelationship
		 * @param copyManager optional copyManager for the built VexVulnAssessmentRelationship
		 */
		public VexVulnAssessmentRelationshipBuilder(IModelStore modelStore, String objectUri, @Nullable ModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		String statusNotes = null;
		String vexVersion = null;
		
		
		/**
		 * Sets the initial value of statusNotes
		 * @parameter statusNotes value to set
		 * @return this for chaining
		**/
		public VexVulnAssessmentRelationshipBuilder setStatusNotes(String statusNotes) {
			this.statusNotes = statusNotes;
			return this;
		}
		
		/**
		 * Sets the initial value of vexVersion
		 * @parameter vexVersion value to set
		 * @return this for chaining
		**/
		public VexVulnAssessmentRelationshipBuilder setVexVersion(String vexVersion) {
			this.vexVersion = vexVersion;
			return this;
		}
	
		
		/**
		 * @return the VexVulnAssessmentRelationship
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public VexVulnAssessmentRelationship build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = modelStore.enterCriticalSection(false);
			try {
				return new VexVulnAssessmentRelationship(this);
			} finally {
				modelStore.leaveCriticalSection(lock);
			}
		}
	}
}
