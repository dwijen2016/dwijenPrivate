package com.dwijen.java.practice.DesignPrimitiveDatastructure;

import org.junit.Test;

public class StackCheckMainClass {

    @Test
    public void testStack(){
        Stack stack = new Stack<String>();
        stack.push("a");stack.push("b");stack.push("c");stack.push("d");


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    @Test
    public void testQueue(){
        Queue stack = new Queue<String>();
        stack.add("a");stack.add("b");stack.add("c");stack.add("d");


        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
    }

    @Test
    public void testDjLinkedLisr(){
        DjLinkedList linkedList = new DjLinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);

        //linkedList.printAllNodes();
        linkedList.deleteNode(3);
        System.out.println("---------");
        linkedList.printAllNodes();

    }
}