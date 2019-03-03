package towerOfHanoi;

public class TowerOfHanoi {
										//A			//C			//B
	public static void buildTower(int n, String from, String to, String using) {
		if(n == 1) {
			System.out.println("Moving disc " + n + " from " + from + " to " + to);
		}else {
			buildTower(n-1,from, using, to);
			System.out.println("Moving disc " + n + " from " + from + " to " + to);
			buildTower(n-1, using, to, from);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		String from = "A";
		String to = "C";
		String using = "B";
		buildTower(n, from, to, using);
	}

}
