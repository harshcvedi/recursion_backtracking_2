 public static void main(String args[]) {
        Scanner scan =new Scanner(System.in);
        int testcase=scan.nextInt();

















        while(testcase-->0){



            int n=scan.nextInt();


            int brr[]=new int[n];










            for(int i=0;i<n;i++){












                brr[i]=scan.nextInt();








            }
            
            System.out.println(loves(brr,0,n-1));
            








        }
    }

    public static int loves(int []arr,int si,int ei){























        for(int mider=si;mider<ei;mider++){










            int sumer1=0;
            for(int i=si;i<=mider;i++){

















                sumer1+=arr[i];










            }
            int sumer2=0;

























































            
            for(int i=mider+1;i<=ei;i++){




                sumer2+=arr[i];
            }







            if(sumer1==sumer2){
                int a=loves(arr,si,mider);








                int b=loves(arr,mider+1,ei);




                return Math.max(a,b)+1;
            }
        }
        return 0;

}
}
