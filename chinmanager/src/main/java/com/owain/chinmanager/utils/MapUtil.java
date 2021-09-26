package com.owain.chinmanager.utils;

import io.reactivex.rxjava3.annotations.NonNull;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapUtil
{
	public static <K, V extends Comparable<? super V>> @NonNull Map<K, V> sortByValue(@NonNull Map<K, V> map, Comparator<? super Map.Entry<K, V>> comparator)
	{
		List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
		list.sort(comparator);

		Map<K, V> result = new LinkedHashMap<>();
		for (Map.Entry<K, V> entry : list)
		{
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}

	public static <K, V> Map.Entry<K, V> getFirst(@NonNull Map<K, V> map)
	{
		return map.entrySet().iterator().next();
	}
}
