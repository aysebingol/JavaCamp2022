package kodlamaIoWebsiteNLayeredApp.dataAccess;

import kodlamaIoWebsiteNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	public void add(Instructor instructor) {
		System.out.println("jdbc eğitmen ile veritabanına eklendi");
	}
}
