package com.faforever.server.entity;

/**
 * Defines whether a game is ranked or - if not - why it isn't ranked.
 * Identifiers must be kept in sync with the contents of the invalid_game_reasons table.
 */
public enum Validity {
  // Order sensitive
  VALID,
  TOO_MANY_DESYNCS,
  WRONG_VICTORY_CONDITION,
  NO_FOG_OF_WAR,
  CHEATS_ENABLED,
  PREBUILT_ENABLED,
  NO_RUSH_ENABLED,
  BAD_UNIT_RESTRICTIONS,
  BAD_MAP,
  TOO_SHORT,
  BAD_MOD,
  COOP_UNRANKED,
  MUTUAL_DRAW,
  SINGLE_PLAYER,
  FREE_FOR_ALL,
  UNEVEN_TEAMS,
  UNKNOWN_RESULT,
  TEAMS_UNLOCKED
}
