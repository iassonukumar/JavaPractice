import java.util.Scanner;
class PalindromeNumber{
public static void main(String args[]){

System.out.println("Enter the number");

Scanner sc=new Scanner(System.in);
int originalNumber=sc.nextInt();
int num=originalNumber;
int rev=0;
int rem;

while(num!=0){

rem=num%10;
rev=(rev*10)+rem;
num=num/10;

}

if(originalNumber==rev){
System.out.println(originalNumber+": is a palindrome number");
}
else{
System.out.println(originalNumber+": is not a palindrome number");
}


}





}