package com.zebra.savanna.example;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class DataModelTest {

	private static final long ID_VALUE = 0;
	private static final String CONTENT_VALUE = "String";

	private DataModel model;

	@Before
	public void setUp() throws Exception {
		model = new DataModel(ID_VALUE, CONTENT_VALUE);
	}

	@Test
	public void testDataModel() {
		assertNotNull(model);
	}

	@Test
	public void testGetId() {
		assertTrue(ID_VALUE == model.getId());
	}

	@Test
	public void testGetContent() {
		assertTrue(CONTENT_VALUE.equals(model.getContent()));
	}

}
