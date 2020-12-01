package com.honchi.socket.payload;

import com.honchi.socket.domain.message.enums.MessageType;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class MessageResponse {

    private Integer id;

    private Integer userId;

    private String name;

    private String message;

    private MessageType messageType;

    private LocalDateTime time;

    private boolean isDelete;

    private boolean isMine;
}
