/*
3.子父类中的构造函数：

在对子类对象进行初始化时，父类的构造函数也会运行；
是因为子类的构造函数默认第一行有一条隐式的语句 super();
super():会访问父类中空参数的构造函数。而且子类中所有的构造函数默认第一行都是super();

super语句一定定义在子类构造函数的第一行。


子类的实例化过程。
结论：
子类的所有构造函数，默认都会访问父类中空参数的构造函数；
因为子类每一个构造函数内的第一行都有一句隐式super();

当父类中没有空参数的构造函数时，子类必须手动通过super语句形式来指定要访问父类的构造函数。

当然，子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数。
子类中至少会有一个构造函数会访问父类中的构造函数。

*/

class fu
{
	fu()
	{
		System.out.println("fu 构造函数");
	}

	fu(int x)
	{
		System.out.println("fu 构造函数;;;"+x);
	}
}

class zi extends fu
{
	zi()
	{
		//super();
		super(5);
		System.out.println("zi 构造函数");
	}

	zi(int x)
	{
		//super();
		//super(x);
		System.out.println("zi 构造函数:::"+x);
	}
}

class extendsdemo3 
{
	public static void main(String[] args) 
	{
		zi p = new zi();
		zi p1 = new zi(10);
	}
}
