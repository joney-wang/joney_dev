package com.joney.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joney.mapper.StudentMapper;
import com.joney.pojo.Student;
import com.joney.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentMapper stum;
	
	@Override
	public List<Student> queryStudnets() {
		// TODO Auto-generated method stub
		return stum.selectAll();
	}

}
