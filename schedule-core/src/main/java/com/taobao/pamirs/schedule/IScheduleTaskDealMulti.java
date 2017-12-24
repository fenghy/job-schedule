package com.taobao.pamirs.schedule;

/**
 * �������������ӿ�
 * @author xuannan
 *
 * @param <T>��������
 */
public interface IScheduleTaskDealMulti<T>  extends IScheduleTaskDeal<T> {
 
/**
 * 	ִ�и������������顣��Ϊ���Ͳ�֧��new ���飬ֻ�ܴ���OBJECT[]
 * @param tasks ��������
 * @param ownSign ��ǰ��������
 * @return
 * @throws Exception
 */
  public boolean execute(T[] tasks, String ownSign) throws Exception;
}
