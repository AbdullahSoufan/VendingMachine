package snackVendingMachine;

public enum Snacks {
	Chetos(1,2,10) , Layz(2,1,1) , Snickers(3,0.50,0) , Twix(4,3,22), Kinder(5,8,11), 
	Mars(6,4,3), Oreo(7,1.5,9),Twirl(8,9,1),Timeout(9,2,10),MMs(10,15,20),Reeses(11,7,2),
	Skittles(12,4,3),Bounty(13,7,33),KitKat(14,6,2),SevenDays(15,1,3),peanuts(16,3,4),
	nuts(17,15,9),Extra(18,0.50,50),Orbit(19,2.2,7),Mints(20,9,2),Pretzels(21,6,3),
	CupCake(22,9,5),Ozmo(23,2,8),Takis(24,13,25),Cookie(25,7,22);

	private int id;
	private double price;
	private int quantity;
	
	Snacks(int id,double price,int quantity){
		this.id=id;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public static Snacks idValue(int itemId) {
		for (Snacks snack : Snacks.values()) {
			if (itemId == snack.getId())
				return snack;
		}
		return null;
	}
}
