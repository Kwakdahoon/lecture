package com.webkdh.dto디티오;

public class SearchNameDTO {
	private String friendName;
	
	public SearchNameDTO(String friendName) {
		this.friendName = friendName;
	}

	@Override
	public String toString() {
		return "SearchNameDTO [friendName=" + friendName + "]";
	}

	public String getFriendName() {
		return friendName;
	}
}
