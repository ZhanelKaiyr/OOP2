package homework7_builder;

public class Main {
	 public static void main(String[] args) {
	        Director director = new Director();
	 houseBuilder builder = new houseBuilder();
     director.MakeSimpleHouse(builder);
     
     House house = builder.getResult();
     
     System.out.println("House was build:"+house);


     houseManualBuilder manualBuilder = new houseManualBuilder();
     System.out.println(manualBuilder.getResult());

}
};