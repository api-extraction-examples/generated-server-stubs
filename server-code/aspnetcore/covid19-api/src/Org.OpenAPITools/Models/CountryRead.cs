/*
 * COVID-19 data API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.2.6
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
    public partial class CountryRead : IEquatable<CountryRead>
    {
        /// <summary>
        /// Gets or Sets Confirmed
        /// </summary>
        [DataMember(Name="confirmed", EmitDefaultValue=true)]
        public int Confirmed { get; set; }

        /// <summary>
        /// Gets or Sets Critical
        /// </summary>
        [DataMember(Name="critical", EmitDefaultValue=true)]
        public int Critical { get; set; }

        /// <summary>
        /// Gets or Sets Deaths
        /// </summary>
        [DataMember(Name="deaths", EmitDefaultValue=true)]
        public int Deaths { get; set; }

        /// <summary>
        /// Gets or Sets LastChange
        /// </summary>
        [DataMember(Name="lastChange", EmitDefaultValue=false)]
        public DateTime LastChange { get; set; }

        /// <summary>
        /// Gets or Sets LastUpdate
        /// </summary>
        [DataMember(Name="lastUpdate", EmitDefaultValue=false)]
        public DateTime LastUpdate { get; set; }

        /// <summary>
        /// Gets or Sets Latitude
        /// </summary>
        [DataMember(Name="latitude", EmitDefaultValue=true)]
        public decimal Latitude { get; set; }

        /// <summary>
        /// Gets or Sets Longitude
        /// </summary>
        [DataMember(Name="longitude", EmitDefaultValue=true)]
        public decimal Longitude { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Recovered
        /// </summary>
        [DataMember(Name="recovered", EmitDefaultValue=true)]
        public int Recovered { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CountryRead {\n");
            sb.Append("  Confirmed: ").Append(Confirmed).Append("\n");
            sb.Append("  Critical: ").Append(Critical).Append("\n");
            sb.Append("  Deaths: ").Append(Deaths).Append("\n");
            sb.Append("  LastChange: ").Append(LastChange).Append("\n");
            sb.Append("  LastUpdate: ").Append(LastUpdate).Append("\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Recovered: ").Append(Recovered).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CountryRead)obj);
        }

        /// <summary>
        /// Returns true if CountryRead instances are equal
        /// </summary>
        /// <param name="other">Instance of CountryRead to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CountryRead other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Confirmed == other.Confirmed ||
                    
                    Confirmed.Equals(other.Confirmed)
                ) && 
                (
                    Critical == other.Critical ||
                    
                    Critical.Equals(other.Critical)
                ) && 
                (
                    Deaths == other.Deaths ||
                    
                    Deaths.Equals(other.Deaths)
                ) && 
                (
                    LastChange == other.LastChange ||
                    LastChange != null &&
                    LastChange.Equals(other.LastChange)
                ) && 
                (
                    LastUpdate == other.LastUpdate ||
                    LastUpdate != null &&
                    LastUpdate.Equals(other.LastUpdate)
                ) && 
                (
                    Latitude == other.Latitude ||
                    
                    Latitude.Equals(other.Latitude)
                ) && 
                (
                    Longitude == other.Longitude ||
                    
                    Longitude.Equals(other.Longitude)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Recovered == other.Recovered ||
                    
                    Recovered.Equals(other.Recovered)
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
                    
                    hashCode = hashCode * 59 + Confirmed.GetHashCode();
                    
                    hashCode = hashCode * 59 + Critical.GetHashCode();
                    
                    hashCode = hashCode * 59 + Deaths.GetHashCode();
                    if (LastChange != null)
                    hashCode = hashCode * 59 + LastChange.GetHashCode();
                    if (LastUpdate != null)
                    hashCode = hashCode * 59 + LastUpdate.GetHashCode();
                    
                    hashCode = hashCode * 59 + Latitude.GetHashCode();
                    
                    hashCode = hashCode * 59 + Longitude.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Recovered.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CountryRead left, CountryRead right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CountryRead left, CountryRead right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
