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
    /// Details of a filter.
    /// </summary>
    [DataContract]
    public partial class FilterDetails : IEquatable<FilterDetails>
    {
        /// <summary>
        /// The description of the filter.
        /// </summary>
        /// <value>The description of the filter.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
        /// </summary>
        /// <value>The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.</value>
        [DataMember(Name="editPermissions", EmitDefaultValue=false)]
        public List<SharePermission> EditPermissions { get; set; }

        /// <summary>
        /// Expand options that include additional filter details in the response.
        /// </summary>
        /// <value>Expand options that include additional filter details in the response.</value>
        [DataMember(Name="expand", EmitDefaultValue=false)]
        public string Expand { get; set; }

        /// <summary>
        /// Whether the filter is selected as a favorite by any users, not including the filter owner.
        /// </summary>
        /// <value>Whether the filter is selected as a favorite by any users, not including the filter owner.</value>
        [DataMember(Name="favourite", EmitDefaultValue=true)]
        public bool Favourite { get; set; }

        /// <summary>
        /// The count of how many users have selected this filter as a favorite, including the filter owner.
        /// </summary>
        /// <value>The count of how many users have selected this filter as a favorite, including the filter owner.</value>
        [DataMember(Name="favouritedCount", EmitDefaultValue=true)]
        public long FavouritedCount { get; set; }

        /// <summary>
        /// The unique identifier for the filter.
        /// </summary>
        /// <value>The unique identifier for the filter.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.
        /// </summary>
        /// <value>The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.</value>
        [DataMember(Name="jql", EmitDefaultValue=false)]
        public string Jql { get; set; }

        /// <summary>
        /// The name of the filter.
        /// </summary>
        /// <value>The name of the filter.</value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Owner
        /// </summary>
        [DataMember(Name="owner", EmitDefaultValue=false)]
        public FilterDetailsOwner Owner { get; set; }

        /// <summary>
        /// A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#39;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*.
        /// </summary>
        /// <value>A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#39;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*.</value>
        [DataMember(Name="searchUrl", EmitDefaultValue=false)]
        public string SearchUrl { get; set; }

        /// <summary>
        /// The URL of the filter.
        /// </summary>
        /// <value>The URL of the filter.</value>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public string Self { get; set; }

        /// <summary>
        /// The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
        /// </summary>
        /// <value>The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.</value>
        [DataMember(Name="sharePermissions", EmitDefaultValue=false)]
        public List<SharePermission> SharePermissions { get; set; }

        /// <summary>
        /// The users that are subscribed to the filter.
        /// </summary>
        /// <value>The users that are subscribed to the filter.</value>
        [DataMember(Name="subscriptions", EmitDefaultValue=false)]
        public List<FilterSubscription> Subscriptions { get; set; }

        /// <summary>
        /// A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*.
        /// </summary>
        /// <value>A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*.</value>
        [DataMember(Name="viewUrl", EmitDefaultValue=false)]
        public string ViewUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FilterDetails {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  EditPermissions: ").Append(EditPermissions).Append("\n");
            sb.Append("  Expand: ").Append(Expand).Append("\n");
            sb.Append("  Favourite: ").Append(Favourite).Append("\n");
            sb.Append("  FavouritedCount: ").Append(FavouritedCount).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Jql: ").Append(Jql).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  SearchUrl: ").Append(SearchUrl).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
            sb.Append("  SharePermissions: ").Append(SharePermissions).Append("\n");
            sb.Append("  Subscriptions: ").Append(Subscriptions).Append("\n");
            sb.Append("  ViewUrl: ").Append(ViewUrl).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FilterDetails)obj);
        }

        /// <summary>
        /// Returns true if FilterDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of FilterDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FilterDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
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
                    Expand == other.Expand ||
                    Expand != null &&
                    Expand.Equals(other.Expand)
                ) && 
                (
                    Favourite == other.Favourite ||
                    
                    Favourite.Equals(other.Favourite)
                ) && 
                (
                    FavouritedCount == other.FavouritedCount ||
                    
                    FavouritedCount.Equals(other.FavouritedCount)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Jql == other.Jql ||
                    Jql != null &&
                    Jql.Equals(other.Jql)
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
                    SearchUrl == other.SearchUrl ||
                    SearchUrl != null &&
                    SearchUrl.Equals(other.SearchUrl)
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
                    Subscriptions == other.Subscriptions ||
                    Subscriptions != null &&
                    other.Subscriptions != null &&
                    Subscriptions.SequenceEqual(other.Subscriptions)
                ) && 
                (
                    ViewUrl == other.ViewUrl ||
                    ViewUrl != null &&
                    ViewUrl.Equals(other.ViewUrl)
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
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (EditPermissions != null)
                    hashCode = hashCode * 59 + EditPermissions.GetHashCode();
                    if (Expand != null)
                    hashCode = hashCode * 59 + Expand.GetHashCode();
                    
                    hashCode = hashCode * 59 + Favourite.GetHashCode();
                    
                    hashCode = hashCode * 59 + FavouritedCount.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Jql != null)
                    hashCode = hashCode * 59 + Jql.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Owner != null)
                    hashCode = hashCode * 59 + Owner.GetHashCode();
                    if (SearchUrl != null)
                    hashCode = hashCode * 59 + SearchUrl.GetHashCode();
                    if (Self != null)
                    hashCode = hashCode * 59 + Self.GetHashCode();
                    if (SharePermissions != null)
                    hashCode = hashCode * 59 + SharePermissions.GetHashCode();
                    if (Subscriptions != null)
                    hashCode = hashCode * 59 + Subscriptions.GetHashCode();
                    if (ViewUrl != null)
                    hashCode = hashCode * 59 + ViewUrl.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FilterDetails left, FilterDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FilterDetails left, FilterDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
