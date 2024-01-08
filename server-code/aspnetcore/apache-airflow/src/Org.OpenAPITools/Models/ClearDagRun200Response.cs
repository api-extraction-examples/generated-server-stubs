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
    public partial class ClearDagRun200Response : IEquatable<ClearDagRun200Response>
    {
        /// <summary>
        /// JSON object describing additional configuration parameters.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. 
        /// </summary>
        /// <value>JSON object describing additional configuration parameters.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. </value>
        [DataMember(Name="conf", EmitDefaultValue=false)]
        public Object Conf { get; set; }

        /// <summary>
        /// Gets or Sets DagId
        /// </summary>
        [DataMember(Name="dag_id", EmitDefaultValue=false)]
        public string DagId { get; set; }

        /// <summary>
        /// Run ID.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  If not provided, a value will be generated based on execution_date.  If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error.  This together with DAG_ID are a unique key. 
        /// </summary>
        /// <value>Run ID.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  If not provided, a value will be generated based on execution_date.  If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error.  This together with DAG_ID are a unique key. </value>
        [DataMember(Name="dag_run_id", EmitDefaultValue=true)]
        public string DagRunId { get; set; }

        /// <summary>
        /// Gets or Sets DataIntervalEnd
        /// </summary>
        [DataMember(Name="data_interval_end", EmitDefaultValue=true)]
        public DateTime? DataIntervalEnd { get; set; }

        /// <summary>
        /// Gets or Sets DataIntervalStart
        /// </summary>
        [DataMember(Name="data_interval_start", EmitDefaultValue=true)]
        public DateTime? DataIntervalStart { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="end_date", EmitDefaultValue=true)]
        public DateTime? EndDate { get; set; }

        /// <summary>
        /// The execution date. This is the same as logical_date, kept for backwards compatibility. If both this field and logical_date are provided but with different values, the request will fail with an BAD_REQUEST error.  *Changed in version 2.2.0*&amp;#58; Field becomes nullable.  *Deprecated since version 2.2.0*&amp;#58; Use &#39;logical_date&#39; instead. 
        /// </summary>
        /// <value>The execution date. This is the same as logical_date, kept for backwards compatibility. If both this field and logical_date are provided but with different values, the request will fail with an BAD_REQUEST error.  *Changed in version 2.2.0*&amp;#58; Field becomes nullable.  *Deprecated since version 2.2.0*&amp;#58; Use &#39;logical_date&#39; instead. </value>
        [DataMember(Name="execution_date", EmitDefaultValue=true)]
        public DateTime? ExecutionDate { get; set; }

        /// <summary>
        /// Gets or Sets ExternalTrigger
        /// </summary>
        [DataMember(Name="external_trigger", EmitDefaultValue=true)]
        public bool ExternalTrigger { get; set; } = true;

        /// <summary>
        /// Gets or Sets LastSchedulingDecision
        /// </summary>
        [DataMember(Name="last_scheduling_decision", EmitDefaultValue=true)]
        public DateTime? LastSchedulingDecision { get; set; }

        /// <summary>
        /// The logical date (previously called execution date). This is the time or interval covered by this DAG run, according to the DAG definition.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  This together with DAG_ID are a unique key.  *New in version 2.2.0* 
        /// </summary>
        /// <value>The logical date (previously called execution date). This is the time or interval covered by this DAG run, according to the DAG definition.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  This together with DAG_ID are a unique key.  *New in version 2.2.0* </value>
        [DataMember(Name="logical_date", EmitDefaultValue=true)]
        public DateTime? LogicalDate { get; set; }

        /// <summary>
        /// Contains manually entered notes by the user about the DagRun.  *New in version 2.5.0* 
        /// </summary>
        /// <value>Contains manually entered notes by the user about the DagRun.  *New in version 2.5.0* </value>
        [DataMember(Name="note", EmitDefaultValue=true)]
        public string Note { get; set; }


        /// <summary>
        /// Gets or Sets RunType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<RunTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum RunTypeEnum
        {
            
            /// <summary>
            /// Enum BackfillEnum for backfill
            /// </summary>
            [EnumMember(Value = "backfill")]
            BackfillEnum = 1,
            
            /// <summary>
            /// Enum ManualEnum for manual
            /// </summary>
            [EnumMember(Value = "manual")]
            ManualEnum = 2,
            
            /// <summary>
            /// Enum ScheduledEnum for scheduled
            /// </summary>
            [EnumMember(Value = "scheduled")]
            ScheduledEnum = 3,
            
            /// <summary>
            /// Enum DatasetTriggeredEnum for dataset_triggered
            /// </summary>
            [EnumMember(Value = "dataset_triggered")]
            DatasetTriggeredEnum = 4
        }

        /// <summary>
        /// Gets or Sets RunType
        /// </summary>
        [DataMember(Name="run_type", EmitDefaultValue=true)]
        public RunTypeEnum RunType { get; set; }

        /// <summary>
        /// The start time. The time when DAG run was actually created.  *Changed in version 2.1.3*&amp;#58; Field becomes nullable. 
        /// </summary>
        /// <value>The start time. The time when DAG run was actually created.  *Changed in version 2.1.3*&amp;#58; Field becomes nullable. </value>
        [DataMember(Name="start_date", EmitDefaultValue=true)]
        public DateTime? StartDate { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=true)]
        public DagState State { get; set; }

        /// <summary>
        /// Gets or Sets TaskInstances
        /// </summary>
        [DataMember(Name="task_instances", EmitDefaultValue=false)]
        public List<TaskInstance> TaskInstances { get; set; }

        /// <summary>
        /// Count of total objects in the current result set before pagination parameters (limit, offset) are applied. 
        /// </summary>
        /// <value>Count of total objects in the current result set before pagination parameters (limit, offset) are applied. </value>
        [DataMember(Name="total_entries", EmitDefaultValue=true)]
        public int TotalEntries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClearDagRun200Response {\n");
            sb.Append("  Conf: ").Append(Conf).Append("\n");
            sb.Append("  DagId: ").Append(DagId).Append("\n");
            sb.Append("  DagRunId: ").Append(DagRunId).Append("\n");
            sb.Append("  DataIntervalEnd: ").Append(DataIntervalEnd).Append("\n");
            sb.Append("  DataIntervalStart: ").Append(DataIntervalStart).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  ExecutionDate: ").Append(ExecutionDate).Append("\n");
            sb.Append("  ExternalTrigger: ").Append(ExternalTrigger).Append("\n");
            sb.Append("  LastSchedulingDecision: ").Append(LastSchedulingDecision).Append("\n");
            sb.Append("  LogicalDate: ").Append(LogicalDate).Append("\n");
            sb.Append("  Note: ").Append(Note).Append("\n");
            sb.Append("  RunType: ").Append(RunType).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  TaskInstances: ").Append(TaskInstances).Append("\n");
            sb.Append("  TotalEntries: ").Append(TotalEntries).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ClearDagRun200Response)obj);
        }

        /// <summary>
        /// Returns true if ClearDagRun200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of ClearDagRun200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClearDagRun200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Conf == other.Conf ||
                    Conf != null &&
                    Conf.Equals(other.Conf)
                ) && 
                (
                    DagId == other.DagId ||
                    DagId != null &&
                    DagId.Equals(other.DagId)
                ) && 
                (
                    DagRunId == other.DagRunId ||
                    DagRunId != null &&
                    DagRunId.Equals(other.DagRunId)
                ) && 
                (
                    DataIntervalEnd == other.DataIntervalEnd ||
                    DataIntervalEnd != null &&
                    DataIntervalEnd.Equals(other.DataIntervalEnd)
                ) && 
                (
                    DataIntervalStart == other.DataIntervalStart ||
                    DataIntervalStart != null &&
                    DataIntervalStart.Equals(other.DataIntervalStart)
                ) && 
                (
                    EndDate == other.EndDate ||
                    EndDate != null &&
                    EndDate.Equals(other.EndDate)
                ) && 
                (
                    ExecutionDate == other.ExecutionDate ||
                    ExecutionDate != null &&
                    ExecutionDate.Equals(other.ExecutionDate)
                ) && 
                (
                    ExternalTrigger == other.ExternalTrigger ||
                    
                    ExternalTrigger.Equals(other.ExternalTrigger)
                ) && 
                (
                    LastSchedulingDecision == other.LastSchedulingDecision ||
                    LastSchedulingDecision != null &&
                    LastSchedulingDecision.Equals(other.LastSchedulingDecision)
                ) && 
                (
                    LogicalDate == other.LogicalDate ||
                    LogicalDate != null &&
                    LogicalDate.Equals(other.LogicalDate)
                ) && 
                (
                    Note == other.Note ||
                    Note != null &&
                    Note.Equals(other.Note)
                ) && 
                (
                    RunType == other.RunType ||
                    
                    RunType.Equals(other.RunType)
                ) && 
                (
                    StartDate == other.StartDate ||
                    StartDate != null &&
                    StartDate.Equals(other.StartDate)
                ) && 
                (
                    State == other.State ||
                    
                    State.Equals(other.State)
                ) && 
                (
                    TaskInstances == other.TaskInstances ||
                    TaskInstances != null &&
                    other.TaskInstances != null &&
                    TaskInstances.SequenceEqual(other.TaskInstances)
                ) && 
                (
                    TotalEntries == other.TotalEntries ||
                    
                    TotalEntries.Equals(other.TotalEntries)
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
                    if (Conf != null)
                    hashCode = hashCode * 59 + Conf.GetHashCode();
                    if (DagId != null)
                    hashCode = hashCode * 59 + DagId.GetHashCode();
                    if (DagRunId != null)
                    hashCode = hashCode * 59 + DagRunId.GetHashCode();
                    if (DataIntervalEnd != null)
                    hashCode = hashCode * 59 + DataIntervalEnd.GetHashCode();
                    if (DataIntervalStart != null)
                    hashCode = hashCode * 59 + DataIntervalStart.GetHashCode();
                    if (EndDate != null)
                    hashCode = hashCode * 59 + EndDate.GetHashCode();
                    if (ExecutionDate != null)
                    hashCode = hashCode * 59 + ExecutionDate.GetHashCode();
                    
                    hashCode = hashCode * 59 + ExternalTrigger.GetHashCode();
                    if (LastSchedulingDecision != null)
                    hashCode = hashCode * 59 + LastSchedulingDecision.GetHashCode();
                    if (LogicalDate != null)
                    hashCode = hashCode * 59 + LogicalDate.GetHashCode();
                    if (Note != null)
                    hashCode = hashCode * 59 + Note.GetHashCode();
                    
                    hashCode = hashCode * 59 + RunType.GetHashCode();
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                    
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (TaskInstances != null)
                    hashCode = hashCode * 59 + TaskInstances.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalEntries.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ClearDagRun200Response left, ClearDagRun200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ClearDagRun200Response left, ClearDagRun200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
