package xmpp;

import java.util.List;

import org.jivesoftware.smack.packet.Message;


/**
 * XMPPP接口
 * @author Steven
 *
 */
public interface IXMPPClient {

	/**
	 * 向指定乘客发送消息
	 * @param msg
	 * @param driverid
	 * @return
	 */
	public boolean sendMessage(Message msg, String driverid);
	/**
	 * 想指定组发送消息
	 * @param msg
	 * @param groupId
	 * @return
	 */
	public boolean sendGroupMessage(Message msg,String groupId);
	
	/**
	 * 向所有用户发送消息
	 * @param msg
	 * @return
	 */
	public boolean sendMessagetoAll(Message msg);
	
	
	/**
	 * 获取当前在线驾驶员数量
	 * @return
	 */
	public int getOnlineDriverCount();
	
	
	/**
	 * 获取在线驾驶员id
	 * @return
	 */
	public List<String> getOnlineDriverList();
	
	

}
