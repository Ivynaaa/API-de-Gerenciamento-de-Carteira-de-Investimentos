package br.edu.ufop.web.investment.repository;

import br.edu.ufop.web.investment.enums.InvestmentType;
import br.edu.ufop.web.investment.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long> {
    List<Investment> findByType(InvestmentType type);
}