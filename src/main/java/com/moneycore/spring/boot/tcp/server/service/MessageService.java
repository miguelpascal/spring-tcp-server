package com.moneycore.spring.boot.tcp.server.service;

public interface MessageService {

    byte[] processMessage(byte[] message);

}
