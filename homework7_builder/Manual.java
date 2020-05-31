package homework7_builder;

public class Manual {
	private int wall;
	 private int door;
	private  int window;
	private  Boolean roof;
	private  Boolean garage;
	
	public Manual(int wall, int door, int window, Boolean roof, Boolean garage) {
		this.door=door;
		this.window=window;
		this.garage=garage;
		this.wall = wall;
		this.roof = roof;
		
	}
	 public String print() {
	        String info = "";
	        info += "Walls number: " + wall + "\n";
	        info += "Count of doors: " + door + "\n";
	        info += "Count of windows:" + window + "; Have garage" + garage + "\n";
	        info += "Have a roof: " + roof + "\n";
	        return info;
	    }

}
