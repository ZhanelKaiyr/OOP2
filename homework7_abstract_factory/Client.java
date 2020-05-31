package homework7_abstract_factory;

public class Client {
	private Chair chair;
	private Sofa sofa;
	private CoffeeTable coffeetable;
	public Client(Abstract_Factory factory) {
		chair= factory.CreateChair();
		sofa=factory.CreateSofa();
		coffeetable=factory.CreateCoffeeTable();
	}
	public String toString() {
		return "ChairType:"+chair+", Sofa type:"+sofa+",Coffee Table type:"+coffeetable;
	}
	
	

}
