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
    public partial class ContainerSummaryInner : IEquatable<ContainerSummaryInner>
    {
        /// <summary>
        /// Command to run when starting the container
        /// </summary>
        /// <value>Command to run when starting the container</value>
        [DataMember(Name="Command", EmitDefaultValue=false)]
        public string Command { get; set; }

        /// <summary>
        /// When the container was created
        /// </summary>
        /// <value>When the container was created</value>
        [DataMember(Name="Created", EmitDefaultValue=true)]
        public long Created { get; set; }

        /// <summary>
        /// Gets or Sets HostConfig
        /// </summary>
        [DataMember(Name="HostConfig", EmitDefaultValue=false)]
        public ContainerSummaryInnerHostConfig HostConfig { get; set; }

        /// <summary>
        /// The ID of this container
        /// </summary>
        /// <value>The ID of this container</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The name of the image used when creating this container
        /// </summary>
        /// <value>The name of the image used when creating this container</value>
        [DataMember(Name="Image", EmitDefaultValue=false)]
        public string Image { get; set; }

        /// <summary>
        /// The ID of the image that this container was created from
        /// </summary>
        /// <value>The ID of the image that this container was created from</value>
        [DataMember(Name="ImageID", EmitDefaultValue=false)]
        public string ImageID { get; set; }

        /// <summary>
        /// User-defined key/value metadata.
        /// </summary>
        /// <value>User-defined key/value metadata.</value>
        [DataMember(Name="Labels", EmitDefaultValue=false)]
        public Dictionary<string, string> Labels { get; set; }

        /// <summary>
        /// Gets or Sets Mounts
        /// </summary>
        [DataMember(Name="Mounts", EmitDefaultValue=false)]
        public List<Mount> Mounts { get; set; }

        /// <summary>
        /// The names that this container has been given
        /// </summary>
        /// <value>The names that this container has been given</value>
        [DataMember(Name="Names", EmitDefaultValue=false)]
        public List<string> Names { get; set; }

        /// <summary>
        /// Gets or Sets NetworkSettings
        /// </summary>
        [DataMember(Name="NetworkSettings", EmitDefaultValue=false)]
        public ContainerSummaryInnerNetworkSettings NetworkSettings { get; set; }

        /// <summary>
        /// The ports exposed by this container
        /// </summary>
        /// <value>The ports exposed by this container</value>
        [DataMember(Name="Ports", EmitDefaultValue=false)]
        public List<Port> Ports { get; set; }

        /// <summary>
        /// The total size of all the files in this container
        /// </summary>
        /// <value>The total size of all the files in this container</value>
        [DataMember(Name="SizeRootFs", EmitDefaultValue=true)]
        public long SizeRootFs { get; set; }

        /// <summary>
        /// The size of files that have been created or changed by this container
        /// </summary>
        /// <value>The size of files that have been created or changed by this container</value>
        [DataMember(Name="SizeRw", EmitDefaultValue=true)]
        public long SizeRw { get; set; }

        /// <summary>
        /// The state of this container (e.g. &#x60;Exited&#x60;)
        /// </summary>
        /// <value>The state of this container (e.g. &#x60;Exited&#x60;)</value>
        [DataMember(Name="State", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Additional human-readable status of this container (e.g. &#x60;Exit 0&#x60;)
        /// </summary>
        /// <value>Additional human-readable status of this container (e.g. &#x60;Exit 0&#x60;)</value>
        [DataMember(Name="Status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContainerSummaryInner {\n");
            sb.Append("  Command: ").Append(Command).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  HostConfig: ").Append(HostConfig).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Image: ").Append(Image).Append("\n");
            sb.Append("  ImageID: ").Append(ImageID).Append("\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
            sb.Append("  Mounts: ").Append(Mounts).Append("\n");
            sb.Append("  Names: ").Append(Names).Append("\n");
            sb.Append("  NetworkSettings: ").Append(NetworkSettings).Append("\n");
            sb.Append("  Ports: ").Append(Ports).Append("\n");
            sb.Append("  SizeRootFs: ").Append(SizeRootFs).Append("\n");
            sb.Append("  SizeRw: ").Append(SizeRw).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ContainerSummaryInner)obj);
        }

        /// <summary>
        /// Returns true if ContainerSummaryInner instances are equal
        /// </summary>
        /// <param name="other">Instance of ContainerSummaryInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContainerSummaryInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Command == other.Command ||
                    Command != null &&
                    Command.Equals(other.Command)
                ) && 
                (
                    Created == other.Created ||
                    
                    Created.Equals(other.Created)
                ) && 
                (
                    HostConfig == other.HostConfig ||
                    HostConfig != null &&
                    HostConfig.Equals(other.HostConfig)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Image == other.Image ||
                    Image != null &&
                    Image.Equals(other.Image)
                ) && 
                (
                    ImageID == other.ImageID ||
                    ImageID != null &&
                    ImageID.Equals(other.ImageID)
                ) && 
                (
                    Labels == other.Labels ||
                    Labels != null &&
                    other.Labels != null &&
                    Labels.SequenceEqual(other.Labels)
                ) && 
                (
                    Mounts == other.Mounts ||
                    Mounts != null &&
                    other.Mounts != null &&
                    Mounts.SequenceEqual(other.Mounts)
                ) && 
                (
                    Names == other.Names ||
                    Names != null &&
                    other.Names != null &&
                    Names.SequenceEqual(other.Names)
                ) && 
                (
                    NetworkSettings == other.NetworkSettings ||
                    NetworkSettings != null &&
                    NetworkSettings.Equals(other.NetworkSettings)
                ) && 
                (
                    Ports == other.Ports ||
                    Ports != null &&
                    other.Ports != null &&
                    Ports.SequenceEqual(other.Ports)
                ) && 
                (
                    SizeRootFs == other.SizeRootFs ||
                    
                    SizeRootFs.Equals(other.SizeRootFs)
                ) && 
                (
                    SizeRw == other.SizeRw ||
                    
                    SizeRw.Equals(other.SizeRw)
                ) && 
                (
                    State == other.State ||
                    State != null &&
                    State.Equals(other.State)
                ) && 
                (
                    Status == other.Status ||
                    Status != null &&
                    Status.Equals(other.Status)
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
                    if (Command != null)
                    hashCode = hashCode * 59 + Command.GetHashCode();
                    
                    hashCode = hashCode * 59 + Created.GetHashCode();
                    if (HostConfig != null)
                    hashCode = hashCode * 59 + HostConfig.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Image != null)
                    hashCode = hashCode * 59 + Image.GetHashCode();
                    if (ImageID != null)
                    hashCode = hashCode * 59 + ImageID.GetHashCode();
                    if (Labels != null)
                    hashCode = hashCode * 59 + Labels.GetHashCode();
                    if (Mounts != null)
                    hashCode = hashCode * 59 + Mounts.GetHashCode();
                    if (Names != null)
                    hashCode = hashCode * 59 + Names.GetHashCode();
                    if (NetworkSettings != null)
                    hashCode = hashCode * 59 + NetworkSettings.GetHashCode();
                    if (Ports != null)
                    hashCode = hashCode * 59 + Ports.GetHashCode();
                    
                    hashCode = hashCode * 59 + SizeRootFs.GetHashCode();
                    
                    hashCode = hashCode * 59 + SizeRw.GetHashCode();
                    if (State != null)
                    hashCode = hashCode * 59 + State.GetHashCode();
                    if (Status != null)
                    hashCode = hashCode * 59 + Status.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ContainerSummaryInner left, ContainerSummaryInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ContainerSummaryInner left, ContainerSummaryInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
