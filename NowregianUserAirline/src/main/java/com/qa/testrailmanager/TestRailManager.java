package com.qa.testrailmanager;

import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestRailManager {

    public static  String TEST_RUN_ID = "30802";

    public static String TEST_RAIL_USERNAME = "omaisj@apadmi.com";
    public static String TEST_RAIL_PASSWORD = "Chotus11";

    public static String TEST_RAIL_ENGINE_URL = "https://apadmitest.testrail.net";

    public static int TEST_CASES_PASS_STATUS = 1;

    public static int TEST_CASE_FAIL_STATUS = 5;

    public static void addResultsForTestCase(String testCaseId, int status, String error) throws APIException, IOException {

        String testRunID = TEST_RUN_ID;

        APIClient client = new APIClient (TEST_RAIL_ENGINE_URL);

        client.setUser(TEST_RAIL_USERNAME);

        client.setPassword(TEST_RAIL_PASSWORD);

        Map<String, Object> data = new HashMap<String, Object>();

        data.put("status_id", status);

        data.put("comment", "This test is executed via test automation code" + error);

        client.sendPost("add_result_for_case" + testRunID + "/" + testCaseId, data);

        try {
            client.sendPost("add_result_for_case/" + testRunID + "/" + testCaseId, data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (APIException e) {
            throw new RuntimeException(e);
        }
    }

}
