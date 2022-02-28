public class Fish implements Animal,MoveMuscles {

    private int gills;
    private int fins;


    public Fish(int gills, int fins) {
        this.gills = gills;
        this.fins = fins;
    }


    @Override
    public void swim(int speed) {
          System.out.println("It swims "+ speed +"meters per minute");
    }

    @Override
    public void NumberOfFins(int n) {
         System.out.println("It has " +n+"      s.");
    }


    @Override
    public void name(String name) {
         System.out.println("Name-->"+name);
    }

    @Override
    public void weight(int n) {
         System.out.println("Weight-->" + n);
    }

    @Override
    public void brain() {
         
    }
}