public class TobaccoStall extends Stall implements ISecurity, IReviewed{

    public TobaccoStall(String name, String owner, int parkingSpot, int rating){
        super(name, owner, parkingSpot, rating);
    }

    public boolean isAllowedToVisit(Visitor visitor){
        if (visitor.age > 18) {
            return false;
        }
        return true;
    }

    public int getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }


}