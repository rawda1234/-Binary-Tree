/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author rawda
 */
public class BinaryTree {
    private Node root;
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if (node == null) node = new Node(value);
        else if (node.value>value) node.left = insert(value,node.left);
        else node.right = insert(value,node.right);
        return node;
    }
    public void remove(int value){
        root = remove(value,root);
    }
    private Node remove(int value,Node node){
        if (node == null) return null;
        else if (node.value>value) node.left = remove(value,node.left);
        else if (node.value<value) node.right = remove(value,node.right);
        else{
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            node.value = minValue(node.right);
            node.right = remove(node.value,node.right);
        }
        return node;
    }
    private int minValue(Node node){
        int min = node.value;
        while (node != null){
            min = node.value;
            node = node.left;
        }
        return min;
    }

    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node != null){
            System.out.println(node.value);
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node != null){
            inorder(node.left);
            System.out.println(node.value);
            inorder(node.right);
        }
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.value);
        }
    }









}