package Product_Except;

import java.util.Arrays;

/*Author: Hyejin Kim
  Date: 9/2/2021 */

//This class is main class. The users can hardcode the input numbers to calculate the project except the self element.

public class Main {

    public static void main(String[] args){
        
        Product_Except PE = new Product_Except();
        int[] inputNumbers = {1,2,3,4};  //The input number can be changed by users.

        System.out.println(Arrays.toString(PE.Product_Except(inputNumbers)));

}
}
