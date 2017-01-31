package net.darklan.primesample;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    
    private static int max = 1000;
    
    public static void main(String[] argvs) {
        if (argvs.length != 0) {
            max = Integer.valueOf(argvs[0]);
        }
        PrimeFinder pf = new PrimeFinder();
        List<Integer> primes = pf.calculate(max);
        pf.print(primes, max);
    }
    
    public List<Integer> calculate(int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < end; i++) {
            List<Integer> dividends = findDividends(i);
            if (dividends.size() == 1) primes.add(i);
        }
        return primes;
    }
    
    public List<Integer> findDividends(int num) {
        List<Integer> dividends = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) dividends.add(i);
        }
        return dividends;
    }
    
    public void print(List<Integer> toPrint, int max) {
        System.out.println("There are " + toPrint.size() + " prime numbers between 1 and " + max);
        List<Integer> divs = findDividends(max);
        int width = divs.get(divs.size() - (divs.size() / 2));
        
        toPrint.forEach(p -> System.out.println(p));
    }
}
