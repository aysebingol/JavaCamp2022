package kodlamaIoWebsiteNLayeredApp;

import java.util.ArrayList;
import java.util.List;
import kodlamaIoWebsiteNLayeredApp.business.CategoryManager;
import kodlamaIoWebsiteNLayeredApp.business.CourseManager;
import kodlamaIoWebsiteNLayeredApp.business.InstructorManager;
import kodlamaIoWebsiteNLayeredApp.core.logging.DatabaseLogger;
import kodlamaIoWebsiteNLayeredApp.core.logging.EmailLogger;
import kodlamaIoWebsiteNLayeredApp.core.logging.FileLogger;
import kodlamaIoWebsiteNLayeredApp.core.logging.Logger;
import kodlamaIoWebsiteNLayeredApp.dataAccess.HibernateCategoryDao;
import kodlamaIoWebsiteNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaIoWebsiteNLayeredApp.dataAccess.HibernateInstructorDao;
import kodlamaIoWebsiteNLayeredApp.entities.Category;
import kodlamaIoWebsiteNLayeredApp.entities.Course;
import kodlamaIoWebsiteNLayeredApp.entities.Instructor;

public class Main {
	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		Course course1 = new Course(1, "Java", 2000);
		Course course2 = new Course(2, "Java", 5000);
		List<Course> courses = new ArrayList<Course>();

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course1);
		courseManager.add(course2);

		Category category1 = new Category(1, "yazýlým");
		Category category2 = new Category(2, "yazýlým");
		List<Category> categories = new ArrayList<Category>();

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category1);
		categoryManager.add(category2);

		Instructor instructor = new Instructor(1, "Engin");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
	}
}
