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
    public partial class PersonPostRequest : IEquatable<PersonPostRequest>
    {
        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        /// <example>janedoe@example.com</example>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets Login
        /// </summary>
        /// <example>jane</example>
        [DataMember(Name="login", EmitDefaultValue=false)]
        public string Login { get; set; }

        /// <summary>
        /// Gets or Sets Note
        /// </summary>
        /// <example>Jane works in the Engineering team</example>
        [DataMember(Name="note", EmitDefaultValue=false)]
        public string Note { get; set; }

        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        /// <example>superpassword123</example>
        [DataMember(Name="password", EmitDefaultValue=false)]
        public string Password { get; set; }

        /// <summary>
        /// Gets or Sets Realname
        /// </summary>
        /// <example>Jane Doe</example>
        [DataMember(Name="realname", EmitDefaultValue=false)]
        public string Realname { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        /// <example>confirmed</example>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonPostRequest {\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Login: ").Append(Login).Append("\n");
            sb.Append("  Note: ").Append(Note).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Realname: ").Append(Realname).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PersonPostRequest)obj);
        }

        /// <summary>
        /// Returns true if PersonPostRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of PersonPostRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonPostRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Email == other.Email ||
                    Email != null &&
                    Email.Equals(other.Email)
                ) && 
                (
                    Login == other.Login ||
                    Login != null &&
                    Login.Equals(other.Login)
                ) && 
                (
                    Note == other.Note ||
                    Note != null &&
                    Note.Equals(other.Note)
                ) && 
                (
                    Password == other.Password ||
                    Password != null &&
                    Password.Equals(other.Password)
                ) && 
                (
                    Realname == other.Realname ||
                    Realname != null &&
                    Realname.Equals(other.Realname)
                ) && 
                (
                    State == other.State ||
                    State != null &&
                    State.Equals(other.State)
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
                    if (Email != null)
                    hashCode = hashCode * 59 + Email.GetHashCode();
                    if (Login != null)
                    hashCode = hashCode * 59 + Login.GetHashCode();
                    if (Note != null)
                    hashCode = hashCode * 59 + Note.GetHashCode();
                    if (Password != null)
                    hashCode = hashCode * 59 + Password.GetHashCode();
                    if (Realname != null)
                    hashCode = hashCode * 59 + Realname.GetHashCode();
                    if (State != null)
                    hashCode = hashCode * 59 + State.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PersonPostRequest left, PersonPostRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PersonPostRequest left, PersonPostRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
