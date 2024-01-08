/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    /// Used to hold information about a user&#39;s list of configured virtual folders.
    /// </summary>
    [DataContract]
    public partial class VirtualFolderInfo : IEquatable<VirtualFolderInfo>
    {
        /// <summary>
        /// Gets or sets the type of the collection.
        /// </summary>
        /// <value>Gets or sets the type of the collection.</value>
        [DataMember(Name="CollectionType", EmitDefaultValue=true)]
        public string CollectionType { get; set; }

        /// <summary>
        /// Gets or sets the item identifier.
        /// </summary>
        /// <value>Gets or sets the item identifier.</value>
        [DataMember(Name="ItemId", EmitDefaultValue=true)]
        public string ItemId { get; set; }

        /// <summary>
        /// Gets or Sets LibraryOptions
        /// </summary>
        [DataMember(Name="LibraryOptions", EmitDefaultValue=false)]
        public LibraryOptions LibraryOptions { get; set; }

        /// <summary>
        /// Gets or sets the locations.
        /// </summary>
        /// <value>Gets or sets the locations.</value>
        [DataMember(Name="Locations", EmitDefaultValue=true)]
        public List<string> Locations { get; set; }

        /// <summary>
        /// Gets or sets the name.
        /// </summary>
        /// <value>Gets or sets the name.</value>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the primary image item identifier.
        /// </summary>
        /// <value>Gets or sets the primary image item identifier.</value>
        [DataMember(Name="PrimaryImageItemId", EmitDefaultValue=true)]
        public string PrimaryImageItemId { get; set; }

        /// <summary>
        /// Gets or Sets RefreshProgress
        /// </summary>
        [DataMember(Name="RefreshProgress", EmitDefaultValue=true)]
        public double? RefreshProgress { get; set; }

        /// <summary>
        /// Gets or Sets RefreshStatus
        /// </summary>
        [DataMember(Name="RefreshStatus", EmitDefaultValue=true)]
        public string RefreshStatus { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VirtualFolderInfo {\n");
            sb.Append("  CollectionType: ").Append(CollectionType).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  LibraryOptions: ").Append(LibraryOptions).Append("\n");
            sb.Append("  Locations: ").Append(Locations).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PrimaryImageItemId: ").Append(PrimaryImageItemId).Append("\n");
            sb.Append("  RefreshProgress: ").Append(RefreshProgress).Append("\n");
            sb.Append("  RefreshStatus: ").Append(RefreshStatus).Append("\n");
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
            return obj.GetType() == GetType() && Equals((VirtualFolderInfo)obj);
        }

        /// <summary>
        /// Returns true if VirtualFolderInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of VirtualFolderInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VirtualFolderInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CollectionType == other.CollectionType ||
                    CollectionType != null &&
                    CollectionType.Equals(other.CollectionType)
                ) && 
                (
                    ItemId == other.ItemId ||
                    ItemId != null &&
                    ItemId.Equals(other.ItemId)
                ) && 
                (
                    LibraryOptions == other.LibraryOptions ||
                    LibraryOptions != null &&
                    LibraryOptions.Equals(other.LibraryOptions)
                ) && 
                (
                    Locations == other.Locations ||
                    Locations != null &&
                    other.Locations != null &&
                    Locations.SequenceEqual(other.Locations)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    PrimaryImageItemId == other.PrimaryImageItemId ||
                    PrimaryImageItemId != null &&
                    PrimaryImageItemId.Equals(other.PrimaryImageItemId)
                ) && 
                (
                    RefreshProgress == other.RefreshProgress ||
                    RefreshProgress != null &&
                    RefreshProgress.Equals(other.RefreshProgress)
                ) && 
                (
                    RefreshStatus == other.RefreshStatus ||
                    RefreshStatus != null &&
                    RefreshStatus.Equals(other.RefreshStatus)
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
                    if (CollectionType != null)
                    hashCode = hashCode * 59 + CollectionType.GetHashCode();
                    if (ItemId != null)
                    hashCode = hashCode * 59 + ItemId.GetHashCode();
                    if (LibraryOptions != null)
                    hashCode = hashCode * 59 + LibraryOptions.GetHashCode();
                    if (Locations != null)
                    hashCode = hashCode * 59 + Locations.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (PrimaryImageItemId != null)
                    hashCode = hashCode * 59 + PrimaryImageItemId.GetHashCode();
                    if (RefreshProgress != null)
                    hashCode = hashCode * 59 + RefreshProgress.GetHashCode();
                    if (RefreshStatus != null)
                    hashCode = hashCode * 59 + RefreshStatus.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(VirtualFolderInfo left, VirtualFolderInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(VirtualFolderInfo left, VirtualFolderInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
