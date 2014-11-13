package mt.edu.um.cs.testing.unittesting.modeljunit.example.coffee;

public class CoffeeMachine {
	
	private double balance =0;
	private Drink drinkChoice=null;
	private ExtraChoice extraChoice = null;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Drink getDrinkChoice() {
		return drinkChoice;
	}
	public void setDrinkChoice(Drink drinkChoice) {
		this.drinkChoice = drinkChoice;
	}
	public ExtraChoice getExtraChoice() {
		return extraChoice;
	}
	public void setExtraChoice(ExtraChoice extraChoice) {
		this.extraChoice = extraChoice;
	}
	
	public void reset(){
		balance = 0;
		drinkChoice = null;
		extraChoice=null;
	}
	
	public void addEuro(){
		balance+=1.0;
	}
	
	public void addFifty(){
		balance+=0.5;
	}
	
	public void chooseTea(){
		if(balance >=1){
			drinkChoice = Drink.TEA;
		}
	}
	
	public void chooseCoffee(){
			drinkChoice = Drink.COFFEE;
	}
	
	public void chooseChoc(){
			drinkChoice = Drink.HOT_CHOCLATE;
	}
	
	public Pair<Drink, ExtraChoice> getDrink(){
		if(balance > 0 && drinkChoice!=null){
			Pair<Drink, ExtraChoice> output = new Pair<Drink, ExtraChoice>(drinkChoice,extraChoice);
			System.out.println("Serving: " + drinkChoice+ " " + extraChoice);
	
			reset();	
			
			return output;
		}else{
			return null;
		}
	}
	
	public void chooseExtraSugar(){
		extraChoice=ExtraChoice.EXTRA_SUGAR;
	}
	
	public void chooseMilk(){
		extraChoice=ExtraChoice.MILK;
	}
	
	public void chooseSugar(){
		extraChoice=ExtraChoice.SUGAR;
	}
	

}
