
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasketballTeam t1 = new BasketballTeam("reds", "pepper", "coach John");
		
		t1.setStats(42, 28, 20, 40, 65, 100);
		System.out.print(t1);
	}

}
