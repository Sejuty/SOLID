public class Fish implements Animal,MoveMuscles {

    private int gills;
    private int eyes;
    private int fins;
    private String name;

    public Fish(String name, int gills, int eyes, int fins) {
        this.name =name;
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }


    @Override
    public void swim(int Speed) {

    }

    @Override
    public void NumberOfFins(int n) {

    }


    @Override
    public void name(String name) {

    }

    @Override
    public void weight(int n) {

    }

    @Override
    public void brain() {

    }
}