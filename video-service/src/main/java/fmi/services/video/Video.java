package fmi.services.video;

public class Video {

	int videoId;
	String videoTitle;
	String videoDescription;
	
	public Video(int id, String title, String description) {
		this.videoId = id;
		this.videoTitle = title;
		this.videoDescription = description;
	}

	public int getVideoId() {
		return videoId;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public String getVideoDescription() {
		return videoDescription;
	}
	
}
