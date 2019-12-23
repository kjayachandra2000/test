package com.glovo.example.steps;

import com.glovo.example.pages.EmployeesPage;
import io.qameta.allure.Step;
import org.junit.Assert;

public class UserSelectionSteps {

    private EmployeesPage employeesPage = new EmployeesPage();

    @Step
    public UserSelectionSteps givenISelectAUser(String empName) {
        employeesPage
                .selectEmpByName(empName);
        return this;
    }

    @Step
    public UserSelectionSteps whenIViewSelectedData() {
        employeesPage
                .viewSelectedData();
        return this;
    }

    @Step
    public void thenIShouldSeeSelectedUserInformation() {
        Assert.assertTrue(employeesPage.isSelectedUserDisplayed());
    }
}
