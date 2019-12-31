package com.kt.springcloud.limit.service.bean;

public class LimitsConfiguration {
 int maximum;
 int minimum;
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}
public LimitsConfiguration(int maximum, int minimum) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
}
public LimitsConfiguration() {
	super();
}
 
}
