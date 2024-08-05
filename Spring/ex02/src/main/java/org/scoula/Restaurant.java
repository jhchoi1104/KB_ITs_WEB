package org.scoula.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Restaurant {
    // 의존객체
    // Restaurant(Chef chef);
    // void set Chef(chef chef);
    @Autowired
    private Chef chef;
}
