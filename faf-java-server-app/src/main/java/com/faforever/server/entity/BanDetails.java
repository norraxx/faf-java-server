package com.faforever.server.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "lobby_ban")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class BanDetails {

  @Id
  @Column(name = "idUser")
  private Integer id;

  @OneToOne
  @JoinColumn(name = "idUser", updatable = false, insertable = false)
  private Player player;

  @Column(name = "reason")
  private String reason;

  @Column(name = "expires_at")
  private Timestamp expiresAt;

}
