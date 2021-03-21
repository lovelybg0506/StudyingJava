package SMSSender;

public abstract class MessageSender {	// 상위클래스
// 스트링 타이틀, 센더네임
	String title;
	String senderName;
// 생성자(스트링 타이틀,센더네임)
	MessageSender(String title, String senderName){
		this.title=title;
		this.senderName=senderName;
	}
// 메소드( abstract를 이용해서 하위클래스에서 추상메소드 완성시키기) sendMessage(스트링 recipient)
 abstract void sendMessage(String recipient);

}
