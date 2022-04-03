package tree;

import java.util.Scanner;

public class Main {
    static Scanner sc;

    public static void main(String[] args) {
	sc=new Scanner(System.in);
    Node root =createTree();
    inOrder(root);
        System.out.println("In Order: ");
    preOrder(root);
        System.out.println("Pre-order: " );
    postOrder(root);
        System.out.println("post-order: ");
    height(root);
        System.out.println("Height is: ");

    }
    static Node createTree()
    {
     Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
       // root=new Node(data);
        if(data ==-1)
        {
            return null;
        }
        root=new Node(data);
        System.out.println("Enter the left Node: "+ data);
        root.left=createTree();
        System.out.println("Enter the right node: "+ data);
        root.right=createTree();


        return root;

    }
    // traverse
    static void inOrder(Node root)
    {
        if (root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    static void preOrder(Node root)
    {
        if (root== null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
static void postOrder(Node root)
{
    if(root == null)
    {
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data +" ");
}
static int height(Node root)
{
    if (root==null)
    {
        return 0;
    }
    return Math.max(height(root.left),height(root.right))+1;
}

}
class Node
{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
    }
}
