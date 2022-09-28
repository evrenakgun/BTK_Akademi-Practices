
public class MySqlCustomerDal implements ICustomerDal, IRepository{
	// Classlar 1'den fazla interface implement edebilir. Bu durum extends kısmında farklıdır.
	// 1 Class yalnızca 1 classı extend edebilir. Ancak 1 class, 1'den fazla classa extend olabilir.
	
	@Override
	public void add() {
		System.out.println("My sql eklendi");
	}
	
}
