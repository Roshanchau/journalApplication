package com.example.journalApplication.service;

import com.example.journalApplication.entity.User;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class UserArguementProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws  Exception{
        return  Stream.of(
                Arguments.of(User.builder().userName("groot").password("hehe").build()),
                Arguments.of(User.builder().userName("duke").password("thhee").build())
        );
    }
}
