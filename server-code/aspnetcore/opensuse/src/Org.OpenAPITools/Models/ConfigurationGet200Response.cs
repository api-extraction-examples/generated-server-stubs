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
    public partial class ConfigurationGet200Response : IEquatable<ConfigurationGet200Response>
    {
        /// <summary>
        /// Gets or Sets AdminEmail
        /// </summary>
        /// <example>unconfigured@openbuildservice.org</example>
        [DataMember(Name="admin_email", EmitDefaultValue=false)]
        public string AdminEmail { get; set; }

        /// <summary>
        /// Gets or Sets AllowUserToCreateHomeProject
        /// </summary>
        /// <example>true</example>
        [DataMember(Name="allow_user_to_create_home_project", EmitDefaultValue=false)]
        public string AllowUserToCreateHomeProject { get; set; }

        /// <summary>
        /// Gets or Sets Anonymous
        /// </summary>
        /// <example>true</example>
        [DataMember(Name="anonymous", EmitDefaultValue=false)]
        public string Anonymous { get; set; }

        /// <summary>
        /// Gets or Sets ChangePassword
        /// </summary>
        /// <example>true</example>
        [DataMember(Name="change_password", EmitDefaultValue=false)]
        public string ChangePassword { get; set; }

        /// <summary>
        /// Gets or Sets CleanupEmptyProjects
        /// </summary>
        /// <example>true</example>
        [DataMember(Name="cleanup_empty_projects", EmitDefaultValue=false)]
        public string CleanupEmptyProjects { get; set; }

        /// <summary>
        /// Gets or Sets DefaultAccessDisabled
        /// </summary>
        /// <example>false</example>
        [DataMember(Name="default_access_disabled", EmitDefaultValue=false)]
        public string DefaultAccessDisabled { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        /// <example>The openSUSE Build Service is the public instance of the Open Build Service (OBS)</example>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets DisablePublishForBranches
        /// </summary>
        /// <example>true</example>
        [DataMember(Name="disable_publish_for_branches", EmitDefaultValue=false)]
        public string DisablePublishForBranches { get; set; }

        /// <summary>
        /// Gets or Sets DisallowGroupCreation
        /// </summary>
        /// <example>false</example>
        [DataMember(Name="disallow_group_creation", EmitDefaultValue=false)]
        public string DisallowGroupCreation { get; set; }

        /// <summary>
        /// Gets or Sets DownloadOnDemand
        /// </summary>
        /// <example>true</example>
        [DataMember(Name="download_on_demand", EmitDefaultValue=false)]
        public string DownloadOnDemand { get; set; }

        /// <summary>
        /// Gets or Sets EnforceProjectKeys
        /// </summary>
        /// <example>false</example>
        [DataMember(Name="enforce_project_keys", EmitDefaultValue=false)]
        public string EnforceProjectKeys { get; set; }

        /// <summary>
        /// Gets or Sets Gravatar
        /// </summary>
        /// <example>true</example>
        [DataMember(Name="gravatar", EmitDefaultValue=false)]
        public string Gravatar { get; set; }

        /// <summary>
        /// Gets or Sets HidePrivateOptions
        /// </summary>
        /// <example>false</example>
        [DataMember(Name="hide_private_options", EmitDefaultValue=false)]
        public string HidePrivateOptions { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        /// <example>private</example>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets ObsUrl
        /// </summary>
        /// <example>https://unconfigured.openbuildservice.org</example>
        [DataMember(Name="obs_url", EmitDefaultValue=false)]
        public string ObsUrl { get; set; }

        /// <summary>
        /// Gets or Sets Registration
        /// </summary>
        /// <example>allow</example>
        [DataMember(Name="registration", EmitDefaultValue=false)]
        public string Registration { get; set; }

        /// <summary>
        /// Gets or Sets Schedulers
        /// </summary>
        [DataMember(Name="schedulers", EmitDefaultValue=false)]
        public ConfigurationGet200ResponseSchedulers Schedulers { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        /// <example>Open Build Service</example>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets TosUrl
        /// </summary>
        /// <example>https://en.opensuse.org/Terms_of_site</example>
        [DataMember(Name="tos_url", EmitDefaultValue=false)]
        public string TosUrl { get; set; }

        /// <summary>
        /// Gets or Sets UnlistedProjectsFilter
        /// </summary>
        /// <example>^home:.+</example>
        [DataMember(Name="unlisted_projects_filter", EmitDefaultValue=false)]
        public string UnlistedProjectsFilter { get; set; }

        /// <summary>
        /// Gets or Sets UnlistedProjectsFilterDescription
        /// </summary>
        /// <example>home projects</example>
        [DataMember(Name="unlisted_projects_filter_description", EmitDefaultValue=false)]
        public string UnlistedProjectsFilterDescription { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConfigurationGet200Response {\n");
            sb.Append("  AdminEmail: ").Append(AdminEmail).Append("\n");
            sb.Append("  AllowUserToCreateHomeProject: ").Append(AllowUserToCreateHomeProject).Append("\n");
            sb.Append("  Anonymous: ").Append(Anonymous).Append("\n");
            sb.Append("  ChangePassword: ").Append(ChangePassword).Append("\n");
            sb.Append("  CleanupEmptyProjects: ").Append(CleanupEmptyProjects).Append("\n");
            sb.Append("  DefaultAccessDisabled: ").Append(DefaultAccessDisabled).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  DisablePublishForBranches: ").Append(DisablePublishForBranches).Append("\n");
            sb.Append("  DisallowGroupCreation: ").Append(DisallowGroupCreation).Append("\n");
            sb.Append("  DownloadOnDemand: ").Append(DownloadOnDemand).Append("\n");
            sb.Append("  EnforceProjectKeys: ").Append(EnforceProjectKeys).Append("\n");
            sb.Append("  Gravatar: ").Append(Gravatar).Append("\n");
            sb.Append("  HidePrivateOptions: ").Append(HidePrivateOptions).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ObsUrl: ").Append(ObsUrl).Append("\n");
            sb.Append("  Registration: ").Append(Registration).Append("\n");
            sb.Append("  Schedulers: ").Append(Schedulers).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  TosUrl: ").Append(TosUrl).Append("\n");
            sb.Append("  UnlistedProjectsFilter: ").Append(UnlistedProjectsFilter).Append("\n");
            sb.Append("  UnlistedProjectsFilterDescription: ").Append(UnlistedProjectsFilterDescription).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ConfigurationGet200Response)obj);
        }

        /// <summary>
        /// Returns true if ConfigurationGet200Response instances are equal
        /// </summary>
        /// <param name="other">Instance of ConfigurationGet200Response to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConfigurationGet200Response other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AdminEmail == other.AdminEmail ||
                    AdminEmail != null &&
                    AdminEmail.Equals(other.AdminEmail)
                ) && 
                (
                    AllowUserToCreateHomeProject == other.AllowUserToCreateHomeProject ||
                    AllowUserToCreateHomeProject != null &&
                    AllowUserToCreateHomeProject.Equals(other.AllowUserToCreateHomeProject)
                ) && 
                (
                    Anonymous == other.Anonymous ||
                    Anonymous != null &&
                    Anonymous.Equals(other.Anonymous)
                ) && 
                (
                    ChangePassword == other.ChangePassword ||
                    ChangePassword != null &&
                    ChangePassword.Equals(other.ChangePassword)
                ) && 
                (
                    CleanupEmptyProjects == other.CleanupEmptyProjects ||
                    CleanupEmptyProjects != null &&
                    CleanupEmptyProjects.Equals(other.CleanupEmptyProjects)
                ) && 
                (
                    DefaultAccessDisabled == other.DefaultAccessDisabled ||
                    DefaultAccessDisabled != null &&
                    DefaultAccessDisabled.Equals(other.DefaultAccessDisabled)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    DisablePublishForBranches == other.DisablePublishForBranches ||
                    DisablePublishForBranches != null &&
                    DisablePublishForBranches.Equals(other.DisablePublishForBranches)
                ) && 
                (
                    DisallowGroupCreation == other.DisallowGroupCreation ||
                    DisallowGroupCreation != null &&
                    DisallowGroupCreation.Equals(other.DisallowGroupCreation)
                ) && 
                (
                    DownloadOnDemand == other.DownloadOnDemand ||
                    DownloadOnDemand != null &&
                    DownloadOnDemand.Equals(other.DownloadOnDemand)
                ) && 
                (
                    EnforceProjectKeys == other.EnforceProjectKeys ||
                    EnforceProjectKeys != null &&
                    EnforceProjectKeys.Equals(other.EnforceProjectKeys)
                ) && 
                (
                    Gravatar == other.Gravatar ||
                    Gravatar != null &&
                    Gravatar.Equals(other.Gravatar)
                ) && 
                (
                    HidePrivateOptions == other.HidePrivateOptions ||
                    HidePrivateOptions != null &&
                    HidePrivateOptions.Equals(other.HidePrivateOptions)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    ObsUrl == other.ObsUrl ||
                    ObsUrl != null &&
                    ObsUrl.Equals(other.ObsUrl)
                ) && 
                (
                    Registration == other.Registration ||
                    Registration != null &&
                    Registration.Equals(other.Registration)
                ) && 
                (
                    Schedulers == other.Schedulers ||
                    Schedulers != null &&
                    Schedulers.Equals(other.Schedulers)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    TosUrl == other.TosUrl ||
                    TosUrl != null &&
                    TosUrl.Equals(other.TosUrl)
                ) && 
                (
                    UnlistedProjectsFilter == other.UnlistedProjectsFilter ||
                    UnlistedProjectsFilter != null &&
                    UnlistedProjectsFilter.Equals(other.UnlistedProjectsFilter)
                ) && 
                (
                    UnlistedProjectsFilterDescription == other.UnlistedProjectsFilterDescription ||
                    UnlistedProjectsFilterDescription != null &&
                    UnlistedProjectsFilterDescription.Equals(other.UnlistedProjectsFilterDescription)
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
                    if (AdminEmail != null)
                    hashCode = hashCode * 59 + AdminEmail.GetHashCode();
                    if (AllowUserToCreateHomeProject != null)
                    hashCode = hashCode * 59 + AllowUserToCreateHomeProject.GetHashCode();
                    if (Anonymous != null)
                    hashCode = hashCode * 59 + Anonymous.GetHashCode();
                    if (ChangePassword != null)
                    hashCode = hashCode * 59 + ChangePassword.GetHashCode();
                    if (CleanupEmptyProjects != null)
                    hashCode = hashCode * 59 + CleanupEmptyProjects.GetHashCode();
                    if (DefaultAccessDisabled != null)
                    hashCode = hashCode * 59 + DefaultAccessDisabled.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (DisablePublishForBranches != null)
                    hashCode = hashCode * 59 + DisablePublishForBranches.GetHashCode();
                    if (DisallowGroupCreation != null)
                    hashCode = hashCode * 59 + DisallowGroupCreation.GetHashCode();
                    if (DownloadOnDemand != null)
                    hashCode = hashCode * 59 + DownloadOnDemand.GetHashCode();
                    if (EnforceProjectKeys != null)
                    hashCode = hashCode * 59 + EnforceProjectKeys.GetHashCode();
                    if (Gravatar != null)
                    hashCode = hashCode * 59 + Gravatar.GetHashCode();
                    if (HidePrivateOptions != null)
                    hashCode = hashCode * 59 + HidePrivateOptions.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (ObsUrl != null)
                    hashCode = hashCode * 59 + ObsUrl.GetHashCode();
                    if (Registration != null)
                    hashCode = hashCode * 59 + Registration.GetHashCode();
                    if (Schedulers != null)
                    hashCode = hashCode * 59 + Schedulers.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (TosUrl != null)
                    hashCode = hashCode * 59 + TosUrl.GetHashCode();
                    if (UnlistedProjectsFilter != null)
                    hashCode = hashCode * 59 + UnlistedProjectsFilter.GetHashCode();
                    if (UnlistedProjectsFilterDescription != null)
                    hashCode = hashCode * 59 + UnlistedProjectsFilterDescription.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ConfigurationGet200Response left, ConfigurationGet200Response right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ConfigurationGet200Response left, ConfigurationGet200Response right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}