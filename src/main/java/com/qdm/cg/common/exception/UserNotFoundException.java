package com.qdm.cg.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @author U Lakshmi Narayan The exception class contains a @ResponseStatus
 *         annotation to tell spring boot to respond with a 404 NOT FOUND status
 *         when this exception is thrown.
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String message) {
		super(message);
	}

}
