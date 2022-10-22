package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 1;
        if (power > 0) {
            while (count <= power * power) {
                System.out.println(count);
                count *= 2;
            }
        } else if (power == 0) {
            System.out.println(count);
        } else {
            System.out.println("too much power");
        }

    }
}
