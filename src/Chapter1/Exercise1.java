package Chapter1;

public class Exercise1 {
    public int sum(int a, int b) {
        return a + b;
    }
    public int multi(int a, int b) {
        return a*b;
    }

    public int customMax(int a, int b) {
        if (a > b) return a;
        return b;
    }
    public int customMin(int a, int b) {
        if (a < b) return a;
        return b;
    }
    public int euclideanGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a==b) {
            return a;
        }
        if (a > b) {
            return euclideanGcd(a-b,b);
        }
        return euclideanGcd(a,b-a);
    }
}
