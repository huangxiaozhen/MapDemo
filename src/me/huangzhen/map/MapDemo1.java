package me.huangzhen.map;

import java.util.HashMap;
import java.util.Map;

import zhen.huang.object.Person;

//关于 Map 一些基本知识的讲解

public class MapDemo1
{
	public static void main(String[] args)
	{
		Map map = new HashMap();

		// 1. 向 Map 中添加元素
		map.put("AA", 123);
		map.put("BB", 456);
		map.put("BB", 12); // key 相同，不能加入到map中
		map.put(123, "AA");
		map.put(null, null);

		// 2. 获取 Map 中元素的个数
		System.out.println(map.size());

		System.out.println(map);

		// 3. 关于加入自定义类
		map.put(new Person("huangzhen", 24), 123);
		// 新添加的相同的key 的value 会覆盖原先的
		map.put(new Person("huangzhen", 24), 456);

		System.out.println(map.size());
		System.out.println(map);

		// 4. remove 如果指定的key 不存在，则返回 null
		Object object = map.remove("AA");
		System.out.println(map);

		// 5 . putall
		Map map2 = new HashMap();
		// 1. 向 Map 中添加元素
		map2.put("FF", 123);
		map2.put("EE", 456);
		
		map.putAll(map2);
		System.out.println(map);
		
		//6. clear 清楚
		map2.clear();
		System.out.println(map2.size());
		
		//7. get(key) 返回key对应的value
		Object object2 = map.get(123);
		System.out.println(object2);
		
		//8 判断是否是空
		System.out.println(map.isEmpty());
		
		//9. 判断是否包含某个Key
		System.out.println(map.containsKey(123));
		
		//10. 判断是否包含某个Value
		System.out.println("$$" + map.containsValue("AA"));
		System.out.println("^^" + map.containsValue("XX"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
