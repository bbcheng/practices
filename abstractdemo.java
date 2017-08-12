/*
当多个类中出现相同功能，但是功能主体不同，
这时可以进行向上抽取，只抽取功能定义，而不抽取功能主体。

抽象：看不懂

抽象类的特点：
1.抽象方法一定在抽象类中；
2.抽象方法和抽象类都必须被abstract关键字修饰；
3.抽象类不可以用new创建对象，因为调用抽象方法没意义；
4.抽象类中的抽象方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用；
	如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。

抽象类不可以实例化；

特殊：抽象类中可以不定义抽象方法，这样做仅仅是不让该类建立对象。

*/

abstract class stu
{
	abstract void study();
	void sleep()
	{
		System.out.println("sleep");
	}
}

class student extends stu
{
	void study()
	{
		System.out.println("a");
	}
}

class students extends stu
{
	void study()
	{
		System.out.println("aa");
	}
}

class abstractdemo 
{
	public static void main(String[] args) 
	{
		student p = new student();
		p.study();
		p.sleep();
		new students().study();
	}
}
