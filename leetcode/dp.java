package leetcode;

public class dp {
    public double ways(int n) {
        double[] factMap = new double[n + 1];
        factMap[0] = 1;
        factMap[1] = 1;
        // System.out.println("FACT - n - "+ n +" "+ fact(n,factMap));
        return fact(n, factMap);
    }

    public double fact(int n, double[] factMap) {
        if (n < 2)
            return factMap[n];
        if (n > 2 && factMap[n] != 0)
            return factMap[n];
        factMap[n] = n * fact(n - 1, factMap);
        return factMap[n];
    }

    public void nondp(int n) {
        int i;
        double fact = 1;

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static void main(String[] args) {
        dp obj = new dp();
        int n = 1000;
        System.out.println(obj.ways(n));

        obj.nondp(n);
    }
}
