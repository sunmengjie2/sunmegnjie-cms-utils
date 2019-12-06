package com.sunmengjie.cms;

import java.util.Date;

import org.junit.Test;

import com.sunmengjie.cms.utils.DateUtils;

public class TestDateUtils {

	@Test
	public void testAge() {
		Date now = new Date(96,05,30);
		int age = DateUtils.getAge(now);
		System.out.println("age is "+age);
		
	}
	
	@Test
	public void testRemainDays() {
		Date future = new Date(120,0,1);
		
		int remainDays = DateUtils.getRemainDays(future);
		System.out.println("距离某天还剩"+remainDays);
		
	}
	
	
	
	
	@Test
	public void testIsToday() {
		Date future = new Date(119,11,5);
		boolean today = DateUtils.isToday(future);
		if(today) {
			System.out.println("是今天");
		}else {
			System.out.println("不是今天日期");
		}
		
	}
	
	
	
	
	@Test
	public void testGetBeginofMonth() {
		Date beginOfMonth = DateUtils.getBeginOfMonth();
		System.out.println("beginOfMonth is" + beginOfMonth);
	}
	
	
	@Test
	public void testGetEndOfMonth() {
		Date endOfMonth = DateUtils.getEndOfMonth();
		
		System.out.println("endOfMonth is" + endOfMonth);
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testIsThisWeek() {
		
		boolean b = DateUtils.isThisWeek(new Date(119, 11, 8));
		System.out.println(b);
	}
	
}
