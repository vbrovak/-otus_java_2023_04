package ru.otus;

//обработка исключений
public class BoxException extends RuntimeException{
    public BoxException(String message) {
        super(message);
    }
}