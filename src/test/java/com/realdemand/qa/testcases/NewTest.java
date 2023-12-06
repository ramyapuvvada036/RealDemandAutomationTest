package com.realdemand.qa.testcases;

import org.testng.annotations.Test;
import com.realdemand.qa.base.BaseTest;

public class NewTest extends BaseTest {
	@Test
	public void f() {

		String str = "ramya";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			
			if(ch == 'a')
			{
				count++;
			}
			
		}System.out.println("Count is:"+ count);
	}
}