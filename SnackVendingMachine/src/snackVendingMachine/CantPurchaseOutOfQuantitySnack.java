package snackVendingMachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CantPurchaseOutOfQuantitySnack {

	@Test
	void testOutofQuantity() {
		int selectedSnack;
		boolean result;
		SnackVendingMachine SVM = new SnackVendingMachine();
		selectedSnack=SVM.selectedItem(3);//Sncikers snack with quantity =0
		result=SVM.isAvailable();
		assertEquals(false,result);
	}

}
