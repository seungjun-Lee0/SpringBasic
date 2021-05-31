package lsj.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lsj.spring.grade.Grade;
import lsj.spring.grade.GradeDAO;
import lsj.spring.grade.GradeService;

@Service("gsrv")
public class GradeServiceImpl implements GradeService {
	
	@Autowired
	private GradeDAO gdao;
	
//	// gsdao 에 대한 객체를 불러오기 위해 생성자 정의
//	public GradeServiceImpl(GradeDAO gdao) {
//		this.gdao = gdao;
//	}
//	
//	//gdao에 대한 객체를 불러오기 위한 setter 메서드 정의
//	// 스프링 컨테이너가 gdao 변수에  gsdao 객체를DI 해줌
//	public void setGdao(GradeDAO gdao) {
//		this.gdao = gdao;
//	}

	@Override
	public void newGrade() {
		Grade gd = new Grade("이름", 55, 61, 77);
		
		System.out.println("성적 생성됨!");
		
		gdao.insertGrade(gd);
	}

}
