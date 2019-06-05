public class Rollercoaster extends Attraction implements ISecurity, IReviewed{

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public boolean isAllowedToVisit(Visitor visitor){
        if (visitor.age > 12 && visitor.height > 1.45) {
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
