package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = first > second ? first : second;
        int res = max > third ? max : third;
        System.out.println(res);
    }
}
