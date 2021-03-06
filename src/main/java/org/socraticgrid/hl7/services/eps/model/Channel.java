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
package org.socraticgrid.hl7.services.eps.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @version 1.0
 * @created 04-Jan-2014 6:15:19 PM
 */
public class Channel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Topic topic;
	private int durability;
	private int priority;
	private int sequencing;
	private Set<User> subscribersSet;
	private List<Subscription> subscriptionsList;
	private List<Message> messageQueueList;

	public Channel(){

	}

	/**
	 * @return the topic
	 */
	public Topic getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	/**
	 * @return the durability
	 */
	public int getDurability() {
		return durability;
	}

	/**
	 * @param durability the durability to set
	 */
	public void setDurability(int durability) {
		this.durability = durability;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the sequencing
	 */
	public int getSequencing() {
		return sequencing;
	}

	/**
	 * @param sequencing the sequencing to set
	 */
	public void setSequencing(int sequencing) {
		this.sequencing = sequencing;
	}

	/**
	 * @return the subscribersSet
	 */
	public Set<User> getSubscribersSet() {
		return subscribersSet;
	}

	/**
	 * @param subscribersSet the subscribersSet to set
	 */
	public void setSubscribersSet(Set<User> subscribersSet) {
		this.subscribersSet = subscribersSet;
	}

	/**
	 * @return the subscriptionsList
	 */
	public List<Subscription> getSubscriptionsList() {
		return subscriptionsList;
	}

	/**
	 * @param subscriptionsList the subscriptionsList to set
	 */
	public void setSubscriptionsList(List<Subscription> subscriptionsList) {
		this.subscriptionsList = subscriptionsList;
	}

	/**
	 * @return the messageQueueList
	 */
	public List<Message> getMessageQueueList() {
		return messageQueueList;
	}

	/**
	 * @param messageQueueList the messageQueueList to set
	 */
	public void setMessageQueueList(List<Message> messageQueueList) {
		this.messageQueueList = messageQueueList;
	}


}