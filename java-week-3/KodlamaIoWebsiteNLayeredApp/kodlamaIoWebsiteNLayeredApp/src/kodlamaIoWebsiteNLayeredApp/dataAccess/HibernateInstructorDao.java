package kodlamaIoWebsiteNLayeredApp.dataAccess;

import kodlamaIoWebsiteNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	public void add(Instructor instructor) {
		System.out.println("hibernate e�itmen ile veritaban�na eklendi");
	}
}
