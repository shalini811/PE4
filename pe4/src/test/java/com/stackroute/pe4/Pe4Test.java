package com.stackroute.pe4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.pe4.Pe4;

public class Pe4Test {
	private static Pe4 obj;
	@BeforeClass
	public static void setup() {
	 obj = new Pe4();
	}
	
	@AfterClass
	public static void teardown() {
		obj = null;
	}
	
	//Q1
	@Test
	public void testSubstr()
	{ 
		String a="aabbccabababaaaabababacbabccbcbcb";
		assertEquals("abababaaaabababa",obj.checkStr(a));
		assertNotEquals("bccbcbcb",obj.checkStr(a));
		//assertNull(obj.checkStr("abcdef"));
	}
	
	//Q2
	@Test
	public void testCharoccur()
	{
		String s= "Java is java again java again";

		assertEquals(10,obj.checkChar(s));
		assertNotEquals(11,obj.checkChar(s));
		assertNotNull(obj.checkChar(s));
	}
    
	//Q3
	@Test
	public void testdoReplace()
	{
		String st="daily dry";
		String sy="faity fry";
		assertEquals(sy,obj.doReplace(st));
		assertNotEquals("faily fry",obj.doReplace(st));
		assertNotNull(obj.doReplace(st));
	}
	//Q4
	@Test
    public void testSort() {
        String s1 = "Shalini Arumugam";
        assertEquals(new String("aaaghiilmmnrsuu"),obj.doSort(new String("Shalini Arumugam")));
        assertNotEquals(s1,obj.doSort(s1));
        
        
}
	
	//Q5
	@SuppressWarnings("deprecation")
	@Test
    public void testTrans()
	{
    String sr = "a quick brown fox jumps over the lazy dog";
    String[] st = {"a", "kciuq", "nworb", "xof", "spmuj", "revo", "eht", "yzal", "god"};
    assertEquals(st,obj.doTraverse(sr));
    assertNotEquals(sr,obj.doTraverse(sr));
}
		
	//Q6
	@Test
    public void testRegular() {
        String s1 = ("This is Harry");
        String s2 = ("This is Henry");
        assertEquals(true,obj.doCheck(s1));
        assertEquals(false,obj.doCheck(s2));
        assertNotEquals(false,obj.doCheck(s1));

}
	//Q7
	@Test
    public void testMultioccur() {
        String s1 = "She sells seashells by the seashore";
        String s2 = "se";
        assertEquals("4-6 10-12 27-29",obj.doCount(s1,s2));
        assertNotEquals("1-3",obj.doCount(s1,s2));
        
        
}

}
