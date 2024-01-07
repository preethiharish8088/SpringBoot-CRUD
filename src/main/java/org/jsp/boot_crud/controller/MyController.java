package org.jsp.boot_crud.controller;

import org.jsp.boot_crud.dto.Student;
import org.jsp.boot_crud.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@Autowired
	MyService service;

	@GetMapping("/")
	public String loadMain() {
		return "Main";
	}

	@GetMapping("/insert")
	public String loadInsert() {
		return "Insert";
	}

	@PostMapping("/insert")
	public String insert(Student student, ModelMap map) {
		return service.save(student, map);
	}

	@GetMapping("/fetch")
	public String fetchAll(ModelMap map) {
		return service.fetchAll(map);
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id,ModelMap map)
	{
		return service.delete(id,map);
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int id,ModelMap map)
	{
		return service.edit(id,map);
	}
	
	@PostMapping("/update")
	public String update(Student student, ModelMap map) {
		return service.update(student, map);
	}


}
