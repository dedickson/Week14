package pet.store.controller.error;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalErrorHandler {
	
	
	private class ExceptionMessage{
		private String message;
		private String statusReason;
		private int statusCode;
		private String timeStamp;
		private String uri;
	}
		
		@ExceptionHandler(NoSuchElementException.class)
		@ResponseStatus(code = HttpStatus.NOT_FOUND)
		public ExceptionMessage handleNoSuchElementException(NoSuchElementException ex, WebRequest webRequest) {
			return buildExceptionMessage(ex, HttpStatus.NOT_FOUND, webRequest);
		}


		private ExceptionMessage buildExceptionMessage(NoSuchElementException ex, HttpStatus notFound,
				WebRequest webRequest) {
			return null;
		}
	
	}
