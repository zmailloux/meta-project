package com.zebra.savanna.example;

import lombok.Data;

@Data
public class DataModel {

	private final long id;
	private final String content;

	public DataModel(long id, String content) {
		this.id = id;
		this.content = content;
	}


}
