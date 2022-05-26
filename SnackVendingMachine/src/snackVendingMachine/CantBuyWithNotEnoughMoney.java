package snackVendingMachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CantBuyWithNotEnoughMoney {

	@Test
	void testNotEnoughMoney() {
		int selectedSnack;
		boolean result;
		SnackVendingMachine SVM = new SnackVendingMachine();
		selectedSnack=SVM.selectedItem(1);//Chetos snack with price =2$
		SVM.displayPrice();
		result = SVM.isEnoughMoney(1);
		assertEquals(false,result);
		
	}

}
