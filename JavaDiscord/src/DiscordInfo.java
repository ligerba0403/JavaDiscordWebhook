
public class DiscordInfo {
	
	String webhookURL; 
	String avatarURL;
	String userName;
	String content;
	
	String jsonCreateString() {
		return "{ \"username\": \""+ userName + "\"," + "\"content\": \"" + content + "\"," + "\"avatar_url\": \""+ avatarURL + "\" }";
	}
	
	
}
