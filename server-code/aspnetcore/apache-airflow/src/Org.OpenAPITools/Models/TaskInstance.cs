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
    public partial class TaskInstance : IEquatable<TaskInstance>
    {
        /// <summary>
        /// Gets or Sets DagId
        /// </summary>
        [DataMember(Name="dag_id", EmitDefaultValue=false)]
        public string DagId { get; set; }

        /// <summary>
        /// The DagRun ID for this task instance  *New in version 2.3.0* 
        /// </summary>
        /// <value>The DagRun ID for this task instance  *New in version 2.3.0* </value>
        [DataMember(Name="dag_run_id", EmitDefaultValue=false)]
        public string DagRunId { get; set; }

        /// <summary>
        /// Gets or Sets Duration
        /// </summary>
        [DataMember(Name="duration", EmitDefaultValue=true)]
        public decimal? Duration { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="end_date", EmitDefaultValue=true)]
        public string EndDate { get; set; }

        /// <summary>
        /// Gets or Sets ExecutionDate
        /// </summary>
        [DataMember(Name="execution_date", EmitDefaultValue=false)]
        public string ExecutionDate { get; set; }

        /// <summary>
        /// Gets or Sets ExecutorConfig
        /// </summary>
        [DataMember(Name="executor_config", EmitDefaultValue=false)]
        public string ExecutorConfig { get; set; }

        /// <summary>
        /// Gets or Sets Hostname
        /// </summary>
        [DataMember(Name="hostname", EmitDefaultValue=false)]
        public string Hostname { get; set; }

        /// <summary>
        /// Gets or Sets MapIndex
        /// </summary>
        [DataMember(Name="map_index", EmitDefaultValue=true)]
        public int MapIndex { get; set; }

        /// <summary>
        /// Gets or Sets MaxTries
        /// </summary>
        [DataMember(Name="max_tries", EmitDefaultValue=true)]
        public int MaxTries { get; set; }

        /// <summary>
        /// Contains manually entered notes by the user about the TaskInstance.  *New in version 2.5.0* 
        /// </summary>
        /// <value>Contains manually entered notes by the user about the TaskInstance.  *New in version 2.5.0* </value>
        [DataMember(Name="note", EmitDefaultValue=true)]
        public string Note { get; set; }

        /// <summary>
        /// *Changed in version 2.1.1*&amp;#58; Field becomes nullable. 
        /// </summary>
        /// <value>*Changed in version 2.1.1*&amp;#58; Field becomes nullable. </value>
        [DataMember(Name="operator", EmitDefaultValue=true)]
        public string VarOperator { get; set; }

        /// <summary>
        /// Gets or Sets Pid
        /// </summary>
        [DataMember(Name="pid", EmitDefaultValue=true)]
        public int? Pid { get; set; }

        /// <summary>
        /// Gets or Sets Pool
        /// </summary>
        [DataMember(Name="pool", EmitDefaultValue=false)]
        public string Pool { get; set; }

        /// <summary>
        /// Gets or Sets PoolSlots
        /// </summary>
        [DataMember(Name="pool_slots", EmitDefaultValue=true)]
        public int PoolSlots { get; set; }

        /// <summary>
        /// Gets or Sets PriorityWeight
        /// </summary>
        [DataMember(Name="priority_weight", EmitDefaultValue=true)]
        public int? PriorityWeight { get; set; }

        /// <summary>
        /// Gets or Sets Queue
        /// </summary>
        [DataMember(Name="queue", EmitDefaultValue=true)]
        public string Queue { get; set; }

        /// <summary>
        /// Gets or Sets QueuedWhen
        /// </summary>
        [DataMember(Name="queued_when", EmitDefaultValue=true)]
        public string QueuedWhen { get; set; }

        /// <summary>
        /// JSON object describing rendered fields.  *New in version 2.3.0* 
        /// </summary>
        /// <value>JSON object describing rendered fields.  *New in version 2.3.0* </value>
        [DataMember(Name="rendered_fields", EmitDefaultValue=false)]
        public Object RenderedFields { get; set; }

        /// <summary>
        /// Gets or Sets SlaMiss
        /// </summary>
        [DataMember(Name="sla_miss", EmitDefaultValue=true)]
        public SLAMiss SlaMiss { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="start_date", EmitDefaultValue=true)]
        public string StartDate { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=true)]
        public TaskState State { get; set; }

        /// <summary>
        /// Gets or Sets TaskId
        /// </summary>
        [DataMember(Name="task_id", EmitDefaultValue=false)]
        public string TaskId { get; set; }

        /// <summary>
        /// Gets or Sets Trigger
        /// </summary>
        [DataMember(Name="trigger", EmitDefaultValue=false)]
        public Trigger Trigger { get; set; }

        /// <summary>
        /// Gets or Sets TriggererJob
        /// </summary>
        [DataMember(Name="triggerer_job", EmitDefaultValue=false)]
        public Job TriggererJob { get; set; }

        /// <summary>
        /// Gets or Sets TryNumber
        /// </summary>
        [DataMember(Name="try_number", EmitDefaultValue=true)]
        public int TryNumber { get; set; }

        /// <summary>
        /// Gets or Sets Unixname
        /// </summary>
        [DataMember(Name="unixname", EmitDefaultValue=false)]
        public string Unixname { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TaskInstance {\n");
            sb.Append("  DagId: ").Append(DagId).Append("\n");
            sb.Append("  DagRunId: ").Append(DagRunId).Append("\n");
            sb.Append("  Duration: ").Append(Duration).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  ExecutionDate: ").Append(ExecutionDate).Append("\n");
            sb.Append("  ExecutorConfig: ").Append(ExecutorConfig).Append("\n");
            sb.Append("  Hostname: ").Append(Hostname).Append("\n");
            sb.Append("  MapIndex: ").Append(MapIndex).Append("\n");
            sb.Append("  MaxTries: ").Append(MaxTries).Append("\n");
            sb.Append("  Note: ").Append(Note).Append("\n");
            sb.Append("  VarOperator: ").Append(VarOperator).Append("\n");
            sb.Append("  Pid: ").Append(Pid).Append("\n");
            sb.Append("  Pool: ").Append(Pool).Append("\n");
            sb.Append("  PoolSlots: ").Append(PoolSlots).Append("\n");
            sb.Append("  PriorityWeight: ").Append(PriorityWeight).Append("\n");
            sb.Append("  Queue: ").Append(Queue).Append("\n");
            sb.Append("  QueuedWhen: ").Append(QueuedWhen).Append("\n");
            sb.Append("  RenderedFields: ").Append(RenderedFields).Append("\n");
            sb.Append("  SlaMiss: ").Append(SlaMiss).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  Trigger: ").Append(Trigger).Append("\n");
            sb.Append("  TriggererJob: ").Append(TriggererJob).Append("\n");
            sb.Append("  TryNumber: ").Append(TryNumber).Append("\n");
            sb.Append("  Unixname: ").Append(Unixname).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TaskInstance)obj);
        }

        /// <summary>
        /// Returns true if TaskInstance instances are equal
        /// </summary>
        /// <param name="other">Instance of TaskInstance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TaskInstance other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
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
                    Duration == other.Duration ||
                    Duration != null &&
                    Duration.Equals(other.Duration)
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
                    ExecutorConfig == other.ExecutorConfig ||
                    ExecutorConfig != null &&
                    ExecutorConfig.Equals(other.ExecutorConfig)
                ) && 
                (
                    Hostname == other.Hostname ||
                    Hostname != null &&
                    Hostname.Equals(other.Hostname)
                ) && 
                (
                    MapIndex == other.MapIndex ||
                    
                    MapIndex.Equals(other.MapIndex)
                ) && 
                (
                    MaxTries == other.MaxTries ||
                    
                    MaxTries.Equals(other.MaxTries)
                ) && 
                (
                    Note == other.Note ||
                    Note != null &&
                    Note.Equals(other.Note)
                ) && 
                (
                    VarOperator == other.VarOperator ||
                    VarOperator != null &&
                    VarOperator.Equals(other.VarOperator)
                ) && 
                (
                    Pid == other.Pid ||
                    Pid != null &&
                    Pid.Equals(other.Pid)
                ) && 
                (
                    Pool == other.Pool ||
                    Pool != null &&
                    Pool.Equals(other.Pool)
                ) && 
                (
                    PoolSlots == other.PoolSlots ||
                    
                    PoolSlots.Equals(other.PoolSlots)
                ) && 
                (
                    PriorityWeight == other.PriorityWeight ||
                    PriorityWeight != null &&
                    PriorityWeight.Equals(other.PriorityWeight)
                ) && 
                (
                    Queue == other.Queue ||
                    Queue != null &&
                    Queue.Equals(other.Queue)
                ) && 
                (
                    QueuedWhen == other.QueuedWhen ||
                    QueuedWhen != null &&
                    QueuedWhen.Equals(other.QueuedWhen)
                ) && 
                (
                    RenderedFields == other.RenderedFields ||
                    RenderedFields != null &&
                    RenderedFields.Equals(other.RenderedFields)
                ) && 
                (
                    SlaMiss == other.SlaMiss ||
                    SlaMiss != null &&
                    SlaMiss.Equals(other.SlaMiss)
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
                    TaskId == other.TaskId ||
                    TaskId != null &&
                    TaskId.Equals(other.TaskId)
                ) && 
                (
                    Trigger == other.Trigger ||
                    Trigger != null &&
                    Trigger.Equals(other.Trigger)
                ) && 
                (
                    TriggererJob == other.TriggererJob ||
                    TriggererJob != null &&
                    TriggererJob.Equals(other.TriggererJob)
                ) && 
                (
                    TryNumber == other.TryNumber ||
                    
                    TryNumber.Equals(other.TryNumber)
                ) && 
                (
                    Unixname == other.Unixname ||
                    Unixname != null &&
                    Unixname.Equals(other.Unixname)
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
                    if (DagId != null)
                    hashCode = hashCode * 59 + DagId.GetHashCode();
                    if (DagRunId != null)
                    hashCode = hashCode * 59 + DagRunId.GetHashCode();
                    if (Duration != null)
                    hashCode = hashCode * 59 + Duration.GetHashCode();
                    if (EndDate != null)
                    hashCode = hashCode * 59 + EndDate.GetHashCode();
                    if (ExecutionDate != null)
                    hashCode = hashCode * 59 + ExecutionDate.GetHashCode();
                    if (ExecutorConfig != null)
                    hashCode = hashCode * 59 + ExecutorConfig.GetHashCode();
                    if (Hostname != null)
                    hashCode = hashCode * 59 + Hostname.GetHashCode();
                    
                    hashCode = hashCode * 59 + MapIndex.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxTries.GetHashCode();
                    if (Note != null)
                    hashCode = hashCode * 59 + Note.GetHashCode();
                    if (VarOperator != null)
                    hashCode = hashCode * 59 + VarOperator.GetHashCode();
                    if (Pid != null)
                    hashCode = hashCode * 59 + Pid.GetHashCode();
                    if (Pool != null)
                    hashCode = hashCode * 59 + Pool.GetHashCode();
                    
                    hashCode = hashCode * 59 + PoolSlots.GetHashCode();
                    if (PriorityWeight != null)
                    hashCode = hashCode * 59 + PriorityWeight.GetHashCode();
                    if (Queue != null)
                    hashCode = hashCode * 59 + Queue.GetHashCode();
                    if (QueuedWhen != null)
                    hashCode = hashCode * 59 + QueuedWhen.GetHashCode();
                    if (RenderedFields != null)
                    hashCode = hashCode * 59 + RenderedFields.GetHashCode();
                    if (SlaMiss != null)
                    hashCode = hashCode * 59 + SlaMiss.GetHashCode();
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                    
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (TaskId != null)
                    hashCode = hashCode * 59 + TaskId.GetHashCode();
                    if (Trigger != null)
                    hashCode = hashCode * 59 + Trigger.GetHashCode();
                    if (TriggererJob != null)
                    hashCode = hashCode * 59 + TriggererJob.GetHashCode();
                    
                    hashCode = hashCode * 59 + TryNumber.GetHashCode();
                    if (Unixname != null)
                    hashCode = hashCode * 59 + Unixname.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TaskInstance left, TaskInstance right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TaskInstance left, TaskInstance right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
