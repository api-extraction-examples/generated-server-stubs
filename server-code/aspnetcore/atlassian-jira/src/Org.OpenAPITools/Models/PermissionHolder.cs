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
    /// Details of a user, group, field, or project role that holds a permission. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
    /// </summary>
    [DataContract]
    public partial class PermissionHolder : IEquatable<PermissionHolder>
    {
        /// <summary>
        /// Expand options that include additional permission holder details in the response.
        /// </summary>
        /// <value>Expand options that include additional permission holder details in the response.</value>
        [DataMember(Name="expand", EmitDefaultValue=false)]
        public string Expand { get; set; }

        /// <summary>
        /// As a group&#39;s name can change, use of &#x60;value&#x60; is recommended. The identifier associated withthe &#x60;type&#x60; value that defines the holder of the permission.
        /// </summary>
        /// <value>As a group&#39;s name can change, use of &#x60;value&#x60; is recommended. The identifier associated withthe &#x60;type&#x60; value that defines the holder of the permission.</value>
        [DataMember(Name="parameter", EmitDefaultValue=false)]
        public string VarParameter { get; set; }

        /// <summary>
        /// The type of permission holder.
        /// </summary>
        /// <value>The type of permission holder.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// The identifier associated with the &#x60;type&#x60; value that defines the holder of the permission.
        /// </summary>
        /// <value>The identifier associated with the &#x60;type&#x60; value that defines the holder of the permission.</value>
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PermissionHolder {\n");
            sb.Append("  Expand: ").Append(Expand).Append("\n");
            sb.Append("  VarParameter: ").Append(VarParameter).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PermissionHolder)obj);
        }

        /// <summary>
        /// Returns true if PermissionHolder instances are equal
        /// </summary>
        /// <param name="other">Instance of PermissionHolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PermissionHolder other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Expand == other.Expand ||
                    Expand != null &&
                    Expand.Equals(other.Expand)
                ) && 
                (
                    VarParameter == other.VarParameter ||
                    VarParameter != null &&
                    VarParameter.Equals(other.VarParameter)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    Value == other.Value ||
                    Value != null &&
                    Value.Equals(other.Value)
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
                    if (Expand != null)
                    hashCode = hashCode * 59 + Expand.GetHashCode();
                    if (VarParameter != null)
                    hashCode = hashCode * 59 + VarParameter.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PermissionHolder left, PermissionHolder right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PermissionHolder left, PermissionHolder right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
