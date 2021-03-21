package SMSSender;

public class SMSSender extends MessageSender {	//하위클래스
// 리턴폰넘버 , 메시지  스트링
	String returnPhoneNo;
	String message;

// 생성자 스트링 타이틀,센더네임,리턴폰넘버,메시지(타이틀,센더네임은 상속)
	SMSSender(String title, String senderName, String returnPhoneNo, String message){
	super(title,senderName);
	this.returnPhoneNo=returnPhoneNo;
	this.message=message;
	}
// 메소드 스트링 recipient// 출력 제목,보내는사람,전화번호,회신전화번호,메시지내용
	void sendMessage(String recipient) {
		System.out.println("===========================");
		System.out.println("제목 : " + title);
		System.out.println("보내는사람 : " + senderName);
		System.out.println("전화번호 : " + recipient);
		System.out.println("회신 전화번호 : " + returnPhoneNo);
		System.out.println("메시지 내용 : "+ message);
	}
}
