import parcs.*;

public class Compute implements AM {
    public void run(AMInfo info) {
        long left, right;

        left = info.parent.readLong();
        right = info.parent.readLong();
        long sum = 0;
        System.out.println("Worker started");
        for (long n = left; n < right + 1; n++) {
            for (long i = 1; i < n / 4 + 1; i++) {
                if (i * i * i * i == n) {
                    sum+= n;
                    System.out.print(n + ", ");
                }
            }
        }
        info.parent.write(sum);
    }
}