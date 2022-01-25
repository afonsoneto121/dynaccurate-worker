package com.br.dynaccurate.dynaccurateworker.service.implementation;
import com.br.dynaccurate.dynaccurateworker.entity.Event;
import com.br.dynaccurate.dynaccurateworker.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EventServiceImp implements EventService {
    private final StreamBridge streamBridge;

    @Override
    public void publishEvent(Event event) {
        Message message = MessageBuilder.withPayload(event).build();
        streamBridge.send("eventsLog-out-0", message);
    }

    @Override
    public void publishEvents(List<Event> events) {
        events.stream().forEach(event -> {
            Message message = MessageBuilder.withPayload(event).build();
            streamBridge.send("eventsLog-out-0", message);
        });
    }
}
