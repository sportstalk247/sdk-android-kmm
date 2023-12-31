package com.sportstalk.sdk.model.user

import com.sportstalk.sdk.model.CommonParcelable
import com.sportstalk.sdk.model.CommonParcelize

typealias UserNotificationType = String

@CommonParcelize
@kotlinx.serialization.Serializable
data class UserNotification(
    val id: String? = null,
    /**
     * [Kind.NOTIFICATION] "notification"
     */
    val kind: String? = null,
    val chatroomid: String? = null,
    val added: String? = null, /* ISODateTime Format */
    val userid: String? = null,
    val ts: Long? = null,   /* Epoch time */
    val whenread: String? = null, /* ISODateTime Format */
    val isread: Boolean? = null,
    /**
     * [UserNotificationType]
     */
    val notificationtype: UserNotificationType? = null,
    val chatroomcustomid: String? = null,
    val commentconversationid: String? = null,
    val commentconversationcustomid: String? = null,
    val chateventid: String? = null,
    val commentid: String? = null
): CommonParcelable {
//    @kotlinx.serialization.Serializable
//    enum class Type(val serialName: String) {
//        @SerialName("chatreply") CHAT_REPLY("chatreply"),
//        @SerialName("chatquote") CHAT_QUOTE("chatquote")
//    }

    object Type {
        const val CHAT_REPLY: UserNotificationType = "chatreply"
        const val CHAT_QUOTE: UserNotificationType = "chatquote"
    }

}