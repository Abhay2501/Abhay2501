

import java.util.*; 
public class pattern1 {
    public static Scanner scn = new Scanner(System.in);
    public static void squarepattern(int n){
        int nst =n;
        for(int row =1; row<= n; row++){


            for( int cst =1; cst<= nst; cst++)
            System.out.print("*");
            nst =n;
            System.out.println();
        }
    }
    public static void triangle(int n){
        int nst =1;
        for(int row =1; row<= n; row++){


            for( int cst =1; cst<= nst; cst++)
            System.out.print("*");
            nst++;
            System.out.println();
        }
    }
    public static void inversetriangle(int n){
        int nst =n;
        for(int row =1; row<= n; row++){


            for( int cst =1; cst<= nst; cst++)
            System.out.print("*");
            nst--;
            System.out.println();
        }  
    }
    public static void mirrortriangle(int n){
     int nst =1;
     int nsp = n-1;
     for(int i =1; i<= n; i++){
         for(int csp =1; csp<= nsp; csp++)
         System.out.print("\t ");
         for(int cst =1; cst<= nst; cst++)
         System.out.print("*\t");
         nst++;
         nsp--;
         System.out.println();
     }   
    }
    public static void halfdiamond(int n){
        int nst =1;
        int nsp = (n-1);
        for(int i =1; i<=n; i++){
            for(int csp =1; csp<= nsp; csp++)
            System.out.print("\t ");
            for(int cst =1; cst<= nst; cst++)
            System.out.print("*\t");
            nsp--;
            nst+= 2;
            System.out.println();



        }
        

    }
    public static void fulldiamond(int n){
     int nst =1, nsp = n/2;
     for(int i =1; i<=n; i++){
        for(int csp =1; csp<= nsp; csp++)
        System.out.print("\t ");
        for(int cst =1; cst<= nst; cst++)
        System.out.print("*\t");
        if(i<= n/2){
        nsp--;
        nst+= 2;}
        else {
            nsp++;
            nst -=2;
        }
        System.out.println();



    }
    }
    public static void pattern_05(int n){
        int nst = n/2 +1;
        int nsp =1;
        for(int row =1; row<= n; row++){
            for(int cst = 1; cst<= nst; cst++)
            System.out.print("*\t");
            for(int csp = 1; csp<= nsp; csp++)
            System.out.print("\t");
            for(int cst = 1; cst<= nst; cst++)
            System.out.print("*\t");
            if(row< (n+1)/2){
                nst-- ;
                nsp+=2;
            }
            else {
                nst ++;
                nsp-= 2;
            }
            System.out.println();
        }

    }
    public static void numberdiamond(int n){
        int nst =1, nsp = n/2;
        for(int row =1; row<=n; row++){
           for(int csp =1; csp<= nsp; csp++)
           System.out.print("\t ");
           int val = row;
           if(row> n/2 +1)
           val = n- row +1;
           for(int cst =1; cst<= nst; cst++){
           System.out.print( val +"\t");
        if(cst<= nst/2)
        val++;
        else 
        val--;
        }
           if(row<= n/2){
           nsp--;
           nst+= 2;}
           else {
               nsp++;
               nst -=2;
           }
           System.out.println();
   
   
   
       }

    }
    public static void backslash(int n){
        for(int i =1; i<= n; i++){
            for(int j =1; j<= i; j++){
                if(i ==j )
                System.out.print("*\t");
                else
                System.out.print("\t");

            }
            System.out.println();
        }
    }
    public static void forwardslash(int n){
        for(int i =1; i<= n; i++){
            for(int j =1; j<= n; j++){
                if(i+j == n+1 )
                System.out.print("*\t");
                else
                System.out.print("\t");

            }
            System.out.println();
        }
    }
    public static void cross(int n){
        for(int i =1; i<= n; i++){
            for(int j =1; j<= n; j++){
                if(i==j ||i+j == n+1 )
                System.out.print("*\t");
                else
                System.out.print("\t");

            }
            System.out.println();
        }
    }
    public static void linediamond(int n){
int nspo = n/2;
int nspi =-1;
for(int row =1; row<= n; row++){
for(int cspo =1; cspo<= nspo; cspo++)
System.out.print("\t");
System.out.print("*\t");
for(int cspi =1; cspi<= nspi; cspi++)
System.out.print("\t");
if(nspi !=-1)
System.out.print("*\t");



if(row<= n/2){
    nspo--;
    nspi+=2;
}
else {
    nspo++;
    nspi-=2;
}
System.out.println();


    }
}
public static void numbertriangle(int n){
    int nst =1;
    int val =1;
    for(int row =1; row<= n; row++){


        for( int cst =1; cst<= nst; cst++)
        System.out.print(val++ + "\t");
        

        nst++;
        
        System.out.println();
    }
}
 

public static void fibonnictriangle(int n){
    int nst =1;
    int a =0;
    int b= 1;
    for(int row =1; row<= n; row++){


        for( int cst =1; cst<= nst; cst++){
        System.out.print(a + "\t");
        int sum = a+b;
        a=b; 
        b = sum;
        }

        nst++;
        
        System.out.println();
    }
}
 
public static void binomialtriangle(int n){
for(int i =0; i< n; i++){
    int ncr =1;
    for(int j =0; j<= i; j++){
        System.out.print(ncr + "\t");
        int ncr1 = (ncr*(i-j))/ (j+1);
        ncr = ncr1;
    }
    System.out.println();
}    
}
public static void hillpattern(int n){
int nst =1, nsp = 2*n-3;
for(int row =1; row<= n; row++){
    int val =1;

    for(int cst =1; cst<= nst; cst++)
    System.out.print(val++ + "\t");

    for(int csp =1; csp<= nsp; csp++)
    System.out.print("\t");
    if(row ==n ){
        val--;
        nst--;}
    for(int cst =1; cst<= nst; cst++){
        
    System.out.print(--val + "\t");}
    nsp-=2;
    nst++;
   
    System.out.println();

} 
}

public static void arrow(int n){  
      int nsp =n/2;
    int nst = 1;
    for(int row =1; row<= n; row++ ){
        for(int csp =1; csp<=nsp; csp++)
        System.out.print("\t");
        for(int cst =1; cst<= nst; cst++)
        System.out.print("*\t");
        if(row<n/2){
            nsp = n/2;
            nst++;
        }
        else if (row == n/2){
            nst+=(n/2+1);
            nsp-=(n/2);
        }
        else if(row == n/2 +1){
            nst-=(n/2+1);
            nsp+=(n/2);
        }
        else {
            nst--;
            nsp= n/2;
        }
        System.out.println();
    }
}
public static void pattern_18(int n){
    int nspo =0;
    int nspi=0;
    int nst = n;
    for(int row =1; row<= n; row++ ){
        for(int cspo =1; cspo<=nspo; cspo++)
        System.out.print("\t");
        for(int cst =1; cst<= nst; cst++)
        if()
        System.out.print("*\t");
        for(int cspi =1; cspi<=nspi; cspi++)
        System.out.print("\t");
        if(row ==1){
            nspo++;
            nst=2;
            nspi= n/2;
        }
       else if(row< n/2){
            nspo++;
            nst= 2;
            nspi-=2;
        }
        else if (row == n/2){
            nspo++;
            nst =1;
            nspi=0;
        }
        else {
            nspo--;
            nst+=2;;
            nspi =0;
        }
        
        System.out.println();
    }
}   

    
        public static void main(String[] args){
int n = scn.nextInt();
// numberdiamond(n);
pattern_18(n);

        }
    }
    
    
    
    