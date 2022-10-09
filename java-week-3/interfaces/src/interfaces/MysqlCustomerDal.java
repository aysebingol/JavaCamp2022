package interfaces;

public class MysqlCustomerDal implements ICustomerDal,IRepository{

	@Override
	public void add() {
		System.out.println("mysql eklendi");
	}
	
}
