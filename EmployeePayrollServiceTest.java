package com.employeepayroll;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {

    @Test
    public void given3EmployeeWhenWrittenToFile_ShouldReturnEmployeeEnteries(){
        EmployeePayRollData[] arrayOfEmps ={
            new EmployeePayRollData(1,"monika",100000),
            new EmployeePayRollData(2,"komal",100000),
            new EmployeePayRollData(3,"ram",100000),
        };
        EmployeePayRollService employeePayRollService;
        employeePayRollService = new EmployeePayRollService(Arrays.asList(arrayOfEmps));
        employeePayRollService.writeData(EmployeePayRollService.IOService.FILE_IO);
    }
}
