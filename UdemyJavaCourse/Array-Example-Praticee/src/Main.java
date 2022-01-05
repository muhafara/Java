public class Main {

    public static void main(String [] args){
        int [] arrayOfInteger = {7, 9, 5, 1 , 3};

        int [] arraysorted = new int [arrayOfInteger.length];
        int temp;
        for (int i = 0; i<arrayOfInteger.length;  i++){
            for (int j = 0 ; j < arrayOfInteger.length; j++  ){
                if(arrayOfInteger[j] < arrayOfInteger[j]){
                    temp = arrayOfInteger[j];
                    arrayOfInteger[i] = arrayOfInteger[i+1];
                    arrayOfInteger[i+1] = temp;
                }
            }
        }
    }
}
