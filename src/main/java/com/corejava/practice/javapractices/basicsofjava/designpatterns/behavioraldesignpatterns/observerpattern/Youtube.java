package com.corejava.practice.javapractices.basicsofjava.designpatterns.behavioraldesignpatterns.observerpattern;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Youtube {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Subscriber Subscriber1 = new Subscriber("Abhishek");
		Subscriber Subscriber2 = new Subscriber("Rinshu");
		Subscriber Subscriber3 = new Subscriber("Amit");
		Subscriber Subscriber4 = new Subscriber("Krishan");
		Subscriber Subscriber5 = new Subscriber("Ram");

		Channel exampleOfObserverPattern = new Channel();
		exampleOfObserverPattern.addSubscriber(Subscriber1);
		exampleOfObserverPattern.addSubscriber(Subscriber2);
		exampleOfObserverPattern.addSubscriber(Subscriber3);
		exampleOfObserverPattern.addSubscriber(Subscriber4);
		exampleOfObserverPattern.addSubscriber(Subscriber5);

		Subscriber1.subscriberChannel(exampleOfObserverPattern);
		Subscriber2.subscriberChannel(exampleOfObserverPattern);
		Subscriber3.subscriberChannel(exampleOfObserverPattern);
		Subscriber4.subscriberChannel(exampleOfObserverPattern);
		Subscriber5.subscriberChannel(exampleOfObserverPattern);

		exampleOfObserverPattern.unSubscriber(Subscriber3);

		exampleOfObserverPattern.upload("Example Of Observer Pattern.");
	}
}
