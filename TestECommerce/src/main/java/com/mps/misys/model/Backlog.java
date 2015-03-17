package com.mps.misys.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Backlog implements Serializable {

	private static final long serialVersionUID = -1711180866003111383L;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
