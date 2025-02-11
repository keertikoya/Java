// Keerti Koya
// Period 1

import java.util.ArrayList;

public class BasketballPlayer {
    double ppg, apg, rpg; // object attributes
    int games;
    ArrayList<Integer> points, assists, rebounds;

    // default constructor
    public BasketballPlayer(){
        ppg = 0;
        apg = 0;
        rpg = 0;
        games = 0;
    }

    // custom constructor
    public BasketballPlayer(ArrayList<Integer> p, ArrayList<Integer> a, ArrayList<Integer> r, int g){
        // finds average
        points = p;
        double sum = 0;
        for (int i : p){
            sum+=i;
            ppg = sum / p.size();
        }

        assists = a;
        sum = 0;
        for (int i : a){
            sum+=i;
            apg = sum / a.size();
        }

        rebounds = r;
        sum = 0;
        for (int i : r){
            sum+=i;
            rpg = sum / r.size();
        }

        games = g;
    }

    // getters
    public double getPPG(){
        return ppg;
    }

    public double getAPG(){
        return apg;
    }

    public double getRPG(){
        return rpg;
    }

    // setters
    public void setPpg(double ppg) {
        this.ppg = ppg;
    }

    public void setApg(double apg){
        this.apg = apg;
    }

    public void setRpg(double rpg){
        this.apg = rpg;
    }

    // add game method
    public void addGame(int p, int a, int r){
        // adds new game values to the arraylists
        points.add(p);
        assists.add(a);
        rebounds.add(r);

        // finds average
        double sum = 0;
        for (int i : points){
            sum+=i;
            ppg = sum / points.size();
        }

        sum = 0;
        for (int i : assists){
            sum+=i;
            apg = sum / assists.size();
        }

        sum = 0;
        for (int i : rebounds){
            sum+=i;
            rpg = sum / rebounds.size();
        }

        games+=1;
    }
}
