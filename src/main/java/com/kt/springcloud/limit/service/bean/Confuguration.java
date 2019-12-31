package com.kt.springcloud.limit.service.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Confuguration {
 private int min;
 private int max;
public int getMin() {
	return min;
}
public void setMin(int min) {
	this.min = min;
}
public int getMax() {
	return max;
}
public void setMax(int max) {
	this.max = max;
}
public Confuguration(int min, int max) {
	super();
	this.min = min;
	this.max = max;
}
public Confuguration() {
	super();
}
 
}
