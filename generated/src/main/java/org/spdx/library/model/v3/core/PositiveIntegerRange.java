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
 
package org.spdx.library.model.v3.core;

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

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import org.spdx.library.SpdxConstants;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
 * PositiveIntegerRange is a tuple of two positive integers that define a range. "begin" 
 * must be less than or equal to "end". 
 */
public class PositiveIntegerRange extends ModelObject  {

	
	/**
	 * Create the PositiveIntegerRange with default model store and generated anonymous ID
	 * @throws InvalidSPDXAnalysisException when unable to create the PositiveIntegerRange
	 */
	public PositiveIntegerRange() throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore().getNextId(IdType.Anonymous, null));
	}

	/**
	 * @param objectUri URI or anonymous ID for the PositiveIntegerRange
	 * @throws InvalidSPDXAnalysisException when unable to create the PositiveIntegerRange
	 */
	public PositiveIntegerRange(String objectUri) throws InvalidSPDXAnalysisException {
		this(DefaultModelStore.getDefaultModelStore(), objectUri, DefaultModelStore.getDefaultCopyManager(), true);
	}

	/**
	 * @param modelStore Model store where the PositiveIntegerRange is to be stored
	 * @param objectUri URI or anonymous ID for the PositiveIntegerRange
	 * @param copyManager Copy manager for the PositiveIntegerRange - can be null if copying is not required
	 * @param create true if PositiveIntegerRange is to be created
	 * @throws InvalidSPDXAnalysisException when unable to create the PositiveIntegerRange
	 */
	public PositiveIntegerRange(IModelStore modelStore, String objectUri, @Nullable ModelCopyManager copyManager,
			boolean create)	throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create);
	}

	/**
	 * Create the PositiveIntegerRange from the builder - used in the builder class
	 * @param builder Builder to create the PositiveIntegerRange from
	 * @throws InvalidSPDXAnalysisException when unable to create the PositiveIntegerRange
	 */
	protected PositiveIntegerRange(PositiveIntegerRangeBuilder builder) throws InvalidSPDXAnalysisException {
		super(builder);
		setEnd(builder.end);
		setBegin(builder.begin);
	}

	/* (non-Javadoc)
	 * @see org.spdx.library.model.ModelObject#getType()
	 */
	@Override
	public String getType() {
		return "Core.PositiveIntegerRange";
	}
	
	// Getters and Setters
	
	
	/**
	 * @return the end
	 */
	public @Nullable Integer getEnd() throws InvalidSPDXAnalysisException {
		Optional<Integer> retval = getIntegerPropertyValue(SpdxConstants.CORE_PROP_END);
		return retval.isPresent() ? retval.get() : null;
	}
	
	/**
	 * @param end the end to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PositiveIntegerRange setEnd(@Nullable Integer end) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(end)) {
			throw new InvalidSPDXAnalysisException("end is a required property");
		}
		if (isStrict() && Objects.nonNull(end) && end < 1) {
			throw new InvalidSPDXAnalysisException("end value " + end + " is less than the minimum 1 in PositiveIntegerRange");
		}
		setPropertyValue(SpdxConstants.CORE_PROP_END, end);
		return this;
	}
	
	/**
	 * @return the begin
	 */
	public @Nullable Integer getBegin() throws InvalidSPDXAnalysisException {
		Optional<Integer> retval = getIntegerPropertyValue(SpdxConstants.CORE_PROP_BEGIN);
		return retval.isPresent() ? retval.get() : null;
	}
	
	/**
	 * @param begin the begin to set
	 * @return this to chain setters
	 * @throws InvalidSPDXAnalysisException 
	 */
	public PositiveIntegerRange setBegin(@Nullable Integer begin) throws InvalidSPDXAnalysisException {
		if (isStrict() && Objects.isNull(begin)) {
			throw new InvalidSPDXAnalysisException("begin is a required property");
		}
		if (isStrict() && Objects.nonNull(begin) && begin < 1) {
			throw new InvalidSPDXAnalysisException("begin value " + begin + " is less than the minimum 1 in PositiveIntegerRange");
		}
		setPropertyValue(SpdxConstants.CORE_PROP_BEGIN, begin);
		return this;
	}
	
	
	@Override
	public String toString() {
		return "PositiveIntegerRange: "+getObjectUri();
	}
	
	/* (non-Javadoc)
	 * @see org.spdx.library.model.ModelObject#_verify(java.util.List)
	 */
	@Override
	public List<String> _verify(Set<String> verifiedIds, String specVersionForVerify, List<ProfileIdentifierType> profiles) {
		List<String> retval = new ArrayList<>();
		try {
			Integer end = getEnd();
			if (Objects.isNull(end) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing end in PositiveIntegerRange");
			}
			if (Objects.nonNull(end) && end < 1) {
				retval.add("end value " + end + " is less than the minimum 1 in PositiveIntegerRange");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting end for PositiveIntegerRange: "+e.getMessage());
		}
		try {
			Integer begin = getBegin();
			if (Objects.isNull(begin) &&
					Collections.disjoint(profiles, Arrays.asList(new ProfileIdentifierType[] { ProfileIdentifierType.CORE }))) {
				retval.add("Missing begin in PositiveIntegerRange");
			}
			if (Objects.nonNull(begin) && begin < 1) {
				retval.add("begin value " + begin + " is less than the minimum 1 in PositiveIntegerRange");
			}
		} catch (InvalidSPDXAnalysisException e) {
			retval.add("Error getting begin for PositiveIntegerRange: "+e.getMessage());
		}
		return retval;
	}
	
	public static class PositiveIntegerRangeBuilder extends ModelObjectBuilder {
	
		/**
		 * Create an PositiveIntegerRangeBuilder from another model object copying the modelStore and copyManager and using an anonymous ID
		 * @param from model object to copy the model store and copyManager from
		 * @throws InvalidSPDXAnalysisException
		 */
		public PositiveIntegerRangeBuilder(ModelObject from) throws InvalidSPDXAnalysisException {
			this(from, from.getModelStore().getNextId(IdType.Anonymous, null));
		}
	
		/**
		 * Create an PositiveIntegerRangeBuilder from another model object copying the modelStore and copyManager
		 * @param from model object to copy the model store and copyManager from
		 * @param objectUri URI for the object
		 * @param objectUri
		 */
		public PositiveIntegerRangeBuilder(ModelObject from, String objectUri) {
			this(from.getModelStore(), objectUri, from.getCopyManager());
			setStrict(from.isStrict());
		}
		
		/**
		 * Creates a PositiveIntegerRangeBuilder
		 * @param modelStore model store for the built PositiveIntegerRange
		 * @param objectUri objectUri for the built PositiveIntegerRange
		 * @param copyManager optional copyManager for the built PositiveIntegerRange
		 */
		public PositiveIntegerRangeBuilder(IModelStore modelStore, String objectUri, @Nullable ModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
		Integer end = null;
		Integer begin = null;
		
		
		/**
		 * Sets the initial value of end
		 * @parameter end value to set
		 * @return this for chaining
		**/
		public PositiveIntegerRangeBuilder setEnd(Integer end) {
			this.end = end;
			return this;
		}
		
		/**
		 * Sets the initial value of begin
		 * @parameter begin value to set
		 * @return this for chaining
		**/
		public PositiveIntegerRangeBuilder setBegin(Integer begin) {
			this.begin = begin;
			return this;
		}
	
		
		/**
		 * @return the PositiveIntegerRange
		 * @throws InvalidSPDXAnalysisException on any errors during build
		 */
		public PositiveIntegerRange build() throws InvalidSPDXAnalysisException {
			IModelStoreLock lock = modelStore.enterCriticalSection(false);
			try {
				return new PositiveIntegerRange(this);
			} finally {
				modelStore.leaveCriticalSection(lock);
			}
		}
	}
}
