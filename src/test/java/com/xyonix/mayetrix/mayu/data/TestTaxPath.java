package com.xyonix.mayetrix.mayu.data;

import com.xyonix.mayetrix.mayu.data.TaxPath;

import junit.framework.TestCase;

public class TestTaxPath extends TestCase {
	
	public void testToString() {
		TaxPath tp = new TaxPath("my/path");
		assertTrue(tp.toString().equals("my/path"));
	}
	
	public void testGetLeaf() {
		TaxPath tp = new TaxPath("my/path");
		assertTrue(tp.getLeaf().equals("path"));
		
		tp = new TaxPath("path");
		assertTrue(tp.getLeaf().equals("path"));
		
		tp = new TaxPath("Path");
		assertTrue(tp.getLeaf().equals("Path"));
	}

}
