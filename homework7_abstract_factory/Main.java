package homework7_abstract_factory;
import java.util.Scanner;

public class Main {
    private static Client order() {
        Client client;
        Abstract_Factory factory;
        Scanner fact = new Scanner(System.in);
        String factory_name = fact.nextLine();
        if (factory_name.contains("modern")) {
            factory = new Modern_Factory();
            client = new Client(factory);
        } else {
            factory = new Victorian_Factory();
            client = new Client(factory);
        }
        return client;
    }

    public static void main(String[] args) {
        Client client = order();
        System.out.println(client.toString());
    }

}
