import java.util.*;
class Code{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),r=0,t=n;
while(n>0){
r=r*10+n%10;
n/=10;
}
System.out.println(t==r?"Valid Code":"Invalid Code");
}
}