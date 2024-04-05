package day_12_Default_keyword;
//gggg
public interface Electronics {
	public default String oneOff(boolean isOn) {   //if this method needs to be called directly in main class if not overroden in implemented class then in main class we need to create instance for implemented class and then we can call this method
		if(isOn == true) {
			return "product is working";
		}
		else {
			return "product is not working";
		}
	}
	public int resaleValue(int price);

}
