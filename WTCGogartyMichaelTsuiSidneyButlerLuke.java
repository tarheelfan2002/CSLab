import java.util.Scanner;
import java.util.ArrayList;

public class WTCGogartyMichaelTsuiSidneyButlerLuke {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<Transportation> landTransport = new ArrayList<>();
            landTransport.add(new Automobile(13, 4, 25, "garage", "18:15", 40));
            landTransport.add(new Train(5, 50, 26, "train station", "15:12", 30));
            landTransport.add(new Bus(6, 5, 16, "bus station", "16:12", 36));
            landTransport.add(new Bike(7, 6, 6, "bike rack", "17:12", 37));

            ArrayList<Transportation> airTransport = new ArrayList<>();
            airTransport.add(new Plane(8, 7, 70, "airport", "18:12", 38));
            airTransport.add(new HotAirBalloon(5, 8, 60, "random field", "19:12", 11));
            airTransport.add(new Dirigible(9, 9, 50, "different random field", "20:12", 33));
            airTransport.add(new Helicopter(11, 11, 40, "helipad", "21:12", 44));


            ArrayList<Transportation> waterTransport = new ArrayList<>();
            waterTransport.add(new Ship(22, 22, 30, "dock", "22:12", 55));
            waterTransport.add(new Submarine(33, 44, 20, "military base", "23:12", 66));
            waterTransport.add(new Boat(44, 55, 10, "dock", "00:12", 77));

            System.out.print("What type of transportation you want to use (Land, Air, Water)?\n[?]: ");
            String choice = scanner.next();
            ArrayList<Transportation> chosenList;

            switch(choice.toLowerCase()) {
                case "land":
                    chosenList = landTransport;
                    break;
                case "air":
                    chosenList = airTransport;
                    break;
                case "water":
                    chosenList = waterTransport;
                    break;
                default:
                    System.out.println("[!] Invalid choice.");
                    return;
            }

            System.out.printf("[*]: %-10s %-10s %-10s %-10s %-10s\n", "Type", "Price", "Service", "Speed", "Space");
            for (int i = 0; i < chosenList.size(); i++) {
                Transportation t = chosenList.get(i);
                System.out.printf("[%d]: %-10s %-10f %-10s %-10f %-10d\n", i + 1, t.getVehicleType(), t.getPrice(), t.getServiceType(), t.getSpeed(), t.getPassengerSpace());
            }

            System.out.print("Which mode of transportation would you like to view?\n[?]: ");
            int selected = scanner.nextInt() - 1;

            if (selected <= 0 || selected > chosenList.size()) {
                System.out.println("[!] Invalid choice.");
                return;
            }

            Transportation chosenTransport = chosenList.get(selected);
            System.out.println(chosenTransport);
            System.out.print("Would you like to use this transportation (Y/N)?\n[?]: ");
            choice = scanner.next();

            if (choice.equalsIgnoreCase("n")) {
                return;
            }

            System.out.print("How many passengers are going?\n[?]: ");
            int passengers = scanner.nextInt();
            System.out.printf("[*] Total cost will be: $%.2f.\n[*] Departure is at %s located at %s.\n", passengers * chosenTransport.getPrice(), chosenTransport.getPickupTime(), chosenTransport.getLocation());

            scanner.close();
        }
}
