import java.util.*;

//import javax.lang.model.util.ElementScanner6;
public class self {
    public static Scanner scn = new Scanner(System.in);
    // public static void gradingSystem(int marks){
    //    // int marks = scn.nextInt();
    //     if(marks>= 90){
    //         System.out.println("Excellent");
    //     }
    //     else if (marks>= 80){
    //         System.out.println("Good");}
    //        else if(marks>= 70){
    //             System.out.println("better");}
    //            else  if(marks>= 60){
    //                 System.out.println("Average");
    // }

    
//  public static void main(String[] args){
     
    // System.out.println("*****");
    // System.out.println("   *");
    // System.out.println("  *");
    // System.out.println(" *");
    // System.out.println("*****");

    
//  } 
public static void printoddeven(int num){
    if(num%2 ==0)
        System.out.println("even");
    else 
    System.out.println("odd");
}
public static void printmultiple(){
    int count = scn.nextInt();
    for(int i =0; i<= count; i++){
        int num = scn.nextInt();
        printoddeven(num);

    }
}
public static void printtable(int num){
    for(int i =1; i<=10; i++){
       // int multiply = num*i;
        System.out.println(num + " X " +i +" = " + (num*i)); 
    }
}
public static void multipletable(int n){
    for(int i=1; i<= n; i++){
        //int num = scn.nextInt();
        printtable(i);
    }
}
public static void isprimeno(int n){
    int count =0;
    if(n==1){
        System.out.println("not prime");
    }
    else{
    for(int i =2; i*i<= n; i++){
        if(n%i ==0)
        count++;
    }
    if(count ==0){
        System.out.println( "prime");

    }
    else 
        System.out.println(  "not prime");
}
    
}

 

public static void test1(){
    for(int i =0; i<= 10; i++){
        int n = scn.nextInt();
    
        isprimeno(n);
    }
}
public static boolean iseven(int n){
    if(n%2 ==0) return true;
    else 
    return false;
    
}
public static boolean isprime(int n){
    for(int i =2; i*i<= n; i++){
        if(n%i ==0)
        return false;
    }
    return true;
}
public static void solve(){
    int n = scn.nextInt();
    boolean res = isprime(n);
    if(res == true){
        System.out.println("prime");

    }
    else {
        System.out.println("not prime");
    }
}
public static void printallprimeno(int n){
    for(int i =1; i<= n; i++){
        isprimeno(i);
    }
}
public static void primenoinrange(int low, int high){
    for(int i =low; i<= high; i++){
        isprimeno(i);
    }
}
public static int countdigit(int n){
    int count =0;
    while(n!= 0){
        n/= 10;
        count++;


    }
    return count;

}
public static void printdigitinreverseorder(int n){
while(n!= 0){
    int rem = n%10;
    n/= 10;
    System.out.println(rem);

}
}

public static int power(int n){
    int pow =1;
    n/= 10;
    while(n!= 0){
        n/= 10;
        pow*= 10;


    }
    return pow;
    
}
public static void printdigit(int n){
    int pow = power(n);
    
    while(pow!= 0){
        int quo = n/pow;
        n%= pow;
        pow/= 10;
        System.out.println(quo);



    }
}
public static int rotateaNo(int n, int r){
    int digit = countdigit(n);
    r%= digit;
    if(r< 0)
    r+= digit;
    
    int mul =1;
    int div =1;
    for(int i =1; i<= digit; i++){
        if(i<= r)
        div*= 10;
        else 
        mul*= 10;
    }

    
    int a = n%div;
    int b = n/div;
    int res = (a*mul + b);
return res;

     
}
public static boolean checkPythagoriantriplet_01(int a, int b, int c){

    //int a = scn.nextInt(), b = scn.nextInt(),c = scn.nextInt();
    int Max = Math.max(Math.max(a,b),c);
    if(Max ==a && (b*b + c*c == a*a)) return true;
    if(Max ==b && (a*a + c*c == b*b)) return true;
    if(Max ==c && (b*b + a*a == c*c)) return true;
    else return false;

}
 public static boolean pythagoriantriplet_02(int a, int b, int c){
     return (b*b + c*c == a*a) || (a*a + c*c == b*b) || (b*b + a*a == c*c);
 }
 

 public static void benjaminbulbs(int n){
     for(int i =1; i*i <= n; i++){
         System.out.println(i*i);
     }
 }
 public static void fibonacciseries(int n){
    int a =0;
    int b=1;
    for(int i =0; i<n; i++){
        System.out.println(a);
        int c= a+b;
        a=b;
        b=c;
    }
}
public static void primefactors(int n){

for(int i =2; i*i< n; i++){
        
            while(n %i ==0){
                System.out.println(i + " ");
                n = n/i;
            }
        } 
            
        if(n != 1)
            System.out.print(n);
        

    
}


 
 public static void main(String[] args) {
     int n= scn.nextInt();
     
    //  int high = scn.nextInt();     
// gradingSystem(marks);
// printmultiple();
// printtable(num);
//multipletable(n);
//isprimeno(t);
//test1();
// System.out.println(countdigit(n));
// printdigit(n);
 //benjaminbulbs(n);
 primefactors(n);
 }
}

