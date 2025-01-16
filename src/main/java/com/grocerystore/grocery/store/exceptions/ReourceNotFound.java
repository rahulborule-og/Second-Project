package com.grocerystore.grocery.store.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ReourceNotFound extends RuntimeException{
    public ReourceNotFound(String message){
      super(message);

    }
}
