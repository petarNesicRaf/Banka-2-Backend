package rs.edu.raf.BankService.data.entities.transactions;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("SecuritiesTransaction")
@Data
@NoArgsConstructor
public class SecuritiesTransaction extends TransferTransaction {
    private String securitiesSymbol;
    private Integer quantityToTransfer;
    private Double amount;
}
