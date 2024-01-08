/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
 * 
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
    /// An action object for use in a batch request.
    /// </summary>
    [DataContract]
    public partial class BatchRequestAction : IEquatable<BatchRequestAction>
    {
        /// <summary>
        /// For &#x60;GET&#x60; requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in &#x60;options&#x60; instead. For &#x60;POST&#x60;, &#x60;PATCH&#x60;, and &#x60;PUT&#x60; methods, this should be the content you would have normally put in the data field of the body.
        /// </summary>
        /// <value>For &#x60;GET&#x60; requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in &#x60;options&#x60; instead. For &#x60;POST&#x60;, &#x60;PATCH&#x60;, and &#x60;PUT&#x60; methods, this should be the content you would have normally put in the data field of the body.</value>
        /// <example>{&quot;assignee&quot;:&quot;me&quot;,&quot;workspace&quot;:&quot;1337&quot;}</example>
        [DataMember(Name="data", EmitDefaultValue=false)]
        public Object Data { get; set; }


        /// <summary>
        /// The HTTP method you wish to emulate for the action.
        /// </summary>
        /// <value>The HTTP method you wish to emulate for the action.</value>
        [TypeConverter(typeof(CustomEnumConverter<MethodEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum MethodEnum
        {
            
            /// <summary>
            /// Enum GetEnum for get
            /// </summary>
            [EnumMember(Value = "get")]
            GetEnum = 1,
            
            /// <summary>
            /// Enum PostEnum for post
            /// </summary>
            [EnumMember(Value = "post")]
            PostEnum = 2,
            
            /// <summary>
            /// Enum PutEnum for put
            /// </summary>
            [EnumMember(Value = "put")]
            PutEnum = 3,
            
            /// <summary>
            /// Enum DeleteEnum for delete
            /// </summary>
            [EnumMember(Value = "delete")]
            DeleteEnum = 4,
            
            /// <summary>
            /// Enum PatchEnum for patch
            /// </summary>
            [EnumMember(Value = "patch")]
            PatchEnum = 5,
            
            /// <summary>
            /// Enum HeadEnum for head
            /// </summary>
            [EnumMember(Value = "head")]
            HeadEnum = 6
        }

        /// <summary>
        /// The HTTP method you wish to emulate for the action.
        /// </summary>
        /// <value>The HTTP method you wish to emulate for the action.</value>
        /// <example>get</example>
        [Required]
        [DataMember(Name="method", EmitDefaultValue=true)]
        public MethodEnum Method { get; set; }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [DataMember(Name="options", EmitDefaultValue=false)]
        public BatchRequestActionOptions Options { get; set; }

        /// <summary>
        /// The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in &#x60;data&#x60; instead.
        /// </summary>
        /// <value>The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in &#x60;data&#x60; instead.</value>
        /// <example>/tasks/123</example>
        [Required]
        [DataMember(Name="relative_path", EmitDefaultValue=false)]
        public string RelativePath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BatchRequestAction {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  RelativePath: ").Append(RelativePath).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BatchRequestAction)obj);
        }

        /// <summary>
        /// Returns true if BatchRequestAction instances are equal
        /// </summary>
        /// <param name="other">Instance of BatchRequestAction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BatchRequestAction other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Data == other.Data ||
                    Data != null &&
                    Data.Equals(other.Data)
                ) && 
                (
                    Method == other.Method ||
                    
                    Method.Equals(other.Method)
                ) && 
                (
                    Options == other.Options ||
                    Options != null &&
                    Options.Equals(other.Options)
                ) && 
                (
                    RelativePath == other.RelativePath ||
                    RelativePath != null &&
                    RelativePath.Equals(other.RelativePath)
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
                    if (Data != null)
                    hashCode = hashCode * 59 + Data.GetHashCode();
                    
                    hashCode = hashCode * 59 + Method.GetHashCode();
                    if (Options != null)
                    hashCode = hashCode * 59 + Options.GetHashCode();
                    if (RelativePath != null)
                    hashCode = hashCode * 59 + RelativePath.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BatchRequestAction left, BatchRequestAction right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BatchRequestAction left, BatchRequestAction right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}