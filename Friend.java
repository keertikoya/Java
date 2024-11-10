// Keerti Koya
// Period 1
// 11/6/24

public class Friend {
    private String name;
    private int grade;
    private Shoe shoe;

    public Friend(String n, int g, Shoe s){
        name = n;
        grade = g;
        shoe = s;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGrade(int g) {
        grade = g;
    }
    public void setShoe(Shoe s){
        shoe = s;
    }
}
