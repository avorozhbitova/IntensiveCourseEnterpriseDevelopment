package main.response;

import lombok.Data;

@Data
public class AuthResponse {
    private boolean result;
    private String name;
}