package com.codepower.striver.arrays;

/**
 * @author Justin Mathew @dev_io
 */
public class SetMatrixZeroBrute {

    public static void main(String[] args) {

        int[][] myNumbers = { {1,0,3,4},
                              {5,6,7,7},
                              {0,1,5,2},
                              {6,1,0,2},
        };
        setmatrixzerobrute(myNumbers);
        setminusoneaszero(myNumbers);
        System.out.println(printInMatrixFormat(myNumbers));
        /**
         * What will be time complexity of this solution?
         * nXm  * nXm +nXm
         */
        /**
         * Optimal solution as follows
         */

    }

    /**
     * nXm
     * @param myNumbers
     */
    private static void setminusoneaszero(int[][] myNumbers) {
        for(int i=0;i<myNumbers[0].length;i++)
        {
            for(int j=0;j<myNumbers[1].length;j++){
                if(myNumbers[i][j]==-1){
                    myNumbers[i][j]=0;
                }
            }
        }
    }

    private static boolean printInMatrixFormat(int[][] myNumbers) {
        for(int i=0;i<myNumbers[0].length;i++)
        {
            for(int j=0;j<myNumbers[1].length;j++){
                System.out.print(myNumbers[i][j]);
            }
            System.out.println();
        }
        return true;
    }

    //Brute force solution..

    /**
     * nXm
     * @param inputArray
     */
    public static void setmatrixzerobrute(int [][] inputArray){

        for(int i=0;i<inputArray[0].length;i++)
        {
            for(int j=0;j<inputArray[1].length;j++){

                if(inputArray[i][j]==0){
                    markRowAsMinusOne(inputArray,i);
                    markColumnAsMinusOne(inputArray, j);
                }

            }
        }
    }

    /**
     * a method which marks all the rows as minus One
     * n
     * @param inputArray
     * @param row
     */
    private static void markRowAsMinusOne(int[][] inputArray,int row) {
    for(int i=0;i<inputArray[0].length;i++){
        if(inputArray[row][i]!=0)
        {
            inputArray[row][i]=-1;
        }
    }
    }

    /**
     * A method which makes all the columns as minus one
     * @param inputArray
     * @param j
     */
    private static void markColumnAsMinusOne(int[][] inputArray, int j) {
        for(int i=0;i<inputArray[0].length;i++){
            if(inputArray[i][j]!=0)
            {
                inputArray[i][j]=-1;
            }
        }
     }




}
