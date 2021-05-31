package lsj.spring.grade;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringGradeApp02 {
	public static void main(String[] args) {
		// 스프링으로 구현하는 성적처리프로그램
		// 각 모듈간의 의존성을 낮추기 위해
		// Service, DAO 클래스는 인터페이스를 기반을 작성함
		// Service : GradeService -> GradeServiceImpl
		// DAO : GradeDAO -> GradeDAOImpl
		
		// 전체적인 흐름
		// SpringGradeApp01 -> GradeServiceImpl -> GradeDAOImpl
		// GradeServiceImpl, GradeDAOImpl 등을
		// bean 설정파일에 등록해 둠
		
		ApplicationContext  ctx = 
				new FileSystemXmlApplicationContext("src/grade02.xml");
		
		// grade.xml에 의해 스프링 컨테이너가
		// 미리 생성해둔 gsrv객체를 가져다 씀
		GradeService gsrv = 
				(GradeService) ctx.getBean("gsrv");
		
		// gsrv변수의 newGrade 메서드 호출
		gsrv.newGrade();
	}
}
