package com.sunmengjie.cms;


import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sunmengjie.cms.utils.StringUtils;

public class TestStringUtils {

	static StringUtils stringUtils;
	
	@Before
	public void init() {
		//stringUtils = new StringUtils();
	}
	
	
	@Test
	public void testIsBlank() {
		boolean blank = StringUtils.isBlank("11");
		System.out.println(" blank is "+blank);
		
		//验证是否为假
		Assert.assertTrue(blank==false);
		
		blank= StringUtils.isBlank("   ");
		System.out.println(" blank is "+blank);
		
		Assert.assertTrue(blank==true);
	}
	
	@Test
	public void testHaveValue() {
		boolean blank = StringUtils.haveValue("");
		System.out.println(" blank is "+blank);
		
	}
	
	@Test
	public void testIsMobileTrue() {
		String str="13635950509";
		Assert.assertTrue("错误1",StringUtils.isMobile(str));
	}
	
	@Test
	public void testIsMobileFalse() {
		String str="136359505df";
		Assert.assertTrue("错误2",StringUtils.isMobile(str));
	}
	
	
	@Test
	public void testRandom() {
		String randomStr = StringUtils.getRandomStr(20);
		System.out.println(randomStr);
		
		Assert.assertTrue(20==randomStr.length());
		
	}
	
	@Test
	public void testGetRandomStrNum() {
		String randomStrNum = StringUtils.getRandomStrNum(15);
		System.out.println(randomStrNum);
		
		Assert.assertTrue(15==randomStrNum.length());
	}
	
	@Test
	public void testIsEmail() {
		String str="1004539656@qq.com";
		
		Assert.assertTrue("错误1",StringUtils.isEmail(str));
	}
	@Test
	public void testIsEmail2() {
		String str="1004539656qq.cn";
		
		Assert.assertTrue("错误2",StringUtils.isEmail(str));
	}
	
	
	@Test
	public void testIsLetter() {
		String str="SunMJ";
		
		Assert.assertTrue("错误1",StringUtils.isLetter(str));
	}
	
	@Test
	public void testIsLetter2() {
		String str="sunMj241";
		
		Assert.assertTrue("错误2",StringUtils.isLetter(str));
	}
	
	
	@Test
	public void testGetCn() throws UnsupportedEncodingException {
		String s = StringUtils.getGb2312(20);
		System.out.println("中文是：" + s);
		
	}

	
}
