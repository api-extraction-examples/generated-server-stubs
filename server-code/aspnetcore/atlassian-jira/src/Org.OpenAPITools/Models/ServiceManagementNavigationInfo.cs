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
    /// 
    /// </summary>
    [DataContract]
    public partial class ServiceManagementNavigationInfo : IEquatable<ServiceManagementNavigationInfo>
    {
        /// <summary>
        /// Gets or Sets QueueCategory
        /// </summary>
        [DataMember(Name="queueCategory", EmitDefaultValue=false)]
        public string QueueCategory { get; set; }

        /// <summary>
        /// Gets or Sets QueueId
        /// </summary>
        [DataMember(Name="queueId", EmitDefaultValue=true)]
        public long QueueId { get; set; }

        /// <summary>
        /// Gets or Sets QueueName
        /// </summary>
        [DataMember(Name="queueName", EmitDefaultValue=false)]
        public string QueueName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ServiceManagementNavigationInfo {\n");
            sb.Append("  QueueCategory: ").Append(QueueCategory).Append("\n");
            sb.Append("  QueueId: ").Append(QueueId).Append("\n");
            sb.Append("  QueueName: ").Append(QueueName).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ServiceManagementNavigationInfo)obj);
        }

        /// <summary>
        /// Returns true if ServiceManagementNavigationInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of ServiceManagementNavigationInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ServiceManagementNavigationInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    QueueCategory == other.QueueCategory ||
                    QueueCategory != null &&
                    QueueCategory.Equals(other.QueueCategory)
                ) && 
                (
                    QueueId == other.QueueId ||
                    
                    QueueId.Equals(other.QueueId)
                ) && 
                (
                    QueueName == other.QueueName ||
                    QueueName != null &&
                    QueueName.Equals(other.QueueName)
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
                    if (QueueCategory != null)
                    hashCode = hashCode * 59 + QueueCategory.GetHashCode();
                    
                    hashCode = hashCode * 59 + QueueId.GetHashCode();
                    if (QueueName != null)
                    hashCode = hashCode * 59 + QueueName.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ServiceManagementNavigationInfo left, ServiceManagementNavigationInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ServiceManagementNavigationInfo left, ServiceManagementNavigationInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}