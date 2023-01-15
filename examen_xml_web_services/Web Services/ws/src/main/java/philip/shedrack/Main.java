package philip.shedrack;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Releve> releveList = new ArrayList<>();
        Releve releve1 = new Releve(1, new Date(), Math.random()*4300);
        Releve releve2 = new Releve(1, new Date(), Math.random()*4300);
        Releve releve3 = new Releve(1, new Date(), Math.random()*4300);
        releveList.add(releve1);
        releveList.add(releve2);
        releveList.add(releve3);
        for (Releve releve : releveList) {
            System.out.println("rib : " + releve.getRib());
            System.out.println("date releve : " + releve.getDateReleve());
            System.out.println("solde : " + releve.getSolde());
        }
    }
}