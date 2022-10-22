package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int size = multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive : multiplyByAndToInclusive * -1;
        int counter = 0;
        if (size != 0) {
            while (size-- >= 0) {
                System.out.println(counter);
                counter += multiplyByAndToInclusive;
            }
        }
    }
}
