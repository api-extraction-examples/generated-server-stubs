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
    /// Details of a dashboard.
    /// </summary>
    [DataContract]
    public partial class Dashboard : IEquatable<Dashboard>
    {
        /// <summary>
        /// The automatic refresh interval for the dashboard in milliseconds.
        /// </summary>
        /// <value>The automatic refresh interval for the dashboard in milliseconds.</value>
        [DataMember(Name="automaticRefreshMs", EmitDefaultValue=true)]
        public int AutomaticRefreshMs { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The details of any edit share permissions for the dashboard.
        /// </summary>
        /// <value>The details of any edit share permissions for the dashboard.</value>
        [DataMember(Name="editPermissions", EmitDefaultValue=false)]
        public List<SharePermission> EditPermissions { get; set; }

        /// <summary>
        /// The ID of the dashboard.
        /// </summary>
        /// <value>The ID of the dashboard.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Whether the dashboard is selected as a favorite by the user.
        /// </summary>
        /// <value>Whether the dashboard is selected as a favorite by the user.</value>
        [DataMember(Name="isFavourite", EmitDefaultValue=true)]
        public bool IsFavourite { get; set; }

        /// <summary>
        /// Whether the current user has permission to edit the dashboard.
        /// </summary>
        /// <value>Whether the current user has permission to edit the dashboard.</value>
        [DataMember(Name="isWritable", EmitDefaultValue=true)]
        public bool IsWritable { get; set; }

        /// <summary>
        /// The name of the dashboard.
        /// </summary>
        /// <value>The name of the dashboard.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Owner
        /// </summary>
        [DataMember(Name="owner", EmitDefaultValue=false)]
        public DashboardOwner Owner { get; set; }

        /// <summary>
        /// The number of users who have this dashboard as a favorite.
        /// </summary>
        /// <value>The number of users who have this dashboard as a favorite.</value>
        [DataMember(Name="popularity", EmitDefaultValue=true)]
        public long Popularity { get; set; }

        /// <summary>
        /// The rank of this dashboard.
        /// </summary>
        /// <value>The rank of this dashboard.</value>
        [DataMember(Name="rank", EmitDefaultValue=true)]
        public int Rank { get; set; }

        /// <summary>
        /// The URL of these dashboard details.
        /// </summary>
        /// <value>The URL of these dashboard details.</value>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public string Self { get; set; }

        /// <summary>
        /// The details of any view share permissions for the dashboard.
        /// </summary>
        /// <value>The details of any view share permissions for the dashboard.</value>
        [DataMember(Name="sharePermissions", EmitDefaultValue=false)]
        public List<SharePermission> SharePermissions { get; set; }

        /// <summary>
        /// Whether the current dashboard is system dashboard.
        /// </summary>
        /// <value>Whether the current dashboard is system dashboard.</value>
        [DataMember(Name="systemDashboard", EmitDefaultValue=true)]
        public bool SystemDashboard { get; set; }

        /// <summary>
        /// The URL of the dashboard.
        /// </summary>
        /// <value>The URL of the dashboard.</value>
        [DataMember(Name="view", EmitDefaultValue=false)]
        public string View { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Dashboard {\n");
            sb.Append("  AutomaticRefreshMs: ").Append(AutomaticRefreshMs).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  EditPermissions: ").Append(EditPermissions).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsFavourite: ").Append(IsFavourite).Append("\n");
            sb.Append("  IsWritable: ").Append(IsWritable).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  Popularity: ").Append(Popularity).Append("\n");
            sb.Append("  Rank: ").Append(Rank).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  SharePermissions: ").Append(SharePermissions).Append("\n");
            sb.Append("  SystemDashboard: ").Append(SystemDashboard).Append("\n");
            sb.Append("  View: ").Append(View).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Dashboard)obj);
        }

        /// <summary>
        /// Returns true if Dashboard instances are equal
        /// </summary>
        /// <param name="other">Instance of Dashboard to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Dashboard other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AutomaticRefreshMs == other.AutomaticRefreshMs ||
                    
                    AutomaticRefreshMs.Equals(other.AutomaticRefreshMs)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    EditPermissions == other.EditPermissions ||
                    EditPermissions != null &&
                    other.EditPermissions != null &&
                    EditPermissions.SequenceEqual(other.EditPermissions)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    IsFavourite == other.IsFavourite ||
                    
                    IsFavourite.Equals(other.IsFavourite)
                ) && 
                (
                    IsWritable == other.IsWritable ||
                    
                    IsWritable.Equals(other.IsWritable)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Owner == other.Owner ||
                    Owner != null &&
                    Owner.Equals(other.Owner)
                ) && 
                (
                    Popularity == other.Popularity ||
                    
                    Popularity.Equals(other.Popularity)
                ) && 
                (
                    Rank == other.Rank ||
                    
                    Rank.Equals(other.Rank)
                ) && 
                (
                    Self == other.Self ||
                    Self != null &&
                    Self.Equals(other.Self)
                ) && 
                (
                    SharePermissions == other.SharePermissions ||
                    SharePermissions != null &&
                    other.SharePermissions != null &&
                    SharePermissions.SequenceEqual(other.SharePermissions)
                ) && 
                (
                    SystemDashboard == other.SystemDashboard ||
                    
                    SystemDashboard.Equals(other.SystemDashboard)
                ) && 
                (
                    View == other.View ||
                    View != null &&
                    View.Equals(other.View)
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
                    
                    hashCode = hashCode * 59 + AutomaticRefreshMs.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (EditPermissions != null)
                    hashCode = hashCode * 59 + EditPermissions.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsFavourite.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsWritable.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Owner != null)
                    hashCode = hashCode * 59 + Owner.GetHashCode();
                    
                    hashCode = hashCode * 59 + Popularity.GetHashCode();
                    
                    hashCode = hashCode * 59 + Rank.GetHashCode();
                    if (Self != null)
                    hashCode = hashCode * 59 + Self.GetHashCode();
                    if (SharePermissions != null)
                    hashCode = hashCode * 59 + SharePermissions.GetHashCode();
                    
                    hashCode = hashCode * 59 + SystemDashboard.GetHashCode();
                    if (View != null)
                    hashCode = hashCode * 59 + View.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Dashboard left, Dashboard right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Dashboard left, Dashboard right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
