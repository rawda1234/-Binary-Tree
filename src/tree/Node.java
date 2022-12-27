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
public class Node {
   public int value;
    public Node left;
   public Node right;
    public Node(int value){
    this.value=value;
    this.left=null;
    this.right=null;
    
    }
    public void display(){
        System.out.println("("+value+")");
    }
}


