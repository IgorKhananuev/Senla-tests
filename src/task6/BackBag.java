package task6;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackBag {

    List<Thing> needItem = null;

    double maxWeight;
    double bestCost;

    public BackBag(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double weightCalculator(List<Thing> things) {

        double sumOfWeight = 0;
        for (Thing i : things) {
            sumOfWeight += i.weight;
        }
        return sumOfWeight;
    }

    public double costCalculator(List<Thing> things) {
        double sumCost = 0;
        for (Thing i : things) {
            sumCost += i.cost;
        }
        return sumCost;
    }

    public void compareSet(List<Thing> things) {
        if (needItem == null) {
            if (weightCalculator(things) <= maxWeight) {
                needItem = things;
                bestCost = costCalculator(things);
            }
        } else {
            if (weightCalculator(things) <= maxWeight && costCalculator(things) > bestCost) {
                needItem = things;
                bestCost = costCalculator(things);
            }
        }
    }

    public void takeAllSets(List<Thing> things) {
        if (things.size() > 0) {
            compareSet(things);
        }
        for (int i = 0; i < things.size(); i++) {
            List<Thing> newSet = new ArrayList<Thing>(things);
            newSet.remove(i);
            takeAllSets(newSet);
        }
    }

    List<Thing> getBestSet(ArrayList<Thing> list) {
        return needItem;
    }

    public void addThings() {
        ArrayList<Thing> list = new ArrayList<Thing>();
        list.add(new Thing("t1", 10, 12));
        list.add(new Thing("t2", 12, 120));
        list.add(new Thing("t3", 11, 30));
        list.add(new Thing("t4", 19, 10));
        for (Thing i: list){
            System.out.println(list);
        }
    }

    public void takeAllSets() {
    }
}








