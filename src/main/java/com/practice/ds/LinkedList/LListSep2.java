package com.practice.ds.LinkedList;

public class LListSep2 {
    public static void main(String[] args) {
        LLNode root = getLLNode();

        printList(root);
    }

    private static void printList(LLNode root) {
        LLNode newNode = root;
        while(newNode.next!=null){
            System.out.println(newNode.node);
            newNode = newNode.next;
        }

    }

    private static LLNode getLLNode() {
        LLNode root = new LLNode("1");
        root.next = new LLNode("2");
        root.next.next = new LLNode("3");
        root.next.next.next = new LLNode("4");
        root.next.next.next.next = new LLNode("5");
        root.next.next.next.next.next = new LLNode("6");
        return root;
    }
}

class LLNode {
    public String node;
    public LLNode next;

    public LLNode (String node) {
        this.node = node;
    }
}
