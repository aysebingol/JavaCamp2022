package oopWithNLayeredApp.dataAccess;
//paket ge�i�leri
import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("JDBC ile veritaban�na eklendi.");
	}
}
