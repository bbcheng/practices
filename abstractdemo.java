/*
��������г�����ͬ���ܣ����ǹ������岻ͬ��
��ʱ���Խ������ϳ�ȡ��ֻ��ȡ���ܶ��壬������ȡ�������塣

���󣺿�����

��������ص㣺
1.���󷽷�һ���ڳ������У�
2.���󷽷��ͳ����඼���뱻abstract�ؼ������Σ�
3.�����಻������new����������Ϊ���ó��󷽷�û���壻
4.�������еĳ��󷽷�Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽������������ã�
	�������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ�������ࡣ

�����಻����ʵ������

���⣺�������п��Բ�������󷽷��������������ǲ��ø��ཨ������

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
