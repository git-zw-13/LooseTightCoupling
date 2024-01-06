public class Car {

	TruckCar tc;
	FordCar fc;
	//SedanCar sc;

	public Car(TruckCar tc, FordCar fc) {
		this.tc = tc;
		this.fc = fc;
	}
	
	public void showAllCarPrice(){
		tc.salePrice();
		fc.salePrice();
	}

}
