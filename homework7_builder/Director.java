package homework7_builder;

public class Director {
	
	  public void MakeSimpleHouse(Builder builder) {
	        builder.BuildWalls(4);
	        builder.BuildDoor(1);
	        builder.BuildWindows(5);
	        builder.BuildGarage();
	        builder.BuildRoof();
	      
	    }

}
