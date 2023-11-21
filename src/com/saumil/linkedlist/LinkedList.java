package com.saumil.linkedlist;

public class LinkedList {
    private Node rootNode;

    public LinkedList(Node rootNode){
        this.rootNode = rootNode;
    }

    public LinkedList(){}

    public String toString(){
        String stringList = "";
        Node curr = rootNode;

        while(curr != null){
            stringList += curr.getData() + " -> ";
            curr = curr.getNext();
        }

        return stringList;
    }

    public void addNode(String data){
        // Case 1: The root node does not exist.
        if(rootNode == null){
            rootNode = new Node(data);
            return;
        }

        // Case 2: The root node does exist.
        Node curr = rootNode;
        while(curr != null){
            if(curr.getNext() == null){
                curr.setNext(new Node(data));
                return;
            }

            curr = curr.getNext();
        }
    }
}
