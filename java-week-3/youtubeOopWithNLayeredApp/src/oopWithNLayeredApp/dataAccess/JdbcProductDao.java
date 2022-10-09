package oopWithNLayeredApp.dataAccess;
//paket geçiþleri
import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("JDBC ile veritabanýna eklendi.");
	}
}
