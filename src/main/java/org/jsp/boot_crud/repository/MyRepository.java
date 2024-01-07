package org.jsp.boot_crud.repository;

import org.jsp.boot_crud.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<Student, Integer>{

}
