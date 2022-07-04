package org.victor.hugo.api.exception;

import javax.ws.rs.ext.Provider;
import java.io.Serializable;

@Provider
public class AlticciException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	public AlticciException() {
		super();
	}

	public AlticciException(String message) {
		super(message);
	}

	public AlticciException(String message, Exception e) {
		super(message, e);
	}

}
