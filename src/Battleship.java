public class Battleship extends Starship implements Offense {

    public Battleship(String name) {

        registry = name;

        hullRange = new int[] {3000, 5000};
        shieldRange = new int[] {1500, 2000};
        beamRange = new int[] {4000, 5000};
        torpRange = new int[] {40, 50};

        hull = getRandom(hullRange);
        shield = getRandom(shieldRange);
        beam = getRandom(beamRange);
        torp = getRandom(torpRange);
    }
}
