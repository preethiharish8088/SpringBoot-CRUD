package org.jsp.boot_crud.service;

import java.util.List;

import org.jsp.boot_crud.dao.MyDao;
import org.jsp.boot_crud.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class MyService {

	@Autowired
	MyDao dao;

	public String save(Student student, ModelMap map) {
		student.setPercentage((student.getScience() + student.getEnglish() + student.getMaths()) / 3.0);
		if (student.getEnglish() < 35 || student.getScience() < 35 || student.getMaths() < 35)
			student.setResult("Fail");
		else {
			if (student.getPercentage() >= 85)
				student.setResult("Distinction");
			else if (student.getPercentage() >= 60)
				student.setResult("FirstClass");
			else
				student.setResult("Secondclass");
		}

		dao.save(student);
		map.put("pass", "Record Saved Success");
		return "Main";
	}

	public String fetchAll(ModelMap map) {
		List<Student> list = dao.fetchAll();
		if (list.isEmpty()) {
			map.put("fail", "No Records Found");
			return "Main";
		} else {
			map.put("list", list);
			return "Fetch";
		}
	}

	public String delete(int id, ModelMap map) {
		dao.delete(id);
		map.put("pass", "Data Deleted Success");

		return fetchAll(map);

	}

	public String edit(int id, ModelMap map) {
		Student student = dao.fetchById(id);
		map.put("student", student);
		return "Edit";
	}

	public String update(Student student, ModelMap map) {
		student.setPercentage((student.getScience() + student.getEnglish() + student.getMaths()) / 3.0);
		if (student.getEnglish() < 35 || student.getScience() < 35 || student.getMaths() < 35)
			student.setResult("Fail");
		else {
			if (student.getPercentage() >= 85)
				student.setResult("Distinction");
			else if (student.getPercentage() >= 60)
				student.setResult("FirstClass");
			else
				student.setResult("Secondclass");
		}

		dao.save(student);
		map.put("pass", "Record Updated Success");
		return fetchAll(map);
	}

}


