package com.osiris.banking.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {

    private String email;
    private String password;

}
