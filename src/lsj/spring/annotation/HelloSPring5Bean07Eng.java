package lsj.spring.annotation;

import org.springframework.stereotype.Component;

import lsj.spring.beans.HelloSPring5Bean03;

@Component("eng")
public class HelloSPring5Bean07Eng implements HelloSPring5Bean03{
		
		@Override
		public void sayHello(String msg) {
			System.out.println("Hello, " + msg);
		}
}
