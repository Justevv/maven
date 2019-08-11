package com.epam.webapp;

import com.epam.webapp.DAO.DataAccess;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestDAO {
    @Test
    public void testingDAO() {
        DataAccess dataAccess = new DataAccess();
        assertThat(dataAccess.getTestData().get(0), is("Test1"));
        assertThat(dataAccess.getTestData().get(1), is("Test2"));
        assertThat(dataAccess.getTestData().get(2), is("Test3"));
    }

    @Test
    public void getTestData() {
        List<String> actualData = new ArrayList<String>();
        actualData.add("Test1");
        actualData.add("Test2");
        actualData.add("Test3");
        DataAccess dataAccess = new DataAccess();
        List<String> testData = dataAccess.getTestData();
        Assert.assertEquals(actualData, testData);
    }
}
