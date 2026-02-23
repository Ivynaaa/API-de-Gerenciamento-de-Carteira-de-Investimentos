package br.edu.ufop.web.investment.dtos;

import br.edu.ufop.web.investment.enums.InvestmentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvestmentSummaryDTO {
    private BigDecimal totalInvested;
    private Map<InvestmentType, BigDecimal> totalByType;
    private long assetCount;
}