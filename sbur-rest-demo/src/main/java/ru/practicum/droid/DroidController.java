package ru.practicum.droid;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/droid")
@RequiredArgsConstructor
public class DroidController {
    private final Droid droid;
    @GetMapping
    public Droid getDroid() {
        return droid;
    }
}
