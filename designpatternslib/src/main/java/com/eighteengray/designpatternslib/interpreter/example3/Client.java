package com.eighteengray.designpatternslib.interpreter.example3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Client {
	public static void main(String[] args) throws Exception {
		//准备上下文
		Context c = new Context("InterpreterTest.xml");
		
		//想要获取c元素的值，也就是如下表达式的值："root/a/b/c"
		
		//首先要构建解释器的抽象语法树
		ElementExpression root = new ElementExpression("root");
//		ElementExpression aEle = new ElementExpression("a");
//		ElementExpression bEle = new ElementExpression("b");
		ElementTerminalExpression cEle = new ElementTerminalExpression("c");
		//组合起来
		root.addEle(cEle);
//		aEle.addEle(bEle);
//		bEle.addEle(cEle);

		//调用
		String ss[] = root.interpret(c);
		System.out.println("c的值是="+ss[0]);
		
		
//		//想要获取c元素的name属性，也就是如下表达式的值："root/a/b/c.name"
//		//这个时候c不是终结了，需要把c修改成ElementExpressioin
//		ElementExpression root = new ElementExpression("root");
//		ElementExpression aEle = new ElementExpression("a");
//		ElementExpression bEle = new ElementExpression("b");
//		ElementExpression cEle = new ElementExpression("c");
//		PropertyTerminalExpression prop = new PropertyTerminalExpression("name");
//		//组合
//		root.addEle(aEle);
//		aEle.addEle(bEle);
//		bEle.addEle(cEle);
//		cEle.addEle(prop);
//		
//		//调用
//		String ss[] = root.interpret(c);
//		System.out.println("c的属性name的值是="+ss[0]);
//		
//		//如果要使用同一个上下文，连续进行解析，需要重新初始化上下文对象
//		//比如要连续的重新再获取一次属性name的值，当然你可以重新组合元素，
//		//重新解析，只要是在使用同一个上下文，就需要重新初始化上下文对象
//		c.reInit();
//		String ss2[] = root.interpret(c);
//		System.out.println("重新获取c的属性name的值是="+ss2[0]);
	}
}
