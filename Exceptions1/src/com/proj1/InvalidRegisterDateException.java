package com.proj1;
/**
 * 
 * Class handles exception
 * @author Nicole Colgan 19345826
 *
 */
public class InvalidRegisterDateException extends Exception{
	
	public InvalidRegisterDateException(String message) { //message can be displayed
		super(message);
	}
}
