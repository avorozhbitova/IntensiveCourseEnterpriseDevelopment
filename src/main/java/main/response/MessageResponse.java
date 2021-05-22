package main.response;

import lombok.Data;

@Data
public class MessageResponse {
    private String name;
    private String time;
    private String text;
}