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
	"context"
	"net/http"
	"reflect"
	"time"
	"reflect"
	"time"
	"reflect"
)



// ConfigAPIRouter defines the required methods for binding the api requests to a responses for the ConfigAPI
// The ConfigAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ConfigAPIServicer to perform the required actions, then write the service results to the http response.
type ConfigAPIRouter interface { 
	GetConfig(http.ResponseWriter, *http.Request)
}
// ConnectionAPIRouter defines the required methods for binding the api requests to a responses for the ConnectionAPI
// The ConnectionAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ConnectionAPIServicer to perform the required actions, then write the service results to the http response.
type ConnectionAPIRouter interface { 
	DeleteConnection(http.ResponseWriter, *http.Request)
	GetConnection(http.ResponseWriter, *http.Request)
	GetConnections(http.ResponseWriter, *http.Request)
	PatchConnection(http.ResponseWriter, *http.Request)
	PostConnection(http.ResponseWriter, *http.Request)
	TestConnection(http.ResponseWriter, *http.Request)
}
// DAGAPIRouter defines the required methods for binding the api requests to a responses for the DAGAPI
// The DAGAPIRouter implementation should parse necessary information from the http request,
// pass the data to a DAGAPIServicer to perform the required actions, then write the service results to the http response.
type DAGAPIRouter interface { 
	DeleteDag(http.ResponseWriter, *http.Request)
	GetDag(http.ResponseWriter, *http.Request)
	GetDagDetails(http.ResponseWriter, *http.Request)
	GetDagSource(http.ResponseWriter, *http.Request)
	GetDags(http.ResponseWriter, *http.Request)
	GetTask(http.ResponseWriter, *http.Request)
	GetTasks(http.ResponseWriter, *http.Request)
	PatchDag(http.ResponseWriter, *http.Request)
	PatchDags(http.ResponseWriter, *http.Request)
	PostClearTaskInstances(http.ResponseWriter, *http.Request)
	PostSetTaskInstancesState(http.ResponseWriter, *http.Request)
}
// DAGRunAPIRouter defines the required methods for binding the api requests to a responses for the DAGRunAPI
// The DAGRunAPIRouter implementation should parse necessary information from the http request,
// pass the data to a DAGRunAPIServicer to perform the required actions, then write the service results to the http response.
type DAGRunAPIRouter interface { 
	ClearDagRun(http.ResponseWriter, *http.Request)
	DeleteDagRun(http.ResponseWriter, *http.Request)
	GetDagRun(http.ResponseWriter, *http.Request)
	GetDagRuns(http.ResponseWriter, *http.Request)
	GetDagRunsBatch(http.ResponseWriter, *http.Request)
	GetUpstreamDatasetEvents(http.ResponseWriter, *http.Request)
	PostDagRun(http.ResponseWriter, *http.Request)
	SetDagRunNote(http.ResponseWriter, *http.Request)
	UpdateDagRunState(http.ResponseWriter, *http.Request)
}
// DagWarningAPIRouter defines the required methods for binding the api requests to a responses for the DagWarningAPI
// The DagWarningAPIRouter implementation should parse necessary information from the http request,
// pass the data to a DagWarningAPIServicer to perform the required actions, then write the service results to the http response.
type DagWarningAPIRouter interface { 
	GetDagWarnings(http.ResponseWriter, *http.Request)
}
// DatasetAPIRouter defines the required methods for binding the api requests to a responses for the DatasetAPI
// The DatasetAPIRouter implementation should parse necessary information from the http request,
// pass the data to a DatasetAPIServicer to perform the required actions, then write the service results to the http response.
type DatasetAPIRouter interface { 
	GetDataset(http.ResponseWriter, *http.Request)
	GetDatasetEvents(http.ResponseWriter, *http.Request)
	GetDatasets(http.ResponseWriter, *http.Request)
	GetUpstreamDatasetEvents(http.ResponseWriter, *http.Request)
}
// EventLogAPIRouter defines the required methods for binding the api requests to a responses for the EventLogAPI
// The EventLogAPIRouter implementation should parse necessary information from the http request,
// pass the data to a EventLogAPIServicer to perform the required actions, then write the service results to the http response.
type EventLogAPIRouter interface { 
	GetEventLog(http.ResponseWriter, *http.Request)
	GetEventLogs(http.ResponseWriter, *http.Request)
}
// ImportErrorAPIRouter defines the required methods for binding the api requests to a responses for the ImportErrorAPI
// The ImportErrorAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ImportErrorAPIServicer to perform the required actions, then write the service results to the http response.
type ImportErrorAPIRouter interface { 
	GetImportError(http.ResponseWriter, *http.Request)
	GetImportErrors(http.ResponseWriter, *http.Request)
}
// MonitoringAPIRouter defines the required methods for binding the api requests to a responses for the MonitoringAPI
// The MonitoringAPIRouter implementation should parse necessary information from the http request,
// pass the data to a MonitoringAPIServicer to perform the required actions, then write the service results to the http response.
type MonitoringAPIRouter interface { 
	GetHealth(http.ResponseWriter, *http.Request)
	GetVersion(http.ResponseWriter, *http.Request)
}
// PermissionAPIRouter defines the required methods for binding the api requests to a responses for the PermissionAPI
// The PermissionAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PermissionAPIServicer to perform the required actions, then write the service results to the http response.
type PermissionAPIRouter interface { 
	GetPermissions(http.ResponseWriter, *http.Request)
}
// PluginAPIRouter defines the required methods for binding the api requests to a responses for the PluginAPI
// The PluginAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PluginAPIServicer to perform the required actions, then write the service results to the http response.
type PluginAPIRouter interface { 
	GetPlugins(http.ResponseWriter, *http.Request)
}
// PoolAPIRouter defines the required methods for binding the api requests to a responses for the PoolAPI
// The PoolAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PoolAPIServicer to perform the required actions, then write the service results to the http response.
type PoolAPIRouter interface { 
	DeletePool(http.ResponseWriter, *http.Request)
	GetPool(http.ResponseWriter, *http.Request)
	GetPools(http.ResponseWriter, *http.Request)
	PatchPool(http.ResponseWriter, *http.Request)
	PostPool(http.ResponseWriter, *http.Request)
}
// ProviderAPIRouter defines the required methods for binding the api requests to a responses for the ProviderAPI
// The ProviderAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ProviderAPIServicer to perform the required actions, then write the service results to the http response.
type ProviderAPIRouter interface { 
	GetProviders(http.ResponseWriter, *http.Request)
}
// RoleAPIRouter defines the required methods for binding the api requests to a responses for the RoleAPI
// The RoleAPIRouter implementation should parse necessary information from the http request,
// pass the data to a RoleAPIServicer to perform the required actions, then write the service results to the http response.
type RoleAPIRouter interface { 
	DeleteRole(http.ResponseWriter, *http.Request)
	GetRole(http.ResponseWriter, *http.Request)
	GetRoles(http.ResponseWriter, *http.Request)
	PatchRole(http.ResponseWriter, *http.Request)
	PostRole(http.ResponseWriter, *http.Request)
}
// TaskInstanceAPIRouter defines the required methods for binding the api requests to a responses for the TaskInstanceAPI
// The TaskInstanceAPIRouter implementation should parse necessary information from the http request,
// pass the data to a TaskInstanceAPIServicer to perform the required actions, then write the service results to the http response.
type TaskInstanceAPIRouter interface { 
	GetExtraLinks(http.ResponseWriter, *http.Request)
	GetLog(http.ResponseWriter, *http.Request)
	GetMappedTaskInstance(http.ResponseWriter, *http.Request)
	GetMappedTaskInstances(http.ResponseWriter, *http.Request)
	GetTaskInstance(http.ResponseWriter, *http.Request)
	GetTaskInstances(http.ResponseWriter, *http.Request)
	GetTaskInstancesBatch(http.ResponseWriter, *http.Request)
	PatchMappedTaskInstance(http.ResponseWriter, *http.Request)
	PatchTaskInstance(http.ResponseWriter, *http.Request)
	SetMappedTaskInstanceNote(http.ResponseWriter, *http.Request)
	SetTaskInstanceNote(http.ResponseWriter, *http.Request)
}
// UserAPIRouter defines the required methods for binding the api requests to a responses for the UserAPI
// The UserAPIRouter implementation should parse necessary information from the http request,
// pass the data to a UserAPIServicer to perform the required actions, then write the service results to the http response.
type UserAPIRouter interface { 
	DeleteUser(http.ResponseWriter, *http.Request)
	GetUser(http.ResponseWriter, *http.Request)
	GetUsers(http.ResponseWriter, *http.Request)
	PatchUser(http.ResponseWriter, *http.Request)
	PostUser(http.ResponseWriter, *http.Request)
}
// VariableAPIRouter defines the required methods for binding the api requests to a responses for the VariableAPI
// The VariableAPIRouter implementation should parse necessary information from the http request,
// pass the data to a VariableAPIServicer to perform the required actions, then write the service results to the http response.
type VariableAPIRouter interface { 
	DeleteVariable(http.ResponseWriter, *http.Request)
	GetVariable(http.ResponseWriter, *http.Request)
	GetVariables(http.ResponseWriter, *http.Request)
	PatchVariable(http.ResponseWriter, *http.Request)
	PostVariables(http.ResponseWriter, *http.Request)
}
// XComAPIRouter defines the required methods for binding the api requests to a responses for the XComAPI
// The XComAPIRouter implementation should parse necessary information from the http request,
// pass the data to a XComAPIServicer to perform the required actions, then write the service results to the http response.
type XComAPIRouter interface { 
	GetXcomEntries(http.ResponseWriter, *http.Request)
	GetXcomEntry(http.ResponseWriter, *http.Request)
}


