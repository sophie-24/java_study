package project0417;

class ColorTV extends TV{
	
	public ColorTV(int size) {
		super(size); // super 생성자 호출
	}
	public void printProperty() {
		System.out.println(size);
	}
}

// TV를 상속
// 생성자 : super 생성자 호출

