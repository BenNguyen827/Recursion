
public class Cake {
 private int bites = 10;
 public Cake() {
	 //nothing to implement
 }
 
 public void takeABite() {
	 --bites;
	 System.out.println("Hmmm...tastes good");
 }
 
 public boolean isEmpty() {
	 return bites == 0;
	 // looks like an empty cake
 }
}

