package lsj.spring.annotation;

import lsj.spring.beans.HelloSPring5Bean03;

public class HelloSPring5Bean07Jpn implements HelloSPring5Bean03{
		
		@Override
		public void sayHello(String msg) {
			System.out.println("こんにちは, " + msg);
		}
		
}
