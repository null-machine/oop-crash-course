class PhotoPost extends Post {
	
	public String fileName;
	public String caption;
	
	public PhotoPost(String userName, String fileName, String caption) {
		super(userName);
		this.fileName = fileName;
		this.caption = caption;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getCaption() {
		return caption;
	}
	
	public String toString() {
		String str = new String();
		str = super.toString() + ", " + fileName + ", " + caption;
		return str;
	}
}
