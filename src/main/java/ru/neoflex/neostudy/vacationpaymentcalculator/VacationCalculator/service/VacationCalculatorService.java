package ru.neoflex.neostudy.vacationpaymentcalculator.VacationCalculator.service;

import org.springframework.stereotype.Service;

@Service
public interface VacationCalculatorService {
    double calculateVacationPay(double averageSalary, int vacationDays);
}
