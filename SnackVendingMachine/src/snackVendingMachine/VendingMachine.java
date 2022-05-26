package snackVendingMachine;

public interface VendingMachine {
	public void displayItems();
	public int selectedItem(int itemId);
	public void displayPrice();
	public boolean isAvailable();
	public void selectPaymentMethod();
	public void insertMoney();
	public boolean isValidMoney(double money);
	public double accumlate(double money);
	public boolean isEnoughMoney(double total);
	public void calculateChange(double total);
	public void itemDispense();
	public void moneyDispense();
	public void exit();
}

