package arrListAssignment2;

import java.util.ArrayList;

public class GoldbachConj {

    public static void main(String[] args) {
        goldbach(100);
    }

    private static void goldbach(int n){
        ArrayList<Integer> primes = eraThis(n);
        for(int i = 0; i<primes.size(); i++){
            if(primes.contains(n-primes.get(i))){
                System.out.println(n + " = " + primes.get(i) + " + " + (n-primes.get(i)));
                return;
            }
        }
    }

    private static ArrayList<Integer> eraThis(int n){
        ArrayList<Integer> primeArrList = new ArrayList<Integer>();
        for(int i = 2; i<=n; i++){
            primeArrList.add(i);
        }
        for(int j = 0; j<primeArrList.size()-1; j++) {
            int p = primeArrList.get(j);
            for (int i = j+1; i < primeArrList.size(); i++) {
                if (primeArrList.get(i) % p == 0) {
                    primeArrList.remove(i);
                    i--;
                }
            }
            p=primeArrList.get(j+1);
        }
        return primeArrList;
    }

}
