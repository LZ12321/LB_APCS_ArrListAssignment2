package arrListAssignment2;

import java.util.ArrayList;

public class addingBigInts {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int aLen = 20 + (int) (Math.random()*20);
        int bLen = 20 + (int) (Math.random()*20);
        for(int i = 0; i<aLen; i++){
            a.add((int) (Math.random()*10));
        }
        for(int i = 0; i<bLen; i++){
            b.add((int) (Math.random()*10));
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(addTwo(a,b));
    }

    private static ArrayList<Integer> addTwo(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> digits = new ArrayList<>();
        boolean increment = false;
        for(int i = 0; i<a.size(); i++){
            if(i<b.size()){
                int n = a.get(a.size()-i-1) + b.get(b.size()-i-1) + (increment?1:0);
                if(n>=10)
                    increment = true;
                else
                    increment = false;
                digits.add(0, n%10);
            } else {
                int n = a.get(a.size()-i-1 )+ (increment?1:0);
                if(n>=10)
                    increment = true;
                else
                    increment = false;
                digits.add(0, n%10);
            }
        }
        if(b.size()>a.size()){
            for(int i = a.size(); i<b.size(); i++){
                if(i<b.size()){
                    int n = b.get(b.size()-i + (increment?1:0));
                    if(n>=10)
                        increment = true;
                    else
                        increment = false;
                    digits.add(0, n%10);
                }
            }
        }
        if(increment){
            digits.add(0,1);
        }

        return digits;
    }

}
