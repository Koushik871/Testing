package com.test.testing.testController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.testing.testDto.testDto;
import com.test.testing.testEntity.testEntity;
import com.test.testing.testService.testService;

@RestController
public class testController {

	@Autowired
	private testService service;

	@PostMapping("/create")
	public testEntity create(@RequestBody testDto dto) {
		return service.createUser(dto);
	}
		
	@GetMapping("/getAllUserDetails")
	public List<testEntity> getAllDetails() {
		return service.getDetails();
	}

}
