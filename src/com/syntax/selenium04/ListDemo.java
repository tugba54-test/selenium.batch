package com.syntax.selenium04;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListDemo d=new ListDemo();
		List<String>list=d.findElement();
System.out.println(list);
	}

	public ArrayList<String> findElement() {
		ArrayList<String>list=new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("hi");
		return list;
	}
}
