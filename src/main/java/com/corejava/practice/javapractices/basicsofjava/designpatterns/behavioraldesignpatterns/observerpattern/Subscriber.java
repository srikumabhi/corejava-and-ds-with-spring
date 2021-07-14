package com.corejava.practice.javapractices.basicsofjava.designpatterns.behavioraldesignpatterns.observerpattern;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Subscriber {

	public String name;

	public Channel channel = new Channel();

	public Subscriber(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println("Hey, " +name+" Vedio Uploaded:-"+channel.title);
	}

	public void subscriberChannel(Channel channel) {
		this.channel = channel;
	}

}
