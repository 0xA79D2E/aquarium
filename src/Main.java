import java.util.Scanner;

public class Main {

    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int money = 100;

        Aquarium aquarium = new Aquarium();
        Species goldfish = new Species("Goldfish");
        Species tetra = new Species("Tetra");

        aquarium.addFish(goldfish);
        aquarium.addFish(tetra);
        aquarium.addFish(goldfish);

        System.out.println("\nAll Fish in Aquarium:");
        aquarium.showAllFish();

        while(true) {
            System.out.println(Shop.menu);
        }

    }
}