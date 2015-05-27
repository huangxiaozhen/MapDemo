package me.huangzhen.map;

import java.util.HashMap;
import java.util.Map;

import zhen.huang.object.Person;

//���� Map һЩ����֪ʶ�Ľ���

public class MapDemo1
{
	public static void main(String[] args)
	{
		Map map = new HashMap();

		// 1. �� Map �����Ԫ��
		map.put("AA", 123);
		map.put("BB", 456);
		map.put("BB", 12); // key ��ͬ�����ܼ��뵽map��
		map.put(123, "AA");
		map.put(null, null);

		// 2. ��ȡ Map ��Ԫ�صĸ���
		System.out.println(map.size());

		System.out.println(map);

		// 3. ���ڼ����Զ�����
		map.put(new Person("huangzhen", 24), 123);
		// ����ӵ���ͬ��key ��value �Ḳ��ԭ�ȵ�
		map.put(new Person("huangzhen", 24), 456);

		System.out.println(map.size());
		System.out.println(map);

		// 4. remove ���ָ����key �����ڣ��򷵻� null
		Object object = map.remove("AA");
		System.out.println(map);

		// 5 . putall
		Map map2 = new HashMap();
		// 1. �� Map �����Ԫ��
		map2.put("FF", 123);
		map2.put("EE", 456);
		
		map.putAll(map2);
		System.out.println(map);
		
		//6. clear ���
		map2.clear();
		System.out.println(map2.size());
		
		//7. get(key) ����key��Ӧ��value
		Object object2 = map.get(123);
		System.out.println(object2);
		
		//8 �ж��Ƿ��ǿ�
		System.out.println(map.isEmpty());
		
		//9. �ж��Ƿ����ĳ��Key
		System.out.println(map.containsKey(123));
		
		//10. �ж��Ƿ����ĳ��Value
		System.out.println("$$" + map.containsValue("AA"));
		System.out.println("^^" + map.containsValue("XX"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
