package com.br.dynaccurate.dynaccurateworker.resource;

import com.br.dynaccurate.dynaccurateworker.entity.Event;
import com.br.dynaccurate.dynaccurateworker.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/events")
@RequiredArgsConstructor
public class EventResource {
    private final EventService service;

    @PostMapping("/publish")
    public ResponseEntity publishEvent(@RequestBody @Valid Event event) {
        service.publishEvent(event);
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/publish_list")
    public ResponseEntity publishEvent(@RequestBody @Valid List<Event> events) {
        service.publishEvents(events);
        return ResponseEntity.noContent().build();
    }
}
