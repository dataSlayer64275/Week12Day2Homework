public class Park extends Attraction implements IReviewed{

    public Park(String name, int rating) {
        super(name, rating);
    }

    public int getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }
}
