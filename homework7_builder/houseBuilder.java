package homework7_builder;

public class houseBuilder implements Builder{
	private int wall;
	private int door;
	private int window;
	private Boolean roof;
	private  Boolean garage;
	

	@Override
	public void BuildWalls(int wall) {
		// TODO Auto-generated method stub
		this.wall=wall;
	}

	@Override
	public void BuildDoor(int door) {
		// TODO Auto-generated method stub
		this.door=door;
	}

	@Override
	public void BuildWindows(int window) {
		// TODO Auto-generated method stub
		this.window=window;
	}

	@Override
	public void BuildRoof() {
		// TODO Auto-generated method stub
		this.roof=true;
	}

	@Override
	public void BuildGarage() {
		// TODO Auto-generated method stub
		this.garage=true;
	}
	public House getResult() {
		return new House(wall,door,window,roof,garage);
	}


	}


