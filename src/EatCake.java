
public class EatCake {
public EatCake () {
	
}
public void eatCake(Cake cake) {
	if(!cake.isEmpty()) {
	cake.takeABite();
	eatCake(cake);
	}
}
public static void main(String[] args) {
	Cake cake  = new Cake();
	eatCake1(cake);
	System.out.println("Done eating cake " + " - ready to go back to Java 2!!!");
	
}
}
