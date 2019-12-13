package com.shweta.datastructures;

import org.junit.Test;

import org.junit.Assert;

public class LinkedListTest {
	
	@Test
	public void test_size_of_an_empty_list() {
		LinkedList list = new LinkedList();
		Assert.assertEquals(0, list.size());
	}
	
	@Test
	public void test_size_of_a_nonempty_list() {
		LinkedList list = new LinkedList();
		list.add("shweta");
		list.add("darsh");
		list.add("mona");
		list.add("sheila");
		Assert.assertEquals(4, list.size());
	}
	
	@Test
	public void test_get_on_empty_list() {
		LinkedList list = new LinkedList();
		Assert.assertNull(list.get(0));
		Assert.assertNull(list.get(7));
	}
	
	@Test
	public void test_get_on_nonempty_list() {
		LinkedList list = new LinkedList();
		list.add("shweta");
		list.add("darsh");
		list.add("mona");
		list.add("sheila");
		Assert.assertEquals("shweta", list.get(0));
		Assert.assertEquals("mona", list.get(2));
		Assert.assertEquals("sheila", list.get(3));
		Assert.assertNull(list.get(7));
	}

}
