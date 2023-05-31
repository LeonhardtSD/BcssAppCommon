package com.icbc.selfserviceticketing.deviceservice;

/**
 * 串口设备对象<br/>
 * 实现串口数据收发功能。
 * @author: laikey(@donge)
 */
interface ISerialPort {
	/**
	 * 打开串口
	 * bps – 波特率(9600、19200、38400、115200等等)
     * par – 校验标志(校验字典为：0不校验，1奇校验，2偶校验)
     * dbs – 数据位(7、8)
	 * @return 成功true，失败false
	 */
	boolean open(int bps, int par, int dbs);
	
	/**
	 * 关闭串口
	 * @return 成功true，失败false
	 */
	boolean close();
	
	/**
	 * 读数据(接收)
	 * @param buffer	缓冲区
	 * @param timeout	超时时间，毫秒
	 * @return 返回实际读取的数据长度，失败返回-1
	 */
	int read(inout byte[] buffer, int timeout);
	
    /**
	 * 写数据(发送)
	 * @param data		要发送的数据
	 * @param timeout	超时时间，毫秒
	 * @return 返回实际写入的数据长度，失败返回-1
	 */
	int write(in byte[] data, int timeout);
	
	/**
	 * 清除接收缓冲区
	 * @return 成功true，失败false
	 */
	boolean clearInputBuffer();
	
	/**
	 * 查看缓冲区是否为空
	 * @param input	true为输入缓冲区，false为输出缓冲区
	 * @return 成功true，失败false
	 */
	 boolean isBufferEmpty(boolean input);

}
