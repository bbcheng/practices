/*

2.�Ӹ����еĺ�����

��������ֺ͸���һģһ���ĺ���ʱ��
�����������øú��������������ຯ�������ݡ�
��ͬ����ĺ���������һ����

����������Ǻ�������һ�����ԣ���д�����ǣ�

������̳и��࣬��Ϯ�˸���Ĺ��ܵ������У�
����������Ȼ�߱��ù��ܣ������ܵ�����ȴ�͸��಻һ����
��ʱ��û�б�Ҫ�����¹��ܣ�����ʹ�ø������ԣ���������Ĺ��ܶ��壬����д�������ݡ�

���ǣ�
1.���า�Ǹ��࣬���뱣֤����Ȩ�޴��ڵ��ڸ���Ȩ�ޣ��ſ��Ը��ǣ��������ʧ�ܡ�

2.��ֻ̬�ܸ��Ǿ�̬��


��ס��
���أ�ֻ��ͬ�������Ĳ����б�
��д���Ӹ��෽��Ҫһģһ������������ֵ���ͣ�
*/

class fu
{
	void show1()
	{
		System.out.println("fu run");
	}

	void speak()
	{
		System.out.println("fu speeak");
	}
}

class zi extends fu
{
	void show()
	{
		System.out.println("zi run");
	}

	void speak()
	{
		super.speak();	//���ø���Ĺ��ܣ���Ϊ�����е�
						//speak�����Ѿ������ǡ�
		System.out.println("zi speeak");
	}
}

class extendsdemo2 
{
	public static void main(String[] args) 
	{
		zi p = new zi();
		p.show1();
		p.show();
		p.speak();
	}
}
