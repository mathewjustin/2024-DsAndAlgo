package com.codepower.striver.arrays;

/**
 * @author Justin Mathew @dev_io
 */
public class SetMatrixZeroOptimal {

    public static void main(String[] args) {

            int[][] myNumbers = { {1,0,3,4},
                                {5,6,7,7},
                                {0,1,5,2},
                                {6,1,0,2},
            };
            int col[]=new int[myNumbers[0].length];
            int row[]=new int[myNumbers[1].length];

            for(int i=0;i<myNumbers[0].length;i++)
            {
                for(int j=0;j<myNumbers[1].length;j++){
                    if(myNumbers[i][j]==0){
                        col[i]=1;
                        row[j]=1;
                    }
                }
            }
            for(int i=0;i<myNumbers[0].length;i++)
            {
                for(int j=0;j<myNumbers[1].length;j++){
                    if(col[i]==1 || row[j]==1){
                        myNumbers[i][j]=0;
                    }
                }
            }
    }
}
