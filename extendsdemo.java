/*
�Ӹ�����ֺ����Ա���ص㣺

���г�Ա��
1.������
2.������
3.���캯����

1������
��������г��ַ�˽�е�ͬ����Ա����ʱ��
����Ҫ���ʱ����еı�������this��
����Ҫ���ʸ����е�ͬ����������super��

super��ʹ�ú�this��ʹ�ü���һ�£�
this������Ǳ����������ã�
super������Ǹ����������á�
*/

class fu
{
	int num = 4;
}

class zi extends fu
{
	int num = 5;
	void show()
	{
		System.out.println(super.num+"..."+this.num);
	}
}
class  extendsdemo
{
	public static void main(String[] args) 
	{
		zi z = new zi();
		z.show();
	}
}
