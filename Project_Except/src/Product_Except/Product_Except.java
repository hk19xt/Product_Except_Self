package Product_Except;

//This class is Product_Except class. This class receive the input numbers by users in the main class.


public class Product_Except {

    //@param array input numbers.
    public int[] Product_Except (int[] inputNumbers){

        int initial = 1; 
        int rightInitial = 1;
        
        int[] temp = new int[inputNumbers.length];
        temp[0] = initial;
        
        // The left side of the array
        for(int left=0; left<inputNumbers.length; left++){

            temp[left] = initial; // Inserting the array with the left side of elements multiplied by the next code line.
            initial = initial*inputNumbers[left];
        }

        
        // The right side of the array
        for(int right=inputNumbers.length-1; right>=0; right--){
            temp[right] = temp[right]*rightInitial; // The existing array (the above left array) will be multiplied by the new right side of array.
            rightInitial = rightInitial*inputNumbers[right];

        }
    return temp;
    }//Product_Except

}//Product_Except
