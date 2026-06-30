package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.repository.MiddlewareRepository;
import java.util.List;

@Service
public class MiddleWareService {

    private MiddlewareRepository middlewareRepository;

    public MiddleWareService(MiddlewareRepository middlewareRepository)
    {
        this.middlewareRepository = middlewareRepository;
    }

    public MiddlewareRepository getMiddlewareRepository() {
        return middlewareRepository;
    }

    public MiddlewareRepository setMiddlewareRepository(MiddlewareRepository middlewareRepository) {
        this.middlewareRepository = middlewareRepository;
        return middlewareRepository;
    }
    @SuppressWarnings("unchecked")
    public List<MiddlewareRepository> getAllMiddleWare() {
        return middlewareRepository.findAll();
    }

}
