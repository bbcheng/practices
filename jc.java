/*
��ѧ���͹��˵Ĺ���������ȡ��������������������
ֻҪ��ѧ���͹����뵥��������������й�ϵ���Ϳ��ԡ�

�̳У�
1.����˴���ĸ����ԣ�
2.��������֮������˹�ϵ�����������ϵ�������˶�̬�����ԡ�

ע�⣺ǧ��ҪΪ�˻�ȡ������Ĺ��ܣ��򻯴�����̳С�
������������֮����������ϵ�ſ��Լ̳С�

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

java�����У�Javaֻ֧�ֵ��̳У���֧�ֶ�̳С�

��Ϊ��̳����״�����ȫ����������������ж�������ͬ���ܣ�
���������ݲ�ͬʱ���������ȷ��Ҫ������һ����

Java֧�ֶ��̳У�Ҳ����һ���̳���ϵ��
���ʹ��һ���̳���ϵ�еĹ����أ�
��Ҫʹ����ϵ���Ȳ�����ϵ�����е���������Ϊ�����ж�����Ǹ���ϵ�й������ݡ�
ͨ���˽⹲�����ݣ��Ϳ���֪������ϵ�Ļ������ܡ�
��ô�����ϵ�Ѿ����Ի���ʹ���ˡ�
��ô�ھ���ʹ��ʱ��Ҫ����������Ķ���
��Ϊ1.�п��ܸ��಻�ܴ�������
2.��������������ʹ�ø���Ĺ��ܣ�����������Ҳ�������еġ�

��һ�仰�����ĸ��๦�ܣ������������ʹ�ù��ܡ�


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