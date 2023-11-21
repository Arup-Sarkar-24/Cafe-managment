package com.mycompany.cafe.main.restImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.cafe.main.constents.CafeConstants;
import com.mycompany.cafe.main.rest.UserRest;
import com.mycompany.cafe.main.service.UserService;
import com.mycompany.cafe.main.utils.CafeUtils;
import com.mycompany.cafe.main.wrapper.UserWrapper;

@RestController
public class UserRestImpl implements UserRest {
	
	@Autowired
	UserService userService;

	@Override
	public ResponseEntity<String> singUp(Map<String, String> reqestMap) {
		try {
			
			return userService.signUp(reqestMap);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> login(Map<String, String> reqestMap) {
		try {
			return userService.login(reqestMap);
		} catch (Exception ex) {
		ex.printStackTrace();
		}
		
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<List<UserWrapper>> getAllUser() {
		try {
			return userService.getAllUser();
		} catch (Exception ex) {
			ex.printStackTrace();
		}return new ResponseEntity<List<UserWrapper>>(new ArrayList<>(),HttpStatus.INTERNAL_SERVER_ERROR );
	}

	@Override
	public ResponseEntity<String> update(Map<String, String> requestMap) {
		try {
			return userService.update(requestMap);
		} catch (Exception ex) {
			ex.printStackTrace();
		}return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> checkToken() {
		try {
			return userService.checkToken();
		} catch (Exception ex) {
			ex.printStackTrace();
		}return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> changePassword(Map<String, String> requestMap) {
		try {
			return userService.changePassword(requestMap);
		} catch (Exception ex) {
			ex.printStackTrace();
		}return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> forgotPassword(Map<String, String> requestMap) {
		try {
			return userService.forgotPassword(requestMap);
		} catch (Exception ex) {
			ex.printStackTrace();
		}return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
