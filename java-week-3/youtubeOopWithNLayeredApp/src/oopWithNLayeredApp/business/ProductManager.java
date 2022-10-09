package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers){
		
			this.productDao = productDao;
			this.loggers = loggers;
			
	}
	public void add(Product product) throws Exception {
		//i� kurallar�
		if(product.getUnitPrice()<10) {
			throw new Exception("�r�n fiyat� 10dan k���k olamaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}

}

