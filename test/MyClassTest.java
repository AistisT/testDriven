/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import test.Stack;
import test.Node;

/**
 *
 * @author aististaraskevicius
 */
public class MyClassTest {

    public MyClassTest() {
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        boolean empty = stack.isEmpty();
        assertTrue("Stack is empty", empty);
    }

    @Test
    public void testPush() {
        Stack stack = new Stack();
        Node node = new Node(1);
        stack.push(node);
        boolean empty = stack.isEmpty();
        assertFalse("Stack is not empy", empty);
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();
        Node node = new Node(1);
        stack.push(node);
        stack.pop();
        boolean empty = stack.isEmpty();
        assertTrue("Stack is  empy", empty);
    }

    @Test
    public void testPopSame() {
        Stack stack = new Stack();
        Node node = new Node(1);
        stack.push(node);
        assertEquals("Objects are same", node, stack.pop());
    }

    @Test
    public void testPop3() {
        Stack stack = new Stack();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        stack.push(node1);
        stack.push(node2);
        stack.push(node3);
        assertEquals("Objects are same", node3, stack.pop());
        assertEquals("Objects are same", node2, stack.pop());
        assertEquals("Objects are same", node1, stack.pop());
    }

    @Test
    public void testPopEmpty() {
        Stack stack = new Stack();
        IndexOutOfBoundsException error = new IndexOutOfBoundsException();
        assertEquals("Error thrown", error.getClass(), stack.pop().getClass());
    }

    @Test
    public void testTop() {
        Stack stack = new Stack();
        Node node1 = new Node(1);
        stack.push(node1);
        stack.top();
        boolean empty = stack.isEmpty();
        assertFalse("Stack is not empy", empty);
    }

    @Test
    public void testTopSame() {
        Stack stack = new Stack();
        Node node = new Node(1);
        stack.push(node);
        assertEquals("Objects are same", node, stack.top());
    }

    @Test
    public void testTop3() {
        Stack stack = new Stack();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        stack.push(node1);
        stack.push(node2);
        stack.push(node3);
        assertEquals("Objects are same", node3, stack.top());
    }
    
    @Test
    public void testTopSameMultiple() {
        Stack stack = new Stack();
        Node node = new Node(1);
        stack.push(node);
        assertEquals("Objects are same", node, stack.top());
        assertEquals("Objects are same", node, stack.top());
        assertEquals("Objects are same", node, stack.top());
        assertEquals("Objects are same", node, stack.top());
        assertEquals("Objects are same", node, stack.top());
    }  
    @Test
    public void testTopEmpty() {
        Stack stack = new Stack();
        IndexOutOfBoundsException error = new IndexOutOfBoundsException();
        assertEquals("Error thrown", error.getClass(), stack.top().getClass());
    } 
    
    @Test
    public void testPushNull() {
        Stack stack = new Stack();
        Node node = new Node(null);
        stack.push(node);
        boolean empty = stack.isEmpty();
        assertFalse("Stack is not empy", empty);
    }    

}
