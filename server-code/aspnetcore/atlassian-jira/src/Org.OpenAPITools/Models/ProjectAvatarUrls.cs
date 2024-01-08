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
    /// The URLs of the project&#39;s avatars.
    /// </summary>
    [DataContract]
    public partial class ProjectAvatarUrls : IEquatable<ProjectAvatarUrls>
    {
        /// <summary>
        /// The URL of the item&#39;s 16x16 pixel avatar.
        /// </summary>
        /// <value>The URL of the item&#39;s 16x16 pixel avatar.</value>
        [DataMember(Name="16x16", EmitDefaultValue=false)]
        public string Var16x16 { get; set; }

        /// <summary>
        /// The URL of the item&#39;s 24x24 pixel avatar.
        /// </summary>
        /// <value>The URL of the item&#39;s 24x24 pixel avatar.</value>
        [DataMember(Name="24x24", EmitDefaultValue=false)]
        public string Var24x24 { get; set; }

        /// <summary>
        /// The URL of the item&#39;s 32x32 pixel avatar.
        /// </summary>
        /// <value>The URL of the item&#39;s 32x32 pixel avatar.</value>
        [DataMember(Name="32x32", EmitDefaultValue=false)]
        public string Var32x32 { get; set; }

        /// <summary>
        /// The URL of the item&#39;s 48x48 pixel avatar.
        /// </summary>
        /// <value>The URL of the item&#39;s 48x48 pixel avatar.</value>
        [DataMember(Name="48x48", EmitDefaultValue=false)]
        public string Var48x48 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProjectAvatarUrls {\n");
            sb.Append("  Var16x16: ").Append(Var16x16).Append("\n");
            sb.Append("  Var24x24: ").Append(Var24x24).Append("\n");
            sb.Append("  Var32x32: ").Append(Var32x32).Append("\n");
            sb.Append("  Var48x48: ").Append(Var48x48).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProjectAvatarUrls)obj);
        }

        /// <summary>
        /// Returns true if ProjectAvatarUrls instances are equal
        /// </summary>
        /// <param name="other">Instance of ProjectAvatarUrls to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProjectAvatarUrls other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Var16x16 == other.Var16x16 ||
                    Var16x16 != null &&
                    Var16x16.Equals(other.Var16x16)
                ) && 
                (
                    Var24x24 == other.Var24x24 ||
                    Var24x24 != null &&
                    Var24x24.Equals(other.Var24x24)
                ) && 
                (
                    Var32x32 == other.Var32x32 ||
                    Var32x32 != null &&
                    Var32x32.Equals(other.Var32x32)
                ) && 
                (
                    Var48x48 == other.Var48x48 ||
                    Var48x48 != null &&
                    Var48x48.Equals(other.Var48x48)
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
                    if (Var16x16 != null)
                    hashCode = hashCode * 59 + Var16x16.GetHashCode();
                    if (Var24x24 != null)
                    hashCode = hashCode * 59 + Var24x24.GetHashCode();
                    if (Var32x32 != null)
                    hashCode = hashCode * 59 + Var32x32.GetHashCode();
                    if (Var48x48 != null)
                    hashCode = hashCode * 59 + Var48x48.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProjectAvatarUrls left, ProjectAvatarUrls right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProjectAvatarUrls left, ProjectAvatarUrls right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
