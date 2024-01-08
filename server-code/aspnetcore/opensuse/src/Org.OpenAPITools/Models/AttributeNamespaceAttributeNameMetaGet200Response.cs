/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * The version of the OpenAPI document: 2.10.50
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
    /// 
    /// </summary>
    [DataContract]
    public partial class AttributeNamespaceAttributeNameMetaGet200Response : IEquatable<AttributeNamespaceAttributeNameMetaGet200Response>
    {
        /// <summary>
        /// Gets or Sets Allowed
        /// </summary>
        [DataMember(Name="allowed", EmitDefaultValue=false)]
        public AttributeNamespaceAttributeNameMetaGet200ResponseAllowed Allowed { get; set; }

        /// <summary>
        /// Gets or Sets Count
        /// </summary>
        /// <example>0</example>
        [DataMember(Name="count", EmitDefaultValue=true)]
        public int Count { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        /// <example>An example description for an attribute.</example>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets ModifiableBy
        /// </summary>
        [DataMember(Name="modifiable_by", EmitDefaultValue=false)]
        public List<AttributeNamespaceMetaGet200ResponseModifiableByInner> ModifiableBy { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        /// <example>OBS_TEST</example>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets VarNamespace
        /// </summary>
        /// <example>OwnerRootProjectTest</example>
        [DataMember(Name="namespace", EmitDefaultValue=false)]
        public string VarNamespace { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AttributeNamespaceAttributeNameMetaGet200Response {\n");
            sb.Append("  Allowed: ").Append(Allowed).Append("\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ModifiableBy: ").Append(ModifiableBy).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  VarNamespace: ").Append(VarNamespace).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AttributeNamespaceAttributeNameMetaGet200Response)obj);
        }

        /// <summary>
        /// Returns true if AttributeNamespaceAttributeNameMetaGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of AttributeNamespaceAttributeNameMetaGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AttributeNamespaceAttributeNameMetaGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Allowed == other.Allowed ||
                    Allowed != null &&
                    Allowed.Equals(other.Allowed)
                ) && 
                (
                    Count == other.Count ||
                    
                    Count.Equals(other.Count)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    ModifiableBy == other.ModifiableBy ||
                    ModifiableBy != null &&
                    other.ModifiableBy != null &&
                    ModifiableBy.SequenceEqual(other.ModifiableBy)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    VarNamespace == other.VarNamespace ||
                    VarNamespace != null &&
                    VarNamespace.Equals(other.VarNamespace)
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
                    if (Allowed != null)
                    hashCode = hashCode * 59 + Allowed.GetHashCode();
                    
                    hashCode = hashCode * 59 + Count.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (ModifiableBy != null)
                    hashCode = hashCode * 59 + ModifiableBy.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (VarNamespace != null)
                    hashCode = hashCode * 59 + VarNamespace.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AttributeNamespaceAttributeNameMetaGet200Response left, AttributeNamespaceAttributeNameMetaGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AttributeNamespaceAttributeNameMetaGet200Response left, AttributeNamespaceAttributeNameMetaGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}