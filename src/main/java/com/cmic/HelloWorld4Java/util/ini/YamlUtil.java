package com.cmic.HelloWorld4Java.util.ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;

import com.cmic.HelloWorld4Java.help.Tips;

public class YamlUtil {

	@Tips(description = "")
	public static void bean2Yaml(String path, String name, Object targetBean) {
//		try {
//			File yamlFile = new File(path, name);
//			System.err.println(yamlFile.getAbsolutePath());
//			if (!yamlFile.exists()) {
//				// 创建父级别目录
//				yamlFile.getParentFile().mkdir();// 用mkdirs有风险
//				yamlFile.createNewFile();
//			}
//			YamlWriter writer = new YamlWriter(new FileWriter(path + File.separator + name));
//			writer.write(targetBean);
//			writer.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
