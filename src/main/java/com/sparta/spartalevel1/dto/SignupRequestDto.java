package com.sparta.spartalevel1.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @Size(min=4, max = 10, message = "4자 이상 10자 이하여야 합니다.")
    @Pattern(regexp = "^[a-z0-9]*$")
    private String username;

    @Size(min=8, max = 15, message = "8자 이상 15자 이하여야 합니다.")
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    private String password;

    @Email
    private String email;
}
