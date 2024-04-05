package day_12_Default_keyword;

public class Mobile implements Electronics{
	
	public int resaleValue(int price) {
		return price/2;
	}
	
	public String oneOff(boolean isOn) {                          //default method can be overriden here
		if(isOn == false) {
			return "product is working";
		}
		else {
			return "display gone";
		}
	}

}
