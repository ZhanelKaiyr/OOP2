package homework7_factory_method;

public class Road_Logistic extends Logistics {
	@Override
	public Transport Create_Transport() {
		return new Truck();
	}

}
