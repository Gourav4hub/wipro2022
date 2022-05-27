package com.wipro.doublelist.model;

import java.util.Scanner;

public class Node 
{
	private int roll;
	private String name;
	private float marks;
	
	private Node nextNode;
	private Node prevNode;
	
	public Node(){}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nRoll : "); roll = sc.nextInt();
		System.out.print("Name : "); name = sc.next();
		System.out.print("Marks : "); marks = sc.nextFloat();
	}
	public void show() 
	{
		System.out.print("\nRoll : " + roll);
		System.out.print("\tName : " + name);
		System.out.println("\tMarks : " + marks);
	}
}
