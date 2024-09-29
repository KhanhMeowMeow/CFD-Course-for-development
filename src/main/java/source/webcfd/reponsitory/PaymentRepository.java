package source.webcfd.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import source.webcfd.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
