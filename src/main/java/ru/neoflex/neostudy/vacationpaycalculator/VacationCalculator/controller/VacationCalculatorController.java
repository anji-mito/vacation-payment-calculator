package ru.neoflex.neostudy.vacationpaycalculator.VacationCalculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.neoflex.neostudy.vacationpaycalculator.VacationCalculator.model.VacationRequest;
import ru.neoflex.neostudy.vacationpaycalculator.VacationCalculator.service.VacationCalculatorService;

@RestController
@RequestMapping("/calculate")
public class VacationCalculatorController {
    private final VacationCalculatorService vacationCalculatorService;

    public VacationCalculatorController(VacationCalculatorService vacationCalculatorService) {
        this.vacationCalculatorService = vacationCalculatorService;
    }

    @GetMapping
    public ResponseEntity<Double> calculateVacation(@RequestParam double averageSalary, @RequestParam int vacationDays) {
        double vacationPay = vacationCalculatorService.calculateVacationPay(averageSalary, vacationDays);
        return ResponseEntity.ok(vacationPay);
    }

    @PostMapping("/with-holidays")
    public ResponseEntity<Double> calculateVacationWithHolidays(@RequestBody VacationRequest vacationRequest) {
        double vacationPay = vacationCalculatorService.calculateVacationPayWithHolidays(vacationRequest);
        return ResponseEntity.ok(vacationPay);
    }
}
