package YardCareSystem;

import java.util.Scanner;

public interface LawnInterface {
	public static void main(String[] args) { 

	      LawnMowing lawn = new LawnMowing();

	 int n = 9; 
     double lawnArea;
     double fee = 0.0;
     double totalFee = 0.0;
     double lowestFee = 0.0;
     double highestFee = 0.0;
     double averageFee = 0.0;


     System.out.println("Welcome to Yard Care System");
     Scanner sc = new Scanner(System.in);

     for (int i = 1; i <= n; i++) { //for loop to input area
     System.out.print("Enterarea for lawn " + i + ":");
     lawnArea = sc.nextDouble(); //read the double value from the user
     fee = lawn.lawnMowingFee(lawnArea);
     System.out.println("The fee for lawn " + i + " is " + fee);
     totalFee = totalFee + fee;
     if (i == 1) {
       lowestFee = fee;
     }

     if (fee < lowestFee) {
       lowestFee = fee;
     }
     if (fee > highestFee) {
       highestFee = fee;
     }

 }

   averageFee = totalFee / n;
   System.out.println("-------------------------Report-----------------"); //Prints the string of characters contained between the double quotation marks
   System.out.println("Totally lawn mowing fee: " + totalFee);
   System.out.println("Lowestly lawn mowing fee: " +lowestFee);
   System.out.println("Highestly lawn mowing fee: " + highestFee);
   System.out.println("Averagely lawn mowing fee: " + averageFee);
   System.out.println("Lawner with highest monthly fee: "+ lawn.lawnNumber(highestFee));
   System.out.println("-----------------------------------------------------");
   System.out.println("THANKfor using Yard Care System"); //exit message
 }
}

