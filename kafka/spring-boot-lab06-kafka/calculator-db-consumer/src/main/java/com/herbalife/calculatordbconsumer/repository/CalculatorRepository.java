package com.herbalife.calculatordbconsumer.repository;

import com.herbalife.calculatordbconsumer.model.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<Calculator, Integer> {
}
