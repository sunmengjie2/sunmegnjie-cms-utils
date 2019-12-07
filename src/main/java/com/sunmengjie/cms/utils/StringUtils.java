package com.sunmengjie.cms.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	
	/**
	 *  随机字符串源
	 */
	static char charArray[] = new char[36];
	static {
		//构建随机字符串的原始数组
		for (int i = 0; i < 10; i++) {
			charArray[i]=(char)('0' + i);
		}
		for (int i = 0; i < 26; i++) {
			charArray[i+10] = (char) ('A'+i);
		}
	}
	
	
	
	

	/**
	 * 判断一个字符串是否为空,空字符串也是空
	 * @param str
	 * @return  为空返回true  否则返回false
	 * 
	 */
	public static boolean isBlank(String str) {
		return null==str||"".equals(str.trim());
	}
	
	/**
	 * 判断一个字符串是否有值
	 * @param str 
	 * @return 	非空返回true 空字符串或空返回false
	 */
	public static boolean haveValue(String str) {
		return null !=str && !"".equals(str.trim());
	}
	
	/**
	 * 验证手机号
	 * @param str
	 * @return
	 */
	public static boolean isMobile(String str) {
		String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0-9]))\\d{8}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		boolean find = matcher.find();
		return find;
	}
	
	/**
	 * 获取n位随机英文字符串
	 * @param n
	 * @return
	 */
	public static String getRandomStr(int n) {
//		new Random();
//		Math.random();
		
		//a -z
		
		Random random = new Random();
		//StringBuilder 线程不安全 但执行效率高，效率高的原因在访问的时候不会加锁
		//StringBuffer 线程安全  但执行效率低
		//这里可以使用StringBuilder 一个函数的执行只能在一个线程内部执行，
		//也就是下边这个sb 不会被多个线程同时访问，不会出现线程安全的问题，因而选择效率较高的StringBuilder
		StringBuilder sb = new StringBuilder();
		//StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			char randomChar = ((char) ('A' + random.nextInt(26)));//0~25
			sb.append(randomChar);
		}
		
		return sb.toString();
	}
	
	/**
	 * 获取n位随机英文和数字字符串
	 * 定义一个长度为36的char类型数组，然后随机获取下表，组成字符串。
	 * @param n
	 * @return
	 */
	public static String getRandomStrNum(int n) {
		//char charArray[] = {'0','1' ..};
		
		Random random = new Random();
		//StringBuilder 线程不安全 但执行效率高，效率高的原因在访问的时候不会加锁
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int index = random.nextInt(36);
			
			char randomChar = charArray[index];
			sb.append(randomChar);
		}
		return  sb.toString();
	}
	
	
	/**
	 * 验证邮箱
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		String regex="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		boolean find = matcher.find();
		
		return find;
	}
	
	
	/**
	 *  验证全为字母
	 * @param str
	 * @return
	 */
	public static boolean isLetter(String str) {
		String regex="^[a-zA-Z]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		boolean find = matcher.find();
		
		return find;
	}
	
	/**
	 * 随机获取一个中文汉子
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String getGb2312() throws UnsupportedEncodingException {
		byte word[] = new byte[2];
		
		Random random = new Random();
		word[0]=(byte) ((0xB0)+random.nextInt(36));
		word[1]=(byte) ((0xA1)+random.nextInt(94));
		
		return new String(word,"GBK");
	}
	
	public static String getGb2312(int n) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append(getGb2312());
		}
		
		return sb.toString();
	}
	
	
	/**
	 * 	字符串替换
	 * @param str  原字符串
	 * @param old	要替换的的字符串中的旧字符
	 * @param neo   替换的新字符
	 * @return
	 */
	public static String getReplace(String str,String old,String neo) {
		String replace = str.replace(old, neo);
		
		
		return replace;
		
	}
	
	
}
