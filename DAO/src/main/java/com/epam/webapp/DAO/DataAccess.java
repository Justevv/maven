package com.epam.webapp.DAO;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private List<String> testData = new ArrayList<String>();

    public DataAccess() {
        testData.add("Test1");
        testData.add("Test2");
        testData.add("Test3");
    }

    public List<String> getTestData() {
        return testData;
    }

    public void setTestData(List<String> testData) {
        this.testData = testData;
    }
}
