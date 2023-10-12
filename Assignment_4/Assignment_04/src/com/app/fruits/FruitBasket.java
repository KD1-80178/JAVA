package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		int size,index=0;
		Fruits basket[];
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		System.out.println("enter the size = ");
		size=sc.nextInt();
		basket=new Fruits[size];
		
		do
		{
		System.out.println("enter the choice = ");
		System.out.print("0.exit   1.add Mango  2.Add Orange  3.Add Apple");
		System.out.print("4. Display all fruits  5.Display details  6.Display taste  7.mark fruit as stale  8.mark all sour fruit as stale");
		System.out.println();
		choice=sc.nextInt();
		
				
		switch(choice)
			{
			case 1:
				basket[index]=new Mango();
				basket[index].acceptData();
				index++;
				break;
			case 2:
				basket[index]=new Orange();
				basket[index].acceptData();
				index++;
				break;
			case 3:
				basket[index]=new Apple();
				basket[index].acceptData();
				index++;
				break;
			case 4:
				for (Fruits fruit:basket)
					if(basket!=null)
					{
						System.out.println(fruit.getName());
						System.out.println();
					}
					break;
			case 5:
				 System.out.println("Details of all fresh fruits:");
                 for(Fruits fruit : basket) {
                     if(fruit != null && fruit.isFresh()) {
                         System.out.println(fruit.toString());
                         System.out.println("Taste: " + fruit.taste());
                     }
                 }
					break;
			case 6:
				System.out.println("Taste of all stale fruits:");
                for(Fruits fruit : basket) {
                    if(fruit != null && !fruit.isFresh()) {
                        System.out.println(fruit.taste());
                    }
                }
					break;
			case 7:
				System.out.println("Enter the index of the fruit to mark as stale:");
                int counter = sc.nextInt();
                if(counter < 0 || counter >= basket.length) {
                    System.out.println("Invalid index!");
                } else {
                    basket[counter].setFresh(false);
                    System.out.println("Fruit marked as stale.");
                }
					break;
			case 8:
				System.out.println("Marking all sour fruits as stale.");
                for(Fruits fruit : basket) {
                    if(fruit != null && fruit.taste().equals("sour")) {
                        fruit.setFresh(false);
                    }
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        
            }
		}while(choice!=0);
	}
}

	


