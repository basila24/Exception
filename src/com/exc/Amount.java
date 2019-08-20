package com.exc;

class Amount1 {
	public Amount1(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	String currency;
	int amount;// Should ideally use BigDecimal
}

class CurrenciesDoNotMatchException extends RuntimeException {
}
class CurrenciesDoNotMatchException1 extends RuntimeException {
	/*String msg1;
	public CurrenciesDoNotMatchException1(String msg) {
		this.msg1=msg;
	}
	
	public CurrenciesDoNotMatchException1() {
		
	}*/

	@Override
    public String toString()
    {
        return "currency not matched matched";
    }
	
}

class AmountAdder {
	static Amount1 addAmounts(Amount1 amount1, Amount1 amount2) {
		if (!amount1.currency.equals(amount2.currency)) {
			throw new CurrenciesDoNotMatchException1();
		}
		return new Amount1(amount1.currency, amount1.amount + amount2.amount);
	}
}

public class Amount {
	public static void main(String[] args) {
		try {
			AmountAdder.addAmounts(new Amount1("RUPEE1", 5), new Amount1("RUPEE",
					5));
			String string = null;
			string.toString();
		} 
		catch (NullPointerException e) {
			System.out.println("Handled NullPointerException grtrg");
		}catch (CurrenciesDoNotMatchException1 e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
