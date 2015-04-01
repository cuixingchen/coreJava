package xmpp;

import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection = XmppConnection.getConnection();
		try {
			connection.login("admin", "1");
		} catch (XMPPException e) {
			e.printStackTrace();
		}
		Message m=new Message();
//		Message m = new Message("test6@broadcast.192.168.5.6");
//		m.setType(Message.Type.chat);
		m.setBody("this is a broadcast.");
		m.setTo("test6@cuipengfei-pc");
		m.setFrom("admin");
		connection.sendPacket(m);

	}

}
