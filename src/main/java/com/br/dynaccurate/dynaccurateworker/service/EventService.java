package com.br.dynaccurate.dynaccurateworker.service;


import com.br.dynaccurate.dynaccurateworker.entity.Event;

import java.util.List;

public interface EventService {
    void publishEvent(Event event);
    void publishEvents(List<Event> event);

}
