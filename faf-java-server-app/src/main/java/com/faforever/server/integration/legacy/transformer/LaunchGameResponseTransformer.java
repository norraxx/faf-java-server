package com.faforever.server.integration.legacy.transformer;

import com.faforever.server.game.StartGameProcessResponse;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import org.springframework.integration.transformer.GenericTransformer;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public enum LaunchGameResponseTransformer implements GenericTransformer<StartGameProcessResponse, Map<String, Serializable>> {

  INSTANCE;

  @Override
  public Map<String, Serializable> transform(StartGameProcessResponse source) {
    Builder<String, Serializable> builder = ImmutableMap.<String, Serializable>builder()
      .put("command", "game_launch")
      .put("mod", source.getMod())
      .put("lobby_mode", source.getLobbyMode().toString())
      .put("uid", source.getGameId())
      .put("args", toLegacyArgs(source.getCommandLineArguments()));

    Optional.ofNullable(source.getMapFolderName())
      .ifPresent(mapFolderName -> builder.put("mapname", mapFolderName));

    return builder.build();
  }

  private String[] toLegacyArgs(List<String> commandLineArguments) {
    Assert.isTrue(commandLineArguments.size() == 2, "Legacy args used to have exactly two values");
    return new String[]{Joiner.on(' ').join(commandLineArguments)};
  }
}
