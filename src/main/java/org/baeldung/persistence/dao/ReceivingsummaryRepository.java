package org.baeldung.persistence.dao;

import java.util.List;
import org.baeldung.persistence.model.Receivingsummary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceivingsummaryRepository extends JpaRepository<Receivingsummary, String> {
    Receivingsummary findByReceivingNo(String receivingNo);

    @Override
    void delete(Receivingsummary receivingsummary);
    
//    @Override
//    List<Receivingsummary> findAll();

}
