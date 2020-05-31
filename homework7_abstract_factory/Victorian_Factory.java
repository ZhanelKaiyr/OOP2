package homework7_abstract_factory;

public class Victorian_Factory implements Abstract_Factory {

	@Override
	public Chair CreateChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public Sofa CreateSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

	@Override
	public CoffeeTable CreateCoffeeTable() {
		// TODO Auto-generated method stub
		return new VictorianCoffeeTable();
	}

}
