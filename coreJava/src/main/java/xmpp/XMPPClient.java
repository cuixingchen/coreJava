package xmpp;

import java.util.List;

import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smackx.muc.DiscussionHistory;
import org.jivesoftware.smackx.muc.MultiUserChat;

public class XMPPClient implements IXMPPClient {
	public static  Connection connection;
	public static String room = "driver@conference.211.101.37.238";
	public static MultiUserChat muc;

	public XMPPClient(String host, int port, String username, String password) {
		try {
			ConnectionConfiguration config;
			config = new ConnectionConfiguration(host, port);
			config.setCompressionEnabled(true);
			/** �Ƿ����ð�ȫ��֤ */
			config.setSASLAuthenticationEnabled(true);
			/** �Ƿ����õ��� */
			config.setDebuggerEnabled(false);
			config.setReconnectionAllowed(true);
			// config.setRosterLoadedAtLogin(true);

			/** ����connection���� */
			connection = new XMPPConnection(config);
			/** �������� */
			connection.connect();
			System.out.println("Openfire���ӳɹ�");
			connection.login(username, password);
			System.out.println("Openfire��½");
			muc = new MultiUserChat(connection, room);
			DiscussionHistory history = new DiscussionHistory();  
			history.setMaxChars(0);
			muc.join("456",null,history,1000);
			muc.addMessageListener(new PacketListener() {
				
				@Override
				public void processPacket(Packet packet) {
					Message mes=(Message) packet;
					System.out.println("�յ���Ϣ"+mes.getBody());
					
				}
			});
			// muc.sendConfigurationForm(new Form(Form.TYPE_SUBMIT));

		} catch (XMPPException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean sendMessage(Message msg, String driverid) {

		return false;
	}

	@Override
	public boolean sendGroupMessage(Message msg, String groupId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendMessagetoAll(Message msg) {
		try {
			muc.sendMessage(msg);
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int getOnlineDriverCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getOnlineDriverList() {
		// TODO Auto-generated method stub
		return null;
	}

}
