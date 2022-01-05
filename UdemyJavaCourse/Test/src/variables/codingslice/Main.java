package variables.codingslice;

public class Main {
    //static int num_One = 1;
    //static int num_two = 2;
    public static void main(String[] args) {
     chek_met(2);
        System.out.println();
    }

    static int chek_met(int score){
        if (score < 1){
            return  1;
        }
        else if(score <= 1){
            return 2;
        }
        return 0;
    }
}
