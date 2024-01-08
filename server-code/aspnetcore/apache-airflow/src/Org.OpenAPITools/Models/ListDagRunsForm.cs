/*
 * Airflow API (Stable)
 *
 * # Overview  To facilitate management, Apache Airflow supports a range of REST API endpoints across its objects. This section provides an overview of the API design, methods, and supported use cases.  Most of the endpoints accept `JSON` as input and return `JSON` responses. This means that you must usually add the following headers to your request: ``` Content-type: application/json Accept: application/json ```  ## Resources  The term `resource` refers to a single type of object in the Airflow metadata. An API is broken up by its endpoint's corresponding resource. The name of a resource is typically plural and expressed in camelCase. Example: `dagRuns`.  Resource names are used as part of endpoint URLs, as well as in API parameters and responses.  ## CRUD Operations  The platform supports **C**reate, **R**ead, **U**pdate, and **D**elete operations on most resources. You can review the standards for these operations and their standard parameters below.  Some endpoints have special behavior as exceptions.  ### Create  To create a resource, you typically submit an HTTP `POST` request with the resource's required metadata in the request body. The response returns a `201 Created` response code upon success with the resource's metadata, including its internal `id`, in the response body.  ### Read  The HTTP `GET` request can be used to read a resource or to list a number of resources.  A resource's `id` can be submitted in the request parameters to read a specific resource. The response usually returns a `200 OK` response code upon success, with the resource's metadata in the response body.  If a `GET` request does not include a specific resource `id`, it is treated as a list request. The response usually returns a `200 OK` response code upon success, with an object containing a list of resources' metadata in the response body.  When reading resources, some common query parameters are usually available. e.g.: ``` v1/connections?limit=25&offset=25 ```  |Query Parameter|Type|Description| |- -- -- -- -- -- -- --|- -- -|- -- -- -- -- --| |limit|integer|Maximum number of objects to fetch. Usually 25 by default| |offset|integer|Offset after which to start returning objects. For use with limit query parameter.|  ### Update  Updating a resource requires the resource `id`, and is typically done using an HTTP `PATCH` request, with the fields to modify in the request body. The response usually returns a `200 OK` response code upon success, with information about the modified resource in the response body.  ### Delete  Deleting a resource requires the resource `id` and is typically executing via an HTTP `DELETE` request. The response usually returns a `204 No Content` response code upon success.  ## Conventions  - Resource names are plural and expressed in camelCase. - Names are consistent between URL parameter name and field name.  - Field names are in snake_case. ```json {     \"name\": \"string\",     \"slots\": 0,     \"occupied_slots\": 0,     \"used_slots\": 0,     \"queued_slots\": 0,     \"open_slots\": 0 } ```  ### Update Mask  Update mask is available as a query parameter in patch endpoints. It is used to notify the API which fields you want to update. Using `update_mask` makes it easier to update objects by helping the server know which fields to update in an object instead of updating all fields. The update request ignores any fields that aren't specified in the field mask, leaving them with their current values.  Example: ```   resource = request.get('/resource/my-id').json()   resource['my_field'] = 'new-value'   request.patch('/resource/my-id?update_mask=my_field', data=json.dumps(resource)) ```  ## Versioning and Endpoint Lifecycle  - API versioning is not synchronized to specific releases of the Apache Airflow. - APIs are designed to be backward compatible. - Any changes to the API will first go through a deprecation phase.  # Trying the API  You can use a third party client, such as [curl](https://curl.haxx.se/), [HTTPie](https://httpie.org/), [Postman](https://www.postman.com/) or [the Insomnia rest client](https://insomnia.rest/) to test the Apache Airflow API.  Note that you will need to pass credentials data.  For e.g., here is how to pause a DAG with [curl](https://curl.haxx.se/), when basic authorization is used: ```bash curl -X PATCH 'https://example.com/api/v1/dags/{dag_id}?update_mask=is_paused' \\ -H 'Content-Type: application/json' \\ - -user \"username:password\" \\ -d '{     \"is_paused\": true }' ```  Using a graphical tool such as [Postman](https://www.postman.com/) or [Insomnia](https://insomnia.rest/), it is possible to import the API specifications directly:  1. Download the API specification by clicking the **Download** button at top of this document 2. Import the JSON specification in the graphical tool of your choice.   - In *Postman*, you can click the **import** button at the top   - With *Insomnia*, you can just drag-and-drop the file on the UI  Note that with *Postman*, you can also generate code snippets by selecting a request and clicking on the **Code** button.  ## Enabling CORS  [Cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) is a browser security feature that restricts HTTP requests that are initiated from scripts running in the browser.  For details on enabling/configuring CORS, see [Enabling CORS](https://airflow.apache.org/docs/apache-airflow/stable/security/api.html).  # Authentication  To be able to meet the requirements of many organizations, Airflow supports many authentication methods, and it is even possible to add your own method.  If you want to check which auth backend is currently set, you can use `airflow config get-value api auth_backends` command as in the example below. ```bash $ airflow config get-value api auth_backends airflow.api.auth.backend.basic_auth ``` The default is to deny all requests.  For details on configuring the authentication, see [API Authorization](https://airflow.apache.org/docs/apache-airflow/stable/security/api.html).  # Errors  We follow the error response format proposed in [RFC 7807](https://tools.ietf.org/html/rfc7807) also known as Problem Details for HTTP APIs. As with our normal API responses, your client must be prepared to gracefully handle additional members of the response.  ## Unauthenticated  This indicates that the request has not been applied because it lacks valid authentication credentials for the target resource. Please check that you have valid credentials.  ## PermissionDenied  This response means that the server understood the request but refuses to authorize it because it lacks sufficient rights to the resource. It happens when you do not have the necessary permission to execute the action you performed. You need to get the appropriate permissions in other to resolve this error.  ## BadRequest  This response means that the server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). To resolve this, please ensure that your syntax is correct.  ## NotFound  This client error response indicates that the server cannot find the requested resource.  ## MethodNotAllowed  Indicates that the request method is known by the server but is not supported by the target resource.  ## NotAcceptable  The target resource does not have a current representation that would be acceptable to the user agent, according to the proactive negotiation header fields received in the request, and the server is unwilling to supply a default representation.  ## AlreadyExists  The request could not be completed due to a conflict with the current state of the target resource, e.g. the resource it tries to create already exists.  ## Unknown  This means that the server encountered an unexpected condition that prevented it from fulfilling the request. 
 *
 * The version of the OpenAPI document: 2.5.3
 * Contact: dev@airflow.apache.org
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class ListDagRunsForm : IEquatable<ListDagRunsForm>
    {
        /// <summary>
        /// Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).
        /// </summary>
        /// <value>Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).</value>
        [DataMember(Name="dag_ids", EmitDefaultValue=false)]
        public List<string> DagIds { get; set; }

        /// <summary>
        /// Returns objects greater or equal the specified date.  This can be combined with end_date_lte parameter to receive only the selected period. 
        /// </summary>
        /// <value>Returns objects greater or equal the specified date.  This can be combined with end_date_lte parameter to receive only the selected period. </value>
        [DataMember(Name="end_date_gte", EmitDefaultValue=false)]
        public DateTime EndDateGte { get; set; }

        /// <summary>
        /// Returns objects less than or equal to the specified date.  This can be combined with end_date_gte parameter to receive only the selected period. 
        /// </summary>
        /// <value>Returns objects less than or equal to the specified date.  This can be combined with end_date_gte parameter to receive only the selected period. </value>
        [DataMember(Name="end_date_lte", EmitDefaultValue=false)]
        public DateTime EndDateLte { get; set; }

        /// <summary>
        /// Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte key to receive only the selected period. 
        /// </summary>
        /// <value>Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte key to receive only the selected period. </value>
        [DataMember(Name="execution_date_gte", EmitDefaultValue=false)]
        public DateTime ExecutionDateGte { get; set; }

        /// <summary>
        /// Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte key to receive only the selected period. 
        /// </summary>
        /// <value>Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte key to receive only the selected period. </value>
        [DataMember(Name="execution_date_lte", EmitDefaultValue=false)]
        public DateTime ExecutionDateLte { get; set; }

        /// <summary>
        /// The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
        /// </summary>
        /// <value>The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* </value>
        [DataMember(Name="order_by", EmitDefaultValue=false)]
        public string OrderBy { get; set; }

        /// <summary>
        /// The numbers of items to return.
        /// </summary>
        /// <value>The numbers of items to return.</value>
        [DataMember(Name="page_limit", EmitDefaultValue=true)]
        public int PageLimit { get; set; } = 100;

        /// <summary>
        /// The number of items to skip before starting to collect the result set.
        /// </summary>
        /// <value>The number of items to skip before starting to collect the result set.</value>
        [DataMember(Name="page_offset", EmitDefaultValue=true)]
        public int PageOffset { get; set; }

        /// <summary>
        /// Returns objects greater or equal the specified date.  This can be combined with start_date_lte key to receive only the selected period. 
        /// </summary>
        /// <value>Returns objects greater or equal the specified date.  This can be combined with start_date_lte key to receive only the selected period. </value>
        [DataMember(Name="start_date_gte", EmitDefaultValue=false)]
        public DateTime StartDateGte { get; set; }

        /// <summary>
        /// Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period 
        /// </summary>
        /// <value>Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period </value>
        [DataMember(Name="start_date_lte", EmitDefaultValue=false)]
        public DateTime StartDateLte { get; set; }

        /// <summary>
        /// Return objects with specific states. The value can be repeated to retrieve multiple matching values (OR condition).
        /// </summary>
        /// <value>Return objects with specific states. The value can be repeated to retrieve multiple matching values (OR condition).</value>
        [DataMember(Name="states", EmitDefaultValue=false)]
        public List<string> States { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ListDagRunsForm {\n");
            sb.Append("  DagIds: ").Append(DagIds).Append("\n");
            sb.Append("  EndDateGte: ").Append(EndDateGte).Append("\n");
            sb.Append("  EndDateLte: ").Append(EndDateLte).Append("\n");
            sb.Append("  ExecutionDateGte: ").Append(ExecutionDateGte).Append("\n");
            sb.Append("  ExecutionDateLte: ").Append(ExecutionDateLte).Append("\n");
            sb.Append("  OrderBy: ").Append(OrderBy).Append("\n");
            sb.Append("  PageLimit: ").Append(PageLimit).Append("\n");
            sb.Append("  PageOffset: ").Append(PageOffset).Append("\n");
            sb.Append("  StartDateGte: ").Append(StartDateGte).Append("\n");
            sb.Append("  StartDateLte: ").Append(StartDateLte).Append("\n");
            sb.Append("  States: ").Append(States).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((ListDagRunsForm)obj);
        }

        /// <summary>
        /// Returns true if ListDagRunsForm instances are equal
        /// </summary>
        /// <param name="other">Instance of ListDagRunsForm to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListDagRunsForm other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DagIds == other.DagIds ||
                    DagIds != null &&
                    other.DagIds != null &&
                    DagIds.SequenceEqual(other.DagIds)
                ) && 
                (
                    EndDateGte == other.EndDateGte ||
                    EndDateGte != null &&
                    EndDateGte.Equals(other.EndDateGte)
                ) && 
                (
                    EndDateLte == other.EndDateLte ||
                    EndDateLte != null &&
                    EndDateLte.Equals(other.EndDateLte)
                ) && 
                (
                    ExecutionDateGte == other.ExecutionDateGte ||
                    ExecutionDateGte != null &&
                    ExecutionDateGte.Equals(other.ExecutionDateGte)
                ) && 
                (
                    ExecutionDateLte == other.ExecutionDateLte ||
                    ExecutionDateLte != null &&
                    ExecutionDateLte.Equals(other.ExecutionDateLte)
                ) && 
                (
                    OrderBy == other.OrderBy ||
                    OrderBy != null &&
                    OrderBy.Equals(other.OrderBy)
                ) && 
                (
                    PageLimit == other.PageLimit ||
                    
                    PageLimit.Equals(other.PageLimit)
                ) && 
                (
                    PageOffset == other.PageOffset ||
                    
                    PageOffset.Equals(other.PageOffset)
                ) && 
                (
                    StartDateGte == other.StartDateGte ||
                    StartDateGte != null &&
                    StartDateGte.Equals(other.StartDateGte)
                ) && 
                (
                    StartDateLte == other.StartDateLte ||
                    StartDateLte != null &&
                    StartDateLte.Equals(other.StartDateLte)
                ) && 
                (
                    States == other.States ||
                    States != null &&
                    other.States != null &&
                    States.SequenceEqual(other.States)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (DagIds != null)
                    hashCode = hashCode * 59 + DagIds.GetHashCode();
                    if (EndDateGte != null)
                    hashCode = hashCode * 59 + EndDateGte.GetHashCode();
                    if (EndDateLte != null)
                    hashCode = hashCode * 59 + EndDateLte.GetHashCode();
                    if (ExecutionDateGte != null)
                    hashCode = hashCode * 59 + ExecutionDateGte.GetHashCode();
                    if (ExecutionDateLte != null)
                    hashCode = hashCode * 59 + ExecutionDateLte.GetHashCode();
                    if (OrderBy != null)
                    hashCode = hashCode * 59 + OrderBy.GetHashCode();
                    
                    hashCode = hashCode * 59 + PageLimit.GetHashCode();
                    
                    hashCode = hashCode * 59 + PageOffset.GetHashCode();
                    if (StartDateGte != null)
                    hashCode = hashCode * 59 + StartDateGte.GetHashCode();
                    if (StartDateLte != null)
                    hashCode = hashCode * 59 + StartDateLte.GetHashCode();
                    if (States != null)
                    hashCode = hashCode * 59 + States.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ListDagRunsForm left, ListDagRunsForm right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ListDagRunsForm left, ListDagRunsForm right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
