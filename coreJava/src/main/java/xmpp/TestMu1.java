package xmpp;

import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smackx.muc.MultiUserChat;

public class TestMu1 {

	private static Connection connection;
	static String room = "driver@conference.211.101.37.238";
	static MultiUserChat muc;
	
	
	public static void main(String[] args) {
		String host = "211.101.37.238";
		int port = 5222;
		String username = "18910645702";
		String password = "123456";
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
			muc.join("server");
			muc.addMessageListener(new PacketListener() {
				
				@Override
				public void processPacket(Packet packet) {
//					System.out.println("�յ���Ϣ��:"+packet.getXmlns());
					
				}
			});
			// muc.sendConfigurationForm(new Form(Form.TYPE_SUBMIT));

		} catch (XMPPException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
