package LinkedList;

public class LinkedList {
  public static void main(String[] args) { 
    LinkedList list = new LinkedList();
    Node head = new Node(5);
    list.add(head, new Node(6));
    list.add(head, new Node(7));
    list.add(head, new Node(9));
    Node sort = list.insert(head,10);
    list.insertAfterIndex(head,2,50);
    Node newHead = list.delete(head,50);
    System.out.println("before");
    while(sort!=null) {
      System.out.print(sort.data+" ");
      sort=sort.next;
    }
    Node reverseHead = list.reverse(head);
    System.out.println();
    System.out.println("after");
    while(reverseHead!=null) {
      System.out.print(reverseHead.data+" ");
      reverseHead=reverseHead.next;
    }
    
    }
  
  public static class Node {
    int data;
    Node next;    
    public Node(int data) {
      this.data=data;
      this.next=null;
    }
  }
  
  public void add(Node head, Node node) {
    Node tmp = head;
    while(tmp.next!=null) {
      tmp=tmp.next;
    } 
      tmp.next = node;
      node.next = null;    
  }
  
  public void insertAfterIndex(Node head, int i, int data) {
    //5 6 7 8
    //2
    //5 6 7 50 8    
    Node newNode = new Node(data);
    Node tmp = head;
    int count = 0;//i=2
    while(tmp!=null && count<i) {
      tmp=tmp.next; 
      count++;
    }
    newNode.next=tmp.next;
    tmp.next=newNode;
  }
  
  public Node delete(Node head, int value) {
    //5 6 7 50 8
    //50
    if(head.data==value) {
      head=head.next;
    } else {
    Node current = head;
    Node previous = null;
    while(current != null && current.data !=value) {
      previous = current; //7
      current = current.next; //50
    }
    previous.next=current.next;
    current.next=null;
    }
    return head;
  }
  
  public Node reverse(Node head) {
    //1 2 3 4 5
    Node current = head;
    Node previous = null;
    Node nextNode = null;
    
    while(current!=null) {
      nextNode = current.next;
      current.next=previous;
      previous=current;
      current=nextNode;
    }
    return previous;
  }
  
  public Node insert(Node head,int value) {
    //5 6 7 9
    //8
    Node newNode = new Node(value);
    if(value<head.data) {
      newNode.next=head;
      head=newNode;
    } else {
    Node tmp = head;
    Node previous = null;
    while(tmp!=null  && tmp.data<value) {
      previous=tmp; //7
      tmp = tmp.next;//9
    }
    previous.next=newNode;
    newNode.next=tmp;
    }
        return head;
  }
}
