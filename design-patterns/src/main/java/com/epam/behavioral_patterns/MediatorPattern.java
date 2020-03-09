package com.epam.behavioral_patterns;

public class MediatorPattern {
	public static void main(String[] args) {
		Chat list = new Communication();
		GroupMember user1 = new DisplayMessages(list, "Pooja");
		GroupMember user2 = new DisplayMessages(list, "Shamini");
		GroupMember user3 = new DisplayMessages(list, "Manas");
		GroupMember user4 = new DisplayMessages(list, "Susritha");
		
		list.addUser(user1);
		list.addUser(user2);
		list.addUser(user3);
		list.addUser(user4);
		
		user3.send("Hello !!");
		
	}

}
