package com.glovo.example.pages;

import com.glovo.example.support.PageActions;
import org.openqa.selenium.By;

public class EmployeesPage extends PageActions {

    private By lblEmpName = By.cssSelector(".jqx-tree-grid-title.jqx-grid-cell-wrap");
    private By chkEmp = By.cssSelector(".jqx-tree-grid-checkbox");
    private By btnViewSelected = By.id("btn");

    public void selectEmpByName(String empName) {
        getText(getElements(lblEmpName).get(0));
    }

    public void viewSelectedData() {
        clickOn(btnViewSelected);
    }

    public boolean isSelectedUserDisplayed() {
        return true;
    }
}
