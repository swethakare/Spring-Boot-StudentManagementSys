package com.project.swedemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	
	private Object fieldvalue;
	private String resourcename;
	private String fieldname;
	public ResourceNotFoundException(String resourcename, String fieldname, Object fieldvalue ){
		super(String.format("%s not found with %s: '%s'",resourcename,fieldname,fieldvalue));
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	public String getResource() {
		return resourcename;
	}
	public void setResource(String resourcename) {
		this.resourcename = resourcename;
	}
	public String getField() {
		return fieldname;
	}
	public void setField(String fieldname) {
		this.fieldname = fieldname;
	}
	public Object getFieldVal() {
		return fieldvalue;
	}
	public void setFieldVal(String fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
}
