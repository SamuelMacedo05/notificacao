package com.bilbo.notificacao.infrastructure;

public class EmailExceptioon  extends RuntimeException{

    public EmailExceptioon(String mensagem){
        super(mensagem);
    }
    public EmailExceptioon(String mensagem, Throwable throwable){
        super(mensagem,throwable);
    }
}
