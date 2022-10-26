package com.example.bookshop.service;

import com.example.bookshop.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
