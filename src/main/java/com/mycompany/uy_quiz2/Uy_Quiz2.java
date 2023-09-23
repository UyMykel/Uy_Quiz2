/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uy_quiz2;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    
    public Node(int data){
            this.data = data;
            this.next = null;
    }
}

class CircularLinkedList{
    Node head;
    
    public CircularLinkedList(){
        this.head = null;
    }
    
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
        } else if(position == 0){
            Node last = getLastNode();
            newNode.next = head;
            head = newNode;
            last.next = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            
        }
    }
    public Node getLastNode(){
        Node current = head;
        while(current.next != head){
            current = current.next;
        }
        return current;
    }
    public void display(){
        if(head == null){
            System.out.println("Circular linked list is empty");
            return;
        }
        Node current = head;
        do{
            System.out.println(current.data + " ");
            current = current.next;
        } while(current != head);
        System.out.println();
    }
    public boolean search (int target){
                Node current = head;
                while (current != null){
                    if (current.data == target){
                        return true;
                    }
                    current = current.next;
                }
                return false;
            }
}

 

       





/**
 *
 * @author MJR BROTHERS
 */
public class Uy_Quiz2 {

    
        
        
        public class Main{
            public static void main(String[] args){
                CircularLinkedList scn = new CircularLinkedList();
           Scanner in = new Scanner (System.in);
                
                while (true){
                        System.out.println("press 1 to Search");
                        System.out.println("press 2 to Insert at Position");
                        System.out.println("press 3 to Display");
                        System.out.println("press 4 to Exit");
                        
                      if (in.hasNext()){
                          int number = in.nextInt();
                          
                          switch (number){
                              
                              case 1 -> {
                                  System.out.println("list you wnat to search");
                                  int search = in.nextInt();
                                  scn.search(search);}
                              case 2 -> {
                                  System.out.println("node you want to insert");
                                  int insertAtPosition = in.nextInt();
                                  scn.insertAtPosition(number, insertAtPosition);}
                              case 3 -> {
                                  System.out.println("display all number on list");
                                 
                                  scn.display();}
                              case 4 -> {
                                  in.close();
                                  
                              System.exit(0);
                          }
                                  
                              
                                  
                              
                                  
                              }
                          }else{
                              System.out.println("Invalid Input");
                              in.nextLine();
                              }
                      } 
                
                
                
                
            }
            
        }
        
    }    
     





           