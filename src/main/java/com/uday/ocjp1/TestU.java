package com.uday.ocjp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Brand {

	private int id;
	private String name;

	private TreeMap<String, String> treeMap;

	public Brand(int id, String name, TreeMap<String, String> treeMap) {
		super();
		this.id = id;
		this.name = name;
		this.treeMap = treeMap;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeMap<String, String> getTreeMap() {
		return treeMap;
	}

	public void setTreeMap(TreeMap<String, String> treeMap) {
		this.treeMap = treeMap;
	}

}

public class TestU {

	public static void main(String[] args) {

		Map<String, List<Brand>> map = getListOFCarNameswithBrandName();

		for (Map.Entry<String, List<Brand>> entry : map.entrySet()) {
				System.out.print(entry.getKey()+" ");
				for(Brand t:entry.getValue()){
					System.out.print(t.getId()+" "+t.getName()+" "+t.getTreeMap());
				}
				System.out.println();
		}

	}

	private static HashMap<String, List<Brand>> getListOFCarNameswithBrandName() {

		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("car1", "ferrari1");
		treeMap.put("car2", "ferrari2");
		treeMap.put("car3", "ferrari3");

		List<Brand> brands = Arrays.asList(new Brand(100, "Car1", treeMap));

		HashMap<String, List<Brand>> map = new HashMap<>();
		map.put("1000", brands);

		return map;
	}

}
