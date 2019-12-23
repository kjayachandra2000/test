package com.glovo.example.specs;

import com.glovo.example.steps.UserSelectionSteps;
import org.junit.Test;

public class UserSelectionTest extends BasicTest {

    private UserSelectionSteps userSelectionSteps = new UserSelectionSteps();

    @Test
    public void selectUser() {
        String empName = "Andrew";

        userSelectionSteps
                .givenISelectAUser(empName)
                .whenIViewSelectedData()
                .thenIShouldSeeSelectedUserInformation();
    }
}
