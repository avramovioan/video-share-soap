package fmi.services.user;

import java.rmi.RemoteException;
import java.util.List;

import fmi.services.user.UserServiceStub.Create;
import fmi.services.user.UserServiceStub.CreateResponse;
import fmi.services.user.UserServiceStub.GetAll;
import fmi.services.user.UserServiceStub.GetAllResponse;
import fmi.services.user.UserServiceStub.GetById;
import fmi.services.user.UserServiceStub.GetByIdResponse;
import fmi.services.user.UserServiceStub.User;

public class UserServiceConsumer {
	
	public void createUser(int id, String firstName, String lastName) throws RemoteException, UserServiceExceptionException {
		UserServiceStub stub = new UserServiceStub();
		
		Create create = new Create();
		create.setId(id);
		create.setFirstName(firstName);
		create.setLastName(lastName);
		
		CreateResponse createResponse = stub.create(create);
		User[] users = createResponse.get_return();
		System.out.println("====createUsers====");
		for(User user: users) {
			printUser(user);
		}
		System.out.println("===================");
	}
	
	public void getAllUsers() throws RemoteException, UserServiceExceptionException {
		UserServiceStub stub = new UserServiceStub();
		GetAll getAll = new GetAll();
		
		GetAllResponse getAllUsers = stub.getAll(getAll);
		User[] users = getAllUsers.get_return();
		System.out.println("====getAllUsers====");
		for(User user: users) {
			printUser(user);
		}
		System.out.println("===================");
	}
	
	public void getUserById(int id) throws RemoteException, UserServiceExceptionException {
		UserServiceStub stub = new UserServiceStub();
		GetById getById = new GetById();
		getById.setId(1);
		
		GetByIdResponse getByIdResponse = stub.getById(getById);
		User user = getByIdResponse.get_return();
		System.out.println("====getUserById====");
		printUser(user);
		System.out.println("===================");
	}
	
	private void printUser(User user) {
		System.out.println("--");
		System.out.println("UserId: "+user.getId());
		System.out.println("FirstName: "+user.getFirstName());
		System.out.println("LastName: "+user.getLastName());
		System.out.println("--");
	}

}

//
//StudentServiceStub stub = new StudentServiceStub();
//
//GetAllStudents getAll = new GetAllStudents();
//
//GetAllStudentsResponse response = stub.getAllStudents(getAll);
//
//fmi.service.StudentServiceStub.Student[] students = response.get_return();
//
//System.out.println("GetAllStudents: ");
//
//for(StudentServiceStub.Student student : students) {
//	System.out.println("Name of student: " + student.getName() + " | Faculty number: " + student.getFacultyNumber() + " | Specialty: " + student.getSpeciality());
//}
//
//GetStudent getStudent = new GetStudent();
//
//getStudent.setFacultyNumber("1234567890");
//
//GetStudentResponse getStudentResponse = stub.getStudent(getStudent);
//
//StudentServiceStub.Student student = getStudentResponse.get_return();
//
//System.out.println();
//System.out.println("GetStudent: ");
//
//System.out.println("Name of student: " + student.getName() + " | Faculty number: " + student.getFacultyNumber() + " | Specialty: " + student.getSpeciality());
//
//
//}