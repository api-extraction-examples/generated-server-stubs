/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * The version of the OpenAPI document: 1.5.7
 * Contact: support@1password.com
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
    /// Represents a request that was made to the API. Including what Token was used and what resource was accessed.
    /// </summary>
    [DataContract]
    public partial class APIRequest : IEquatable<APIRequest>
    {

        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ActionEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ActionEnum
        {
            
            /// <summary>
            /// Enum READEnum for READ
            /// </summary>
            [EnumMember(Value = "READ")]
            READEnum = 1,
            
            /// <summary>
            /// Enum CREATEEnum for CREATE
            /// </summary>
            [EnumMember(Value = "CREATE")]
            CREATEEnum = 2,
            
            /// <summary>
            /// Enum UPDATEEnum for UPDATE
            /// </summary>
            [EnumMember(Value = "UPDATE")]
            UPDATEEnum = 3,
            
            /// <summary>
            /// Enum DELETEEnum for DELETE
            /// </summary>
            [EnumMember(Value = "DELETE")]
            DELETEEnum = 4
        }

        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [DataMember(Name="action", EmitDefaultValue=true)]
        public ActionEnum Action { get; set; }

        /// <summary>
        /// Gets or Sets Actor
        /// </summary>
        [DataMember(Name="actor", EmitDefaultValue=false)]
        public APIRequestActor Actor { get; set; }

        /// <summary>
        /// The unique id used to identify a single request.
        /// </summary>
        /// <value>The unique id used to identify a single request.</value>
        [DataMember(Name="requestId", EmitDefaultValue=false)]
        public Guid RequestId { get; set; }

        /// <summary>
        /// Gets or Sets Resource
        /// </summary>
        [DataMember(Name="resource", EmitDefaultValue=false)]
        public APIRequestResource Resource { get; set; }


        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ResultEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ResultEnum
        {
            
            /// <summary>
            /// Enum SUCCESSEnum for SUCCESS
            /// </summary>
            [EnumMember(Value = "SUCCESS")]
            SUCCESSEnum = 1,
            
            /// <summary>
            /// Enum DENYEnum for DENY
            /// </summary>
            [EnumMember(Value = "DENY")]
            DENYEnum = 2
        }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name="result", EmitDefaultValue=true)]
        public ResultEnum Result { get; set; }

        /// <summary>
        /// The time at which the request was processed by the server.
        /// </summary>
        /// <value>The time at which the request was processed by the server.</value>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public DateTime Timestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class APIRequest {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Actor: ").Append(Actor).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  Resource: ").Append(Resource).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
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
            return obj.GetType() == GetType() && Equals((APIRequest)obj);
        }

        /// <summary>
        /// Returns true if APIRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of APIRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(APIRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Action == other.Action ||
                    
                    Action.Equals(other.Action)
                ) && 
                (
                    Actor == other.Actor ||
                    Actor != null &&
                    Actor.Equals(other.Actor)
                ) && 
                (
                    RequestId == other.RequestId ||
                    RequestId != null &&
                    RequestId.Equals(other.RequestId)
                ) && 
                (
                    Resource == other.Resource ||
                    Resource != null &&
                    Resource.Equals(other.Resource)
                ) && 
                (
                    Result == other.Result ||
                    
                    Result.Equals(other.Result)
                ) && 
                (
                    Timestamp == other.Timestamp ||
                    Timestamp != null &&
                    Timestamp.Equals(other.Timestamp)
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
                    
                    hashCode = hashCode * 59 + Action.GetHashCode();
                    if (Actor != null)
                    hashCode = hashCode * 59 + Actor.GetHashCode();
                    if (RequestId != null)
                    hashCode = hashCode * 59 + RequestId.GetHashCode();
                    if (Resource != null)
                    hashCode = hashCode * 59 + Resource.GetHashCode();
                    
                    hashCode = hashCode * 59 + Result.GetHashCode();
                    if (Timestamp != null)
                    hashCode = hashCode * 59 + Timestamp.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(APIRequest left, APIRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(APIRequest left, APIRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
