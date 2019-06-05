public class IceCreamStall extends Stall implements IReviewed {

    public IceCreamStall(String name, String owner, int parkingSpot, int rating){
        super(name, owner, parkingSpot, rating);
    }

    public int getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }
}
