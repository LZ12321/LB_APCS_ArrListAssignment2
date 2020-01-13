package arrListAssignment2;

import java.util.ArrayList;

public class Eratosthenes {

    public static void main(String[] args) {
        System.out.println(eraThis(100));
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