// ConfigAPIServicer defines the api actions for the ConfigAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ConfigAPIServicer interface { 
	GetConfig(context.Context) (ImplResponse, error)
}


// ConnectionAPIServicer defines the api actions for the ConnectionAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ConnectionAPIServicer interface { 
	DeleteConnection(context.Context, string) (ImplResponse, error)
	GetConnection(context.Context, string) (ImplResponse, error)
	GetConnections(context.Context, int32, int32, string) (ImplResponse, error)
	PatchConnection(context.Context, string, Connection, []string) (ImplResponse, error)
	PostConnection(context.Context, Connection) (ImplResponse, error)
	TestConnection(context.Context, Connection) (ImplResponse, error)
}


// DAGAPIServicer defines the api actions for the DAGAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type DAGAPIServicer interface { 
	DeleteDag(context.Context, string) (ImplResponse, error)
	GetDag(context.Context, string) (ImplResponse, error)
	GetDagDetails(context.Context, string) (ImplResponse, error)
	GetDagSource(context.Context, string) (ImplResponse, error)
	GetDags(context.Context, int32, int32, string, []string, bool, string) (ImplResponse, error)
	GetTask(context.Context, string, string) (ImplResponse, error)
	GetTasks(context.Context, string, string) (ImplResponse, error)
	PatchDag(context.Context, string, Dag, []string) (ImplResponse, error)
	PatchDags(context.Context, string, Dag, int32, int32, []string, []string, bool) (ImplResponse, error)
	PostClearTaskInstances(context.Context, string, ClearTaskInstances) (ImplResponse, error)
	PostSetTaskInstancesState(context.Context, string, UpdateTaskInstancesState) (ImplResponse, error)
}


