package Project_Except;

import java.util.Arrays;

public class Main {

    public int[] product(int[] first, int[] second){

        // second[] = [1,2,3,4];

        int[] tmp = new int[4];

        int initial = 1;

        for(int i=0; i<4; i++){
            tmp[i]=first[i];
            System.out.println(tmp[i]);
        }
        for(int j=0;j<4;j++){
            tmp[j]=second[j];
            System.out.println(tmp[j]);
        }
    return tmp;
    }


    public static void main(String[] args){
        Main m = new Main();
      //  int[] numbers = {1,2,3,4};
        int[] first = new int[]{1,2,3,4};
        int[] second = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(m.product(first, second)));

}
}
