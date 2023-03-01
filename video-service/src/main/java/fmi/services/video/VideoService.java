package fmi.services.video;

import java.util.ArrayList;
import java.util.List;

public class VideoService {
	
	List<Video> videosDb;
	
	public VideoService(){
		videosDb = new ArrayList<>();
		videosDb.add(new Video(1, "Stoqn eats", "Stoqn eats pizza"));
		videosDb.add(new Video(2, "Ivan steals", "Ivan ate a slice of Stoqn's pizza"));
		videosDb.add(new Video(3, "Maria sins", "Maria took a bite from Ivan's slice from Stoqns pizza"));
		videosDb.add(new Video(4, "Ivan kills", "Ivan terminated Maria for what she did"));
	}
	
	public Video getById(int id) throws Exception {
		for(Video video: videosDb){
			if(video.videoId == id) {
				return video;
			}
		}
		throw new Exception("No video with that Id");
	}
	
	public List<Video> getAll() throws Exception {
		return this.videosDb;
	}
	
	public List<Video> create(int id, String title, String description) throws Exception {
		for(Video video: videosDb) {
			if(video.videoId == id) {
				throw new Exception("Stoqn already has a video with that Id.");
			}
		}
		this.videosDb.add(new Video(id, title, description));
		return this.videosDb;
	}
	
	

}
