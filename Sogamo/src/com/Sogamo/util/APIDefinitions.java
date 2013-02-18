package com.Sogamo.util;

public class APIDefinitions {
	public static final String XMLContent = 
	"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
	"<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">" +
	"<plist version=\"1.0\">" + 
	"<dict>" +
		"<key>api_definitions</key>" +
		"<dict>" +
			"<key>session</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>login_datetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>gameId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>player_id</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>session_id</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>username</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>firstname</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>lastname</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>dob</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>email</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>gender</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>relationship_status</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>updatedDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>number_of_friends</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSNumber</string>" +
					"</dict>" +
					"<key>status</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>currency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<false/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>login_datetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>last_active_datetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>inviteSent</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>inviteId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>inviteType</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>recipientIds</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>screenName</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>inviteResponse</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>inviteId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>respondedPlayerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>responseDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>respondedPlayerStatus</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>notificationSent</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>notifiId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>notifiSubject</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>recipientIds</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>notifiText</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>notificationResponse</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>notifiId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>respondedPlayerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>responseDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>respondedPlayerStatus</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>giftSent</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>giftRequestId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>giftItems</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>recipientIds</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>screenName</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>giftResponse</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>giftRequestId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>respondedPlayerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>responseDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>respondedPlayerStatus</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>feedStory</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>storyId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>recipientIds</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>storyMessage</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>storyType</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>feedResponse</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>storyId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>respondedPlayerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>responseDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>respondedPlayerStatus</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>multiFeedStory</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>storyId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>recipientIds</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>storyMessage</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>storyType</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>multiFeedResponse</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>storyId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>respondedPlayerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>responseDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>respondedPlayerStatus</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>publishedUserAction</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>postId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>recipientIds</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>postMessage</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>postType</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>publishedUserActionResponse</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>postId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>respondedPlayerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>responseDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>respondedPlayerStatus</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>levelUp</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>presentLevel</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>levelupDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>itemsUnlocked</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>itemChange</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>itemsInUse</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>itemsInInventory</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logAction</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>itemsRemaining</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>itemsRemainingQuantity</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>itemsBought</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>itemsBoughtQuantity</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>itemsBoughtPrice</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>miscExpenditures</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>currencySpent</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logAction</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>playerTopUp</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>gameId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>currencyEarned</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>currencyBalance</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>remarks</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>payment</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>gameId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>creditSpent</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>resourceBought</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>exchangeRate</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSNumber</string>" +
					"</dict>" +
					"<key>realCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
			"<key>playerAction</key>" +
			"<dict>" +
				"<key>event_index</key>" +
				"<string>logDatetime</string>" +
				"<key>parameters</key>" +
				"<dict>" +
					"<key>playerId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>attributes</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>credit</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>level</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>experience</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>virtualCurrency</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>logDatetime</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>sessionId</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>type</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>description</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSDate</string>" +
					"</dict>" +
					"<key>requirements</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
					"<key>rewards</key>" +
					"<dict>" +
						"<key>required</key>" +
						"<true/>" +
						"<key>type</key>" +
						"<string>NSString</string>" +
					"</dict>" +
				"</dict>" +
			"</dict>" +
		"</dict>" +
		"<key>version</key>" +
		"<string>1.0</string>" +
	"</dict>" +
	"</plist>" ;
}
