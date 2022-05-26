package snackVendingMachine;

public class SnackVendingMachine implements VendingMachine {
	
	private int selectedItem;
	private double total;
	private double selectedItemPrice;
	private double change;
	private int quantity;
	
	@Override
	public void displayItems() {
		int i=0;
		System.out.println("#####################################################################");
		for (Snacks snack : Snacks.values()){
			i++;
			System.out.print(snack.getId()+":"+snack.name()+" ");
			if (i==5) {
				i=0;
				System.out.println("");
			}
		}
		System.out.println("Please Choose snack by its number:");
	}
 
	@Override
	public int selectedItem(int itemId) {
		this.selectedItem=itemId;
		return selectedItem;
	}

	@Override
	public void displayPrice() {
		Snacks snack = Snacks.idValue(this.selectedItem);
		selectedItemPrice = snack.getPrice();
		System.out.println("#####################################################################");
		System.out.println("snack:"+ snack.name()+ "  Price:"+snack.getPrice());
	}

	@Override
	public boolean isAvailable() {
		Snacks snack = Snacks.idValue(this.selectedItem);
		quantity = snack.getQuantity();
		if (snack.getQuantity()<=0) return false;
		return true;
	}
	
	@Override
	public void selectPaymentMethod() {
		System.out.println("#####################################################################");
		System.out.println("1.Cards Slot:The machine accepts any types of cards in the cards slot");
		System.out.println("2.Money:The machine only accpets coins of values: 10c 50c 100c & bills of values: 10$ 50% ");
		System.out.println("Please Choose Payment method:");
	}
	
	@Override
	public void insertMoney() {
		System.out.println("#####################################################################");
		System.out.println("Please insert money");
	}

	
	@Override
	public boolean isValidMoney(double money) {
		for (Money value : Money.values()) {
			if (money == value.getValue())
				return true;
		}
		return false;
	}
	
	@Override
	public double accumlate(double money) {
		total+=money;
		return total;
	}
	
	@Override
	public boolean isEnoughMoney(double total) {
	 if (total-this.selectedItemPrice <0)return false;
		return true;
	}

	@Override
	public void calculateChange(double total) {
		change = total - this.selectedItemPrice;
		System.out.println("#####################################################################");
		System.out.println("Change:"+change);
		while (change > 0) {
			if (change >= Money.bills50$.getValue()) {
				System.out.println("Money dispense:"+Money.bills50$.name());
				change-= Money.bills50$.getValue();
			}
			else if (change >= Money.bills20$.getValue()) {
				System.out.println("Money dispense:"+Money.bills20$.name());
				change-= Money.bills20$.getValue();
			}
			else if (change >= Money.coins1$.getValue()) {
				System.out.println("Money dispense:"+Money.coins1$.name());
				change-= Money.coins1$.getValue();
			}
			else if (change >= Money.coins50c.getValue()) { 
				System.out.println("Money dispense:"+Money.coins50c.name());
				change-= Money.coins50c.getValue();
			}
			else if (change >= Money.coins20c.getValue()) {
				System.out.println("Money dispense:"+Money.coins20c.name());
				change-= Money.coins20c.getValue();
			}
			else {
				System.out.println("Money dispense:"+Money.coins10c.name());
				change-= Money.coins10c.getValue();
			}
			
		}
	}

	@Override
	public void exit() {
		System.out.println("#####################################################################");
		System.out.println("Thanks for using our Vendingmachine");
	}

	@Override
	public void moneyDispense() {
		System.out.println("#####################################################################");
		System.out.println("Money is dispensing");
		
	}

	@Override
	public void itemDispense() {
		this.quantity-=1;
		Snacks snack = Snacks.idValue(this.selectedItem);
		snack.setQuantity(quantity);
		System.out.println("#####################################################################");
		System.out.println("Snack dispense");
		
	}

	
	
	

}
