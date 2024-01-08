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
    /// Details of an application property.
    /// </summary>
    [DataContract]
    public partial class ApplicationProperty : IEquatable<ApplicationProperty>
    {
        /// <summary>
        /// The allowed values, if applicable.
        /// </summary>
        /// <value>The allowed values, if applicable.</value>
        [DataMember(Name="allowedValues", EmitDefaultValue=false)]
        public List<string> AllowedValues { get; set; }

        /// <summary>
        /// The default value of the application property.
        /// </summary>
        /// <value>The default value of the application property.</value>
        [DataMember(Name="defaultValue", EmitDefaultValue=false)]
        public string DefaultValue { get; set; }

        /// <summary>
        /// The description of the application property.
        /// </summary>
        /// <value>The description of the application property.</value>
        [DataMember(Name="desc", EmitDefaultValue=false)]
        public string Desc { get; set; }

        /// <summary>
        /// Gets or Sets Example
        /// </summary>
        [DataMember(Name="example", EmitDefaultValue=false)]
        public string Example { get; set; }

        /// <summary>
        /// The ID of the application property. The ID and key are the same.
        /// </summary>
        /// <value>The ID of the application property. The ID and key are the same.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The key of the application property. The ID and key are the same.
        /// </summary>
        /// <value>The key of the application property. The ID and key are the same.</value>
        [DataMember(Name="key", EmitDefaultValue=false)]
        public string Key { get; set; }

        /// <summary>
        /// The name of the application property.
        /// </summary>
        /// <value>The name of the application property.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The data type of the application property.
        /// </summary>
        /// <value>The data type of the application property.</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// The new value.
        /// </summary>
        /// <value>The new value.</value>
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ApplicationProperty {\n");
            sb.Append("  AllowedValues: ").Append(AllowedValues).Append("\n");
            sb.Append("  DefaultValue: ").Append(DefaultValue).Append("\n");
            sb.Append("  Desc: ").Append(Desc).Append("\n");
            sb.Append("  Example: ").Append(Example).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ApplicationProperty)obj);
        }

        /// <summary>
        /// Returns true if ApplicationProperty instances are equal
        /// </summary>
        /// <param name="other">Instance of ApplicationProperty to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApplicationProperty other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AllowedValues == other.AllowedValues ||
                    AllowedValues != null &&
                    other.AllowedValues != null &&
                    AllowedValues.SequenceEqual(other.AllowedValues)
                ) && 
                (
                    DefaultValue == other.DefaultValue ||
                    DefaultValue != null &&
                    DefaultValue.Equals(other.DefaultValue)
                ) && 
                (
                    Desc == other.Desc ||
                    Desc != null &&
                    Desc.Equals(other.Desc)
                ) && 
                (
                    Example == other.Example ||
                    Example != null &&
                    Example.Equals(other.Example)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Key == other.Key ||
                    Key != null &&
                    Key.Equals(other.Key)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
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
                    if (AllowedValues != null)
                    hashCode = hashCode * 59 + AllowedValues.GetHashCode();
                    if (DefaultValue != null)
                    hashCode = hashCode * 59 + DefaultValue.GetHashCode();
                    if (Desc != null)
                    hashCode = hashCode * 59 + Desc.GetHashCode();
                    if (Example != null)
                    hashCode = hashCode * 59 + Example.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Key != null)
                    hashCode = hashCode * 59 + Key.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ApplicationProperty left, ApplicationProperty right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ApplicationProperty left, ApplicationProperty right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
