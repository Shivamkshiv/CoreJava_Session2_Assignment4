import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
		
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter FirstNum :");
    	int FNum = scn.nextInt();
    	System.out.println("Enter SecondNum :");
    	int Snum = scn.nextInt();
    	System.out.println("Enter ThirdNum :");
    	int TNum = scn.nextInt();
    	
    	if(FNum > Snum && FNum >TNum){
    		System.out.println("First Num is greatest");
    	}else if(Snum > TNum ){
    		System.out.println("Second Num is greatest");
    	}else{
    		System.out.println("Third Num is greatest");
    	}
	}
}
