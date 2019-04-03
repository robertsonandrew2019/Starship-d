import java.util.ArrayList;

public class Main {

    ArrayList<String> shipNames;

    public static void main(String[] args) {

        String[] rawNames = new String[] {"Reliant","Enterprise","Yorktown","Saratoga","Voyager","Discovery","Constitution","Constellation","Grissom","Defiant","Intrepid","Britaan","Stargazer","Yamato","Galaxy","Ambassador","Nimitz","Equinox","Relativity","Challenger"};
        ArrayList<Starship> fleet = new ArrayList<Starship>();
        for (int i = 0; i < 20; i+=4) {
            fleet.add(new Escort(rawNames[i]));
            fleet.add(new Frigate(rawNames[i + 1]));
            fleet.add(new Cruiser(rawNames[i + 2]));
            fleet.add(new Battleship(rawNames[i + 3]));
        }

        System.out.println("Fleet:");
        for (Starship x : fleet) x.stats();

        ArrayList<Defense> defBattalion = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int shields = 0;
            int maxIndex = 0;
            for (int j = 0; j < fleet.size(); j++) {
                if ((fleet.get(j).shield > shields) && (fleet.get(j) instanceof Defense)) {
                    shields = fleet.get(j).shield;
                    maxIndex = j;
                }
            }
            defBattalion.add(fleet.remove(maxIndex));
        }

        ArrayList<Offense> offBattalion = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int hulls = 0;
            int maxIndex = 0;
            for (int j = 0; j < fleet.size(); j++) {
                if ((fleet.get(j).hull > hulls) && (fleet.get(j) instanceof Offense)) {
                    hulls = fleet.get(j).hull;
                    maxIndex = j;
                }
            }
            offBattalion.add(fleet.remove(maxIndex));
        }

        System.out.printf("\nDefensive Battalion:\n");
        for (Defense x : defBattalion) x.stats();


        System.out.printf("\nOffensive Battalion:\n");
        for (Offense x : offBattalion) x.stats();

    }
}