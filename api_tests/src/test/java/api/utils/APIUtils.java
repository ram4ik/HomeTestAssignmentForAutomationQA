package api.utils;

import api.executor.APIExecutor;

public class APIUtils {

    private static final APIExecutor apiExecutor = new APIExecutor();

    public static void verifyStatusCode(String endpointPath, int expectedStatusCode) {
        apiExecutor
                .get(endpointPath)
                .then()
                .statusCode(expectedStatusCode);
    }
}
