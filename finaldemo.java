/*
final：最终。作为一个修饰符；
1.可以修饰类、函数、变量；
2.被final修饰的类不可以被继承；为了避免被继承，被子类复写功能。
3.被final修饰的方法不可以被复写。
4.被final修饰的变量是一个常量只能赋值一次，既可以修饰成员变量，也可以修饰局部变量。
	当在描述事物时，一些数据的出现值是固定的，那么此时为了增强阅读性，都给这些值起个名字，方便于阅读，
	而这个值不需要改变，所以加上final修饰。
	作为常量，常量的书写规范：所有字母都大写，如果由多个单词组成，单词间通过_连接。


*/
class fu
{
	public static final int x= 10;
	void show(){}
}

class zi extends fu
{
	void show(){
		System.out.println(x);
	}
}
class finaldemo 
{
	public static void main(String[] args) 
	{
		zi p = new zi();
		p.show();
		System.out.println(fu.x);
	}
}
