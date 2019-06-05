public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedToVisit(Visitor visitor){
        if (visitor.age > 15) {
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
