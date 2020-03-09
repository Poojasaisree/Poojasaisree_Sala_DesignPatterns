package com.epam.behavioral_patterns;

import java.util.ArrayList;
import java.util.List;

public class Communication implements Chat{
	private List<GroupMember> users;

	public Communication(){
		this.users=new ArrayList();
	}

	

	public void sendMsg(String msg, GroupMember user) {
		// TODO Auto-generated method stub
		for(GroupMember u : this.users){
			//message should not be received by the user sending it
			if(u != user){
				u.receive(msg);
			}
		}
		
	}

	public void addUser(GroupMember user) {
		// TODO Auto-generated method stub
		this.users.add(user);
		
	}

}
