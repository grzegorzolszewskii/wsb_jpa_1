package com.capgemini.wsb.rest.exception;

public class EntityNotFoundException extends RuntimeException
{

    public EntityNotFoundException(Integer id)
    {
        super("Could not find entity of id " + id);
    }
}
