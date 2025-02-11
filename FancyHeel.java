public class FancyHeel extends Heel{
    String occasion;

    public FancyHeel(){
        super();
        occasion = "prom";
    }

    public FancyHeel(int s, String c, int h, String o){
        // super (s, c, h);
        occasion = o;
    }

    public String getOccasion(){
        return occasion;
    }

    public void setOccasion(String x){
        occasion = x;
    }

    public String toString(){
        return "I am of size " + getSize() + ", of color " + getColor() + ", of height " + getHeight() +
                ", and for " + getOccasion();
    }


}
