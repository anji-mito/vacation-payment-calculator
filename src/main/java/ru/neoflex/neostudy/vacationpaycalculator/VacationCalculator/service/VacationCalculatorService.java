package ru.neoflex.neostudy.vacationpaycalculator.VacationCalculator.service;

import org.springframework.stereotype.Service;
import ru.neoflex.neostudy.vacationpaycalculator.VacationCalculator.model.VacationRequest;

@Service
public interface VacationCalculatorService {
    double calculateVacationPay(double averageSalary, int vacationDays);

    double calculateVacationPayWithHolidays(VacationRequest vacationRequest);
}
