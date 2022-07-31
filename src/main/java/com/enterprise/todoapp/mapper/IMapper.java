package com.enterprise.todoapp.mapper;

import org.springframework.stereotype.Component;

@Component
public interface IMapper <I, O> {
    public O map(I in);
}
