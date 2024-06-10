import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		DiscordInfo discord = new DiscordInfo();
		DiscordMessageService messageService = new DiscordMessageService();
		
		
		discord.webhookURL = "https://discord.com/api/webhooks/1249682329270747206/2lf2SwpFJ40_0nGSOUdtvJEJBojzQrZojWTe4RW62KOLb_otocS5IIOegaw42MKp57cj";
		discord.userName = "Abdullah's java bot";
		discord.content = "This is test from Abdullah's local pc.";
		discord.avatarURL = "https://egetelgrafcom.teimg.com/crop/1280x720/egetelgraf-com/wp/uploads/2023/05/Cumhurbaskani-Recep-Tayyip-Erdogan-kimdir-Recep-Tayyip-Erdogan-nereli-Recep-Tayyip-Erdogan-egitimi-Recep-Tayyip-Erdogan-siyasi-hayati.png";
		
		messageService.sendMessage(discord);
	
	}

}
