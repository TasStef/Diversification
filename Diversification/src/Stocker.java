import java.util.Random;

public class Stocker {

	private String stockerID;
	private double wallet; 
	private static int population;
	private int numberOfStocks;
	private boolean broke;
	
	Stocker(Integer stockerNumber) {
		this.wallet = 1000;
		this.stockerID = "Stocker #" + stockerNumber.toString();
		this.broke = false;
		this.numberOfStocks = 0;
		population++; 
	}
	
	//Get methods
	public String getStockerID() {
		return this.stockerID;
	}
		public double getWallet() {
		return this.wallet;
	}
	public  int getPopulation() {
		return population;
	}
	public boolean getBrokeStatus() {
		return this.broke;
	}
	public int getNumberOfStocks() {
		return this.numberOfStocks;
	}
	
	//Set Methods 
	 void setNumberOfStocks() {
		this.numberOfStocks = 0;
		double temp = this.wallet;
		
		while(temp / 1000 >=1){
			this.numberOfStocks++;
			temp-=1000;
		}
		
	}
	
	//Stock Outcome Method
	public void stockResult() {
		Random random = new Random();
		this.setNumberOfStocks();
		
		if (this.broke == false) {
			
			for (int j = 1; j <= this.numberOfStocks; j++) {
				double temp = random.nextDouble(100);
				
				if (temp <=10) {
					this.wallet = this.wallet -1000;
				}
				else {
					this.wallet = this.wallet + 1000*0.2;
				}
			}	
		}	
	}


		
		
		
	
}
 