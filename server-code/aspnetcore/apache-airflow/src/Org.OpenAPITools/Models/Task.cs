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
    /// For details see: [airflow.models.BaseOperator](https://airflow.apache.org/docs/apache-airflow/stable/_api/airflow/models/index.html#airflow.models.BaseOperator) 
    /// </summary>
    [DataContract]
    public partial class Task : IEquatable<Task>
    {
        /// <summary>
        /// Gets or Sets ClassRef
        /// </summary>
        [DataMember(Name="class_ref", EmitDefaultValue=false)]
        public ClassReference ClassRef { get; set; }

        /// <summary>
        /// Gets or Sets DependsOnPast
        /// </summary>
        [DataMember(Name="depends_on_past", EmitDefaultValue=true)]
        public bool DependsOnPast { get; set; }

        /// <summary>
        /// Gets or Sets DownstreamTaskIds
        /// </summary>
        [DataMember(Name="downstream_task_ids", EmitDefaultValue=false)]
        public List<string> DownstreamTaskIds { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="end_date", EmitDefaultValue=true)]
        public DateTime? EndDate { get; set; }

        /// <summary>
        /// Gets or Sets ExecutionTimeout
        /// </summary>
        [DataMember(Name="execution_timeout", EmitDefaultValue=false)]
        public TimeDelta ExecutionTimeout { get; set; }

        /// <summary>
        /// Gets or Sets ExtraLinks
        /// </summary>
        [DataMember(Name="extra_links", EmitDefaultValue=false)]
        public List<TaskExtraLinksInner> ExtraLinks { get; set; }

        /// <summary>
        /// Gets or Sets IsMapped
        /// </summary>
        [DataMember(Name="is_mapped", EmitDefaultValue=true)]
        public bool IsMapped { get; set; }

        /// <summary>
        /// Gets or Sets Owner
        /// </summary>
        [DataMember(Name="owner", EmitDefaultValue=false)]
        public string Owner { get; set; }

        /// <summary>
        /// Gets or Sets Pool
        /// </summary>
        [DataMember(Name="pool", EmitDefaultValue=false)]
        public string Pool { get; set; }

        /// <summary>
        /// Gets or Sets PoolSlots
        /// </summary>
        [DataMember(Name="pool_slots", EmitDefaultValue=true)]
        public decimal PoolSlots { get; set; }

        /// <summary>
        /// Gets or Sets PriorityWeight
        /// </summary>
        [DataMember(Name="priority_weight", EmitDefaultValue=true)]
        public decimal PriorityWeight { get; set; }

        /// <summary>
        /// Gets or Sets Queue
        /// </summary>
        [DataMember(Name="queue", EmitDefaultValue=true)]
        public string Queue { get; set; }

        /// <summary>
        /// Gets or Sets Retries
        /// </summary>
        [DataMember(Name="retries", EmitDefaultValue=true)]
        public decimal Retries { get; set; }

        /// <summary>
        /// Gets or Sets RetryDelay
        /// </summary>
        [DataMember(Name="retry_delay", EmitDefaultValue=false)]
        public TimeDelta RetryDelay { get; set; }

        /// <summary>
        /// Gets or Sets RetryExponentialBackoff
        /// </summary>
        [DataMember(Name="retry_exponential_backoff", EmitDefaultValue=true)]
        public bool RetryExponentialBackoff { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="start_date", EmitDefaultValue=false)]
        public DateTime StartDate { get; set; }

        /// <summary>
        /// Gets or Sets SubDag
        /// </summary>
        [DataMember(Name="sub_dag", EmitDefaultValue=false)]
        public DAG SubDag { get; set; }

        /// <summary>
        /// Gets or Sets TaskId
        /// </summary>
        [DataMember(Name="task_id", EmitDefaultValue=false)]
        public string TaskId { get; set; }

        /// <summary>
        /// Gets or Sets TemplateFields
        /// </summary>
        [DataMember(Name="template_fields", EmitDefaultValue=false)]
        public List<string> TemplateFields { get; set; }

        /// <summary>
        /// Gets or Sets TriggerRule
        /// </summary>
        [DataMember(Name="trigger_rule", EmitDefaultValue=true)]
        public TriggerRule TriggerRule { get; set; }

        /// <summary>
        /// Color in hexadecimal notation.
        /// </summary>
        /// <value>Color in hexadecimal notation.</value>
        [RegularExpression("^#[a-fA-F0-9]{3,6}$")]
        [DataMember(Name="ui_color", EmitDefaultValue=false)]
        public string UiColor { get; set; }

        /// <summary>
        /// Color in hexadecimal notation.
        /// </summary>
        /// <value>Color in hexadecimal notation.</value>
        [RegularExpression("^#[a-fA-F0-9]{3,6}$")]
        [DataMember(Name="ui_fgcolor", EmitDefaultValue=false)]
        public string UiFgcolor { get; set; }

        /// <summary>
        /// Gets or Sets WaitForDownstream
        /// </summary>
        [DataMember(Name="wait_for_downstream", EmitDefaultValue=true)]
        public bool WaitForDownstream { get; set; }

        /// <summary>
        /// Gets or Sets WeightRule
        /// </summary>
        [DataMember(Name="weight_rule", EmitDefaultValue=true)]
        public WeightRule WeightRule { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Task {\n");
            sb.Append("  ClassRef: ").Append(ClassRef).Append("\n");
            sb.Append("  DependsOnPast: ").Append(DependsOnPast).Append("\n");
            sb.Append("  DownstreamTaskIds: ").Append(DownstreamTaskIds).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  ExecutionTimeout: ").Append(ExecutionTimeout).Append("\n");
            sb.Append("  ExtraLinks: ").Append(ExtraLinks).Append("\n");
            sb.Append("  IsMapped: ").Append(IsMapped).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  Pool: ").Append(Pool).Append("\n");
            sb.Append("  PoolSlots: ").Append(PoolSlots).Append("\n");
            sb.Append("  PriorityWeight: ").Append(PriorityWeight).Append("\n");
            sb.Append("  Queue: ").Append(Queue).Append("\n");
            sb.Append("  Retries: ").Append(Retries).Append("\n");
            sb.Append("  RetryDelay: ").Append(RetryDelay).Append("\n");
            sb.Append("  RetryExponentialBackoff: ").Append(RetryExponentialBackoff).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  SubDag: ").Append(SubDag).Append("\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  TemplateFields: ").Append(TemplateFields).Append("\n");
            sb.Append("  TriggerRule: ").Append(TriggerRule).Append("\n");
            sb.Append("  UiColor: ").Append(UiColor).Append("\n");
            sb.Append("  UiFgcolor: ").Append(UiFgcolor).Append("\n");
            sb.Append("  WaitForDownstream: ").Append(WaitForDownstream).Append("\n");
            sb.Append("  WeightRule: ").Append(WeightRule).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Task)obj);
        }

        /// <summary>
        /// Returns true if Task instances are equal
        /// </summary>
        /// <param name="other">Instance of Task to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Task other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ClassRef == other.ClassRef ||
                    ClassRef != null &&
                    ClassRef.Equals(other.ClassRef)
                ) && 
                (
                    DependsOnPast == other.DependsOnPast ||
                    
                    DependsOnPast.Equals(other.DependsOnPast)
                ) && 
                (
                    DownstreamTaskIds == other.DownstreamTaskIds ||
                    DownstreamTaskIds != null &&
                    other.DownstreamTaskIds != null &&
                    DownstreamTaskIds.SequenceEqual(other.DownstreamTaskIds)
                ) && 
                (
                    EndDate == other.EndDate ||
                    EndDate != null &&
                    EndDate.Equals(other.EndDate)
                ) && 
                (
                    ExecutionTimeout == other.ExecutionTimeout ||
                    ExecutionTimeout != null &&
                    ExecutionTimeout.Equals(other.ExecutionTimeout)
                ) && 
                (
                    ExtraLinks == other.ExtraLinks ||
                    ExtraLinks != null &&
                    other.ExtraLinks != null &&
                    ExtraLinks.SequenceEqual(other.ExtraLinks)
                ) && 
                (
                    IsMapped == other.IsMapped ||
                    
                    IsMapped.Equals(other.IsMapped)
                ) && 
                (
                    Owner == other.Owner ||
                    Owner != null &&
                    Owner.Equals(other.Owner)
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
                    
                    PriorityWeight.Equals(other.PriorityWeight)
                ) && 
                (
                    Queue == other.Queue ||
                    Queue != null &&
                    Queue.Equals(other.Queue)
                ) && 
                (
                    Retries == other.Retries ||
                    
                    Retries.Equals(other.Retries)
                ) && 
                (
                    RetryDelay == other.RetryDelay ||
                    RetryDelay != null &&
                    RetryDelay.Equals(other.RetryDelay)
                ) && 
                (
                    RetryExponentialBackoff == other.RetryExponentialBackoff ||
                    
                    RetryExponentialBackoff.Equals(other.RetryExponentialBackoff)
                ) && 
                (
                    StartDate == other.StartDate ||
                    StartDate != null &&
                    StartDate.Equals(other.StartDate)
                ) && 
                (
                    SubDag == other.SubDag ||
                    SubDag != null &&
                    SubDag.Equals(other.SubDag)
                ) && 
                (
                    TaskId == other.TaskId ||
                    TaskId != null &&
                    TaskId.Equals(other.TaskId)
                ) && 
                (
                    TemplateFields == other.TemplateFields ||
                    TemplateFields != null &&
                    other.TemplateFields != null &&
                    TemplateFields.SequenceEqual(other.TemplateFields)
                ) && 
                (
                    TriggerRule == other.TriggerRule ||
                    
                    TriggerRule.Equals(other.TriggerRule)
                ) && 
                (
                    UiColor == other.UiColor ||
                    UiColor != null &&
                    UiColor.Equals(other.UiColor)
                ) && 
                (
                    UiFgcolor == other.UiFgcolor ||
                    UiFgcolor != null &&
                    UiFgcolor.Equals(other.UiFgcolor)
                ) && 
                (
                    WaitForDownstream == other.WaitForDownstream ||
                    
                    WaitForDownstream.Equals(other.WaitForDownstream)
                ) && 
                (
                    WeightRule == other.WeightRule ||
                    
                    WeightRule.Equals(other.WeightRule)
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
                    if (ClassRef != null)
                    hashCode = hashCode * 59 + ClassRef.GetHashCode();
                    
                    hashCode = hashCode * 59 + DependsOnPast.GetHashCode();
                    if (DownstreamTaskIds != null)
                    hashCode = hashCode * 59 + DownstreamTaskIds.GetHashCode();
                    if (EndDate != null)
                    hashCode = hashCode * 59 + EndDate.GetHashCode();
                    if (ExecutionTimeout != null)
                    hashCode = hashCode * 59 + ExecutionTimeout.GetHashCode();
                    if (ExtraLinks != null)
                    hashCode = hashCode * 59 + ExtraLinks.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsMapped.GetHashCode();
                    if (Owner != null)
                    hashCode = hashCode * 59 + Owner.GetHashCode();
                    if (Pool != null)
                    hashCode = hashCode * 59 + Pool.GetHashCode();
                    
                    hashCode = hashCode * 59 + PoolSlots.GetHashCode();
                    
                    hashCode = hashCode * 59 + PriorityWeight.GetHashCode();
                    if (Queue != null)
                    hashCode = hashCode * 59 + Queue.GetHashCode();
                    
                    hashCode = hashCode * 59 + Retries.GetHashCode();
                    if (RetryDelay != null)
                    hashCode = hashCode * 59 + RetryDelay.GetHashCode();
                    
                    hashCode = hashCode * 59 + RetryExponentialBackoff.GetHashCode();
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                    if (SubDag != null)
                    hashCode = hashCode * 59 + SubDag.GetHashCode();
                    if (TaskId != null)
                    hashCode = hashCode * 59 + TaskId.GetHashCode();
                    if (TemplateFields != null)
                    hashCode = hashCode * 59 + TemplateFields.GetHashCode();
                    
                    hashCode = hashCode * 59 + TriggerRule.GetHashCode();
                    if (UiColor != null)
                    hashCode = hashCode * 59 + UiColor.GetHashCode();
                    if (UiFgcolor != null)
                    hashCode = hashCode * 59 + UiFgcolor.GetHashCode();
                    
                    hashCode = hashCode * 59 + WaitForDownstream.GetHashCode();
                    
                    hashCode = hashCode * 59 + WeightRule.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Task left, Task right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Task left, Task right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
