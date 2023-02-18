  static int c1=0;
    public static void main(String args[]) {
        Scanner scann =new Scanner(System.in);








        int x=scann.nextInt();






        int y=scann.nextInt();







        char [][]arr=new char[x][y];








        for(int i=0;i<arr.length;i++){








            String str2=scann.next();







            for(int j=0;j<str2.length();j++){






                arr[i][j]=str2.charAt(j);







            }
        }
        int [][]brr=new int[x][y];






        print(arr,0,0,brr);


        if(flagerrr==false){








            System.out.println(-1);








        }










    }

    static boolean flagerrr=false;













  
    public static void print(char [][]arr,
    
    
    
    
    
    
    
    int cr,int cc,
    
    
    
    
    
    
    
    int [][]anserrr){
        if(cr==arr.length-1 && cc==arr[0].length-1
        
        
        
        
        
        
         && arr[cr][cc]!='X'){






            flagerrr=true;








            anserrr[cr][cc]=1;







            c1++;
            
            
                 Dis(anserrr);
            
            return;
            
        }
        if(cr<0 || cc<0 ||cr>=arr.length || cc>=arr[0].length || 
        
        
        
        
        
        
        arr[cr][cc]=='X'){







            return;






        }
    if(c1==0){





        arr[cr][cc]='X';








        anserrr[cr][cc]=1;






        print(arr,cr,cc+1,anserrr);













        print(arr,cr+1,cc,anserrr);







        arr[cr][cc]='O';//backtracking






        anserrr[cr][cc]=0;









    }
    return;








    }
    public static void Dis(int [][] arr){









        for(int i=0;i<arr.length;i++){








            for(int j=0;j<arr[0].length;j++){







                System.out.print(arr[i][j]+" ");










            }System.out.println();





        }

























        
    }





}

