public class Cruiser extends Starship implements Offense {

    public Cruiser(String name) {

        registry = name;

        hullRange = new int[] {2000,2500};
        shieldRange = new int[] {2000,2500};
        beamRange = new int[] {3000,4000};
        torpRange = new int[] {20,35};


        hull = getRandom(hullRange);
        shield = getRandom(shieldRange);
        beam = getRandom(beamRange);
        torp = getRandom(torpRange);
    }
}
