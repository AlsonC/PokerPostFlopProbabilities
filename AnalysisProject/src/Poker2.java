import java.util.Scanner;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class Poker2 {
	static int CardsDealt = 0;
	static String WantToKnow;
	static int CardsTo;
	static String Straight1;
	static String Straight2;


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many cards are dealt?");
		CardsDealt = Integer.parseInt(scn.nextLine());
		System.out.println("What do you want to know?");
		WantToKnow = scn.nextLine();
		if(WantToKnow.equals("RF")) {
			System.out.println("How many cards to your Royal Flush?");
			CardsTo = Integer.parseInt(scn.nextLine());
			if(!((5 - CardsDealt) == (5 - CardsTo))) {
				System.out.println("Your probability is: 2/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
			}
			else {
				System.out.println("Your probability is: 1/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 5 - CardsTo));
			}
		}
		else if(WantToKnow.equals("SF")) {
			System.out.println("How many cards to your Straight Flush?");
			CardsTo = Integer.parseInt(scn.nextLine());
			System.out.println("Where is the first missing card?");
			Straight1 = scn.nextLine();
			int numer = 1;
			int denom = 1;
			if(CardsTo == 3) {
				System.out.println("Where is the second missing card?");
				Straight2 = scn.nextLine();	
				if(!(Straight1.equals(Straight2))){
					System.out.println("Your probability is " + 2 + "/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
				}
				else if(Straight1.equals("MID")){
					System.out.println("Your probability is 1/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
				}	
				else {
					System.out.println("Your probability is 3/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
				}
			}
			else {
				if(Straight1.equals("MID")) {
					System.out.println("Your probability is 2/47");
				}
				else{
					System.out.println("Your proability is 4/47");
				}
			}
		}
		else if(WantToKnow.equals("FK")) {
			System.out.println("How many cards to your Four of a Kind?");
			CardsTo = Integer.parseInt(scn.nextLine());
			if(CardsTo == 2) {
				System.out.println("Your probability is 1/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
			}
			if(CardsTo == 3) {
				System.out.println("Your probability is " + (5 - CardsDealt) + "/" + (52 - 2 - CardsDealt));
			}
		}
		else if(WantToKnow.equals("FH")) {
			int Card1 = 0;
			int Card2 = 0;
			System.out.println("How many cards to your Full House?");
			CardsTo = Integer.parseInt(scn.nextLine());
			System.out.println("How many cards to Card 1?");
			Card1 = Integer.parseInt(scn.nextLine());
			Card2 = CardsTo - Card1;
			if(CardsDealt == 4) {
				if((!(Card1 == 3)) && ((!(Card2 == 3)))){
					System.out.println("Your probability is 4/" + (52 - 2 - CardsDealt));
				}
				else{
					System.out.println("Your probability is 3/" + (52 - 2 - CardsDealt));
				}
			}
			else {
//				CardsDealt = 3
				if(CardsTo == 3) {
					if((!(Card1 == 3)) && ((!(Card2 == 3)))){
						System.out.println("Your probability is 12/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
					}
					else {
						System.out.println("Your probability is 12/" + (CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2)*2));
					}
				}
				else {
					if((!(Card1 == 3)) && ((!(Card2 == 3)))){
						System.out.println("Your probability is 8/47");
					}
					else {
						System.out.println("Your probability is 6/47");
					}
				}
				
			}
			
		}
		else if(WantToKnow.equals("FL")) {
			System.out.println("How many cards to your Flush?");
			CardsTo = Integer.parseInt(scn.nextLine());
			if(CardsDealt == 4) {
				System.out.println("Your probability is 9/46");
			}
			else {
				if(CardsTo == 3) {
					System.out.println("Your probability is 90/" + (CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2)*2));
				}
				else {
					System.out.println("Your probability is 18/47");
				}
			}
		}
		else if(WantToKnow.equals("ST")) {
			System.out.println("How many cards to your Straight ");
			CardsTo = Integer.parseInt(scn.nextLine());
			System.out.println("Where is the first missing card?");
			Straight1 = scn.nextLine();
			int numer = 1;
			int denom = 1;
			if(CardsTo == 3) {
				System.out.println("Where is the second missing card?");
				Straight2 = scn.nextLine();	
				if(!(Straight1.equals(Straight2))){
					System.out.println("Your probability is " + 2 + "/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
				}
				else if(Straight1.equals("MID")){
					System.out.println("Your probability is 1/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
				}	
				else {
					System.out.println("Your probability is 3/" + CombinatoricsUtils.binomialCoefficient(52-2-CardsDealt, 2));
				}
			}
			else {
				if(Straight1.equals("MID")) {
					System.out.println("Your probability is 2/47");
				}
				else{
					System.out.println("Your proability is 4/47");
				}
			}
		}
//		else if(WantToKnow.equals("TK")) {
//			System.out.println("How many cards to your Royal Flush?");
//			CardsTo = Integer.parseInt(scn.nextLine());
//		}
//		else if(WantToKnow.equals("TP")) {
//			System.out.println("How many cards to your Royal Flush?");
//			CardsTo = Integer.parseInt(scn.nextLine());
//		}
//		else if(WantToKnow.equals("OP")) {
//			System.out.println("How many cards to your Royal Flush?");
//			CardsTo = Integer.parseInt(scn.nextLine());
//		}

	}

}
