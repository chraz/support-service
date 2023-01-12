package com.example.customersupport.Repository;

import com.example.customersupport.Model.SupportTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface SupportRepository extends JpaRepository<SupportTask, Long> {
    List<SupportTask> findByCustomerId(long customerId);


    @Transactional
    @Modifying
    @Query("delete from SupportTask s where s.customerId=:customerId")
    int deleteByCustomerId(@Param("customerId") long customerId);

}
