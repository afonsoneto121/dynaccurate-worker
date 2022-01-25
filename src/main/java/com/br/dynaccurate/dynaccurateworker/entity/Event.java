package com.br.dynaccurate.dynaccurateworker.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @NotBlank
    private String id;
    @NotBlank
    private String type;
    @NotNull
    private LocalDateTime dateTime;
    @NotBlank
    String nicknameUser;
}
