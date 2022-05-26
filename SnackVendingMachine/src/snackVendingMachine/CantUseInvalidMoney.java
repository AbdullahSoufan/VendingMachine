package snackVendingMachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CantUseInvalidMoney {

	@Test
	void testNotValidMoney() {
		boolean result;
		SnackVendingMachine SVM = new SnackVendingMachine();
		result=SVM.isValidMoney(22);
		assertEquals(false,result);
	}

}
