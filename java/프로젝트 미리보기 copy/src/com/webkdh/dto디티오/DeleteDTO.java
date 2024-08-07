package com.webkdh.dto디티오;

public class DeleteDTO {
	private String friendName;

	
	public DeleteDTO(String friendName) {
		this.friendName = friendName;
	}

	public String getFriendName() {
		return friendName;
	}

	@Override
	public String toString() {
		return "DeleteDTO [friendName=" + friendName + "]";
	}

}
