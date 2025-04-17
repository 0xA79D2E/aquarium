public class Fish {


    private static int nextId;
    public final int id;
    public final Species species;

    public Fish(Species species) {
        this.id = nextId++;
        this.species = species;
    }


    public void show() {
        System.out.printf("Fish #%d | %s\n", id, species.name);
    }


}
