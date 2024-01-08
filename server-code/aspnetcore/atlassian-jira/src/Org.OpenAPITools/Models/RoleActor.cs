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
    /// Details about a user assigned to a project role.
    /// </summary>
    [DataContract]
    public partial class RoleActor : IEquatable<RoleActor>
    {
        /// <summary>
        /// Gets or Sets ActorGroup
        /// </summary>
        [DataMember(Name="actorGroup", EmitDefaultValue=false)]
        public ProjectRoleGroup ActorGroup { get; set; }

        /// <summary>
        /// Gets or Sets ActorUser
        /// </summary>
        [DataMember(Name="actorUser", EmitDefaultValue=false)]
        public ProjectRoleUser ActorUser { get; set; }

        /// <summary>
        /// The avatar of the role actor.
        /// </summary>
        /// <value>The avatar of the role actor.</value>
        [DataMember(Name="avatarUrl", EmitDefaultValue=false)]
        public string AvatarUrl { get; set; }

        /// <summary>
        /// The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user&#39;s name.
        /// </summary>
        /// <value>The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user&#39;s name.</value>
        [DataMember(Name="displayName", EmitDefaultValue=false)]
        public string DisplayName { get; set; }

        /// <summary>
        /// The ID of the role actor.
        /// </summary>
        /// <value>The ID of the role actor.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public long Id { get; set; }

        /// <summary>
        /// This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
        /// </summary>
        /// <value>This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }


        /// <summary>
        /// The type of role actor.
        /// </summary>
        /// <value>The type of role actor.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum GroupRoleActorEnum for atlassian-group-role-actor
            /// </summary>
            [EnumMember(Value = "atlassian-group-role-actor")]
            GroupRoleActorEnum = 1,
            
            /// <summary>
            /// Enum UserRoleActorEnum for atlassian-user-role-actor
            /// </summary>
            [EnumMember(Value = "atlassian-user-role-actor")]
            UserRoleActorEnum = 2
        }

        /// <summary>
        /// The type of role actor.
        /// </summary>
        /// <value>The type of role actor.</value>
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RoleActor {\n");
            sb.Append("  ActorGroup: ").Append(ActorGroup).Append("\n");
            sb.Append("  ActorUser: ").Append(ActorUser).Append("\n");
            sb.Append("  AvatarUrl: ").Append(AvatarUrl).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RoleActor)obj);
        }

        /// <summary>
        /// Returns true if RoleActor instances are equal
        /// </summary>
        /// <param name="other">Instance of RoleActor to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RoleActor other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ActorGroup == other.ActorGroup ||
                    ActorGroup != null &&
                    ActorGroup.Equals(other.ActorGroup)
                ) && 
                (
                    ActorUser == other.ActorUser ||
                    ActorUser != null &&
                    ActorUser.Equals(other.ActorUser)
                ) && 
                (
                    AvatarUrl == other.AvatarUrl ||
                    AvatarUrl != null &&
                    AvatarUrl.Equals(other.AvatarUrl)
                ) && 
                (
                    DisplayName == other.DisplayName ||
                    DisplayName != null &&
                    DisplayName.Equals(other.DisplayName)
                ) && 
                (
                    Id == other.Id ||
                    
                    Id.Equals(other.Id)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
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
                    if (ActorGroup != null)
                    hashCode = hashCode * 59 + ActorGroup.GetHashCode();
                    if (ActorUser != null)
                    hashCode = hashCode * 59 + ActorUser.GetHashCode();
                    if (AvatarUrl != null)
                    hashCode = hashCode * 59 + AvatarUrl.GetHashCode();
                    if (DisplayName != null)
                    hashCode = hashCode * 59 + DisplayName.GetHashCode();
                    
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RoleActor left, RoleActor right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RoleActor left, RoleActor right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
