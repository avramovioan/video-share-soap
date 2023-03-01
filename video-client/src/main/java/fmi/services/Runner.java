package fmi.services;

import fmi.services.user.UserServiceConsumer;
import fmi.services.video.VideoServiceConsumer;

public class Runner {

	public static void main(String[] args) {
		UserServiceConsumer userServiceConsumer = new UserServiceConsumer();
		VideoServiceConsumer videoServiceConsumer = new VideoServiceConsumer();
		try {
			userServiceConsumer.getUserById(5);
			userServiceConsumer.getAllUsers();
			userServiceConsumer.createUser(5, "Gosho", "Draganov");
			
			System.out.println("=======================================================0");
			
			videoServiceConsumer.getVideoById(1);
			videoServiceConsumer.getAllVideos();
			videoServiceConsumer.createVideo(5, "What happened next?", "Aftermath of Ivan and Maria tragedy.");
		}
		catch (Exception e) {
			System.out.println("Oopps");
		}
		
		
	}
}
