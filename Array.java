import java.util.*;
public class Array{
public static Scanner scn = new Scanner(System.in);
public static void test1(int n){
int[] arr = new int[n];
for(int i =0; i< n; i++){
    System.out.println(arr[i] + " ");

}
}
public static void input1(int[] arr){
    int n = arr.length;
    for(int i =0; i<n; i++){
        arr[i] = scn.nextInt();
    }
}
public static void display1(int [] arr){
    for(int i =0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
// for each loop(only to get)
// automatically increment by 1
// always in forward direction
public static void display2(int [] arr){
for(int ele : arr){
    System.out.print(ele + " ");
}
}
public static int [] input2(int n){
    int [] arr = new int[n];
    for(int i =0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    return arr;
}
public static int  maximum(int[] arr){
    int maxEle = -(int)1e9-1; 
 for (int ele : arr){
     maxEle = Math.max(maxEle, ele);
 }
 return maxEle;

}
public static int  minimum(int [] arr){
int minEle = (int)1e9;
for(int ele: arr){
    minEle = Math.min(minEle, ele);
}
return minEle;
}
public static int  find(int [] arr, int data){
    int foundindex =-1;
    for(int i =0; i<arr.length; i++){
        
        if(arr[i] == data){
        foundindex =i;
break;
         
        }
    }
    return foundindex;

}
public static int spanofarray(int [] arr){
 int maxEle = -(int)1e9;
 int minEle = (int)1e9;
 for(int ele: arr){
     maxEle = Math.max(maxEle, ele);
     minEle = Math.min(minEle, ele);
     

 }
 return maxEle - minEle;

}
public static void swap(int [] arr, int i, int j){
    int temp = arr[i];
    arr[i]= arr[j];
     arr[j] = temp;
}
public static void reverseofarray(int [] arr){
    int i =0, j =arr.length -1;
    while(i<j){
        swap(arr,i,j);
        i++;
        j--;
    }
    
}

public static int[] inverseofArray(int [] arr){
    int n = arr.length;
    int [] ans = new int[n];
    for(int i =0; i<n; i++){
        int idx = arr[i];
        ans[idx] = i;
    }

return ans;

}
public static int [] rotateanarray(int [] arr, int r){
int n = arr.length;
r%= n;
if(r<n)

r+= n;
int [] ans = new int[n];
for(int i =0; i<n; i++){
    int idx = (i+r)%n;
    ans[idx] =arr[i];

}
return ans;
}
public static void reverseofArray(int [] arr, int i, int j){

    while(i<j){
        swap(arr,i,j);
        i++;
        j--;
    }

}
public static void rotateofArray2(int[] arr, int r){
    int n = arr.length;
    r%= n;
    if(r<0)
    r+=n;
    reverseofArray(arr, 0,n-1);
    reverseofArray(arr, 0,r-1);
    reverseofArray(arr, r,n-1);
}
public static void sumoftwoArray(int [] arr1, int [] arrr2){
    int n = arr1.length;
    int m = arr2.length;
    int p =Math.max(n,m) +1;
    int [] ans = new int [p];
    int i =n-1, j =m-1, k =p-1, carry =0;
    while(k>=0){
        int sum = carry +(i>=0 ? arr1[i] :0) + (j>=0 ? arr2[j] : 0);
ans[k] = sum%10;
carry = sum/10;
i--;
j--;
k--;
    }



}
// arr1 as number > arr2 as a number
public static void subtractoftwoarray(int [] arr1, int [] arr2){

}



public static void main(String[] args){
   int n = scn.nextInt();
   
   int [] arr = input2(n);
//  int data = scn.nextInt();
//  int Find = find(arr,data);
//  System.out.print(Find);
   
 int [] ans = inverseofArray(arr);
//  rotateofArray2(arr,r);
display1(ans);
}
}
 