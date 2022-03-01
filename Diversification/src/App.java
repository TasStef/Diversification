
public class App {

	public static void main(String[] args) {
		
		Stocker stocker = new Stocker(1); 
		

	
				
		
		
		System.out.println(stocker.getStockerID());
		System.out.println(stocker.getWallet());
		stocker.setNumberOfStocks();
		System.out.println(stocker.getNumberOfStocks());
		
		for (int i = 0; i < 10; i++) {
			stocker.stockResult();
			System.out.println("year " + i +"\nwallet " +stocker.getWallet() + "||Stocks " +stocker.getNumberOfStocks());
		}
		
		
	}
}
