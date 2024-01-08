/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * The version of the OpenAPI document: 2.16.0
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
    public partial class DnsRecordCreate : IEquatable<DnsRecordCreate>
    {
        /// <summary>
        /// Gets or Sets Flag
        /// </summary>
        [DataMember(Name="flag", EmitDefaultValue=true)]
        public long Flag { get; set; }

        /// <summary>
        /// Gets or Sets Hostname
        /// </summary>
        [DataMember(Name="hostname", EmitDefaultValue=false)]
        public string Hostname { get; set; }

        /// <summary>
        /// Gets or Sets Port
        /// </summary>
        [DataMember(Name="port", EmitDefaultValue=true)]
        public long Port { get; set; }

        /// <summary>
        /// Gets or Sets Priority
        /// </summary>
        [DataMember(Name="priority", EmitDefaultValue=true)]
        public long Priority { get; set; }

        /// <summary>
        /// Gets or Sets Tag
        /// </summary>
        [DataMember(Name="tag", EmitDefaultValue=false)]
        public string Tag { get; set; }

        /// <summary>
        /// Gets or Sets Ttl
        /// </summary>
        [DataMember(Name="ttl", EmitDefaultValue=true)]
        public long Ttl { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }

        /// <summary>
        /// Gets or Sets Weight
        /// </summary>
        [DataMember(Name="weight", EmitDefaultValue=true)]
        public long Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DnsRecordCreate {\n");
            sb.Append("  Flag: ").Append(Flag).Append("\n");
            sb.Append("  Hostname: ").Append(Hostname).Append("\n");
            sb.Append("  Port: ").Append(Port).Append("\n");
            sb.Append("  Priority: ").Append(Priority).Append("\n");
            sb.Append("  Tag: ").Append(Tag).Append("\n");
            sb.Append("  Ttl: ").Append(Ttl).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DnsRecordCreate)obj);
        }

        /// <summary>
        /// Returns true if DnsRecordCreate instances are equal
        /// </summary>
        /// <param name="other">Instance of DnsRecordCreate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DnsRecordCreate other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Flag == other.Flag ||
                    
                    Flag.Equals(other.Flag)
                ) && 
                (
                    Hostname == other.Hostname ||
                    Hostname != null &&
                    Hostname.Equals(other.Hostname)
                ) && 
                (
                    Port == other.Port ||
                    
                    Port.Equals(other.Port)
                ) && 
                (
                    Priority == other.Priority ||
                    
                    Priority.Equals(other.Priority)
                ) && 
                (
                    Tag == other.Tag ||
                    Tag != null &&
                    Tag.Equals(other.Tag)
                ) && 
                (
                    Ttl == other.Ttl ||
                    
                    Ttl.Equals(other.Ttl)
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
                ) && 
                (
                    Weight == other.Weight ||
                    
                    Weight.Equals(other.Weight)
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
                    
                    hashCode = hashCode * 59 + Flag.GetHashCode();
                    if (Hostname != null)
                    hashCode = hashCode * 59 + Hostname.GetHashCode();
                    
                    hashCode = hashCode * 59 + Port.GetHashCode();
                    
                    hashCode = hashCode * 59 + Priority.GetHashCode();
                    if (Tag != null)
                    hashCode = hashCode * 59 + Tag.GetHashCode();
                    
                    hashCode = hashCode * 59 + Ttl.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                    
                    hashCode = hashCode * 59 + Weight.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DnsRecordCreate left, DnsRecordCreate right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DnsRecordCreate left, DnsRecordCreate right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
