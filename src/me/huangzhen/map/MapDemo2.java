package me.huangzhen.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.Set;

import zhen.huang.object.Customer;
import zhen.huang.object.Person;

//关于 Map 的遍历

public class MapDemo2
{
	public static void main(String[] args)
	{
		Map map = new HashMap();

		map.put("AA", 123);
		map.put("BB", 456);
		map.put(123, "AA");
		map.put(null, null);
		map.put(new Person("huangzhen", 24), 123);

		// 1. 遍历 Key
		Set set = map.keySet();
		for (Object object : set)
		{
			System.out.println(object);
		}

		// 2. 遍历 Values
		Collection collection = map.values();
		Iterator iterator = collection.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());

		}

		// 3 . 遍历 key-vlaue 对 entry
		Set set2 = map.entrySet();
		for (Object object : set2)
		{
			Map.Entry entry = (Map.Entry) object;
			System.out.println(entry.getKey() + "---->" + entry.getValue());
			System.out.println(entry);
		}

		// 4. linkedhashmap 使用链表维护添加的顺序。遍历时，是按添加的顺序遍历

		Map map2 = new LinkedHashMap();

		// 使用链表添加维护的顺序
		map2.put("AA", 123);
		map2.put("BB", 456);
		map2.put(123, "AA");
		map2.put(null, null);
		map2.put(new Person("huangzhen", 24), 123);

		System.out.println(map2);

		// 5. 关于 TreeMap
		Comparator comparator = new Comparator()
		{

			@Override
			public int compare(Object o1, Object o2)
			{
				if (o1 instanceof Customer && o2 instanceof Customer)
				{
					Customer customer1 = (Customer) o1;
					Customer customer2 = (Customer) o2;
					int i = customer1.getId().compareTo(customer2.getId());
					if (i == 0)
					{
						return customer1.getName().compareTo(customer2.getName());
					}
					return i;
				}
			
				return 0;
			}
		};
		
		Map map3 = new TreeMap(comparator);
		map3.put(new Customer("AA", 1), 1213);
		map3.put(new Customer("DD", 3), 1123);
		map3.put(new Customer("BB", 3), 1123);
		map3.put(new Customer("FF", 2), 1233);
		map3.put(new Customer("CC", 4), 1223);
		
		System.out.println(map3);



	}

}
