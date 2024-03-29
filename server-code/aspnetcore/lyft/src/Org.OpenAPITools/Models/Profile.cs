/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api-support@lyft.com
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
    /// Represents the general information about a user.
    /// </summary>
    [DataContract]
    public partial class Profile : IEquatable<Profile>
    {
        /// <summary>
        /// The first name of this user
        /// </summary>
        /// <value>The first name of this user</value>
        [Required]
        [DataMember(Name="first_name", EmitDefaultValue=false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Indicates whether this user has taken at least one Lyft ride
        /// </summary>
        /// <value>Indicates whether this user has taken at least one Lyft ride</value>
        [Required]
        [DataMember(Name="has_taken_a_ride", EmitDefaultValue=true)]
        public bool HasTakenARide { get; set; }

        /// <summary>
        /// The unique ID of this user
        /// </summary>
        /// <value>The unique ID of this user</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The last name of this user
        /// </summary>
        /// <value>The last name of this user</value>
        [Required]
        [DataMember(Name="last_name", EmitDefaultValue=false)]
        public string LastName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Profile {\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  HasTakenARide: ").Append(HasTakenARide).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Profile)obj);
        }

        /// <summary>
        /// Returns true if Profile instances are equal
        /// </summary>
        /// <param name="other">Instance of Profile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Profile other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    FirstName == other.FirstName ||
                    FirstName != null &&
                    FirstName.Equals(other.FirstName)
                ) && 
                (
                    HasTakenARide == other.HasTakenARide ||
                    
                    HasTakenARide.Equals(other.HasTakenARide)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    LastName == other.LastName ||
                    LastName != null &&
                    LastName.Equals(other.LastName)
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
                    if (FirstName != null)
                    hashCode = hashCode * 59 + FirstName.GetHashCode();
                    
                    hashCode = hashCode * 59 + HasTakenARide.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (LastName != null)
                    hashCode = hashCode * 59 + LastName.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Profile left, Profile right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Profile left, Profile right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
