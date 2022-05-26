package com.wipro.linkedlist.model;

public class StudentList 
{
	private Node startNode;
	private Node endNode;
	
	public void addStudent() // addNode() 
	{
		Node newNode = new Node();
		newNode.input();
		
		if(startNode==null) // First Node 
		{
			startNode = endNode  = newNode;
		}else 
		{
			endNode.setNextNode(newNode);
			endNode = newNode;
		}
	}
	
	public void removeStudent() 
	{
		if(startNode==null) 
			System.err.println("No Data Found !");
		else 
		{
			if(startNode.getNextNode()==null)
			{
				startNode = endNode = null;
			}else 
			{
				Node node = startNode;			
				while(node.getNextNode().getNextNode()!=null) 
				{
					node = node.getNextNode();
				}			
				node.setNextNode(null);
				endNode = node;
			}
		}
	}
	
	public void traverse() 
	{
		if(startNode==null) 
			System.err.println("No Data Found !");
		else 
		{
			Node node = startNode;
			do 
			{
				node.show();
				node = node.getNextNode();
			}while(node!=null);
		}
	}
}
