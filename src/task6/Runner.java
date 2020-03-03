package task6;

/*
Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
*/

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Thing> list = new ArrayList<Thing>();
        list.add(new Thing("t1", 10, 12));
        list.add(new Thing("t2", 12, 120));
        list.add(new Thing("t3", 11, 30));
        list.add(new Thing("t4", 19, 10));


        BackBag bg = new BackBag(100);

        bg.addThings();
        bg.takeAllSets();
        System.out.println(bg.getBestSet(list));

    }

}
