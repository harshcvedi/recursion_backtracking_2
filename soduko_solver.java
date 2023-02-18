 public static boolean issafe(int array[][],
    
    
    
    
    
    
    int row,int col,
    
    
    
    
    
    
    int target){



        //column
        for(int i=0;i<=8;i++){









            if(array[i][col]==target){
















                return false;










            }
        }

        //row
        for(int j=0;j<=8;j++){














            if(array[row][j]==target){






                return false;
            }
        }


        //grid
        int sr=(row/3)*3;












        int scol=(col/3)*3;














        for(int i=sr;i<sr+3;i++){









































            for(int j=scol;j<scol+3;j++){























                if(array[i][j]==target){








                    return false;













                }

        }
        }






        return true;









    }
    public static void main(String args[]) {























        // Your Code Here
        Scanner sc =new Scanner(System.in);
















        int n=sc.nextInt();















        int arr[][]=new int[n][n];

































        for(int i=0;i<arr.length;i++){






















            for(int j=0;j<arr[0].length;j++){






























                arr[i][j]=sc.nextInt();


            }
        }

        if(soduko(arr,0,0)){
             printsoduko(arr);

        }
       
        }
        public static void printsoduko(int arr[][]){

            for(int i=0;i<arr.length;i++){


            for(int j=0;j<arr[0].length;j++){



                System.out.print(arr[i][j]+" ");



            }System.out.println();
        }
        }

        public static boolean soduko(int brr[][],int i,int j){
            //i==row
            //j==col
            //brr=matrix
        if(i==9 && j==0){


                return true;
        }
       




        int nextrow=i;



        int nextcol=j+1;





        if(j+1==9){



            nextrow=i+1;


            nextcol=0;






        }

        if(brr[i][j]!=0){





            return soduko(brr,nextrow,nextcol);





        }
        for(int digit=1;digit<=9;digit++){



                if(issafe(brr,i,j,digit)){

                    brr[i][j]=digit;

                    if(soduko(brr,nextrow,nextcol)){


                        //solution exist
                        return true;

                }

                brr[i][j]=0;

            }
        }
        return false;







        
}
}
