package snackVendingMachine;

import java.util.Scanner;

public class Main { 
	
	
	public static void main (String[] args) {
		while(true){
			SnackVendingMachine SVM = new SnackVendingMachine();
			SVM.displayItems();
			int selectedItem;
			int answer = 1;
			double total=0;
			Scanner scanner = new Scanner (System.in);
			int itemId= Integer.parseInt(scanner.nextLine());
			
			while (true) {
				selectedItem = SVM.selectedItem(itemId);
				if (itemId < 25) break;
				System.out.println("This item ID is not valid");
			}
			if (SVM.isAvailable())
				SVM.displayPrice();
			else{
				System.out.println("This item is not available now");
				SVM.exit();
				continue;
			}
			
			SVM.selectPaymentMethod();
			scanner = new Scanner (System.in);
			int paymentMethod= Integer.parseInt(scanner.nextLine());
			if (paymentMethod==1) {
				System.out.println("Your card was accepted !");
				SVM.itemDispense();
				SVM.exit();
				continue;
			}
			else {
				while (answer==1) {
				SVM.insertMoney();
				scanner = new Scanner (System.in);
				double money = scanner.nextDouble();
				if (SVM.isValidMoney(money)) {
					total= SVM.accumlate(money);
					System.out.println("#####################################################################");
					System.out.println("Total money enterd:"+total);
				}
				else{
					System.out.println("#####################################################################");
					System.out.println("not valid money");
					System.out.println("Invalid money dispense");
				}
				System.out.println("If not finished Press 1.");
				System.out.println("If finished Press 2.");
				scanner = new Scanner (System.in);
				answer = Integer.parseInt(scanner.nextLine());
				}
			}
			if (SVM.isEnoughMoney(total)) {
				SVM.itemDispense();
				SVM.calculateChange(total);
				SVM.exit();
			}
			else {
				System.out.println("Money is not enough");
				SVM.moneyDispense();
				SVM.exit();
			}
			
		}
	}
}
