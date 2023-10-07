import java.util.Scanner;

public class ques03 {

   public static void main(String[] args) {
      int choice = 0;
      int qty, price;
      int totalDosaBill = 0, totalSamosaBill = 0, totalIdliBill = 0, totalUttappaBill = 0, totalVadapavBill = 0;
      int totalPohaBill = 0, totalPattiesBill = 0, totalUpmaBill = 0, totalPizzaBill = 0;
      Scanner sc = new Scanner(System.in);
      
      while (choice != 6) {
         System.out.println("Enter your choice:");
         System.out.println("0.Exit 1.Dosa 2.Samosa 3.Idli 4.Uttappa 5.Vadapav 6.poha 7.patties 8.upma 9.pizza 10.Generate Bill");
         choice = sc.nextInt();
         
         switch(choice) {
            case 0:
               System.out.println("Exit");
               break;
            case 1:
               System.out.println("Enter the quantity of dosa:");
               qty = sc.nextInt();
               price = 30;
               totalDosaBill += qty * price;
               System.out.println("Total bill for dosa: " + totalDosaBill);
               break;
            case 2:
               System.out.println("Enter the quantity of samosa:");
               qty = sc.nextInt();
               price = 15;
               totalSamosaBill += qty * price;
               System.out.println("Total bill for samosa: " + totalSamosaBill);
               break;
            case 3:
               System.out.println("Enter the quantity of idli:");
               qty = sc.nextInt();
               price = 40;
               totalIdliBill += qty * price;
               System.out.println("Total bill for idli: " + totalIdliBill);
               break;
            case 4:
               System.out.println("Enter the quantity of uttappa:");
               qty = sc.nextInt();
               price = 45;
               totalUttappaBill += qty * price;
               System.out.println("Total bill for uttappa: " + totalUttappaBill);
               break;
            case 5:
               System.out.println("Enter the quantity of vadapav:");
               qty = sc.nextInt();
               price = 20;
               totalVadapavBill += qty * price;
               System.out.println("Total bill for vadapav: " + totalVadapavBill);
               break;
            case 6:
                System.out.println("Enter the quantity of poha:");
                qty = sc.nextInt();
                price = 25;
                totalPohaBill += qty * price;
                System.out.println("Total bill for poha: " + totalPohaBill);
                break;
            case 7:
                System.out.println("Enter the quantity of patties:");
                qty = sc.nextInt();
                price = 18;
                totalPattiesBill += qty * price;
                System.out.println("Total bill for patties: " + totalPattiesBill);
                break;
            case 8:
                System.out.println("Enter the quantity of upma:");
                qty = sc.nextInt();
                price = 15;
                totalUpmaBill += qty * price;
                System.out.println("Total bill for upma: " + totalUpmaBill);
                break;
            case 9:
                System.out.println("Enter the quantity of pizza:");
                qty = sc.nextInt();
                price = 60;
                totalPizzaBill += qty * price;
                System.out.println("Total bill for pizza: " + totalPizzaBill);
                break;
            case 10:
               int totalBill = totalDosaBill + totalSamosaBill + totalIdliBill + totalUttappaBill + totalVadapavBill + totalPohaBill + totalPattiesBill + totalPizzaBill + totalUpmaBill;
               System.out.println("Total bill: " + totalBill);
               break;
            default:
               System.out.println("Invalid menu entered");
               break;
         }
      }
   }
}