/*
 * Docker Engine API
 *
 * The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release of Docker, so API calls are versioned to ensure that clients don't break.  For Docker Engine 17.09, the API version is 1.32. To lock to this version, you prefix the URL with `/v1.32`. For example, calling `/info` is the same as calling `/v1.32/info`.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  In previous versions of Docker, it was possible to access the API without providing a version. This behaviour is now deprecated will be removed in a future version of Docker.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer Docker daemons.  This documentation is for version 1.33 of the API. Use this table to find documentation for previous versions of the API:  Docker version  | API version | Changes - -- -- -- -- -- -- -- -|- -- -- -- -- -- --|- -- -- -- -- 17.09.x | [1.31](https://docs.docker.com/engine/api/v1.32/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-32-api-changes) 17.07.x | [1.31](https://docs.docker.com/engine/api/v1.31/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-31-api-changes) 17.06.x | [1.30](https://docs.docker.com/engine/api/v1.30/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-30-api-changes) 17.05.x | [1.29](https://docs.docker.com/engine/api/v1.29/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-29-api-changes) 17.04.x | [1.28](https://docs.docker.com/engine/api/v1.28/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-28-api-changes) 17.03.1 | [1.27](https://docs.docker.com/engine/api/v1.27/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-27-api-changes) 1.13.1 & 17.03.0 | [1.26](https://docs.docker.com/engine/api/v1.26/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-26-api-changes) 1.13.0 | [1.25](https://docs.docker.com/engine/api/v1.25/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-25-api-changes) 1.12.x | [1.24](https://docs.docker.com/engine/api/v1.24/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-24-api-changes) 1.11.x | [1.23](https://docs.docker.com/engine/api/v1.23/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-23-api-changes) 1.10.x | [1.22](https://docs.docker.com/engine/api/v1.22/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-22-api-changes) 1.9.x | [1.21](https://docs.docker.com/engine/api/v1.21/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-21-api-changes) 1.8.x | [1.20](https://docs.docker.com/engine/api/v1.20/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-20-api-changes) 1.7.x | [1.19](https://docs.docker.com/engine/api/v1.19/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-19-api-changes) 1.6.x | [1.18](https://docs.docker.com/engine/api/v1.18/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-18-api-changes)  # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a Base64 encoded (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
 *
 * The version of the OpenAPI document: 1.33
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
    public partial class Secret : IEquatable<Secret>
    {
        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        /// <example>2017-07-20T13:55:28.678958722Z</example>
        [DataMember(Name="CreatedAt", EmitDefaultValue=false)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets ID
        /// </summary>
        /// <example>blt1owaxmitz71s9v5zh81zun</example>
        [DataMember(Name="ID", EmitDefaultValue=false)]
        public string ID { get; set; }

        /// <summary>
        /// Gets or Sets Spec
        /// </summary>
        [DataMember(Name="Spec", EmitDefaultValue=false)]
        public SecretSpec Spec { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        /// <example>2017-07-20T13:55:28.678958722Z</example>
        [DataMember(Name="UpdatedAt", EmitDefaultValue=false)]
        public string UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets VarVersion
        /// </summary>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public ObjectVersion VarVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Secret {\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  ID: ").Append(ID).Append("\n");
            sb.Append("  Spec: ").Append(Spec).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Secret)obj);
        }

        /// <summary>
        /// Returns true if Secret instances are equal
        /// </summary>
        /// <param name="other">Instance of Secret to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Secret other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CreatedAt == other.CreatedAt ||
                    CreatedAt != null &&
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    ID == other.ID ||
                    ID != null &&
                    ID.Equals(other.ID)
                ) && 
                (
                    Spec == other.Spec ||
                    Spec != null &&
                    Spec.Equals(other.Spec)
                ) && 
                (
                    UpdatedAt == other.UpdatedAt ||
                    UpdatedAt != null &&
                    UpdatedAt.Equals(other.UpdatedAt)
                ) && 
                (
                    VarVersion == other.VarVersion ||
                    VarVersion != null &&
                    VarVersion.Equals(other.VarVersion)
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
                    if (CreatedAt != null)
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (ID != null)
                    hashCode = hashCode * 59 + ID.GetHashCode();
                    if (Spec != null)
                    hashCode = hashCode * 59 + Spec.GetHashCode();
                    if (UpdatedAt != null)
                    hashCode = hashCode * 59 + UpdatedAt.GetHashCode();
                    if (VarVersion != null)
                    hashCode = hashCode * 59 + VarVersion.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Secret left, Secret right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Secret left, Secret right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
