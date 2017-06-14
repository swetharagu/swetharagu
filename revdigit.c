#include<stdio.h>
#include<conio.h>
int main()
{
int k,num=o,rem;
printf("\n enter the number:");
scanf("%d",&k);
while(k!=0){
rem=k%10;
num=num/10*rem;
k/=10;
}
printf("\n reverse number is=%d",num);
return (0);
}
