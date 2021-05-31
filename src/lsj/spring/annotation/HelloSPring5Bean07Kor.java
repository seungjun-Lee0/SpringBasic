package lsj.spring.annotation;

import org.springframework.stereotype.Component;

import lsj.spring.beans.HelloSPring5Bean03;

@Component("kor")
public class HelloSPring5Bean07Kor implements HelloSPring5Bean03{
		
		@Override
		public void sayHello(String msg) {
			System.out.println("안녕하세요, " + msg);
		}
}
