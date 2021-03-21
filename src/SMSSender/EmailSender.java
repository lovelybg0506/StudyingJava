package SMSSender;

public class EmailSender extends MessageSender{	//하위클래스
// 센더어드레스,이메일바디 스트링타입
	String senderAddr;
	String emailBody;
	
//생성자(스트링 타이틀,센더네임,센더어드레스,이메일바디(타이틀,센더네임은 상위클래스에서상속)
	EmailSender(String title, String senderName, String senderAddr, String emailBody){
		super(title, senderName);
		this.senderAddr=senderAddr;
		this.emailBody=emailBody;
	}
	
	
//메소드(스트링 recipient) 출력 제목,보내는사람,받는사람,내용
	void sendMessage(String recipient){
		System.out.println("=============================");
		System.out.println("제목 : " + title);
		System.out.println("보내는 사람 : " + senderName);
		System.out.println("받는 사람 : " + recipient);
		System.out.println("내용 : " + emailBody);
	}
}
