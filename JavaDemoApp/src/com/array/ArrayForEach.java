package com.array;

public class ArrayForEach{
    public static void main(String args[]){

        int values[][] = {
                            {1,5,6,7},
                            {2,5,6,7,8,9,},
                            {3,5,6,7,8,9,}
                        };

    for(int[] rows: values)
        {
            for(int val: rows){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


}

