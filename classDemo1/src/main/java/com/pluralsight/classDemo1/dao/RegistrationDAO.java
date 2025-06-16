package com.pluralsight.classDemo1.dao;

import com.pluralsight.classDemo1.model.Student;

public interface RegistrationDAO {
    public Long persistStudent(Student student);
    public Student findById(Long id);
}
