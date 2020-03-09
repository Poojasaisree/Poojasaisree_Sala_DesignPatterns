package com.epam.behavioral_patterns;

public class DisplayMessages extends GroupMember{
	public DisplayMessages(Chat mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String msg){
		System.out.println(this.name+": Sending Message = "+msg);
		mediator.sendMsg(msg, this);
	}
	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message: "+msg);
	}

}