// DAGRunAPIServicer defines the api actions for the DAGRunAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type DAGRunAPIServicer interface { 
	ClearDagRun(context.Context, string, string, ClearDagRun) (ImplResponse, error)
	DeleteDagRun(context.Context, string, string) (ImplResponse, error)
	GetDagRun(context.Context, string, string) (ImplResponse, error)
	GetDagRuns(context.Context, string, int32, int32, time.Time, time.Time, time.Time, time.Time, time.Time, time.Time, []string, string) (ImplResponse, error)
	GetDagRunsBatch(context.Context, ListDagRunsForm) (ImplResponse, error)
	GetUpstreamDatasetEvents(context.Context, string, string) (ImplResponse, error)
	PostDagRun(context.Context, string, DagRun) (ImplResponse, error)
	SetDagRunNote(context.Context, string, string, SetDagRunNote) (ImplResponse, error)
	UpdateDagRunState(context.Context, string, string, UpdateDagRunState) (ImplResponse, error)
}


// DagWarningAPIServicer defines the api actions for the DagWarningAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type DagWarningAPIServicer interface { 
	GetDagWarnings(context.Context, string, string, int32, int32, string) (ImplResponse, error)
}


// DatasetAPIServicer defines the api actions for the DatasetAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type DatasetAPIServicer interface { 
	GetDataset(context.Context, string) (ImplResponse, error)
	GetDatasetEvents(context.Context, int32, int32, string, int32, string, string, string, int32) (ImplResponse, error)
	GetDatasets(context.Context, int32, int32, string, string) (ImplResponse, error)
	GetUpstreamDatasetEvents(context.Context, string, string) (ImplResponse, error)
}


// EventLogAPIServicer defines the api actions for the EventLogAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type EventLogAPIServicer interface { 
	GetEventLog(context.Context, int32) (ImplResponse, error)
	GetEventLogs(context.Context, int32, int32, string) (ImplResponse, error)
}


