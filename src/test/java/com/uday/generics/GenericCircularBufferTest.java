package com.uday.generics;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenericCircularBufferTest
{
    private GenericCircularBuffer<Integer> buffer = new GenericCircularBuffer<>(2);

    @Test
    public void shouldOfferPollableElement()
    {
        assertTrue(buffer.offer(1));

        assertEquals(Integer.valueOf(1), buffer.pull());
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
        assertEquals(Integer.valueOf(1), buffer.pull());
        assertTrue(buffer.offer(3));
        assertEquals(Integer.valueOf(2), buffer.pull());
        assertEquals(Integer.valueOf(3), buffer.pull());
    }
}
