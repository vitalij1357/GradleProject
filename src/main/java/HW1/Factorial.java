package HW1;

public class Factorial {
    public int calc (int n){
        if (n <0){
            throw new IllegalArgumentException("vrong value "+ n + " - cant be negative");
        }
        if (n>16){
            throw new IllegalArgumentException("to big Value "+ n);
        }
        int result =1;
        for (int i =1 ; i <= n ; i++) {

            result *= i;
        }
        return result;
    }


}


