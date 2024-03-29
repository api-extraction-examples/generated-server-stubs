/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.1
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
    public partial class AppScreenshotAttributes : IEquatable<AppScreenshotAttributes>
    {
        /// <summary>
        /// Gets or Sets AssetDeliveryState
        /// </summary>
        [DataMember(Name="assetDeliveryState", EmitDefaultValue=false)]
        public AppMediaAssetState AssetDeliveryState { get; set; }

        /// <summary>
        /// Gets or Sets AssetToken
        /// </summary>
        [DataMember(Name="assetToken", EmitDefaultValue=false)]
        public string AssetToken { get; set; }

        /// <summary>
        /// Gets or Sets AssetType
        /// </summary>
        [DataMember(Name="assetType", EmitDefaultValue=false)]
        public string AssetType { get; set; }

        /// <summary>
        /// Gets or Sets FileName
        /// </summary>
        [DataMember(Name="fileName", EmitDefaultValue=false)]
        public string FileName { get; set; }

        /// <summary>
        /// Gets or Sets FileSize
        /// </summary>
        [DataMember(Name="fileSize", EmitDefaultValue=true)]
        public int FileSize { get; set; }

        /// <summary>
        /// Gets or Sets ImageAsset
        /// </summary>
        [DataMember(Name="imageAsset", EmitDefaultValue=false)]
        public ImageAsset ImageAsset { get; set; }

        /// <summary>
        /// Gets or Sets SourceFileChecksum
        /// </summary>
        [DataMember(Name="sourceFileChecksum", EmitDefaultValue=false)]
        public string SourceFileChecksum { get; set; }

        /// <summary>
        /// Gets or Sets UploadOperations
        /// </summary>
        [DataMember(Name="uploadOperations", EmitDefaultValue=false)]
        public List<UploadOperation> UploadOperations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AppScreenshotAttributes {\n");
            sb.Append("  AssetDeliveryState: ").Append(AssetDeliveryState).Append("\n");
            sb.Append("  AssetToken: ").Append(AssetToken).Append("\n");
            sb.Append("  AssetType: ").Append(AssetType).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  FileSize: ").Append(FileSize).Append("\n");
            sb.Append("  ImageAsset: ").Append(ImageAsset).Append("\n");
            sb.Append("  SourceFileChecksum: ").Append(SourceFileChecksum).Append("\n");
            sb.Append("  UploadOperations: ").Append(UploadOperations).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AppScreenshotAttributes)obj);
        }

        /// <summary>
        /// Returns true if AppScreenshotAttributes instances are equal
        /// </summary>
        /// <param name="other">Instance of AppScreenshotAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AppScreenshotAttributes other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AssetDeliveryState == other.AssetDeliveryState ||
                    AssetDeliveryState != null &&
                    AssetDeliveryState.Equals(other.AssetDeliveryState)
                ) && 
                (
                    AssetToken == other.AssetToken ||
                    AssetToken != null &&
                    AssetToken.Equals(other.AssetToken)
                ) && 
                (
                    AssetType == other.AssetType ||
                    AssetType != null &&
                    AssetType.Equals(other.AssetType)
                ) && 
                (
                    FileName == other.FileName ||
                    FileName != null &&
                    FileName.Equals(other.FileName)
                ) && 
                (
                    FileSize == other.FileSize ||
                    
                    FileSize.Equals(other.FileSize)
                ) && 
                (
                    ImageAsset == other.ImageAsset ||
                    ImageAsset != null &&
                    ImageAsset.Equals(other.ImageAsset)
                ) && 
                (
                    SourceFileChecksum == other.SourceFileChecksum ||
                    SourceFileChecksum != null &&
                    SourceFileChecksum.Equals(other.SourceFileChecksum)
                ) && 
                (
                    UploadOperations == other.UploadOperations ||
                    UploadOperations != null &&
                    other.UploadOperations != null &&
                    UploadOperations.SequenceEqual(other.UploadOperations)
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
                    if (AssetDeliveryState != null)
                    hashCode = hashCode * 59 + AssetDeliveryState.GetHashCode();
                    if (AssetToken != null)
                    hashCode = hashCode * 59 + AssetToken.GetHashCode();
                    if (AssetType != null)
                    hashCode = hashCode * 59 + AssetType.GetHashCode();
                    if (FileName != null)
                    hashCode = hashCode * 59 + FileName.GetHashCode();
                    
                    hashCode = hashCode * 59 + FileSize.GetHashCode();
                    if (ImageAsset != null)
                    hashCode = hashCode * 59 + ImageAsset.GetHashCode();
                    if (SourceFileChecksum != null)
                    hashCode = hashCode * 59 + SourceFileChecksum.GetHashCode();
                    if (UploadOperations != null)
                    hashCode = hashCode * 59 + UploadOperations.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AppScreenshotAttributes left, AppScreenshotAttributes right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AppScreenshotAttributes left, AppScreenshotAttributes right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
