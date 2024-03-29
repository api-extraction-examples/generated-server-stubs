/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * The version of the OpenAPI document: 4.4.12
 * Contact: admin@collegefootballdata.com
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
    public partial class TeamLocation : IEquatable<TeamLocation>
    {
        /// <summary>
        /// Gets or Sets Capacity
        /// </summary>
        [DataMember(Name="capacity", EmitDefaultValue=true)]
        public decimal Capacity { get; set; }

        /// <summary>
        /// Gets or Sets City
        /// </summary>
        [DataMember(Name="city", EmitDefaultValue=false)]
        public string City { get; set; }

        /// <summary>
        /// Gets or Sets CountryCode
        /// </summary>
        [DataMember(Name="country_code", EmitDefaultValue=false)]
        public string CountryCode { get; set; }

        /// <summary>
        /// Gets or Sets Dome
        /// </summary>
        [DataMember(Name="dome", EmitDefaultValue=true)]
        public bool Dome { get; set; }

        /// <summary>
        /// Gets or Sets Elevation
        /// </summary>
        [DataMember(Name="elevation", EmitDefaultValue=true)]
        public decimal Elevation { get; set; }

        /// <summary>
        /// Gets or Sets Grass
        /// </summary>
        [DataMember(Name="grass", EmitDefaultValue=true)]
        public bool Grass { get; set; }

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
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Gets or Sets Timezone
        /// </summary>
        [DataMember(Name="timezone", EmitDefaultValue=false)]
        public string Timezone { get; set; }

        /// <summary>
        /// Gets or Sets VenueId
        /// </summary>
        [DataMember(Name="venue_id", EmitDefaultValue=true)]
        public int VenueId { get; set; }

        /// <summary>
        /// Gets or Sets YearConstructed
        /// </summary>
        [DataMember(Name="year_constructed", EmitDefaultValue=true)]
        public decimal YearConstructed { get; set; }

        /// <summary>
        /// Gets or Sets Zip
        /// </summary>
        [DataMember(Name="zip", EmitDefaultValue=false)]
        public string Zip { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TeamLocation {\n");
            sb.Append("  Capacity: ").Append(Capacity).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  Dome: ").Append(Dome).Append("\n");
            sb.Append("  Elevation: ").Append(Elevation).Append("\n");
            sb.Append("  Grass: ").Append(Grass).Append("\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Timezone: ").Append(Timezone).Append("\n");
            sb.Append("  VenueId: ").Append(VenueId).Append("\n");
            sb.Append("  YearConstructed: ").Append(YearConstructed).Append("\n");
            sb.Append("  Zip: ").Append(Zip).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TeamLocation)obj);
        }

        /// <summary>
        /// Returns true if TeamLocation instances are equal
        /// </summary>
        /// <param name="other">Instance of TeamLocation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TeamLocation other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Capacity == other.Capacity ||
                    
                    Capacity.Equals(other.Capacity)
                ) && 
                (
                    City == other.City ||
                    City != null &&
                    City.Equals(other.City)
                ) && 
                (
                    CountryCode == other.CountryCode ||
                    CountryCode != null &&
                    CountryCode.Equals(other.CountryCode)
                ) && 
                (
                    Dome == other.Dome ||
                    
                    Dome.Equals(other.Dome)
                ) && 
                (
                    Elevation == other.Elevation ||
                    
                    Elevation.Equals(other.Elevation)
                ) && 
                (
                    Grass == other.Grass ||
                    
                    Grass.Equals(other.Grass)
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
                    State == other.State ||
                    State != null &&
                    State.Equals(other.State)
                ) && 
                (
                    Timezone == other.Timezone ||
                    Timezone != null &&
                    Timezone.Equals(other.Timezone)
                ) && 
                (
                    VenueId == other.VenueId ||
                    
                    VenueId.Equals(other.VenueId)
                ) && 
                (
                    YearConstructed == other.YearConstructed ||
                    
                    YearConstructed.Equals(other.YearConstructed)
                ) && 
                (
                    Zip == other.Zip ||
                    Zip != null &&
                    Zip.Equals(other.Zip)
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
                    
                    hashCode = hashCode * 59 + Capacity.GetHashCode();
                    if (City != null)
                    hashCode = hashCode * 59 + City.GetHashCode();
                    if (CountryCode != null)
                    hashCode = hashCode * 59 + CountryCode.GetHashCode();
                    
                    hashCode = hashCode * 59 + Dome.GetHashCode();
                    
                    hashCode = hashCode * 59 + Elevation.GetHashCode();
                    
                    hashCode = hashCode * 59 + Grass.GetHashCode();
                    
                    hashCode = hashCode * 59 + Latitude.GetHashCode();
                    
                    hashCode = hashCode * 59 + Longitude.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (State != null)
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (Timezone != null)
                    hashCode = hashCode * 59 + Timezone.GetHashCode();
                    
                    hashCode = hashCode * 59 + VenueId.GetHashCode();
                    
                    hashCode = hashCode * 59 + YearConstructed.GetHashCode();
                    if (Zip != null)
                    hashCode = hashCode * 59 + Zip.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TeamLocation left, TeamLocation right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TeamLocation left, TeamLocation right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
