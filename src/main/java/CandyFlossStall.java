public class CandyFlossStall extends Stall implements IReviewed{

    public CandyFlossStall(String name, String owner, int parkingSpot, int rating){
        super(name, owner, parkingSpot, rating);
    }

    public int getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }
}
