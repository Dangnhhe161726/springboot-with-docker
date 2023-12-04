package com.springbootwithdocker.demo.controller;

import com.springbootwithdocker.demo.dto.response.HttpResponse;
import com.springbootwithdocker.demo.model.Employee;
import com.springbootwithdocker.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/demo")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<HttpResponse> getAllEmployees() {
        List<Employee> listEmployees = employeeService.getAllEmpoyees();
        return ResponseEntity.ok().body(
                HttpResponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .data(Map.of("listEmployees", listEmployees))
                        .message("Get success")
                        .httpStatus(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<HttpResponse> getEmployee(@PathVariable("id") Long id) {
        Employee employee = employeeService.findById(id);
        return ResponseEntity.ok().body(
                HttpResponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .data(Map.of("Employee", employee))
                        .message("Get employee success")
                        .httpStatus(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PostMapping
    public ResponseEntity<HttpResponse> saveEmployee(@RequestBody Employee employee) {
        Employee employeeSave = employeeService.saveEmployee(employee);
        return ResponseEntity.created(URI.create("")).body(
                HttpResponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .data(Map.of("Employee", employeeSave))
                        .message("save success")
                        .httpStatus(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpResponse> deleteEmployee(@PathVariable("id") Long id) {
        Employee employee = employeeService.deleteById(id);
        return ResponseEntity.ok().body(
                HttpResponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .data(Map.of("Employee", employee))
                        .message("delete success")
                        .httpStatus(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PutMapping
    public ResponseEntity<HttpResponse> updateEmployee(@RequestBody Employee employee) {
        Employee employeeUpdate = employeeService.updateEmployee(employee);
        return ResponseEntity.ok().body(
                HttpResponse.builder()
                        .timeStamp(LocalDateTime.now().toString())
                        .data(Map.of("Employee", employeeUpdate))
                        .message("Update success")
                        .httpStatus(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
}
