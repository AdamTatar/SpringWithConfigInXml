package pl.coderslab.examples.Spring01xmlTest.bean;

public class MessageSender {
	MessageService messageService;

	public MessageSender(MessageService messageService) {
		this.messageService = messageService;
	}

	public void sendMessage() {
		messageService.send();
	}

}
