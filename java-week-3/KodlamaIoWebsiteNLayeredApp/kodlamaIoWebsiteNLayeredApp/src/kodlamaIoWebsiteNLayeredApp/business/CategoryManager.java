package kodlamaIoWebsiteNLayeredApp.business;

import java.util.List;

import kodlamaIoWebsiteNLayeredApp.core.logging.Logger;
import kodlamaIoWebsiteNLayeredApp.dataAccess.CategoryDao;
import kodlamaIoWebsiteNLayeredApp.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {

		for (Category ct : categories) {
			if (ct.getCategoryName().contains(ct.getCategoryName())) {
				throw new Exception("kategori ismi ayný olamaz");
			}
		}
		categories.add(category);
		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
