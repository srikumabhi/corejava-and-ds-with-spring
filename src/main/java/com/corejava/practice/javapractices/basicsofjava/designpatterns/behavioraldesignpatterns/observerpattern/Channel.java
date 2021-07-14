package com.corejava.practice.javapractices.basicsofjava.designpatterns.behavioraldesignpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Channel {

	private List<Subscriber> subscribers = new ArrayList<>();
	public String title;

	/**
	 * 
	 * @param subscriber
	 */
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	/**
	 * 
	 * @param subscriber
	 */
	public void unSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	/**
	 * 
	 */
	public void notifySubscribers() {
		for(Subscriber subscriber :subscribers) {
			subscriber.update();
		}
	}

	/**
	 * 
	 * @param title
	 */
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}
}
