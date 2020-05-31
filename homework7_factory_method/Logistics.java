package homework7_factory_method;

public abstract class Logistics {
	public String  Plan_delivery() {
		Transport t= Create_Transport();
		t.Deliver();
		return "Deliver by something";
		
	}
	public abstract Transport Create_Transport() ;

}
