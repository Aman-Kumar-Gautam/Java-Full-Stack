package com.blog.blogger.exception;

import com.blog.blogger.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
   @ExceptionHandler(ResourcesNotFoundException.class)
    public ResponseEntity<ErrorDetails> resourceNotFoundException(
    ResourcesNotFoundException exception,
    WebRequest webRequest)
   {
       ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(),
               webRequest.getDescription(true));

       return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
