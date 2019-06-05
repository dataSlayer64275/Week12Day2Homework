public abstract class Stall {

    protected String name;
    private String owner;
    private int parkingSpot;
    protected int rating;

    public Stall (String name, String owner,int parkingSpot, int rating){
        this.name = name;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
