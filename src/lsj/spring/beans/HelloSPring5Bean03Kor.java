package lsj.spring.beans;

public class HelloSPring5Bean03Kor implements HelloSPring5Bean03{
		
		@Override
		public void sayHello(String msg) {
			System.out.println("안녕하세요, " + msg);
		}
}
