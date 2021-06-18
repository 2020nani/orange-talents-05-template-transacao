package br.com.api.transacao.transacoes;

import com.nimbusds.jose.shaded.json.JSONUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<EventoDeTransacao, String> {

    Page<EventoDeTransacao> findByCartaoId(String idCartao, Pageable paginacao);
}
