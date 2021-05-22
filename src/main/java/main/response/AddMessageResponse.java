package main.response;

import lombok.Data;

@Data
public class AddMessageResponse {
    private boolean result;
    private String time;
}