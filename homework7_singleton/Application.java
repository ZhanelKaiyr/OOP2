package homework7_singleton;


public class Application {
	public static void main(String[] args) {
		Database foo = Database.getInstance();
		foo.query("SELECT * FROM article");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM article");
	}
}
