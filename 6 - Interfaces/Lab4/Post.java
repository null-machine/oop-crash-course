import java.util.Calendar;
import java.util.Date;

public class Post {
	
	protected int likes;
	private Date timeStamp;
	private String userName;
	
	public Post(String userName) {
		this.userName = userName;
		timeStamp = Calendar.getInstance().getTime();
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	
	public void like() {
		likes++;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public String toString() {
		String str = new String();
		str = getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
		return str;
	}
	
	public int compareTo(Post other) {
		return timeStamp.compareTo(other.getTimeStamp());
	}
	
	public boolean isPopular() {
		return likes > 100;
	}
}
