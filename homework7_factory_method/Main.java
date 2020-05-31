package homework7_factory_method;

public class Main {
	private static Logistics logistic;

    public static void main(String[] args) {
       System.out.println(logistic.Plan_delivery());
       surroundings();
     
    }
    static void surroundings() {
        if (System.getProperty("Logistic.name").equals("Sea")) {
            logistic = new Sea_Logistics();
        } else {
            logistic = new Road_Logistic();
        }
    }
  
}
