import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aquarium {

    private final Map<Species, List<Fish>> fishBySpecies = new HashMap<>();


    private List<Fish> fishList;

    public Aquarium() {
        fishList = new ArrayList<>();

    }


    public void addFish(Species species) {
        Fish fish = new Fish(species);

        if (!fishBySpecies.containsKey(species)) {
            fishBySpecies.put(species, new ArrayList<>());
        }
        fishBySpecies.get(species).add(fish);

        fishList.add(fish);
    }


    public void showAllFish() {
        for (Map.Entry<Species, List<Fish>> entry : fishBySpecies.entrySet()) {
            System.out.printf("Species: %s\n", entry.getKey().name);
            for (Fish fish : entry.getValue()) {
                fish.show();
            }
        }
    }






}
