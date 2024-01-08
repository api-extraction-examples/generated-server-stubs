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
    /// IndexInfo contains information about a registry.
    /// </summary>
    [DataContract]
    public partial class IndexInfo : IEquatable<IndexInfo>
    {
        /// <summary>
        /// List of mirrors, expressed as URIs. 
        /// </summary>
        /// <value>List of mirrors, expressed as URIs. </value>
        /// <example>[&quot;https://hub-mirror.corp.example.com:5000/&quot;,&quot;https://registry-2.docker.io/&quot;,&quot;https://registry-3.docker.io/&quot;]</example>
        [DataMember(Name="Mirrors", EmitDefaultValue=false)]
        public List<string> Mirrors { get; set; }

        /// <summary>
        /// Name of the registry, such as \&quot;docker.io\&quot;. 
        /// </summary>
        /// <value>Name of the registry, such as \&quot;docker.io\&quot;. </value>
        /// <example>docker.io</example>
        [DataMember(Name="Name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Indicates whether this is an official registry (i.e., Docker Hub / docker.io) 
        /// </summary>
        /// <value>Indicates whether this is an official registry (i.e., Docker Hub / docker.io) </value>
        /// <example>true</example>
        [DataMember(Name="Official", EmitDefaultValue=true)]
        public bool Official { get; set; }

        /// <summary>
        /// Indicates if the the registry is part of the list of insecure registries.  If &#x60;false&#x60;, the registry is insecure. Insecure registries accept un-encrypted (HTTP) and/or untrusted (HTTPS with certificates from unknown CAs) communication.  &gt; **Warning**: Insecure registries can be useful when running a local &gt; registry. However, because its use creates security vulnerabilities &gt; it should ONLY be enabled for testing purposes. For increased &gt; security, users should add their CA to their system&#39;s list of &gt; trusted CAs instead of enabling this option. 
        /// </summary>
        /// <value>Indicates if the the registry is part of the list of insecure registries.  If &#x60;false&#x60;, the registry is insecure. Insecure registries accept un-encrypted (HTTP) and/or untrusted (HTTPS with certificates from unknown CAs) communication.  &gt; **Warning**: Insecure registries can be useful when running a local &gt; registry. However, because its use creates security vulnerabilities &gt; it should ONLY be enabled for testing purposes. For increased &gt; security, users should add their CA to their system&#39;s list of &gt; trusted CAs instead of enabling this option. </value>
        /// <example>true</example>
        [DataMember(Name="Secure", EmitDefaultValue=true)]
        public bool Secure { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IndexInfo {\n");
            sb.Append("  Mirrors: ").Append(Mirrors).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Official: ").Append(Official).Append("\n");
            sb.Append("  Secure: ").Append(Secure).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IndexInfo)obj);
        }

        /// <summary>
        /// Returns true if IndexInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of IndexInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IndexInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Mirrors == other.Mirrors ||
                    Mirrors != null &&
                    other.Mirrors != null &&
                    Mirrors.SequenceEqual(other.Mirrors)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Official == other.Official ||
                    
                    Official.Equals(other.Official)
                ) && 
                (
                    Secure == other.Secure ||
                    
                    Secure.Equals(other.Secure)
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
                    if (Mirrors != null)
                    hashCode = hashCode * 59 + Mirrors.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Official.GetHashCode();
                    
                    hashCode = hashCode * 59 + Secure.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IndexInfo left, IndexInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IndexInfo left, IndexInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}