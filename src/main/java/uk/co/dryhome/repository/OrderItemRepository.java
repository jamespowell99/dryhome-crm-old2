package uk.co.dryhome.repository;

import uk.co.dryhome.domain.OrderItem;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the OrderItem entity.
 */
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
