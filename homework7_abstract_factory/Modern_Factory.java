package homework7_abstract_factory;

public class Modern_Factory implements Abstract_Factory {

	@Override
	public Chair CreateChair() {
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	public Sofa CreateSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

	@Override
	public CoffeeTable CreateCoffeeTable() {
		// TODO Auto-generated method stub
		return new ModernCoffeeTable();
	}

}
