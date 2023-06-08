package com.example.demo;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseCookie;

@RestController
@RequestMapping("/api")
public class CookieController {

    @GetMapping("/set-cookie")
    public ResponseEntity<String> setCookie() {
        ResponseCookie cookie = ResponseCookie.from("myCookie", "cookieValue")
                .httpOnly(true)
                .path("/")
                .build();

        return ResponseEntity.ok()
                .header(HttpHeaders.SET_COOKIE, cookie.toString())
                .body("Cookie has been set");
    }

}

