package homework7_builder;

public class House {
	 private int wall;
	 private int door;
	private  int window;
	private final Boolean roof;
	private final  Boolean garage;
	public House(int wall, int door, int window, Boolean roof, Boolean garage) {
		this.door=door;
		this.window=window;
		this.garage=garage;
		this.wall = wall;
		this.roof = roof;
		
	}
	public void SetWall(int wall) {
		this.wall=wall;
		
	}
	public int GetWall() {
		return wall;
	}
	public void SetDoor(int door) {
		this.door=door;
		
	}
	public int GetDoor() {
		return door;
	}
	public void SetWindow(int window) {
		this.window=window;
		
	}
	public int GetWindow() {
		return window;
	}
	public Boolean GetRoof() {
		return roof;
	}
	public Boolean GetGarage() {
		return garage;
	}
	
	
}
