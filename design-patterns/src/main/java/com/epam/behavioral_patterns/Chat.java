package com.epam.behavioral_patterns;

public interface Chat {
	public void sendMsg(String msg, GroupMember user);

	void addUser(GroupMember user);

}
