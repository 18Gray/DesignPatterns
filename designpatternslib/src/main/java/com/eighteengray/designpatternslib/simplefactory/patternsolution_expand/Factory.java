package com.eighteengray.designpatternslib.simplefactory.patternsolution_expand;

/**
 * 工厂类，用来创造Api的
 */
public class Factory {
	/**
	 * 具体的创造Api的方法，根据客户端的参数来创建接口
	 * @param type 客户端传入的选择创造接口的条件
	 * @return 创造好的Api对象
	 */
	public static Api createApi(int type){
		//这里的type也可以不由外部传入，而是直接读取配置文件来获取
		//为了把注意力放在模式本身上，这里就不去写读取配置文件的代码了
		
		//根据type来进行选择，当然这里的1和2应该做成常量

		
		//选择===〉如何选？====〉选择的参数===〉参数从何而来？
		//1：参数来源于 client
		//2：参数来源于配置文件
		//3：参数来源于系统自身，比如运行期间的某个值
		
		Api api = null;
		if(type==1){
			api = new Impl();
		}else if(type==2){
			api = new Impl2();
		}
		return api;
	}
}