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
    /// Defines the MediaBrowser.Common.Plugins.IPlugin.
    /// </summary>
    [DataContract]
    public partial class IPlugin : IEquatable<IPlugin>
    {
        /// <summary>
        /// Gets the path to the assembly file.
        /// </summary>
        /// <value>Gets the path to the assembly file.</value>
        [DataMember(Name="AssemblyFilePath", EmitDefaultValue=true)]
        public string AssemblyFilePath { get; set; }

        /// <summary>
        /// Gets a value indicating whether the plugin can be uninstalled.
        /// </summary>
        /// <value>Gets a value indicating whether the plugin can be uninstalled.</value>
        [DataMember(Name="CanUninstall", EmitDefaultValue=true)]
        public bool CanUninstall { get; set; }

        /// <summary>
        /// Gets the full path to the data folder, where the plugin can store any miscellaneous files needed.
        /// </summary>
        /// <value>Gets the full path to the data folder, where the plugin can store any miscellaneous files needed.</value>
        [DataMember(Name="DataFolderPath", EmitDefaultValue=true)]
        public string DataFolderPath { get; set; }

        /// <summary>
        /// Gets the Description.
        /// </summary>
        /// <value>Gets the Description.</value>
        [DataMember(Name="Description", EmitDefaultValue=true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets the unique id.
        /// </summary>
        /// <value>Gets the unique id.</value>
        [DataMember(Name="Id", EmitDefaultValue=false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets the name of the plugin.
        /// </summary>
        /// <value>Gets the name of the plugin.</value>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets VarVersion
        /// </summary>
        [DataMember(Name="Version", EmitDefaultValue=false)]
        public ModelVersion VarVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IPlugin {\n");
            sb.Append("  AssemblyFilePath: ").Append(AssemblyFilePath).Append("\n");
            sb.Append("  CanUninstall: ").Append(CanUninstall).Append("\n");
            sb.Append("  DataFolderPath: ").Append(DataFolderPath).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return obj.GetType() == GetType() && Equals((IPlugin)obj);
        }

        /// <summary>
        /// Returns true if IPlugin instances are equal
        /// </summary>
        /// <param name="other">Instance of IPlugin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IPlugin other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AssemblyFilePath == other.AssemblyFilePath ||
                    AssemblyFilePath != null &&
                    AssemblyFilePath.Equals(other.AssemblyFilePath)
                ) && 
                (
                    CanUninstall == other.CanUninstall ||
                    
                    CanUninstall.Equals(other.CanUninstall)
                ) && 
                (
                    DataFolderPath == other.DataFolderPath ||
                    DataFolderPath != null &&
                    DataFolderPath.Equals(other.DataFolderPath)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
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
                    if (AssemblyFilePath != null)
                    hashCode = hashCode * 59 + AssemblyFilePath.GetHashCode();
                    
                    hashCode = hashCode * 59 + CanUninstall.GetHashCode();
                    if (DataFolderPath != null)
                    hashCode = hashCode * 59 + DataFolderPath.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (VarVersion != null)
                    hashCode = hashCode * 59 + VarVersion.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IPlugin left, IPlugin right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IPlugin left, IPlugin right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}