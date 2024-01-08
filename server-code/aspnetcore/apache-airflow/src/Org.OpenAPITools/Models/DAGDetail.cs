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
    /// DAG details.  For details see: [airflow.models.DAG](https://airflow.apache.org/docs/apache-airflow/stable/_api/airflow/models/index.html#airflow.models.DAG) 
    /// </summary>
    [DataContract]
    public partial class DAGDetail : IEquatable<DAGDetail>
    {
        /// <summary>
        /// The ID of the DAG.
        /// </summary>
        /// <value>The ID of the DAG.</value>
        [DataMember(Name="dag_id", EmitDefaultValue=false)]
        public string DagId { get; set; }

        /// <summary>
        /// Gets or Sets DefaultView
        /// </summary>
        [DataMember(Name="default_view", EmitDefaultValue=false)]
        public string DefaultView { get; set; }

        /// <summary>
        /// User-provided DAG description, which can consist of several sentences or paragraphs that describe DAG contents. 
        /// </summary>
        /// <value>User-provided DAG description, which can consist of several sentences or paragraphs that describe DAG contents. </value>
        [DataMember(Name="description", EmitDefaultValue=true)]
        public string Description { get; set; }

        /// <summary>
        /// The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
        /// </summary>
        /// <value>The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. </value>
        [DataMember(Name="file_token", EmitDefaultValue=false)]
        public string FileToken { get; set; }

        /// <summary>
        /// The absolute path to the file.
        /// </summary>
        /// <value>The absolute path to the file.</value>
        [DataMember(Name="fileloc", EmitDefaultValue=false)]
        public string Fileloc { get; set; }

        /// <summary>
        /// Whether the DAG has import errors  *New in version 2.3.0* 
        /// </summary>
        /// <value>Whether the DAG has import errors  *New in version 2.3.0* </value>
        [DataMember(Name="has_import_errors", EmitDefaultValue=true)]
        public bool? HasImportErrors { get; set; }

        /// <summary>
        /// Whether the DAG has task concurrency limits  *New in version 2.3.0* 
        /// </summary>
        /// <value>Whether the DAG has task concurrency limits  *New in version 2.3.0* </value>
        [DataMember(Name="has_task_concurrency_limits", EmitDefaultValue=true)]
        public bool? HasTaskConcurrencyLimits { get; set; }

        /// <summary>
        /// Whether the DAG is currently seen by the scheduler(s).  *New in version 2.1.1*  *Changed in version 2.2.0*&amp;#58; Field is read-only. 
        /// </summary>
        /// <value>Whether the DAG is currently seen by the scheduler(s).  *New in version 2.1.1*  *Changed in version 2.2.0*&amp;#58; Field is read-only. </value>
        [DataMember(Name="is_active", EmitDefaultValue=true)]
        public bool? IsActive { get; set; }

        /// <summary>
        /// Whether the DAG is paused.
        /// </summary>
        /// <value>Whether the DAG is paused.</value>
        [DataMember(Name="is_paused", EmitDefaultValue=true)]
        public bool? IsPaused { get; set; }

        /// <summary>
        /// Whether the DAG is SubDAG.
        /// </summary>
        /// <value>Whether the DAG is SubDAG.</value>
        [DataMember(Name="is_subdag", EmitDefaultValue=true)]
        public bool IsSubdag { get; set; }

        /// <summary>
        /// Time when the DAG last received a refresh signal (e.g. the DAG&#39;s \&quot;refresh\&quot; button was clicked in the web UI)  *New in version 2.3.0* 
        /// </summary>
        /// <value>Time when the DAG last received a refresh signal (e.g. the DAG&#39;s \&quot;refresh\&quot; button was clicked in the web UI)  *New in version 2.3.0* </value>
        [DataMember(Name="last_expired", EmitDefaultValue=true)]
        public DateTime? LastExpired { get; set; }

        /// <summary>
        /// The last time the DAG was parsed.  *New in version 2.3.0* 
        /// </summary>
        /// <value>The last time the DAG was parsed.  *New in version 2.3.0* </value>
        [DataMember(Name="last_parsed_time", EmitDefaultValue=true)]
        public DateTime? LastParsedTime { get; set; }

        /// <summary>
        /// The last time the DAG was pickled.  *New in version 2.3.0* 
        /// </summary>
        /// <value>The last time the DAG was pickled.  *New in version 2.3.0* </value>
        [DataMember(Name="last_pickled", EmitDefaultValue=true)]
        public DateTime? LastPickled { get; set; }

        /// <summary>
        /// Maximum number of active DAG runs for the DAG  *New in version 2.3.0* 
        /// </summary>
        /// <value>Maximum number of active DAG runs for the DAG  *New in version 2.3.0* </value>
        [DataMember(Name="max_active_runs", EmitDefaultValue=true)]
        public int? MaxActiveRuns { get; set; }

        /// <summary>
        /// Maximum number of active tasks that can be run on the DAG  *New in version 2.3.0* 
        /// </summary>
        /// <value>Maximum number of active tasks that can be run on the DAG  *New in version 2.3.0* </value>
        [DataMember(Name="max_active_tasks", EmitDefaultValue=true)]
        public int? MaxActiveTasks { get; set; }

        /// <summary>
        /// The logical date of the next dag run.  *New in version 2.3.0* 
        /// </summary>
        /// <value>The logical date of the next dag run.  *New in version 2.3.0* </value>
        [DataMember(Name="next_dagrun", EmitDefaultValue=true)]
        public DateTime? NextDagrun { get; set; }

        /// <summary>
        /// Earliest time at which this &#x60;&#x60;next_dagrun&#x60;&#x60; can be created.  *New in version 2.3.0* 
        /// </summary>
        /// <value>Earliest time at which this &#x60;&#x60;next_dagrun&#x60;&#x60; can be created.  *New in version 2.3.0* </value>
        [DataMember(Name="next_dagrun_create_after", EmitDefaultValue=true)]
        public DateTime? NextDagrunCreateAfter { get; set; }

        /// <summary>
        /// The end of the interval of the next dag run.  *New in version 2.3.0* 
        /// </summary>
        /// <value>The end of the interval of the next dag run.  *New in version 2.3.0* </value>
        [DataMember(Name="next_dagrun_data_interval_end", EmitDefaultValue=true)]
        public DateTime? NextDagrunDataIntervalEnd { get; set; }

        /// <summary>
        /// The start of the interval of the next dag run.  *New in version 2.3.0* 
        /// </summary>
        /// <value>The start of the interval of the next dag run.  *New in version 2.3.0* </value>
        [DataMember(Name="next_dagrun_data_interval_start", EmitDefaultValue=true)]
        public DateTime? NextDagrunDataIntervalStart { get; set; }

        /// <summary>
        /// Gets or Sets Owners
        /// </summary>
        [DataMember(Name="owners", EmitDefaultValue=false)]
        public List<string> Owners { get; set; }

        /// <summary>
        /// Foreign key to the latest pickle_id  *New in version 2.3.0* 
        /// </summary>
        /// <value>Foreign key to the latest pickle_id  *New in version 2.3.0* </value>
        [DataMember(Name="pickle_id", EmitDefaultValue=true)]
        public string PickleId { get; set; }

        /// <summary>
        /// If the DAG is SubDAG then it is the top level DAG identifier. Otherwise, null.
        /// </summary>
        /// <value>If the DAG is SubDAG then it is the top level DAG identifier. Otherwise, null.</value>
        [DataMember(Name="root_dag_id", EmitDefaultValue=true)]
        public string RootDagId { get; set; }

        /// <summary>
        /// Gets or Sets ScheduleInterval
        /// </summary>
        [DataMember(Name="schedule_interval", EmitDefaultValue=true)]
        public ScheduleInterval ScheduleInterval { get; set; }

        /// <summary>
        /// Whether (one of) the scheduler is scheduling this DAG at the moment  *New in version 2.3.0* 
        /// </summary>
        /// <value>Whether (one of) the scheduler is scheduling this DAG at the moment  *New in version 2.3.0* </value>
        [DataMember(Name="scheduler_lock", EmitDefaultValue=true)]
        public bool? SchedulerLock { get; set; }

        /// <summary>
        /// List of tags.
        /// </summary>
        /// <value>List of tags.</value>
        [DataMember(Name="tags", EmitDefaultValue=true)]
        public List<Tag> Tags { get; set; }

        /// <summary>
        /// Timetable/Schedule Interval description.  *New in version 2.3.0* 
        /// </summary>
        /// <value>Timetable/Schedule Interval description.  *New in version 2.3.0* </value>
        [DataMember(Name="timetable_description", EmitDefaultValue=true)]
        public string TimetableDescription { get; set; }

        /// <summary>
        /// Gets or Sets Catchup
        /// </summary>
        [DataMember(Name="catchup", EmitDefaultValue=true)]
        public bool Catchup { get; set; }

        /// <summary>
        /// Gets or Sets Concurrency
        /// </summary>
        [DataMember(Name="concurrency", EmitDefaultValue=true)]
        public decimal Concurrency { get; set; }

        /// <summary>
        /// Gets or Sets DagRunTimeout
        /// </summary>
        [DataMember(Name="dag_run_timeout", EmitDefaultValue=false)]
        public TimeDelta DagRunTimeout { get; set; }

        /// <summary>
        /// Gets or Sets DocMd
        /// </summary>
        [DataMember(Name="doc_md", EmitDefaultValue=true)]
        public string DocMd { get; set; }

        /// <summary>
        /// The DAG&#39;s end date.  *New in version 2.3.0*. 
        /// </summary>
        /// <value>The DAG&#39;s end date.  *New in version 2.3.0*. </value>
        [DataMember(Name="end_date", EmitDefaultValue=true)]
        public DateTime? EndDate { get; set; }

        /// <summary>
        /// Whether the DAG is paused upon creation.  *New in version 2.3.0* 
        /// </summary>
        /// <value>Whether the DAG is paused upon creation.  *New in version 2.3.0* </value>
        [DataMember(Name="is_paused_upon_creation", EmitDefaultValue=true)]
        public bool? IsPausedUponCreation { get; set; }

        /// <summary>
        /// The last time the DAG was parsed.  *New in version 2.3.0* 
        /// </summary>
        /// <value>The last time the DAG was parsed.  *New in version 2.3.0* </value>
        [DataMember(Name="last_parsed", EmitDefaultValue=true)]
        public DateTime? LastParsed { get; set; }

        /// <summary>
        /// Gets or Sets Orientation
        /// </summary>
        [DataMember(Name="orientation", EmitDefaultValue=false)]
        public string Orientation { get; set; }

        /// <summary>
        /// User-specified DAG params.  *New in version 2.0.1* 
        /// </summary>
        /// <value>User-specified DAG params.  *New in version 2.0.1* </value>
        [DataMember(Name="params", EmitDefaultValue=false)]
        public Object VarParams { get; set; }

        /// <summary>
        /// Whether to render templates as native Python objects.  *New in version 2.3.0* 
        /// </summary>
        /// <value>Whether to render templates as native Python objects.  *New in version 2.3.0* </value>
        [DataMember(Name="render_template_as_native_obj", EmitDefaultValue=true)]
        public bool? RenderTemplateAsNativeObj { get; set; }

        /// <summary>
        /// The DAG&#39;s start date.  *Changed in version 2.0.1*&amp;#58; Field becomes nullable. 
        /// </summary>
        /// <value>The DAG&#39;s start date.  *Changed in version 2.0.1*&amp;#58; Field becomes nullable. </value>
        [DataMember(Name="start_date", EmitDefaultValue=true)]
        public DateTime? StartDate { get; set; }

        /// <summary>
        /// The template search path.  *New in version 2.3.0* 
        /// </summary>
        /// <value>The template search path.  *New in version 2.3.0* </value>
        [DataMember(Name="template_search_path", EmitDefaultValue=true)]
        public List<string> TemplateSearchPath { get; set; }

        /// <summary>
        /// Gets or Sets Timezone
        /// </summary>
        [DataMember(Name="timezone", EmitDefaultValue=false)]
        public string Timezone { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DAGDetail {\n");
            sb.Append("  DagId: ").Append(DagId).Append("\n");
            sb.Append("  DefaultView: ").Append(DefaultView).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  FileToken: ").Append(FileToken).Append("\n");
            sb.Append("  Fileloc: ").Append(Fileloc).Append("\n");
            sb.Append("  HasImportErrors: ").Append(HasImportErrors).Append("\n");
            sb.Append("  HasTaskConcurrencyLimits: ").Append(HasTaskConcurrencyLimits).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  IsPaused: ").Append(IsPaused).Append("\n");
            sb.Append("  IsSubdag: ").Append(IsSubdag).Append("\n");
            sb.Append("  LastExpired: ").Append(LastExpired).Append("\n");
            sb.Append("  LastParsedTime: ").Append(LastParsedTime).Append("\n");
            sb.Append("  LastPickled: ").Append(LastPickled).Append("\n");
            sb.Append("  MaxActiveRuns: ").Append(MaxActiveRuns).Append("\n");
            sb.Append("  MaxActiveTasks: ").Append(MaxActiveTasks).Append("\n");
            sb.Append("  NextDagrun: ").Append(NextDagrun).Append("\n");
            sb.Append("  NextDagrunCreateAfter: ").Append(NextDagrunCreateAfter).Append("\n");
            sb.Append("  NextDagrunDataIntervalEnd: ").Append(NextDagrunDataIntervalEnd).Append("\n");
            sb.Append("  NextDagrunDataIntervalStart: ").Append(NextDagrunDataIntervalStart).Append("\n");
            sb.Append("  Owners: ").Append(Owners).Append("\n");
            sb.Append("  PickleId: ").Append(PickleId).Append("\n");
            sb.Append("  RootDagId: ").Append(RootDagId).Append("\n");
            sb.Append("  ScheduleInterval: ").Append(ScheduleInterval).Append("\n");
            sb.Append("  SchedulerLock: ").Append(SchedulerLock).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  TimetableDescription: ").Append(TimetableDescription).Append("\n");
            sb.Append("  Catchup: ").Append(Catchup).Append("\n");
            sb.Append("  Concurrency: ").Append(Concurrency).Append("\n");
            sb.Append("  DagRunTimeout: ").Append(DagRunTimeout).Append("\n");
            sb.Append("  DocMd: ").Append(DocMd).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  IsPausedUponCreation: ").Append(IsPausedUponCreation).Append("\n");
            sb.Append("  LastParsed: ").Append(LastParsed).Append("\n");
            sb.Append("  Orientation: ").Append(Orientation).Append("\n");
            sb.Append("  VarParams: ").Append(VarParams).Append("\n");
            sb.Append("  RenderTemplateAsNativeObj: ").Append(RenderTemplateAsNativeObj).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  TemplateSearchPath: ").Append(TemplateSearchPath).Append("\n");
            sb.Append("  Timezone: ").Append(Timezone).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DAGDetail)obj);
        }

        /// <summary>
        /// Returns true if DAGDetail instances are equal
        /// </summary>
        /// <param name="other">Instance of DAGDetail to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DAGDetail other)
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
                    DefaultView == other.DefaultView ||
                    DefaultView != null &&
                    DefaultView.Equals(other.DefaultView)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    FileToken == other.FileToken ||
                    FileToken != null &&
                    FileToken.Equals(other.FileToken)
                ) && 
                (
                    Fileloc == other.Fileloc ||
                    Fileloc != null &&
                    Fileloc.Equals(other.Fileloc)
                ) && 
                (
                    HasImportErrors == other.HasImportErrors ||
                    HasImportErrors != null &&
                    HasImportErrors.Equals(other.HasImportErrors)
                ) && 
                (
                    HasTaskConcurrencyLimits == other.HasTaskConcurrencyLimits ||
                    HasTaskConcurrencyLimits != null &&
                    HasTaskConcurrencyLimits.Equals(other.HasTaskConcurrencyLimits)
                ) && 
                (
                    IsActive == other.IsActive ||
                    IsActive != null &&
                    IsActive.Equals(other.IsActive)
                ) && 
                (
                    IsPaused == other.IsPaused ||
                    IsPaused != null &&
                    IsPaused.Equals(other.IsPaused)
                ) && 
                (
                    IsSubdag == other.IsSubdag ||
                    
                    IsSubdag.Equals(other.IsSubdag)
                ) && 
                (
                    LastExpired == other.LastExpired ||
                    LastExpired != null &&
                    LastExpired.Equals(other.LastExpired)
                ) && 
                (
                    LastParsedTime == other.LastParsedTime ||
                    LastParsedTime != null &&
                    LastParsedTime.Equals(other.LastParsedTime)
                ) && 
                (
                    LastPickled == other.LastPickled ||
                    LastPickled != null &&
                    LastPickled.Equals(other.LastPickled)
                ) && 
                (
                    MaxActiveRuns == other.MaxActiveRuns ||
                    MaxActiveRuns != null &&
                    MaxActiveRuns.Equals(other.MaxActiveRuns)
                ) && 
                (
                    MaxActiveTasks == other.MaxActiveTasks ||
                    MaxActiveTasks != null &&
                    MaxActiveTasks.Equals(other.MaxActiveTasks)
                ) && 
                (
                    NextDagrun == other.NextDagrun ||
                    NextDagrun != null &&
                    NextDagrun.Equals(other.NextDagrun)
                ) && 
                (
                    NextDagrunCreateAfter == other.NextDagrunCreateAfter ||
                    NextDagrunCreateAfter != null &&
                    NextDagrunCreateAfter.Equals(other.NextDagrunCreateAfter)
                ) && 
                (
                    NextDagrunDataIntervalEnd == other.NextDagrunDataIntervalEnd ||
                    NextDagrunDataIntervalEnd != null &&
                    NextDagrunDataIntervalEnd.Equals(other.NextDagrunDataIntervalEnd)
                ) && 
                (
                    NextDagrunDataIntervalStart == other.NextDagrunDataIntervalStart ||
                    NextDagrunDataIntervalStart != null &&
                    NextDagrunDataIntervalStart.Equals(other.NextDagrunDataIntervalStart)
                ) && 
                (
                    Owners == other.Owners ||
                    Owners != null &&
                    other.Owners != null &&
                    Owners.SequenceEqual(other.Owners)
                ) && 
                (
                    PickleId == other.PickleId ||
                    PickleId != null &&
                    PickleId.Equals(other.PickleId)
                ) && 
                (
                    RootDagId == other.RootDagId ||
                    RootDagId != null &&
                    RootDagId.Equals(other.RootDagId)
                ) && 
                (
                    ScheduleInterval == other.ScheduleInterval ||
                    ScheduleInterval != null &&
                    ScheduleInterval.Equals(other.ScheduleInterval)
                ) && 
                (
                    SchedulerLock == other.SchedulerLock ||
                    SchedulerLock != null &&
                    SchedulerLock.Equals(other.SchedulerLock)
                ) && 
                (
                    Tags == other.Tags ||
                    Tags != null &&
                    other.Tags != null &&
                    Tags.SequenceEqual(other.Tags)
                ) && 
                (
                    TimetableDescription == other.TimetableDescription ||
                    TimetableDescription != null &&
                    TimetableDescription.Equals(other.TimetableDescription)
                ) && 
                (
                    Catchup == other.Catchup ||
                    
                    Catchup.Equals(other.Catchup)
                ) && 
                (
                    Concurrency == other.Concurrency ||
                    
                    Concurrency.Equals(other.Concurrency)
                ) && 
                (
                    DagRunTimeout == other.DagRunTimeout ||
                    DagRunTimeout != null &&
                    DagRunTimeout.Equals(other.DagRunTimeout)
                ) && 
                (
                    DocMd == other.DocMd ||
                    DocMd != null &&
                    DocMd.Equals(other.DocMd)
                ) && 
                (
                    EndDate == other.EndDate ||
                    EndDate != null &&
                    EndDate.Equals(other.EndDate)
                ) && 
                (
                    IsPausedUponCreation == other.IsPausedUponCreation ||
                    IsPausedUponCreation != null &&
                    IsPausedUponCreation.Equals(other.IsPausedUponCreation)
                ) && 
                (
                    LastParsed == other.LastParsed ||
                    LastParsed != null &&
                    LastParsed.Equals(other.LastParsed)
                ) && 
                (
                    Orientation == other.Orientation ||
                    Orientation != null &&
                    Orientation.Equals(other.Orientation)
                ) && 
                (
                    VarParams == other.VarParams ||
                    VarParams != null &&
                    VarParams.Equals(other.VarParams)
                ) && 
                (
                    RenderTemplateAsNativeObj == other.RenderTemplateAsNativeObj ||
                    RenderTemplateAsNativeObj != null &&
                    RenderTemplateAsNativeObj.Equals(other.RenderTemplateAsNativeObj)
                ) && 
                (
                    StartDate == other.StartDate ||
                    StartDate != null &&
                    StartDate.Equals(other.StartDate)
                ) && 
                (
                    TemplateSearchPath == other.TemplateSearchPath ||
                    TemplateSearchPath != null &&
                    other.TemplateSearchPath != null &&
                    TemplateSearchPath.SequenceEqual(other.TemplateSearchPath)
                ) && 
                (
                    Timezone == other.Timezone ||
                    Timezone != null &&
                    Timezone.Equals(other.Timezone)
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
                    if (DefaultView != null)
                    hashCode = hashCode * 59 + DefaultView.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (FileToken != null)
                    hashCode = hashCode * 59 + FileToken.GetHashCode();
                    if (Fileloc != null)
                    hashCode = hashCode * 59 + Fileloc.GetHashCode();
                    if (HasImportErrors != null)
                    hashCode = hashCode * 59 + HasImportErrors.GetHashCode();
                    if (HasTaskConcurrencyLimits != null)
                    hashCode = hashCode * 59 + HasTaskConcurrencyLimits.GetHashCode();
                    if (IsActive != null)
                    hashCode = hashCode * 59 + IsActive.GetHashCode();
                    if (IsPaused != null)
                    hashCode = hashCode * 59 + IsPaused.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsSubdag.GetHashCode();
                    if (LastExpired != null)
                    hashCode = hashCode * 59 + LastExpired.GetHashCode();
                    if (LastParsedTime != null)
                    hashCode = hashCode * 59 + LastParsedTime.GetHashCode();
                    if (LastPickled != null)
                    hashCode = hashCode * 59 + LastPickled.GetHashCode();
                    if (MaxActiveRuns != null)
                    hashCode = hashCode * 59 + MaxActiveRuns.GetHashCode();
                    if (MaxActiveTasks != null)
                    hashCode = hashCode * 59 + MaxActiveTasks.GetHashCode();
                    if (NextDagrun != null)
                    hashCode = hashCode * 59 + NextDagrun.GetHashCode();
                    if (NextDagrunCreateAfter != null)
                    hashCode = hashCode * 59 + NextDagrunCreateAfter.GetHashCode();
                    if (NextDagrunDataIntervalEnd != null)
                    hashCode = hashCode * 59 + NextDagrunDataIntervalEnd.GetHashCode();
                    if (NextDagrunDataIntervalStart != null)
                    hashCode = hashCode * 59 + NextDagrunDataIntervalStart.GetHashCode();
                    if (Owners != null)
                    hashCode = hashCode * 59 + Owners.GetHashCode();
                    if (PickleId != null)
                    hashCode = hashCode * 59 + PickleId.GetHashCode();
                    if (RootDagId != null)
                    hashCode = hashCode * 59 + RootDagId.GetHashCode();
                    if (ScheduleInterval != null)
                    hashCode = hashCode * 59 + ScheduleInterval.GetHashCode();
                    if (SchedulerLock != null)
                    hashCode = hashCode * 59 + SchedulerLock.GetHashCode();
                    if (Tags != null)
                    hashCode = hashCode * 59 + Tags.GetHashCode();
                    if (TimetableDescription != null)
                    hashCode = hashCode * 59 + TimetableDescription.GetHashCode();
                    
                    hashCode = hashCode * 59 + Catchup.GetHashCode();
                    
                    hashCode = hashCode * 59 + Concurrency.GetHashCode();
                    if (DagRunTimeout != null)
                    hashCode = hashCode * 59 + DagRunTimeout.GetHashCode();
                    if (DocMd != null)
                    hashCode = hashCode * 59 + DocMd.GetHashCode();
                    if (EndDate != null)
                    hashCode = hashCode * 59 + EndDate.GetHashCode();
                    if (IsPausedUponCreation != null)
                    hashCode = hashCode * 59 + IsPausedUponCreation.GetHashCode();
                    if (LastParsed != null)
                    hashCode = hashCode * 59 + LastParsed.GetHashCode();
                    if (Orientation != null)
                    hashCode = hashCode * 59 + Orientation.GetHashCode();
                    if (VarParams != null)
                    hashCode = hashCode * 59 + VarParams.GetHashCode();
                    if (RenderTemplateAsNativeObj != null)
                    hashCode = hashCode * 59 + RenderTemplateAsNativeObj.GetHashCode();
                    if (StartDate != null)
                    hashCode = hashCode * 59 + StartDate.GetHashCode();
                    if (TemplateSearchPath != null)
                    hashCode = hashCode * 59 + TemplateSearchPath.GetHashCode();
                    if (Timezone != null)
                    hashCode = hashCode * 59 + Timezone.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DAGDetail left, DAGDetail right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DAGDetail left, DAGDetail right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
