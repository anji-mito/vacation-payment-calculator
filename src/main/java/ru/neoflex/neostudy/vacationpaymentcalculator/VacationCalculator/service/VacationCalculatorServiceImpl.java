package ru.neoflex.neostudy.vacationpaymentcalculator.VacationCalculator.service;

public class VacationCalculatorServiceImpl implements VacationCalculatorService {
    final double averageDaysInMonth = 29.3;
    @Override
    public double calculateVacationPay(double averageSalary, int vacationDays) {
        return averageSalary/averageDaysInMonth * vacationDays;
    }
}
