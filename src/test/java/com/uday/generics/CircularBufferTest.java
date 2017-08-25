package com.uday.generics;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

	private CircularBuffer buffer = new CircularBuffer(2);

	@Test
	public void shouldOfferPollElement() {
		assertTrue(buffer.offer(1));
		assertEquals(1, buffer.pull());
        assertNull(buffer.pull());
	}
	
	@Test
    public void shouldNotOfferWhenBufferIsFull()
    {
        assertTrue(buffer.offer(1));
        assertTrue(buffer.offer(2));
        assertFalse(buffer.offer(3));
    }

	@Test
    public void shouldNotPollWhenBufferIsEmpty()
    {
        assertNull(buffer.pull());
    }
	
	 @Test
	    public void shouldRecycleBuffer()
	    {
	        assertTrue(buffer.offer(1));
	        assertTrue(buffer.offer(2));
	        assertEquals(1, buffer.pull());
	        assertTrue(buffer.offer(3));
	        assertEquals(2, buffer.pull());
	        assertEquals(3, buffer.pull());
	    }
}
