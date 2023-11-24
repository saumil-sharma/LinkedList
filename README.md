# LinkedList
A LinkedList is an elementary data structure that can be used for a variety of 
real-life cases. Such cases include a playlist for a music player and a list
for the history in your browser.

A LinkedList at the core is a list of nodes, that are linked to each other via
a variable in the Node itself. A sample Node and LinkedList class would look like the following:

```java
class LinkedList{
    Node rootNode;

    public void addNode(String data){}
    public void removeNode(String data){}
}

class Node{
    Node next;
    String data;

    // Constructor and other methods here.
}
```

You can see the variable `next` that stores the next Node, and you can
see the variable data that stores information in the Node. Do note that you **do not need a "next" node to create a node.**

Once you link all of these together, you'll get something that looks like the following:

![Image](https://media.discordapp.net/attachments/850110174387896351/1176305219823489064/image.png?ex=656e629b&is=655bed9b&hm=d8bf70f017b6d39c982f1e97ce72ec97aea9a7cb6e5b97f799e31eb3a5e50470&=&width=799&height=417)

You can see how each Node links to each other via the `next` variable. The first Node is also known
as the "Root Node", with all following nodes just called "Nodes".

In the code, you'll see a basic one-way LinkedList implementation.

## LinkedList.addNode()
This method is responsible for adding a Node to the LinkedList. It works like the following:

If there is no `rootNode`, that means that there is no LinkedList currently. As a result of this,
we create a new `Node` and set it as the `rootNode`.

In the other case, that means that a Node does exist and there is a basic LinkedList. For this,
we iterate thru the whole LinkedList until we find a Node that has no Node in the `next` variable.

We can start with the `rootNode` and make our way down the list using the logic above.

## LinkedList.removeNodeByData()
This method is responsible for removing a Node in the LinkedList 
by data.

You can give it a String `data`, for which it searches in the LinkedList to attempt
to find and remove.

This method also returns the Node that's passed. Similar to `addNode()` we also
iterate thru the whole LinkedList to attempt to find it.

## LinkedList.modifyByData()
This method modifies the LinkedList at a Node it finds by the same iteration method as above.

When a Node is found, we use the setter method `Node.setData(Str data)` to replace the data.

If nothing is found, `false` is returned.