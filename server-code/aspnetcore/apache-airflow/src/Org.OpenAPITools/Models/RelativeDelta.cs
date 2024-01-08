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
    /// Relative delta
    /// </summary>
    [DataContract]
    public partial class RelativeDelta : IEquatable<RelativeDelta>
    {
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="__type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Day
        /// </summary>
        [Required]
        [DataMember(Name="day", EmitDefaultValue=true)]
        public int Day { get; set; }

        /// <summary>
        /// Gets or Sets Days
        /// </summary>
        [Required]
        [DataMember(Name="days", EmitDefaultValue=true)]
        public int Days { get; set; }

        /// <summary>
        /// Gets or Sets Hour
        /// </summary>
        [Required]
        [DataMember(Name="hour", EmitDefaultValue=true)]
        public int Hour { get; set; }

        /// <summary>
        /// Gets or Sets Hours
        /// </summary>
        [Required]
        [DataMember(Name="hours", EmitDefaultValue=true)]
        public int Hours { get; set; }

        /// <summary>
        /// Gets or Sets Leapdays
        /// </summary>
        [Required]
        [DataMember(Name="leapdays", EmitDefaultValue=true)]
        public int Leapdays { get; set; }

        /// <summary>
        /// Gets or Sets Microsecond
        /// </summary>
        [Required]
        [DataMember(Name="microsecond", EmitDefaultValue=true)]
        public int Microsecond { get; set; }

        /// <summary>
        /// Gets or Sets Microseconds
        /// </summary>
        [Required]
        [DataMember(Name="microseconds", EmitDefaultValue=true)]
        public int Microseconds { get; set; }

        /// <summary>
        /// Gets or Sets Minute
        /// </summary>
        [Required]
        [DataMember(Name="minute", EmitDefaultValue=true)]
        public int Minute { get; set; }

        /// <summary>
        /// Gets or Sets Minutes
        /// </summary>
        [Required]
        [DataMember(Name="minutes", EmitDefaultValue=true)]
        public int Minutes { get; set; }

        /// <summary>
        /// Gets or Sets Month
        /// </summary>
        [Required]
        [DataMember(Name="month", EmitDefaultValue=true)]
        public int Month { get; set; }

        /// <summary>
        /// Gets or Sets Months
        /// </summary>
        [Required]
        [DataMember(Name="months", EmitDefaultValue=true)]
        public int Months { get; set; }

        /// <summary>
        /// Gets or Sets Second
        /// </summary>
        [Required]
        [DataMember(Name="second", EmitDefaultValue=true)]
        public int Second { get; set; }

        /// <summary>
        /// Gets or Sets Seconds
        /// </summary>
        [Required]
        [DataMember(Name="seconds", EmitDefaultValue=true)]
        public int Seconds { get; set; }

        /// <summary>
        /// Gets or Sets Year
        /// </summary>
        [Required]
        [DataMember(Name="year", EmitDefaultValue=true)]
        public int Year { get; set; }

        /// <summary>
        /// Gets or Sets Years
        /// </summary>
        [Required]
        [DataMember(Name="years", EmitDefaultValue=true)]
        public int Years { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RelativeDelta {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Day: ").Append(Day).Append("\n");
            sb.Append("  Days: ").Append(Days).Append("\n");
            sb.Append("  Hour: ").Append(Hour).Append("\n");
            sb.Append("  Hours: ").Append(Hours).Append("\n");
            sb.Append("  Leapdays: ").Append(Leapdays).Append("\n");
            sb.Append("  Microsecond: ").Append(Microsecond).Append("\n");
            sb.Append("  Microseconds: ").Append(Microseconds).Append("\n");
            sb.Append("  Minute: ").Append(Minute).Append("\n");
            sb.Append("  Minutes: ").Append(Minutes).Append("\n");
            sb.Append("  Month: ").Append(Month).Append("\n");
            sb.Append("  Months: ").Append(Months).Append("\n");
            sb.Append("  Second: ").Append(Second).Append("\n");
            sb.Append("  Seconds: ").Append(Seconds).Append("\n");
            sb.Append("  Year: ").Append(Year).Append("\n");
            sb.Append("  Years: ").Append(Years).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RelativeDelta)obj);
        }

        /// <summary>
        /// Returns true if RelativeDelta instances are equal
        /// </summary>
        /// <param name="other">Instance of RelativeDelta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelativeDelta other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    Day == other.Day ||
                    
                    Day.Equals(other.Day)
                ) && 
                (
                    Days == other.Days ||
                    
                    Days.Equals(other.Days)
                ) && 
                (
                    Hour == other.Hour ||
                    
                    Hour.Equals(other.Hour)
                ) && 
                (
                    Hours == other.Hours ||
                    
                    Hours.Equals(other.Hours)
                ) && 
                (
                    Leapdays == other.Leapdays ||
                    
                    Leapdays.Equals(other.Leapdays)
                ) && 
                (
                    Microsecond == other.Microsecond ||
                    
                    Microsecond.Equals(other.Microsecond)
                ) && 
                (
                    Microseconds == other.Microseconds ||
                    
                    Microseconds.Equals(other.Microseconds)
                ) && 
                (
                    Minute == other.Minute ||
                    
                    Minute.Equals(other.Minute)
                ) && 
                (
                    Minutes == other.Minutes ||
                    
                    Minutes.Equals(other.Minutes)
                ) && 
                (
                    Month == other.Month ||
                    
                    Month.Equals(other.Month)
                ) && 
                (
                    Months == other.Months ||
                    
                    Months.Equals(other.Months)
                ) && 
                (
                    Second == other.Second ||
                    
                    Second.Equals(other.Second)
                ) && 
                (
                    Seconds == other.Seconds ||
                    
                    Seconds.Equals(other.Seconds)
                ) && 
                (
                    Year == other.Year ||
                    
                    Year.Equals(other.Year)
                ) && 
                (
                    Years == other.Years ||
                    
                    Years.Equals(other.Years)
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
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    
                    hashCode = hashCode * 59 + Day.GetHashCode();
                    
                    hashCode = hashCode * 59 + Days.GetHashCode();
                    
                    hashCode = hashCode * 59 + Hour.GetHashCode();
                    
                    hashCode = hashCode * 59 + Hours.GetHashCode();
                    
                    hashCode = hashCode * 59 + Leapdays.GetHashCode();
                    
                    hashCode = hashCode * 59 + Microsecond.GetHashCode();
                    
                    hashCode = hashCode * 59 + Microseconds.GetHashCode();
                    
                    hashCode = hashCode * 59 + Minute.GetHashCode();
                    
                    hashCode = hashCode * 59 + Minutes.GetHashCode();
                    
                    hashCode = hashCode * 59 + Month.GetHashCode();
                    
                    hashCode = hashCode * 59 + Months.GetHashCode();
                    
                    hashCode = hashCode * 59 + Second.GetHashCode();
                    
                    hashCode = hashCode * 59 + Seconds.GetHashCode();
                    
                    hashCode = hashCode * 59 + Year.GetHashCode();
                    
                    hashCode = hashCode * 59 + Years.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RelativeDelta left, RelativeDelta right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RelativeDelta left, RelativeDelta right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
