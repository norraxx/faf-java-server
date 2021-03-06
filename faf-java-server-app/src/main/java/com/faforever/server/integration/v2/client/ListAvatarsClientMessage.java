package com.faforever.server.integration.v2.client;

import com.faforever.server.annotations.V2ClientNotification;

/**
 * Message sent from the client to the server to request a list of all available avatars for the current player.
 */
// TODO not sure if this should be provided by the server or not.
@V2ClientNotification
class ListAvatarsClientMessage extends V2ClientMessage {

  public static final String TYPE_NAME = "listAvatars";
}
