package com.cmic.HelloWorld4Java.util.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.cmic.HelloWorld4Java.help.Tips;

public class TimeUtil {

	@Tips(description = "测试静态代码块的作用域|无意义")
	private static int just4Test;
	static {
		just4Test = 1;
		// FINDING 引用仅初始化一次
	}

	public static String getCalendar() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis() - 60 * 60 * 1000);
		SimpleDateFormat sdf = new SimpleDateFormat("dd日HH时mm分ss秒");
		return sdf.format(calendar.getTime());
	}

	public static String getCalendar1() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) - 20);
		SimpleDateFormat sdf = new SimpleDateFormat("dd日HH时mm分ss秒");
		return sdf.format(calendar.getTime());
	}

	public static boolean match4Time() throws ParseException {
		String t = "2018年05月21日00:41";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日hh:mm");
		Date d = sdf.parse(t);
		System.out.println(d.toString());
		Calendar cl = Calendar.getInstance();
		cl.setTimeInMillis(System.currentTimeMillis() - 1000 * 60 * 60);
		return d.before(cl.getTime());
	}

	@Test
	public void test() {
		System.err.println(System.currentTimeMillis());
		try {
			System.err.println(match4Time());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
