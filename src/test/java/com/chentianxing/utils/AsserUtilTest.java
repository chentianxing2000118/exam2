/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: AsserUtilTest.java 
 * @Prject: chentianxing_exam2
 * @Package: com.chentianxing.utils 
 * @Description: TODO
 * @author: 陈天星  
 * @date: 2019年7月15日 上午9:02:21 
 * @version: V1.0   
 */
package com.chentianxing.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

/** 
 * @ClassName: AsserUtilTest 
 * @Description: TODO
 * @author:陈天星
 * @date: 2019年7月15日 上午9:02:21  
 */
public class AsserUtilTest {

	/**
	 * Test method for {@link com.chentianxing.utils.AsserUtil#isTrue(boolean, java.lang.String)}.
	 */
	@Test
	public void testIsTrue() {
		AsserUtil.isTrue(1<2, "这是假的");
	}

	/**
	 * Test method for {@link com.chentianxing.utils.AsserUtil#isFalse(boolean, java.lang.String)}.
	 */
	@Test
	public void testIsFalse() {
		AsserUtil.isFalse(1>2, "这是真的");
	}

	/**
	 * Test method for {@link com.chentianxing.utils.AsserUtil#notNull(java.lang.Object, java.lang.String)}.
	 */
	@Test
	public void testNotNull() {
		AsserUtil.notNull(new String(), "这个对象是空的");
	}

	/**
	 * Test method for {@link com.chentianxing.utils.AsserUtil#isNull(java.lang.Object, java.lang.String)}.
	 */
	@Test
	public void testIsNull() {
		AsserUtil.isNull(null, "这个对象不为空");
	}

	/**
	 * Test method for {@link com.chentianxing.utils.AsserUtil#notEmpty(java.util.Collection, java.lang.String)}.
	 */
	@Test
	public void testNotEmptyCollectionString() {
		List list = new ArrayList<>();
		list.add(1);
		AsserUtil.notEmpty(list, "这个集合是null或者为空集合");
	}

	/**
	 * Test method for {@link com.chentianxing.utils.AsserUtil#notEmpty(java.util.Map, java.lang.String)}.
	 */
	@Test
	public void testNotEmptyMapString() {
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put(1, 1);
		AsserUtil.notEmpty(hashMap, "这个Map集合是null或者为空集合");
	}

	/**
	 * Test method for {@link com.chentianxing.utils.AsserUtil#hasText(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		AsserUtil.hasText("123 ", "这个字符串是空串或者只有空格");
	}

	/**
	 * Test method for {@link com.chentianxing.utils.AsserUtil#greaterThanZero(java.math.BigDecimal, java.lang.String)}.
	 */
	@Test
	public void testGreaterThanZero() {
		AsserUtil.greaterThanZero(new BigDecimal("0.1"), "这个数值不大于0");
	}

}
