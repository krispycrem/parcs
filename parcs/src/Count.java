import parcs.*;

public class Count implements AM {
    public void run(AMInfo info) {
        long left, right;

        left = info.parent.readLong();
        right = info.parent.readLong();
        long k = 0;
        for (long n = left; n < right + 1; n++) {
            for (long i = 1; i < n / 4 + 1; i++) {
                if (i * i * i * i == n) {
                    k++;
                    System.out.print(n + ", ");
                }
            }
        }

        info.parent.write(k);

    }
}