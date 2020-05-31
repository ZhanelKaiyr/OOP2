package homework7_factory_method;

public class Sea_Logistics extends Logistics {
	@Override
	public Transport Create_Transport() {
		return new Ship();
	}

}
