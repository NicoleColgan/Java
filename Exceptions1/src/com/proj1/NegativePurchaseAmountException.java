package com.proj1;
/**
 * class handles exception
 * @author Nicole Colgan 19345826
 *
 */
public class NegativePurchaseAmountException extends Exception {
	public NegativePurchaseAmountException(String message) {
		super(message); //message can be displayed
	}
}
