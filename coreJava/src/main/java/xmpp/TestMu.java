package xmpp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.muc.Affiliate;
import org.jivesoftware.smackx.muc.MultiUserChat;
import org.jivesoftware.smackx.muc.RoomInfo;

public class TestMu {
public static XMPPClient c;
	public static void main(String[] args) {
		String host = "211.101.37.238";
		int port = 5222;
		String username = "nauti";
		String password = "1";
		c = new XMPPClient(host, port, username, password);
		
		getMember();


	}

	private static void sendOnlin(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Iterator<String> it=XMPPClient.muc.getOccupants();
		Chat chat = XMPPClient.muc.createPrivateChat("driver@conference.211.101.37.238/15117986763", null);
	    try {
			chat.sendMessage("Hello there");
		} catch (XMPPException e) {
			e.printStackTrace();
		}
//		while(it.hasNext()){
//			System.out.println(it.next());
//			Chat chat = XMPPClient.muc.createPrivateChat(it.next(), null);
//		    try {
//				chat.sendMessage("Hello there");
//			} catch (XMPPException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	
	private static void getMember(){
		Collection<Affiliate> list;
		try {
			list=XMPPClient.muc.getMembers();
			Iterator<Affiliate> it =list.iterator();
			Affiliate affiliate;
			System.out.println(list.size());
			while(it.hasNext()){
				affiliate=it.next();
				System.out.println(affiliate.getJid());
			}
			
		} catch (XMPPException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private void send(){
		Message msg =XMPPClient.muc.createMessage();
		msg.setBody("来了");
		c.sendMessagetoAll(msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.sendMessagetoAll(msg);
		System.out.println("发送成功");
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
