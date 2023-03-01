package fmi.services.video;

import java.rmi.RemoteException;

import fmi.services.video.VideoServiceStub.Create;
import fmi.services.video.VideoServiceStub.CreateResponse;
import fmi.services.video.VideoServiceStub.GetAll;
import fmi.services.video.VideoServiceStub.GetAllResponse;
import fmi.services.video.VideoServiceStub.GetById;
import fmi.services.video.VideoServiceStub.GetByIdResponse;
import fmi.services.video.VideoServiceStub.Video;


public class VideoServiceConsumer {
	
	public void createVideo(int id, String title, String description) throws RemoteException, VideoServiceExceptionException {
		VideoServiceStub stub = new VideoServiceStub();
		
		Create create = new Create();
		create.setId(id);
		create.setTitle(title);
		create.setDescription(description);
		
		CreateResponse createResponse = stub.create(create);
		Video[] videos = createResponse.get_return();
		System.out.println("====createVideo====");
		for(Video video: videos) {
			printVideo(video);
		}
		System.out.println("===================");
	}
	
	public void getAllVideos() throws RemoteException, VideoServiceExceptionException {
		VideoServiceStub stub = new VideoServiceStub();
		GetAll getAll = new GetAll();
		
		GetAllResponse getAllVideos = stub.getAll(getAll);
		Video[] videos = getAllVideos.get_return();
		System.out.println("====getAllVideos====");
		for(Video video: videos) {
			printVideo(video);
		}
		System.out.println("===================");
	}
	
	public void getVideoById(int id) throws RemoteException, VideoServiceExceptionException {
		VideoServiceStub stub = new VideoServiceStub();
		GetById getById = new GetById();
		getById.setId(1);
		
		GetByIdResponse getByIdResponse = stub.getById(getById);
		Video video= getByIdResponse.get_return();
		System.out.println("====getVideoById====");
		printVideo(video);
		System.out.println("===================");
	}
	
	private void printVideo(Video video) {
		System.out.println("--");
		System.out.println("VideoId: "+video.getVideoId());
		System.out.println("Title: "+video.getVideoTitle());
		System.out.println("Description: "+video.getVideoDescription());
		System.out.println("--");
	}
}
