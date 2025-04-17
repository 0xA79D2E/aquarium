public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        Species goldfish = new Species("Goldfish");
        Species tetra = new Species("Tetra");

        aquarium.addFish(goldfish);
        aquarium.addFish(tetra);
        aquarium.addFish(goldfish);

        System.out.println("\nAll Fish in Aquarium:");
        aquarium.showAllFish();


    }
}