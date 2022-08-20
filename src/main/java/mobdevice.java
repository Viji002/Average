
public class mobdevice{
	private static mobdevice myPhone;
	
	String brand = "Iphone";
	
	public int price( int equipno) {
	if (equipno == 1) {
		return 10000;
	}
	else if (equipno == 2) {
		return 20000;
	}
	else {
	return 30000;
	}
	
	}
	
	protected void wallPhoto() {
		String c = "Diya";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobdevice.myPhone = new mobdevice();
		int equipno;
		System.out.println("Price:"+myPhone.price(myPhone.price(1)));
		System.out.println("Brand:"+myPhone.brand);
		

	}

}
