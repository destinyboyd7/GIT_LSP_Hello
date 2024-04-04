package org.howard.edu.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows; 
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName; 
import org.junit.jupiter.api.Test;

//import java.util.ArrayList;

public class IntegerSetTest {
    IntegerSet setA;
    IntegerSet setB;
    IntegerSet setC;
    
    @BeforeEach
    public void setUp() {
        setA = new IntegerSet();
        setB = new IntegerSet();
    }
    
    
    @Test
    @DisplayName("Test case for clear") 
    public void testClear() {
    	setA.add(1);
        setA.add(2);
        setA.add(3);
        assertFalse(setA.isEmpty());
        setA.clear();
        assertEquals(0, setA.length());
    } 
    
    @Test
    @DisplayName("Test case for length") 
    public void testLength() {
    	setA.add(1);
        setA.add(2);
        setA.add(3);
    	assertEquals(3, setA.length());
    	
    	setB.add(13);
        setB.add(67);
        setB.add(3);
        assertNotEquals(5, setA.length());
        
    }
    
    
	@Test
    @DisplayName("Test case for equals") 
    public void testEquals() {
		setA.add(15);
		setA.add(2);
		setA.add(63);
	       
	    setB.add(15);
	    setB.add(63);
	    setB.add(2);
	       
	    assertTrue(setA.equals(setB));
	       
	   setA.add(1);
       setA.add(2);
       setA.add(3);
       
       setB.add(3);
       setB.add(4);
       setB.add(5);
       
       assertFalse(setA.equals(setB));
      
    }
	
	@Test
    @DisplayName("Test case for contains")
    public void testContains() { 
		setA.add(1);
        setA.add(2);
        assertTrue(setA.contains(1));
        assertFalse(setA.contains(3));
        
        setB.add(7);
        setB.add(1);
        setB.add(3);
        assertTrue(setA.contains(1));
	}
	
	@Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
		setA.add(1);
        setA.add(2);
        setA.add(78);
        setA.add(356);
        setA.add(8);
        
        assertEquals(356, setA.largest());
        
        
	}
	
	@Test
    @DisplayName("Test case for largest with emptyset")
    public void testLargestempty() {
		assertThrows(IntegerSetException.class, () -> {
        setA.largest();
    });
}
	
	@Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
		setA.add(1);
        setA.add(2);
        setA.add(78);
        setA.add(356);
        setA.add(8);
        
        assertEquals(1, setA.smallest());
		
		
		
		setB.add(782);
		setB.add(0);
        setB.add(8);
        setB.add(45);
        setB.add(136);
        setB.add(256);
        setB.add(1);
        setB.add(3);
        
        assertNotEquals(1, setB.smallest());
	}
	
	@Test
    @DisplayName("Test case for smallest with emptyset")
    public void testSmallestempty() {
		assertThrows(IntegerSetException.class, () -> {
	        setA.smallest();
	    });
	}
	
	@Test
    @DisplayName("Test case for add")
    public void testAdd() {
		setA.add(1);
        assertTrue(setA.contains(1));
        
        setB.add(1);
        setB.add(100);
        assertFalse(setA.contains(78));
	}
	
	
	@Test
    @DisplayName("Test case for remove")
    public void testRemove() {
		setA.add(7);
	    setA.remove(7);
	    assertFalse(setA.contains(7));
	    
	   
		setB.add(0);
        setB.add(42);
        setB.add(98);
        setB.remove(42);
        setB.remove(98);
        assertFalse(setB.contains(42));
	    
	}
	
	@Test
    @DisplayName("Test case for union")
    public void testUnion() {
		setA.add(1);
        setA.add(2);
        setA.add(5);
        setA.add(7);

        setB.add(2);
        setB.add(4);
  

        setA.union(setB);
        assertTrue(setA.contains(2));
        assertTrue(setA.contains(4));
        assertTrue(setA.contains(7));
	}
	
	@Test
    @DisplayName("Test case for intersection")
    public void testIntersection() {
		setA.add(87);
	    setA.add(2);
	    setA.add(3);
	    

	    setB.add(2);
	    setB.add(3);
	    setB.add(5);
	    setB.add(6);

	    setA.intersect(setB);
	    assertTrue(setA.contains(2));
	    assertTrue(setA.contains(3));
	    assertFalse(setA.contains(87));
	}
	
	@Test
    @DisplayName("Test case for difference")
    public void testDifference() {
		setA.add(1);
		setA.add(2);
        setA.add(4);
        setA.add(6);
        setA.add(8);

        setB.add(2);
        setB.add(3);
        setB.add(6);

        setA.diff(setB);
        assertTrue(setA.contains(1));
        assertTrue(setA.contains(4));
        assertFalse(setA.contains(2));
    }
	
	@Test
    @DisplayName("Test case for complement") //wrong
    public void testComplement() {
		setA.add(1);
        setA.add(2);
        setA.add(3);
        
        setB.add(3);
        setB.add(4);
        setB.add(5);
        
        setA.complement(setB);

        //assertFalse(setA.isEmpty());
        assertFalse(setA.contains(1));
        assertTrue(setA.contains(4));
        assertTrue(setA.contains(5));
        
    }
	
	@Test
    @DisplayName("Test case for isEmpty") 
    public void testIsEmpty(){
		setA.clear();
		assertFalse(setA.isEmpty());
		setA.add(3);
		assertFalse(setA.isEmpty());
		
	}
	
	@Test
    @DisplayName("Test case for toString")
    public void testToString() {
        setA.add(1);
        setA.add(2);
        assertEquals("[1, 2]", setA.toString());
    }

}
