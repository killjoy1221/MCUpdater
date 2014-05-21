package mcupdater;


public class RemoteMod implements Mod{

	String modid;
	String version;
	String url;
	String md5;
	
	public RemoteMod(String modid, String version, String url, String md5){
		
			this.modid = modid;
			this.version = version;
			this.url = url;
			this.md5 = md5;
	}
	
	@Override
	public String getModID() {
		return this.modid;
	}

	@Override
	public String getVersion() {
		return this.version;
	}

	@Override
	public String getFile() {
		return this.url;
	}
	
	public String getMD5(){
		return this.md5;
	}

}