// ImportErrorAPIServicer defines the api actions for the ImportErrorAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ImportErrorAPIServicer interface { 
	GetImportError(context.Context, int32) (ImplResponse, error)
	GetImportErrors(context.Context, int32, int32, string) (ImplResponse, error)
}


// MonitoringAPIServicer defines the api actions for the MonitoringAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type MonitoringAPIServicer interface { 
	GetHealth(context.Context) (ImplResponse, error)
	GetVersion(context.Context) (ImplResponse, error)
}


// PermissionAPIServicer defines the api actions for the PermissionAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PermissionAPIServicer interface { 
	GetPermissions(context.Context, int32, int32) (ImplResponse, error)
}


// PluginAPIServicer defines the api actions for the PluginAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PluginAPIServicer interface { 
	GetPlugins(context.Context, int32, int32) (ImplResponse, error)
}


// PoolAPIServicer defines the api actions for the PoolAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PoolAPIServicer interface { 
	DeletePool(context.Context, string) (ImplResponse, error)
	GetPool(context.Context, string) (ImplResponse, error)
	GetPools(context.Context, int32, int32, string) (ImplResponse, error)
	PatchPool(context.Context, string, Pool, []string) (ImplResponse, error)
	PostPool(context.Context, Pool) (ImplResponse, error)
}


// ProviderAPIServicer defines the api actions for the ProviderAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ProviderAPIServicer interface { 
	GetProviders(context.Context) (ImplResponse, error)
}


// RoleAPIServicer defines the api actions for the RoleAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type RoleAPIServicer interface { 
	DeleteRole(context.Context, string) (ImplResponse, error)
	GetRole(context.Context, string) (ImplResponse, error)
	GetRoles(context.Context, int32, int32, string) (ImplResponse, error)
	PatchRole(context.Context, string, Role, []string) (ImplResponse, error)
	PostRole(context.Context, Role) (ImplResponse, error)
}


// TaskInstanceAPIServicer defines the api actions for the TaskInstanceAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type TaskInstanceAPIServicer interface { 
	GetExtraLinks(context.Context, string, string, string) (ImplResponse, error)
	GetLog(context.Context, string, string, string, int32, bool, int32, string) (ImplResponse, error)
	GetMappedTaskInstance(context.Context, string, string, string, int32) (ImplResponse, error)
	GetMappedTaskInstances(context.Context, string, string, string, int32, int32, time.Time, time.Time, time.Time, time.Time, time.Time, time.Time, float32, float32, []string, []string, []string, string) (ImplResponse, error)
	GetTaskInstance(context.Context, string, string, string) (ImplResponse, error)
	GetTaskInstances(context.Context, string, string, time.Time, time.Time, time.Time, time.Time, time.Time, time.Time, float32, float32, []string, []string, []string, int32, int32) (ImplResponse, error)
	GetTaskInstancesBatch(context.Context, ListTaskInstanceForm) (ImplResponse, error)
	PatchMappedTaskInstance(context.Context, string, string, string, int32, UpdateTaskInstance) (ImplResponse, error)
	PatchTaskInstance(context.Context, string, string, string, UpdateTaskInstance) (ImplResponse, error)
	SetMappedTaskInstanceNote(context.Context, string, string, string, int32, SetTaskInstanceNote) (ImplResponse, error)
	SetTaskInstanceNote(context.Context, string, string, string, SetTaskInstanceNote) (ImplResponse, error)
}


// UserAPIServicer defines the api actions for the UserAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type UserAPIServicer interface { 
	DeleteUser(context.Context, string) (ImplResponse, error)
	GetUser(context.Context, string) (ImplResponse, error)
	GetUsers(context.Context, int32, int32, string) (ImplResponse, error)
	PatchUser(context.Context, string, User, []string) (ImplResponse, error)
	PostUser(context.Context, User) (ImplResponse, error)
}


// VariableAPIServicer defines the api actions for the VariableAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type VariableAPIServicer interface { 
	DeleteVariable(context.Context, string) (ImplResponse, error)
	GetVariable(context.Context, string) (ImplResponse, error)
	GetVariables(context.Context, int32, int32, string) (ImplResponse, error)
	PatchVariable(context.Context, string, Variable, []string) (ImplResponse, error)
	PostVariables(context.Context, Variable) (ImplResponse, error)
}


// XComAPIServicer defines the api actions for the XComAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type XComAPIServicer interface { 
	GetXcomEntries(context.Context, string, string, string, int32, int32) (ImplResponse, error)
	GetXcomEntry(context.Context, string, string, string, string, bool) (ImplResponse, error)
}
