package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	

	@BeforeClass
	public static void setup() {
	}
	
public ArrayList<Double> myStaff() {
	ArrayList<Double> st = new ArrayList<Double>();
	st.add(45000.00);
	st.add(50000.00);
	st.add(47000.00);
	st.add(51000.00);
	st.add(53000.00);
	return(st);
	
}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testStaff() {
		assertEquals((45000.00 + 50000.00 + 47000.000 + 51000.00 + 53000.00)/5,49200);
		
	}	

}
