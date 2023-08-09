package main;
import linkedlist.*;

public class TestLinkedList {

	public static void main(String[] args) {
		
		GenericLinkedList<Integer> intList= new GenericLinkedList<Integer>();
	
		GenericNode<Integer> intNode =new GenericNode<Integer>();
		intNode.setData(5);
		intList.addNode(intNode);
		
		intNode = new GenericNode<Integer>();
		intNode.setData(10);
		intList.addNode(intNode);
		
		intNode = new GenericNode<Integer>();
		intNode.setData(15);
		intList.addNode(intNode);
	
		
		GenericNode tempnode=intList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode = tempnode.getNextNode();
		} while (tempnode!=null);
		//end Integer list

		GenericLinkedList<String> stList= new GenericLinkedList<String>();
		
		GenericNode<String> stNode = new GenericNode<String>();
		stNode.setData("Sally");
		stList.addNode(stNode);
		
		stNode = new GenericNode<String>();
		stNode.setData("Mater");
		stList.addNode(stNode);
		
		stNode = new GenericNode<String>();
		stNode.setData("Lighting McQueen");
		stList.addNode(stNode);
	
		
		GenericNode tempnode1=stList.getList();
		do 
		{
			System.out.println(tempnode1.getData());
			tempnode1 = tempnode1.getNextNode();
		} while (tempnode1!=null);
		//end String list
		
		GenericLinkedList<Double> dbList= new GenericLinkedList<Double>();
		
		GenericNode<Double> dbNode = new GenericNode<Double>();
		dbNode.setData(11.02);
		dbList.addNode(dbNode);
		
		dbNode = new GenericNode<Double>();
		dbNode.setData(02.01);
		dbList.addNode(dbNode);
		
		dbNode = new GenericNode<Double>();
		dbNode.setData(05.26);
		dbList.addNode(dbNode);
	
		
		GenericNode tempnode2 = dbList.getList();
		do 
		{
			System.out.println(tempnode2.getData());
			tempnode2 = tempnode2.getNextNode();
		} while (tempnode2!=null);
		//end Double list
		
		
		
	}//end main

}//end class
