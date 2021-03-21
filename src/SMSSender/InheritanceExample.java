package SMSSender;

public class InheritanceExample {	//메인

	public static void main(String[] args) {
		EmailSender emailsender = new EmailSender("생일축하합니다","고객센터","umminsung@gmail.com","엄민성씨의 생일을 축하합니다~");
		
		SMSSender smssender = new SMSSender("생일을 축하 합니다.","고객센터","010-6243-0000","10% 할인 쿠폰이 발행 되었습니다.");

		emailsender.sendMessage("엄성이");
		
		smssender.sendMessage("010-7922-9118");
		
	}

}
