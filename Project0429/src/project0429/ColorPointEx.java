package project0429;

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
		
		ColorPoint[] arr = new ColorPoint[3];
		for (int i = 0; i<arr.length;i++) {
			arr[i] = new ColorPoint();
			arr[i].set(i*10, i*10+1);
			arr[i].setColor("color" + i);
		}
		for (int i = 0; i<arr.length;i++) {
			arr[i].showColorPoint();
		}
	}
}