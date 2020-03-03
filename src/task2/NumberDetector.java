package task2;

public class NumberDetector {

    static int greatestCommonDivider(int n1,int n2){
        return n2 == 0 ? n1 : greatestCommonDivider(n2,n1 % n2);
    }

    static int leastCommonMultipler(int n1,int n2){
        return n1 / greatestCommonDivider(n1,n2) * n2;
    }
}
