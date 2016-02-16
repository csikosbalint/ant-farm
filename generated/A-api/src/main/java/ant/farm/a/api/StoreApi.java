package ant.farm.a.api;

import ant.farm.a.ApiClient;
import ant.farm.a.ApiException;
import ant.farm.a.Configuration;
import ant.farm.a.Pair;
import ant.farm.a.model.Order;
import com.sun.jersey.api.client.GenericType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-13T14:25:40.778+01:00")
public class StoreApi {
    private ApiClient apiClient;

    public StoreApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @return Map<String, Integer>
     */
    public Map<String, Integer> getInventory() throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/store/inventory".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, Object> formParams = new HashMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {

        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};


        GenericType<Map<String, Integer>> returnType = new GenericType<Map<String, Integer>>() {
        };
        return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);

    }

    /**
     * Place an order for a pet
     *
     * @param body order placed for purchasing the pet
     * @return Order
     */
    public Order placeOrder(Order body) throws ApiException {
        Object postBody = body;

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling placeOrder");
        }

        // create path and map variables
        String path = "/store/order".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, Object> formParams = new HashMap<String, Object>();


        final String[] accepts = {
                "application/xml", "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {

        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{};


        GenericType<Order> returnType = new GenericType<Order>() {
        };
        return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);

    }

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &gt;= 1 and &lt;= 10. Other values will generated exceptions
     *
     * @param orderId ID of pet that needs to be fetched
     * @return Order
     */
    public Order getOrderById(Long orderId) throws ApiException {
        Object postBody = null;

        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException(400, "Missing the required parameter 'orderId' when calling getOrderById");
        }

        // create path and map variables
        String path = "/store/order/{orderId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, Object> formParams = new HashMap<String, Object>();


        final String[] accepts = {
                "application/xml", "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {

        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{};


        GenericType<Order> returnType = new GenericType<Order>() {
        };
        return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);

    }

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted
     * @return void
     */
    public void deleteOrder(Long orderId) throws ApiException {
        Object postBody = null;

        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException(400, "Missing the required parameter 'orderId' when calling deleteOrder");
        }

        // create path and map variables
        String path = "/store/order/{orderId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, Object> formParams = new HashMap<String, Object>();


        final String[] accepts = {
                "application/xml", "application/json"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = {

        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{};


        apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);

    }

}
