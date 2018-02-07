package RMUTI.Tree1;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class App1 {

	public static void main(String[] args) {
		  Node e = new Node("e",null,null);
	      Node d = new Node("f",null,null);
		  Node f = new Node("f",null,null);
	      Node b = new Node("b",e,d);
	      Node g = new Node("g",null,null);
	      Node c = new Node("c",g,f);
	      
	      Node root = new Node("a",b,c);
	      TreeDraw drawTree = new  TreeDraw(root);
	      drawTree.binaryTreeDraw();


	}

}
