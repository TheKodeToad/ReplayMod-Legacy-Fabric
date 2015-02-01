package eu.crushedpixel.replaymod.recording;

import java.util.Date;
import java.util.List;

public class ReplayMetaData {
	
	private boolean singleplayer;
	private String serverName;
	private int duration;
	private long date;
	private String[] players;
	private String mcversion;
	
	public ReplayMetaData(boolean singleplayer, String serverName,
			int duration, long date, String[] players, String mcversion) {
		this.singleplayer = singleplayer;
		this.serverName = serverName;
		this.duration = duration;
		this.date = date;
		this.players = players;
		this.mcversion = mcversion;
	}
	public boolean isSingleplayer() {
		return singleplayer;
	}
	public String getServerName() {
		return serverName;
	}
	public int getDuration() {
		return duration;
	}
	public long getDate() {
		return date;
	}
	public String[] getPlayers() {
		return players;
	}
	public String getMCVersion() {
		return mcversion;
	}
}