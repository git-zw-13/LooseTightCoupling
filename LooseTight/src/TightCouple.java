
public class TightCouple {
public static void main(String[] args) {
	TruckCar tcObj = new TruckCar();
	FordCar fcObj = new FordCar();
	Car cObj = new Car(tcObj, fcObj);
	cObj.showAllCarPrice();
}
}
