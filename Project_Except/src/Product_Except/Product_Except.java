package Product_Except;

public class Product_Except {

    public int[] Product_Except (int[] inputNumbers){

        int initial = 1;

        int[] temp = new int[inputNumbers.length];
        temp[0] = initial;

        for(int left=0; left<inputNumbers.length; left++){

            temp[left] = initial;
            initial = initial*inputNumbers[left];
        }

        int rightInitial = 1;
        for(int right=inputNumbers.length-1; right>=0; right--){
            temp[right] = temp[right]*rightInitial;
            rightInitial = rightInitial*inputNumbers[right];

        }
    return temp;
    }

}
