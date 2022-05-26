package snackVendingMachine;

public enum Money {
	coins10c(0.10), coins20c(0.20), coins50c(0.50), coins1$(1.0),bills20$(20), bills50$(50);
	
	private double value;
	Money (double value) {
		this.value=value;
	}
	
	public double getValue() {
		return value;
	}
	

}
