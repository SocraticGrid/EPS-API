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
package org.socraticgrid.hl7.services.eps.interfaces;

import java.util.Set;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.socraticgrid.hl7.services.eps.model.LinkManagementMessage;
import org.socraticgrid.hl7.services.eps.model.Message;
import org.socraticgrid.hl7.services.eps.model.SynchronizationMessage;
import org.socraticgrid.hl7.services.eps.model.SynchronizationStatus;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 04-Jan-2014 6:15:20 PM
 */
@WebService(name = "psfederation", targetNamespace = "org.socraticgrid.hl7.services.eps")
public interface PSFederationIFace {

	/**
	 * 
	 * @param Events
	 */
	public void receiveEvents(@WebParam(name = "sourceId") String sourceId,
			@WebParam(name = "events") Set<Message> events);

	public Set<Message> pullEvents(@WebParam(name = "syncMsg") String targetId);

	public SynchronizationStatus synchronize(
			@WebParam(name = "syncMsg") SynchronizationMessage syncMsg);

	public boolean linkMananageUpdate(
			@WebParam(name = "msg") LinkManagementMessage msg);

}