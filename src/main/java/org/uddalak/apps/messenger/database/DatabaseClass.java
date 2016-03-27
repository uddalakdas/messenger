package org.uddalak.apps.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.uddalak.apps.messenger.model.Message;
import org.uddalak.apps.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long,Message> messages = new HashMap<>();
	private static Map<String,Profile> profiles = new HashMap<>();
	static{
		messages.put(1L, new Message(1,"Hello World","Uddalak"));
		messages.put(2L,new Message(2,"Hello Jersey","Uddalak"));
	}
	static {
		profiles.put("uddas", new Profile(1L,"uddas","uddalak","das"));
	}
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String,Profile> getProfiles(){
		return profiles;
	}
}
