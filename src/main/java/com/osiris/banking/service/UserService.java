package com.osiris.banking.service;

import com.osiris.banking.dto.AuthenticationRequest;
import com.osiris.banking.dto.AuthenticationResponse;
import com.osiris.banking.dto.UserDto;

public interface UserService extends AbstractService<UserDto>{

    Long validateAccount(Long id);

    Long unvalidateAccount(Long id);

    AuthenticationResponse register(UserDto userDto);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
