package com.test.testing.testService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.testing.testDto.testDto;
import com.test.testing.testEntity.testEntity;
import com.test.testing.testRepo.testRepo;

@Service
public class testService {

	@Autowired
	private testRepo repo;

	public testEntity createUser(testDto Dto) {

		testEntity entity = new testEntity();
		entity.setName(Dto.getName());
		entity.setMobile(Dto.getMobile());
		entity.setEmail(Dto.getEmail());
		repo.save(entity);
		return entity;

	}

	public List<testEntity> getDetails() {
		return repo.findAll() ;
		
	}
}
