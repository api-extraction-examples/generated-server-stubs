/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
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
    /// Details of updates for a custom field.
    /// </summary>
    [DataContract]
    public partial class ConnectCustomFieldValues : IEquatable<ConnectCustomFieldValues>
    {
        /// <summary>
        /// The list of custom field update details.
        /// </summary>
        /// <value>The list of custom field update details.</value>
        [DataMember(Name="updateValueList", EmitDefaultValue=false)]
        public List<ConnectCustomFieldValue> UpdateValueList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConnectCustomFieldValues {\n");
            sb.Append("  UpdateValueList: ").Append(UpdateValueList).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ConnectCustomFieldValues)obj);
        }

        /// <summary>
        /// Returns true if ConnectCustomFieldValues instances are equal
        /// </summary>
        /// <param name="other">Instance of ConnectCustomFieldValues to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConnectCustomFieldValues other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    UpdateValueList == other.UpdateValueList ||
                    UpdateValueList != null &&
                    other.UpdateValueList != null &&
                    UpdateValueList.SequenceEqual(other.UpdateValueList)
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
                    if (UpdateValueList != null)
                    hashCode = hashCode * 59 + UpdateValueList.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ConnectCustomFieldValues left, ConnectCustomFieldValues right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ConnectCustomFieldValues left, ConnectCustomFieldValues right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}