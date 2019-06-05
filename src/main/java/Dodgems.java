public class Dodgems  extends Attraction implements IReviewed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public int getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }
}
