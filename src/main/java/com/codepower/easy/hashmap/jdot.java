package javaBasics;

import java.util.Scanner;



class Main {

    /**
     * @param args progrm to dynamically print JDOT with asterisks . by:Justin Mathew.
     *
     * done in eclipse
     */																		//********************
    public static void main(String[] args) {
        //********************
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of JDOT Mininum 4");
        int i=sc.nextInt();


        PrintJdotInStars.printJdot(i);

    }
}

class PrintJdotInStars
{
    static void printJdot( int size)
    {

        boolean hPartofJ=true;
        //1=10,2=10,3=30..
        int flag=0;
        //int size=90;
        int checkNo=1;
        if(size==20|size==30|size==60|size==70|size==100)
            checkNo=2;
        int i;
        int jSpace,dSpace,oSpace;
        int jref=0;
        int dref=0;//to store the value of j elem while hpart is printing can be used for bottom printing
        int hSize=correct(size/2);//To get the odd number as size. after division
        //   System.out.println(hSize);
        int spaceFlag=0;
        //5 4 4 5
        jSpace=hSize;
        dSpace=oSpace=hSize-1;
        int looplim=hSize*2+((hSize-1)*2); //calculated to make it 5+4+4+5 :)

        for(i=0;i<looplim;i++)//Printing top and bottom same code.
        {
            System.out.print("*");
            if(i==jSpace-1)
                printSpace(2);
            if(i==(jSpace+dSpace)-1)
            {

                printSpace(2);
            }
            if(i==(jSpace+dSpace+oSpace)-1)
                printSpace(2);

        }														//*****  ****  ****  *****

        for(i=0;i<hSize;i++)
        {//Should print the entire line and go down

            System.out.println();

            if(hPartofJ)

            {
                printSpace(hSize/2);//should exe only half part of j is printing
                /////////////////////The following loop will print the 6 asterisk on places
                for(int j=0;j<6;j++){
                    System.out.print("*");
                    switch (j) {
                        case 0:
                            printSpace(((hSize/2)+2));
                            jref=((hSize/2)+2);

                            break;
                        case 1:
                            printSpace(dSpace-1);//Corerctly working
                            //  dref=dSpace-1;
                            break;
                        case 2:
                            printSpace(1);
                            break;
                        case 3:
                            printSpace(oSpace-2);
                            break;
                        case 4:
                            printSpace(((hSize/2)+2));
                        default:
                            break;
                    }

                }
            }
            if(i==hSize/4)// ratio to make a ""
            {
                hPartofJ=false;
                System.out.println();
            }

            if(hPartofJ==false)
            {

                for(int j=0;j<7;j++){
                    System.out.print("*");
                    switch (j) {
                        case 0:
                            printSpace((hSize/2)-1);
                            break;
                        case 1:
                            printSpace((jSpace/2+2));//Corerctly working
                            break;
                        case 2:
                            printSpace(dSpace-1);
                            break;
                        case 3:
                            printSpace(1);
                            break;
                        case 4:
                            printSpace(oSpace-2);
                            break;
                        case 5:
                            printSpace((hSize/2)+2);
                        default:
                            break;
                    }

                }
                flag++;

                if(flag==hSize/4)
                {
                    //print the bottom part

                    System.out.println();


                    for(i=0;i<(looplim-size)+3;i++)
                    {
                        if(i<=((jSpace/4)-1))
                        {	printSpace(1);//print only in the case of j to make it curved :) "switch wont work here coz it doesn't support variables,to do calculs i need variables so i used if else ladder"

                            System.out.print("*"); }
                        if(i==((jSpace/4)-1)){ //3
                            printSpace(jref+checkNo);
                            printStar(dSpace);
                            printStar(oSpace);
                            printSpace( (jSpace/2));
                            printStar(1);
                        }


                    }
                }




            }}

    }













    static void printStar(int a)
    {
        for(int i=0;i<a;i++)
            System.out.print("*");
        printSpace(2);
    }

    static void printSpace(int a)
    {
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
        }


    }

    static int correct(int size)
    {

        if((size%2)==0)
        {
            size=size+1;
            return size;
        }
        return size;
    }
    static int getJspace(int hSize)
    {

        return hSize/2;

    }
}
