package lsj.spring.beans;

public class HelloSPring5Bean03Eng implements HelloSPring5Bean03{
		
		@Override
		public void sayHello(String msg) {
			System.out.println("Hello, " + msg);
		}
}
