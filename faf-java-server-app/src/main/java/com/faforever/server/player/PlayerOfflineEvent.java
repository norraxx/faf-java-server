package com.faforever.server.player;

import com.faforever.server.entity.Player;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.context.ApplicationEvent;

@Data
@EqualsAndHashCode(callSuper = true)
public class PlayerOfflineEvent extends ApplicationEvent {
  private final Player player;

  public PlayerOfflineEvent(Object source, Player player) {
    super(source);
    this.player = player;
  }
}
