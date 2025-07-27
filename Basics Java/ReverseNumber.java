import java.util.Scanner;
class ReverseNumber{
public static void main(String args[]){
System.out.println("Enter the number");

Scanner sc=new Scanner(System.in);
int rem;
int num=sc.nextInt();
int rev=0;

while(num!=0){

rem=num%10;
rev=(rev*10)+rem;
num=num/10;

}
System.out.println("reverse number is:"+rev);


}





}