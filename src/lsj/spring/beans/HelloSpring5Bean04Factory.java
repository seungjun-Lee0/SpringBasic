package lsj.spring.beans;

public class HelloSpring5Bean04Factory {
	
	// HelloSPring5Bean03 타입의 객체를 만드는 공장이라는 의미
	// 인삿말을 출력하는 객체를 생성하는 create 메서드 정의
	public static HelloSPring5Bean03 create(String type) {
		HelloSPring5Bean03 obj = null;
		
		if(type.equalsIgnoreCase("kor"))
			obj = new HelloSPring5Bean03Kor();
		else if(type.equalsIgnoreCase("eng"))
			obj = new HelloSPring5Bean03Eng();
		return obj;
	}
}
