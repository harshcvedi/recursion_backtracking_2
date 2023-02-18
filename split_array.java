 public static void main(String args[]) {
        // Your Code Here
        Scanner scann =new Scanner(System.in);
        int number=scann.nextInt();
        int brr[]=new int[number];





        
        for(int ith=0;ith<number;ith++){
            brr[ith]=scann.nextInt();







        }
       count(brr,0,"",0,"",0);




       System.out.println(c1);
    }
    static int c1=0;






    public static void count(int array[],int ith,String answer,
    
    
    
    int sumer1,String answer2,int sumer2){













        if(ith==array.length){




            if(sumer1==sumer2){




                System.out.println(answer+"and "+answer2);
                c1++;



            }
                return;
            
        }





        count(array,ith+1,answer+array[ith] + " ",sumer1+array[ith],answer2,sumer2);











        count(array,ith+1,answer,sumer1,answer2+array[ith]+" ",sumer2+array[ith]);
        



    }
}
