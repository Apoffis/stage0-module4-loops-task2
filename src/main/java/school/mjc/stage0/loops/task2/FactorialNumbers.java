package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0, fact = 1;
        while (counter++ <= printToInclusive) {
            System.out.println(fact);
            fact *= counter;
        }
    }
}
