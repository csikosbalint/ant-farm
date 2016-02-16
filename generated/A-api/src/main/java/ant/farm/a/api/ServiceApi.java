package ant.farm.a.api;

import ant.farm.a.ApiClient;
import ant.farm.a.ApiException;
import ant.farm.a.Configuration;
import ant.farm.a.Pair;
import com.sun.jersey.api.client.GenericType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T14:52:13.449+01:00")
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
        String path = "/a".replaceAll("\\{format\\}", "json");

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
