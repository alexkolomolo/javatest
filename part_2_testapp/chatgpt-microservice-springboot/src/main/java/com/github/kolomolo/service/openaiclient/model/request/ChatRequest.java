package com.github.kolomolo.service.openaiclient.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChatRequest implements Serializable {
    private String question;
}
