/*
final�����ա���Ϊһ�����η���
1.���������ࡢ������������
2.��final���ε��಻���Ա��̳У�Ϊ�˱��ⱻ�̳У������ิд���ܡ�
3.��final���εķ��������Ա���д��
4.��final���εı�����һ������ֻ�ܸ�ֵһ�Σ��ȿ������γ�Ա������Ҳ�������ξֲ�������
	������������ʱ��һЩ���ݵĳ���ֵ�ǹ̶��ģ���ô��ʱΪ����ǿ�Ķ��ԣ�������Щֵ������֣��������Ķ���
	�����ֵ����Ҫ�ı䣬���Լ���final���Ρ�
	��Ϊ��������������д�淶��������ĸ����д������ɶ��������ɣ����ʼ�ͨ��_���ӡ�


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
