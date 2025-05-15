package project0417;

class TV {
	int size;
	
	public TV() {  // 기본 생성자
		this.size = 0;
	}
	
	public TV(int size) {  //size 초기화하는 생성자
		this.size = size;
	}
}

// 필드 : size
// >> TV 객체가 크기 정보를 가지고 있다.

// 생성자 2개 : 기본 생성자, size 초기화
// >> 생성자는 객체가 생성될 때 자동으로 호추로디는 메서드이다. 
// 이를 통해 객체의 초기 상태(필드값)을 설정할 수 있다.

// 기본 생성자 : 매개변수가 없음, 
// TV 객체를 만들 때 특별히 값을 주지 않으면 이 생성자가 실행됨
// TV tv1 = new TV(); >> 크기를 0으로 설정

// size를 초기화하는 생성자 >> TV를 만들 때 size를 지정 가능..