package fibonacci;

public class Fibonacci {
    public int fn(int num) {
        if (num == 0) {
            return 0;
        }
        if (num <= 2) {
            return 1;
        }
        return fn(num-2) + fn(num-1);
    }
}
