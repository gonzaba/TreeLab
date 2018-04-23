package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class exercise7 {

	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedTree<Integer> t = new LinkedTree<>(); 
		t.addRoot(4);
		t.addChild(t.root(), 3);
		Position<Integer> pos2 = t.addChild(t.root(),2);
		t.addChild(pos2,5);
		Position<Integer> ptr =t.addChild(pos2, 4);
		Utils.displayTree("The binary tree t is : ", t);
		
		LinkedTree<Integer> y;
		
			y = t.clone();  //new clone method implemented for LinkedBinaryTree class
			Utils.displayTree("The clone of t is ", y);
		
		
		t.remove(pos2);
		
		Utils.displayTree("Tree after removing 2 :", t);
		Utils.displayTree("Clone of the original t is : ", y);
		
	}

}