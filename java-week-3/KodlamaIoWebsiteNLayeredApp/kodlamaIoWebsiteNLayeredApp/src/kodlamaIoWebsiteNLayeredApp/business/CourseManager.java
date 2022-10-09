package kodlamaIoWebsiteNLayeredApp.business;

import java.util.List;

import kodlamaIoWebsiteNLayeredApp.core.logging.Logger;
import kodlamaIoWebsiteNLayeredApp.dataAccess.CourseDao;
import kodlamaIoWebsiteNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		if (course.getCoursePrice() < 0) {
			throw new Exception("kurs fiyatý 0 dan küçük olamaz ");
		}
		for (Course c : courses) {
			if (c.getCourseName().contains(c.getCourseName())) {
				throw new Exception("kurs bilgisi ayný olamaz ");
			}
		}
		courseDao.add(course);
		courses.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
