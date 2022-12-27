/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;
import java.util.Scanner;
/**
 *
 * @author rawda
 */
public class Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                BinaryTree tree=new BinaryTree();
                tree.insert(12);
                tree.insert(13);
                tree.insert(10);
                tree.insert(15);
                tree.insert(16);
                tree.insert(17);
                
               System.out.println("Enter the value of the node you want to delete (12, 13 , 10 , 15 , 16 , 17 )");
                int value;
                value=input.nextInt();
                tree.remove(value);
              System.out.println("Preorder traversal of binary tree is "); 
                tree.preorder();
              System.out.println("\nInorder traversal of binary tree is "); 
                tree.inorder();
                 System.out.println("\nPostorder traversal of binary tree is ");
               tree.postorder();
//        tree.root = new Node(1); tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//        System.out.println("Preorder traversal of binary tree is "); 
//        tree.preOrder();
//        System.out.println("\nInorder traversal of binary tree is "); 
//        tree.InOrder();
//        System.out.println("\nPostorder traversal of binary tree is ");
//        tree.PostOrder();
        //public Node deleteNode(Node root, int value) {
//         System.out.println("Enter the value of the node you want to delete");
//        int value;
//        value=input.nextInt();
//        Node node=new Node(value);
//        tree.deleteNode(node, value);
//        System.out.println("Preorder traversal of binary tree is "); 
//        tree.preOrder();
//        System.out.println("\nInorder traversal of binary tree is "); 
//        tree.InOrder();
//        System.out.println("\nPostorder traversal of binary tree is ");
//        tree.PostOrder();
//        if(tree.deleteNode(node, value)==null){
//                   System.out.println("tree is empty, no nodes to delete");
//
//        }
//System.out.println("Dleat items");
//Node result=tree.remove(4, tree.root);
//        System.out.println("preorder After Delete 4");
//        tree.preOrder(result);
//       //result=tree.remove(tree.Root, 5);
//        result=tree.remove(4,tree.Root);
//                System.out.println("preorder After Delete 5");
//                        tree.preOrder(result);



        
    }
    
}
