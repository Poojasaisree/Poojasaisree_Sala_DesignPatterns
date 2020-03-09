package com.epam.behavioral_patterns;

public abstract class GroupMember {
	protected Chat mediator;
	protected String name;
	
	public GroupMember(Chat mediator, String name){
		this.mediator=mediator;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);

}
