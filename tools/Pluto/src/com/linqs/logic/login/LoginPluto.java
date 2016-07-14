package com.linqs.logic.login;

import com.linqs.logic.MSGIDType;
import com.linqs.net.Pluto;

public class LoginPluto extends Pluto
{
    /// <summary>
    /// ��Զ�̷������ñ���Ϊ���������顣
    /// </summary>
    /// <param name="passport">��¼�ʺ�</param>
    /// <param name="password">��¼����</param>
    /// <param name="loginArgs">��¼���Ͳ���</param>
    /// <returns>�����Ķ���������</returns>
    public byte[] Encode(String passport, String password, String loginArgs)
    {
    	ioBuffer.putShort((short)MSGIDType.LOGINAPP_LOGIN);
        pushString(passport);
        pushString(password);
        pushString(loginArgs);
        return endPluto();
    }

    /// <summary>
    /// ��Զ�̷������ñ���Ϊ���������顣
    /// </summary>
    /// <returns>�����Ķ���������</returns>
	public byte[] Encode(String[] args)
    {
		ioBuffer.putShort((short)MSGIDType.LOGINAPP_LOGIN);
        for (String item : args)
        {
        	pushString(item);
        }
        return endPluto();
    }

    /// <summary>
    /// ��Զ�̵��õķ�������ΪLogin���á�
    /// </summary>
    /// <param name="data">Զ�̵��÷����Ķ���������</param>
    /// <param name="unLen">����ƫ����</param>
    protected void DoDecode(byte[] data)
    {
    }

    public void HandleData()
    {
    }

    /// <summary>
    /// ������LoginPlutoʵ����
    /// </summary>
    /// <returns>LoginPlutoʵ��</returns>
    public static Pluto Create()
    {
        return new LoginPluto();
    }
}