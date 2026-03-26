#include <stdio.h>

int class getsum (int a, int b) {

    while(b!=0){
         int sum =a^b;
         int carry = (a&b)<<1;
         a= sum;
         b = carry;
    }
    return a ;
}

int main(){
     int a, b;

     printf("enter the first number : ");
     scanf("%a" , "%b" , &a , &b);

     int result= getsum(a, b);

     rintf(result);
     return 0;
}