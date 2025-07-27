import java.util.*;
public class PrimeNumber{
public static void main(String args[]){

System.out.println("entr the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

boolean isPrime=true;

if(n==2){
System.out.println(n+"is not a prime number");
}

else{

for(int i=2;i<n;i++){

if(n%i==0){
isPrime=false;
}

}

}
 
if(isPrime==true){
System.out.println(n+":is a prime number");
}

else{
System.out.println(n+":is not a prime  number");
}

}




}