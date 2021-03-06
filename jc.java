/*
将学生和工人的共性描述提取出来，单独进行描述。
只要让学生和工人与单独描述的这个类有关系，就可以。

继承：
1.提高了代码的复用性；
2.让类与类之间产生了关系，有了这个关系，才有了多态的特性。

注意：千万不要为了获取其他类的功能，简化代码而继承。
必须是类与类之间有所属关系才可以继承。

class c
{
	void demo1(){}
}

class a extends c
{
	//void demo1(){}
	void demo2(){}
}

class b extends c
{
	//void demo1(){}
	void demo3(){}
}

java语言中，Java只支持单继承，不支持多继承。

因为多继承容易带来安全隐患：当多个父类中定义了相同功能，
当功能内容不同时，子类对象不确定要运行哪一个。

Java支持多层继承，也就是一个继承体系。
如何使用一个继承体系中的功能呢？
想要使用体系，先查阅体系父类中的描述。因为父类中定义的是该体系中共性内容。
通过了解共性内容，就可以知道该体系的基本功能。
那么这个体系已经可以基本使用了。
那么在具体使用时，要创建最子类的对象。
因为1.有可能父类不能创建对象；
2.创建子类对象可以使用更多的功能，包括基本的也包括特有的。

简单一句话：查阅父类功能，创建子类对象使用功能。


class a
{
	void show()
	{
		System.out.println("a");
	}
}

class b
{
	void show()
	{
		System.out.println("b");
	}
}

class c extends a,b
{
	c p = new c();
	p.show();
}
*/


class person
{
	 String name;
	 int age;
	
}
class student extends person
{
	public void show(String name)
	{
		this.name = name;
		System.out.println("stud.name:"+name+" ::: age: "+age);
	}
}

class worker extends person
{
	public void show(int age)
	{
		this.age = age;
		System.out.println("work.name:"+name+" ::: age: "+age);
	}
}

class jc
{
	public static void main(String[] args)
	{
		student p = new student();
		p.show("zc");
		worker w = new worker();
		w.show(18);
	}
}
