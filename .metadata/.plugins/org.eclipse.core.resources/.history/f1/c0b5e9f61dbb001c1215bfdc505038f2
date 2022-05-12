package com.service;
import com.model.InterestCalculator;
public class CalculatorService {
	private InterestCalculator ic;

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	public double service(double amount) {
		return ic.calculate(amount);
	}
	public CalculatorService() {
		System.out.println("Service initiated");
	}
	public void callInit() {
		System.out.println("Init Called");
	}
	public void callDestroy() {
		System.out.println("destroy called");
	}
}
