/*
 * Airflow API (Stable)
 *
 * # Overview  To facilitate management, Apache Airflow supports a range of REST API endpoints across its objects. This section provides an overview of the API design, methods, and supported use cases.  Most of the endpoints accept `JSON` as input and return `JSON` responses. This means that you must usually add the following headers to your request: ``` Content-type: application/json Accept: application/json ```  ## Resources  The term `resource` refers to a single type of object in the Airflow metadata. An API is broken up by its endpoint's corresponding resource. The name of a resource is typically plural and expressed in camelCase. Example: `dagRuns`.  Resource names are used as part of endpoint URLs, as well as in API parameters and responses.  ## CRUD Operations  The platform supports **C**reate, **R**ead, **U**pdate, and **D**elete operations on most resources. You can review the standards for these operations and their standard parameters below.  Some endpoints have special behavior as exceptions.  ### Create  To create a resource, you typically submit an HTTP `POST` request with the resource's required metadata in the request body. The response returns a `201 Created` response code upon success with the resource's metadata, including its internal `id`, in the response body.  ### Read  The HTTP `GET` request can be used to read a resource or to list a number of resources.  A resource's `id` can be submitted in the request parameters to read a specific resource. The response usually returns a `200 OK` response code upon success, with the resource's metadata in the response body.  If a `GET` request does not include a specific resource `id`, it is treated as a list request. The response usually returns a `200 OK` response code upon success, with an object containing a list of resources' metadata in the response body.  When reading resources, some common query parameters are usually available. e.g.: ``` v1/connections?limit=25&offset=25 ```  |Query Parameter|Type|Description| |---------------|----|-----------| |limit|integer|Maximum number of objects to fetch. Usually 25 by default| |offset|integer|Offset after which to start returning objects. For use with limit query parameter.|  ### Update  Updating a resource requires the resource `id`, and is typically done using an HTTP `PATCH` request, with the fields to modify in the request body. The response usually returns a `200 OK` response code upon success, with information about the modified resource in the response body.  ### Delete  Deleting a resource requires the resource `id` and is typically executing via an HTTP `DELETE` request. The response usually returns a `204 No Content` response code upon success.  ## Conventions  - Resource names are plural and expressed in camelCase. - Names are consistent between URL parameter name and field name.  - Field names are in snake_case. ```json {     \"name\": \"string\",     \"slots\": 0,     \"occupied_slots\": 0,     \"used_slots\": 0,     \"queued_slots\": 0,     \"open_slots\": 0 } ```  ### Update Mask  Update mask is available as a query parameter in patch endpoints. It is used to notify the API which fields you want to update. Using `update_mask` makes it easier to update objects by helping the server know which fields to update in an object instead of updating all fields. The update request ignores any fields that aren't specified in the field mask, leaving them with their current values.  Example: ```   resource = request.get('/resource/my-id').json()   resource['my_field'] = 'new-value'   request.patch('/resource/my-id?update_mask=my_field', data=json.dumps(resource)) ```  ## Versioning and Endpoint Lifecycle  - API versioning is not synchronized to specific releases of the Apache Airflow. - APIs are designed to be backward compatible. - Any changes to the API will first go through a deprecation phase.  # Trying the API  You can use a third party client, such as [curl](https://curl.haxx.se/), [HTTPie](https://httpie.org/), [Postman](https://www.postman.com/) or [the Insomnia rest client](https://insomnia.rest/) to test the Apache Airflow API.  Note that you will need to pass credentials data.  For e.g., here is how to pause a DAG with [curl](https://curl.haxx.se/), when basic authorization is used: ```bash curl -X PATCH 'https://example.com/api/v1/dags/{dag_id}?update_mask=is_paused' \\ -H 'Content-Type: application/json' \\ --user \"username:password\" \\ -d '{     \"is_paused\": true }' ```  Using a graphical tool such as [Postman](https://www.postman.com/) or [Insomnia](https://insomnia.rest/), it is possible to import the API specifications directly:  1. Download the API specification by clicking the **Download** button at top of this document 2. Import the JSON specification in the graphical tool of your choice.   - In *Postman*, you can click the **import** button at the top   - With *Insomnia*, you can just drag-and-drop the file on the UI  Note that with *Postman*, you can also generate code snippets by selecting a request and clicking on the **Code** button.  ## Enabling CORS  [Cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) is a browser security feature that restricts HTTP requests that are initiated from scripts running in the browser.  For details on enabling/configuring CORS, see [Enabling CORS](https://airflow.apache.org/docs/apache-airflow/stable/security/api.html).  # Authentication  To be able to meet the requirements of many organizations, Airflow supports many authentication methods, and it is even possible to add your own method.  If you want to check which auth backend is currently set, you can use `airflow config get-value api auth_backends` command as in the example below. ```bash $ airflow config get-value api auth_backends airflow.api.auth.backend.basic_auth ``` The default is to deny all requests.  For details on configuring the authentication, see [API Authorization](https://airflow.apache.org/docs/apache-airflow/stable/security/api.html).  # Errors  We follow the error response format proposed in [RFC 7807](https://tools.ietf.org/html/rfc7807) also known as Problem Details for HTTP APIs. As with our normal API responses, your client must be prepared to gracefully handle additional members of the response.  ## Unauthenticated  This indicates that the request has not been applied because it lacks valid authentication credentials for the target resource. Please check that you have valid credentials.  ## PermissionDenied  This response means that the server understood the request but refuses to authorize it because it lacks sufficient rights to the resource. It happens when you do not have the necessary permission to execute the action you performed. You need to get the appropriate permissions in other to resolve this error.  ## BadRequest  This response means that the server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). To resolve this, please ensure that your syntax is correct.  ## NotFound  This client error response indicates that the server cannot find the requested resource.  ## MethodNotAllowed  Indicates that the request method is known by the server but is not supported by the target resource.  ## NotAcceptable  The target resource does not have a current representation that would be acceptable to the user agent, according to the proactive negotiation header fields received in the request, and the server is unwilling to supply a default representation.  ## AlreadyExists  The request could not be completed due to a conflict with the current state of the target resource, e.g. the resource it tries to create already exists.  ## Unknown  This means that the server encountered an unexpected condition that prevented it from fulfilling the request. 
 *
 * API version: 2.5.3
 * Contact: dev@airflow.apache.org
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

// Route is the information for every URI.
type Route struct {
	// Name is the name of this Route.
	Name		string
	// Method is the string for the HTTP method. ex) GET, POST etc..
	Method		string
	// Pattern is the pattern of the URI.
	Pattern	 	string
	// HandlerFunc is the handler function of this route.
	HandlerFunc	gin.HandlerFunc
}

// NewRouter returns a new router.
func NewRouter(handleFunctions ApiHandleFunctions) *gin.Engine {
	router := gin.Default()
	for _, route := range getRoutes(handleFunctions) {
		if route.HandlerFunc == nil {
			route.HandlerFunc = DefaultHandleFunc
		}
		switch route.Method {
		case http.MethodGet:
			router.GET(route.Pattern, route.HandlerFunc)
		case http.MethodPost:
			router.POST(route.Pattern, route.HandlerFunc)
		case http.MethodPut:
			router.PUT(route.Pattern, route.HandlerFunc)
		case http.MethodPatch:
			router.PATCH(route.Pattern, route.HandlerFunc)
		case http.MethodDelete:
			router.DELETE(route.Pattern, route.HandlerFunc)
		}
	}

	return router
}

// Default handler for not yet implemented routes
func DefaultHandleFunc(c *gin.Context) {
	c.String(http.StatusNotImplemented, "501 not implemented")
}

type ApiHandleFunctions struct {

	// Routes for the ConfigAPI part of the API
	ConfigAPI ConfigAPI
	// Routes for the ConnectionAPI part of the API
	ConnectionAPI ConnectionAPI
	// Routes for the DAGAPI part of the API
	DAGAPI DAGAPI
	// Routes for the DAGRunAPI part of the API
	DAGRunAPI DAGRunAPI
	// Routes for the DagWarningAPI part of the API
	DagWarningAPI DagWarningAPI
	// Routes for the DatasetAPI part of the API
	DatasetAPI DatasetAPI
	// Routes for the EventLogAPI part of the API
	EventLogAPI EventLogAPI
	// Routes for the ImportErrorAPI part of the API
	ImportErrorAPI ImportErrorAPI
	// Routes for the MonitoringAPI part of the API
	MonitoringAPI MonitoringAPI
	// Routes for the PermissionAPI part of the API
	PermissionAPI PermissionAPI
	// Routes for the PluginAPI part of the API
	PluginAPI PluginAPI
	// Routes for the PoolAPI part of the API
	PoolAPI PoolAPI
	// Routes for the ProviderAPI part of the API
	ProviderAPI ProviderAPI
	// Routes for the RoleAPI part of the API
	RoleAPI RoleAPI
	// Routes for the TaskInstanceAPI part of the API
	TaskInstanceAPI TaskInstanceAPI
	// Routes for the UserAPI part of the API
	UserAPI UserAPI
	// Routes for the VariableAPI part of the API
	VariableAPI VariableAPI
	// Routes for the XComAPI part of the API
	XComAPI XComAPI
}

func getRoutes(handleFunctions ApiHandleFunctions) []Route {
	return []Route{ 
		{
			"GetConfig",
			http.MethodGet,
			"/api/v1/config",
			handleFunctions.ConfigAPI.GetConfig,
		},
		{
			"DeleteConnection",
			http.MethodDelete,
			"/api/v1/connections/:connection_id",
			handleFunctions.ConnectionAPI.DeleteConnection,
		},
		{
			"GetConnection",
			http.MethodGet,
			"/api/v1/connections/:connection_id",
			handleFunctions.ConnectionAPI.GetConnection,
		},
		{
			"GetConnections",
			http.MethodGet,
			"/api/v1/connections",
			handleFunctions.ConnectionAPI.GetConnections,
		},
		{
			"PatchConnection",
			http.MethodPatch,
			"/api/v1/connections/:connection_id",
			handleFunctions.ConnectionAPI.PatchConnection,
		},
		{
			"PostConnection",
			http.MethodPost,
			"/api/v1/connections",
			handleFunctions.ConnectionAPI.PostConnection,
		},
		{
			"TestConnection",
			http.MethodPost,
			"/api/v1/connections/test",
			handleFunctions.ConnectionAPI.TestConnection,
		},
		{
			"DeleteDag",
			http.MethodDelete,
			"/api/v1/dags/:dag_id",
			handleFunctions.DAGAPI.DeleteDag,
		},
		{
			"GetDag",
			http.MethodGet,
			"/api/v1/dags/:dag_id",
			handleFunctions.DAGAPI.GetDag,
		},
		{
			"GetDagDetails",
			http.MethodGet,
			"/api/v1/dags/:dag_id/details",
			handleFunctions.DAGAPI.GetDagDetails,
		},
		{
			"GetDagSource",
			http.MethodGet,
			"/api/v1/dagSources/:file_token",
			handleFunctions.DAGAPI.GetDagSource,
		},
		{
			"GetDags",
			http.MethodGet,
			"/api/v1/dags",
			handleFunctions.DAGAPI.GetDags,
		},
		{
			"GetTask",
			http.MethodGet,
			"/api/v1/dags/:dag_id/tasks/:task_id",
			handleFunctions.DAGAPI.GetTask,
		},
		{
			"GetTasks",
			http.MethodGet,
			"/api/v1/dags/:dag_id/tasks",
			handleFunctions.DAGAPI.GetTasks,
		},
		{
			"PatchDag",
			http.MethodPatch,
			"/api/v1/dags/:dag_id",
			handleFunctions.DAGAPI.PatchDag,
		},
		{
			"PatchDags",
			http.MethodPatch,
			"/api/v1/dags",
			handleFunctions.DAGAPI.PatchDags,
		},
		{
			"PostClearTaskInstances",
			http.MethodPost,
			"/api/v1/dags/:dag_id/clearTaskInstances",
			handleFunctions.DAGAPI.PostClearTaskInstances,
		},
		{
			"PostSetTaskInstancesState",
			http.MethodPost,
			"/api/v1/dags/:dag_id/updateTaskInstancesState",
			handleFunctions.DAGAPI.PostSetTaskInstancesState,
		},
		{
			"ClearDagRun",
			http.MethodPost,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/clear",
			handleFunctions.DAGRunAPI.ClearDagRun,
		},
		{
			"DeleteDagRun",
			http.MethodDelete,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id",
			handleFunctions.DAGRunAPI.DeleteDagRun,
		},
		{
			"GetDagRun",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id",
			handleFunctions.DAGRunAPI.GetDagRun,
		},
		{
			"GetDagRuns",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns",
			handleFunctions.DAGRunAPI.GetDagRuns,
		},
		{
			"GetDagRunsBatch",
			http.MethodPost,
			"/api/v1/dags/~/dagRuns/list",
			handleFunctions.DAGRunAPI.GetDagRunsBatch,
		},
		{
			"GetUpstreamDatasetEvents",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/upstreamDatasetEvents",
			handleFunctions.DAGRunAPI.GetUpstreamDatasetEvents,
		},
		{
			"PostDagRun",
			http.MethodPost,
			"/api/v1/dags/:dag_id/dagRuns",
			handleFunctions.DAGRunAPI.PostDagRun,
		},
		{
			"SetDagRunNote",
			http.MethodPatch,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/setNote",
			handleFunctions.DAGRunAPI.SetDagRunNote,
		},
		{
			"UpdateDagRunState",
			http.MethodPatch,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id",
			handleFunctions.DAGRunAPI.UpdateDagRunState,
		},
		{
			"GetDagWarnings",
			http.MethodGet,
			"/api/v1/dagWarnings",
			handleFunctions.DagWarningAPI.GetDagWarnings,
		},
		{
			"GetDataset",
			http.MethodGet,
			"/api/v1/datasets/:uri",
			handleFunctions.DatasetAPI.GetDataset,
		},
		{
			"GetDatasetEvents",
			http.MethodGet,
			"/api/v1/datasets/events",
			handleFunctions.DatasetAPI.GetDatasetEvents,
		},
		{
			"GetDatasets",
			http.MethodGet,
			"/api/v1/datasets",
			handleFunctions.DatasetAPI.GetDatasets,
		},
		{
			"GetUpstreamDatasetEvents",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/upstreamDatasetEvents",
			handleFunctions.DatasetAPI.GetUpstreamDatasetEvents,
		},
		{
			"GetEventLog",
			http.MethodGet,
			"/api/v1/eventLogs/:event_log_id",
			handleFunctions.EventLogAPI.GetEventLog,
		},
		{
			"GetEventLogs",
			http.MethodGet,
			"/api/v1/eventLogs",
			handleFunctions.EventLogAPI.GetEventLogs,
		},
		{
			"GetImportError",
			http.MethodGet,
			"/api/v1/importErrors/:import_error_id",
			handleFunctions.ImportErrorAPI.GetImportError,
		},
		{
			"GetImportErrors",
			http.MethodGet,
			"/api/v1/importErrors",
			handleFunctions.ImportErrorAPI.GetImportErrors,
		},
		{
			"GetHealth",
			http.MethodGet,
			"/api/v1/health",
			handleFunctions.MonitoringAPI.GetHealth,
		},
		{
			"GetVersion",
			http.MethodGet,
			"/api/v1/version",
			handleFunctions.MonitoringAPI.GetVersion,
		},
		{
			"GetPermissions",
			http.MethodGet,
			"/api/v1/permissions",
			handleFunctions.PermissionAPI.GetPermissions,
		},
		{
			"GetPlugins",
			http.MethodGet,
			"/api/v1/plugins",
			handleFunctions.PluginAPI.GetPlugins,
		},
		{
			"DeletePool",
			http.MethodDelete,
			"/api/v1/pools/:pool_name",
			handleFunctions.PoolAPI.DeletePool,
		},
		{
			"GetPool",
			http.MethodGet,
			"/api/v1/pools/:pool_name",
			handleFunctions.PoolAPI.GetPool,
		},
		{
			"GetPools",
			http.MethodGet,
			"/api/v1/pools",
			handleFunctions.PoolAPI.GetPools,
		},
		{
			"PatchPool",
			http.MethodPatch,
			"/api/v1/pools/:pool_name",
			handleFunctions.PoolAPI.PatchPool,
		},
		{
			"PostPool",
			http.MethodPost,
			"/api/v1/pools",
			handleFunctions.PoolAPI.PostPool,
		},
		{
			"GetProviders",
			http.MethodGet,
			"/api/v1/providers",
			handleFunctions.ProviderAPI.GetProviders,
		},
		{
			"DeleteRole",
			http.MethodDelete,
			"/api/v1/roles/:role_name",
			handleFunctions.RoleAPI.DeleteRole,
		},
		{
			"GetRole",
			http.MethodGet,
			"/api/v1/roles/:role_name",
			handleFunctions.RoleAPI.GetRole,
		},
		{
			"GetRoles",
			http.MethodGet,
			"/api/v1/roles",
			handleFunctions.RoleAPI.GetRoles,
		},
		{
			"PatchRole",
			http.MethodPatch,
			"/api/v1/roles/:role_name",
			handleFunctions.RoleAPI.PatchRole,
		},
		{
			"PostRole",
			http.MethodPost,
			"/api/v1/roles",
			handleFunctions.RoleAPI.PostRole,
		},
		{
			"GetExtraLinks",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/links",
			handleFunctions.TaskInstanceAPI.GetExtraLinks,
		},
		{
			"GetLog",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/logs/:task_try_number",
			handleFunctions.TaskInstanceAPI.GetLog,
		},
		{
			"GetMappedTaskInstance",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/:map_index",
			handleFunctions.TaskInstanceAPI.GetMappedTaskInstance,
		},
		{
			"GetMappedTaskInstances",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/listMapped",
			handleFunctions.TaskInstanceAPI.GetMappedTaskInstances,
		},
		{
			"GetTaskInstance",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id",
			handleFunctions.TaskInstanceAPI.GetTaskInstance,
		},
		{
			"GetTaskInstances",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances",
			handleFunctions.TaskInstanceAPI.GetTaskInstances,
		},
		{
			"GetTaskInstancesBatch",
			http.MethodPost,
			"/api/v1/dags/~/dagRuns/~/taskInstances/list",
			handleFunctions.TaskInstanceAPI.GetTaskInstancesBatch,
		},
		{
			"PatchMappedTaskInstance",
			http.MethodPatch,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/:map_index",
			handleFunctions.TaskInstanceAPI.PatchMappedTaskInstance,
		},
		{
			"PatchTaskInstance",
			http.MethodPatch,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id",
			handleFunctions.TaskInstanceAPI.PatchTaskInstance,
		},
		{
			"SetMappedTaskInstanceNote",
			http.MethodPatch,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/:map_index/setNote",
			handleFunctions.TaskInstanceAPI.SetMappedTaskInstanceNote,
		},
		{
			"SetTaskInstanceNote",
			http.MethodPatch,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/setNote",
			handleFunctions.TaskInstanceAPI.SetTaskInstanceNote,
		},
		{
			"DeleteUser",
			http.MethodDelete,
			"/api/v1/users/:username",
			handleFunctions.UserAPI.DeleteUser,
		},
		{
			"GetUser",
			http.MethodGet,
			"/api/v1/users/:username",
			handleFunctions.UserAPI.GetUser,
		},
		{
			"GetUsers",
			http.MethodGet,
			"/api/v1/users",
			handleFunctions.UserAPI.GetUsers,
		},
		{
			"PatchUser",
			http.MethodPatch,
			"/api/v1/users/:username",
			handleFunctions.UserAPI.PatchUser,
		},
		{
			"PostUser",
			http.MethodPost,
			"/api/v1/users",
			handleFunctions.UserAPI.PostUser,
		},
		{
			"DeleteVariable",
			http.MethodDelete,
			"/api/v1/variables/:variable_key",
			handleFunctions.VariableAPI.DeleteVariable,
		},
		{
			"GetVariable",
			http.MethodGet,
			"/api/v1/variables/:variable_key",
			handleFunctions.VariableAPI.GetVariable,
		},
		{
			"GetVariables",
			http.MethodGet,
			"/api/v1/variables",
			handleFunctions.VariableAPI.GetVariables,
		},
		{
			"PatchVariable",
			http.MethodPatch,
			"/api/v1/variables/:variable_key",
			handleFunctions.VariableAPI.PatchVariable,
		},
		{
			"PostVariables",
			http.MethodPost,
			"/api/v1/variables",
			handleFunctions.VariableAPI.PostVariables,
		},
		{
			"GetXcomEntries",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/xcomEntries",
			handleFunctions.XComAPI.GetXcomEntries,
		},
		{
			"GetXcomEntry",
			http.MethodGet,
			"/api/v1/dags/:dag_id/dagRuns/:dag_run_id/taskInstances/:task_id/xcomEntries/:xcom_key",
			handleFunctions.XComAPI.GetXcomEntry,
		},
	}
}
