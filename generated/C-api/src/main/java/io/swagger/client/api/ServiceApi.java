package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T16:11:34.648+01:00")
public class ServiceApi {
    private ApiClient apiClient;

    public ServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    /**
     * service
     *
     * @param a a
     * @return String
     */
    public String serviceUsingGET(String a) throws ApiException {
        Object postBody = a;

        // verify the required parameter 'a' is set
        if (a == null) {
            throw new ApiException(400, "Missing the required parameter 'a' when calling serviceUsingGET");
        }

        // create path and map variables
        String path = "/c".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, Object> formParams = new HashMap<String, Object>();


        final String[] accepts = {
                "*/*"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {
                "application/json"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{};


        GenericType<String> returnType = new GenericType<String>() {
        };
        return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);

    }

}
