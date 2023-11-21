package com.mycompany.cafe.main.rest;

import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.cafe.main.wrapper.UserWrapper;

@RequestMapping(path = "/user")
public interface UserRest {
	@PostMapping(path = "/signup")
	public ResponseEntity<String> singUp(@RequestBody(required = true)Map<String, String> reqestMap);
	
	@PostMapping(path = "/login")
	public ResponseEntity<String> login(@RequestBody(required = true)Map<String, String> reqestMap);
	
	@GetMapping(path="get")
	public ResponseEntity<List<UserWrapper>> getAllUser();
	
	@PutMapping(path="/update")
	public ResponseEntity<String> update(@RequestBody(required = true) Map<String, String>requestMap);
	
	@GetMapping(path="checkToken")
	public ResponseEntity<String> checkToken();
	
	@PostMapping(path = "changePassword")
	public ResponseEntity<String> changePassword(@RequestBody Map<String, String>requestMap);
	
	@PostMapping(path = "forgotPassword")
	public ResponseEntity<String> forgotPassword(@RequestBody Map<String, String>requestMap);
	
	

}
