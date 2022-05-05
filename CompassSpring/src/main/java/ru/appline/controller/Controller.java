package ru.appline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.appline.logic.Model;
import ru.appline.logic.Side;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {
    private static final Model model = Model.getInstance();
    private static final AtomicInteger newId = new AtomicInteger(1);

    @GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
    public Side getSide(@RequestBody int degree) {
        return model.choosingSide(degree);
    }

}
