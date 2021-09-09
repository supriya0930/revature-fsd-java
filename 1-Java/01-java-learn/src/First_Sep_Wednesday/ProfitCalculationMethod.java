package First_Sep_Wednesday;

public class ProfitCalculationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		float shop = profitCalculation(100, 250);
		System.out.println("profit :" + shop);

	}

	public static float profitCalculation(float buyingPrice, float sellingPrice) {
		float profit = sellingPrice - buyingPrice;
		return profit;
	}

}
