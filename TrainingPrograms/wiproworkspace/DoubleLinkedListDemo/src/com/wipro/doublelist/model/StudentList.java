package com.wipro.doublelist.model;

import java.util.Deque;

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
			newNode.setPrevNode(endNode);
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
				endNode.getPrevNode().setNextNode(null);
				endNode = endNode.getPrevNode();
			}
		}
	}
	
	public void deleteStudent(int roll) 
	{
		Node node = searchStudent(roll);
		if(node!=null)
		{
			if(startNode==endNode) 
			{
				startNode = endNode = null;
			}else 
			{
				Node preNode = node.getPrevNode();
				Node nextNode = node.getNextNode();						
				
				if(preNode==null)
				{					
					nextNode.setPrevNode(null);
					startNode = nextNode;
				}else 
				{
					if(nextNode==null) 
					{				
						preNode.setNextNode(null);
						endNode = preNode;
					}else 
					{
						preNode.setNextNode(nextNode);
						nextNode.setPrevNode(preNode);		
					}
				}				
			}
		}
	}
	
	public Node searchStudent(int roll) 
	{
		if(startNode==null) 
			return null;
		else 
		{
			Node node = startNode;
			do 
			{
				if(node.getRoll()==roll)
					return node;
				node = node.getNextNode();
			}while(node!=null);
		}
		return null;
	}
	
	public void traverse(boolean isForward) 
	{
		if(startNode==null) 
			System.err.println("No Data Found !");
		else 
		{
			if(isForward) {
				Node node = startNode;
				do 
				{
					node.show();
					node = node.getNextNode();
				}while(node!=null);
			}else {
				Node node = endNode;
				do 
				{
					node.show();
					node = node.getPrevNode();
				}while(node!=null);
			}
		}
	}
}
