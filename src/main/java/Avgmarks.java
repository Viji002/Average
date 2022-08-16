
public class Room1 {
int alexa = 50;
int aria = 80;
int diya = 100;


public String calculateGrade(int mark) {
	if(mark<60) {
		return "C";
	}
	else if (mark<90) {
		return "B";
	}
	else if (mark==100) {
		return "A";
	}
	else {
		return "fail";
	}
}

public int getavg(int mark1,int mark2,int mark3) {
	int avg = (mark1+mark2+mark3)/3;
	return avg;
			
			

}

	

public static void main(String[] args) {
	Room1 room = new Room1();
	System.out.println(room.alexa);
	System.out.println(room.aria);
	System.out.println(room.diya);
	System.out.println ("alexa's Grade"+"="+room.calculateGrade(room.alexa));
	System.out.println("Avg"+"="+room.getavg(room.alexa, room.aria, room.diya));
}		// TODO Auto-generated method stub



}

