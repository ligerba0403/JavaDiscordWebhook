import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DiscordMessageService {
	
	
	void sendMessage(DiscordInfo discordInfo) throws IOException {
		
		
		URL url = new URL(discordInfo.webhookURL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.addRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		connection.setRequestMethod("POST");
		
		OutputStream stream = connection.getOutputStream();
		stream.write(discordInfo.jsonCreateString().getBytes());
		stream.flush();
		stream.close();
		
		connection.getInputStream().close();
		connection.disconnect();
		
	}
}
