package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right.right = new Node(8);
        levelOrder(root);
        levelOrderByLevel(root);
        rightMostNode(root);
        leftMostNode(root);
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            Node top = q.peek();
            System.out.println(top.data);
            if(top.left!=null) {
                q.add(top.left);
            }
            if(top.right!=null) {
                q.add(top.right);
            }
            q.remove();
        }
    }

    public static void levelOrderByLevel(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            int count=q.size();
            while(count>0) {
                Node top = q.peek();
                System.out.print(top.data);
                if(top.left!=null) {
                    q.add(top.left);
                }
                if(top.right!=null) {
                    q.add(top.right);
                }
                q.remove();
                count--;
            }
            System.out.println(" ");
        }
    }

    public static void rightMostNode(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            int count=q.size();
            while(count>0) {
                Node top = q.peek();
                if(count==1) {
                    System.out.print(top.data);
                }
                if(top.left!=null) {
                    q.add(top.left);
                }
                if(top.right!=null) {
                    q.add(top.right);
                }
                q.remove();
                count--;
            }
            System.out.println(" ");
        }
    }

    public static void leftMostNode(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            int count=q.size();
            int i=0;
            while(count>0) {
                Node top = q.peek();
                if(i==0) {
                    System.out.print(top.data);
                }
                if(top.left!=null) {
                    q.add(top.left);
                }
                if(top.right!=null) {
                    q.add(top.right);
                }
                q.remove();
                count--;
                i++;
            }
            i=0;
            System.out.println(" ");
        }
    }
}
