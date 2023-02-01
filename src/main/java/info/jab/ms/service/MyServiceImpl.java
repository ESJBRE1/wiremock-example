package info.jab.ms.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public List<String> getData() {
        return List.of("Hello", "World");
    }
}
