package br.com.api.transacao.listenerkafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.api.transacao.transacoes.EventoDeTransacao;

@Component
public class ListenerDeTransacao {

    //@Autowired
   // TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacao eventoDeTransacao) {
    	System.out.println(eventoDeTransacao);
        //transacaoRepository.save(eventoDeTransacao.toModel());
    }
}
