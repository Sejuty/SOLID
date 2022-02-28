public class Dog implements Animal,MoveLegs  {

    private int tail;
    private String coat;


    public  Dog (int tail,String coat)
    {
        this.tail = tail;
        this.coat = coat;
    }

    @Override
    public void walk(int speed) {
        System.out.println("It walks "+ speed +"meters per minute");
    }

    @Override
    public void run(int speed) {
        System.out.println("It runs "+ speed +"meters per minute");
    }

    @Override
    public void NumberOfLegs(int n) {
        System.out.println("It has " +n+"legs.");
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