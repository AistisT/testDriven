/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aististaraskevicius
 */
public class Stack {

    Node node;
    int stackSize = 0;
    List<Node> stack = new LinkedList();

    public boolean isEmpty() {
        return stackSize == 0;
    }

    public void push(Node node) {
        stack.add(node);
        stackSize++;
    }

    public Object pop() throws IndexOutOfBoundsException {
        try {
            stackSize--;
            node = stack.get(stackSize);
            stack.remove(stackSize);
            return node;
        } catch (IndexOutOfBoundsException e) {
            return e;
        }
    }

    public Object top() throws IndexOutOfBoundsException {
        try {
            return stack.get(stackSize - 1);
        } catch (IndexOutOfBoundsException e) {
            return e;
        }

    }

}
