package com.saumil.app;

import com.saumil.linkedlist.LinkedList;

public class App {
    public static void main(String[] args){
        App mainApp = new App();
        mainApp.start();
    }

    private void start(){
        LinkedList newList = new LinkedList();

        while(true){
            String promptResp = IO.prompt("Do you want to (A)dd a Node, (R)emove a Node, (M)odify a Node, (V)iew the List, or (Q)uit?");

            switch(promptResp){
                case "A":
                    newList.addNode(IO.prompt("What data do you want to add?"));
                    break;
                case "R":
                    newList.removeNodeByData(IO.prompt("Enter the data you are looking for."));
                    break;
                case "M":
                    newList.modifyNode(IO.prompt("Enter the old data."), IO.prompt("Enter the new data."));
                    break;
                case "V":
                    System.out.println(newList);
                    break;
                case "Q":
                    System.exit(0);
                    break;
                default:
                    System.out.println("You didn't enter a valid option.");
                    System.exit(0);
            }
        }
    }
}
