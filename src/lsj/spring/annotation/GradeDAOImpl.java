package lsj.spring.annotation;

import org.springframework.stereotype.Repository;

import lsj.spring.grade.Grade;
import lsj.spring.grade.GradeDAO;

@Repository("gdao")
public class GradeDAOImpl implements GradeDAO  {

	@Override
	public void insertGrade(Grade gd) {
		System.out.println("성적 추가됨");
	}
}
