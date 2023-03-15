import Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)){
                case 0:
                    team1.add(new Peasant(getName(), 0, i));
                    team2.add(new Peasant(getName(), 9, i));
                    break;
                case 1:
                    team1.add(new Robber(getName(), 0, i));
                    team2.add(new Crossbowman(getName(), 9, i));
                    break;
                case 2:
                    team1.add(new Sniper(getName(), 0, i));
                    team2.add(new Crossbowman(getName(), 9, i));
                    break;
                default:
                    team1.add(new Wizard(getName(), 0, i));
                    team2.add(new Monk(getName(), 9, i));
                    break;
            }
        }
        System.out.println(team1);
        System.out.println(team2);
        System.out.println("team1");
        for (BaseHero item: team1) {
            System.out.println(item.getInfo());
        }
        System.out.println("team2");
        for (BaseHero item: team2) {
            System.out.println(item.getInfo());
        }
        ArrayList<BaseHero> allHeroes = new ArrayList<>();
        allHeroes.addAll(team1);
        allHeroes.addAll(team2);
        allHeroes.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o1.getSpeed() == o2.getSpeed()){
                    return 0;
                } else if (o1.getSpeed() > o2.getSpeed()) {
                    return -1;
                }else
                    return 1;
            }
        });
        System.out.println(allHeroes);
        //team1.forEach(u -> u.step(team2, team1));
       // team2.forEach(u -> u.step(team1, team2));
        
        for (BaseHero hero: allHeroes) {
            if (team1.contains(hero)){
                hero.step(team2, team1);
            }else{
                hero.step(team1, team2);
            }
        }

        System.out.println("team1");
        for (BaseHero item: team1) {
            System.out.println(item.getInfo());
        }
        System.out.println("team2");
        for (BaseHero item: team2) {
            System.out.println(item.getInfo());
        }
    }
    private static String getName(){
        return  Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}