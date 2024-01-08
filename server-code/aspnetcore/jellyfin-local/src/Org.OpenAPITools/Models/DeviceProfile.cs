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
    /// Defines the MediaBrowser.Model.Dlna.DeviceProfile.
    /// </summary>
    [DataContract]
    public partial class DeviceProfile : IEquatable<DeviceProfile>
    {
        /// <summary>
        /// Gets or sets the AlbumArtPn.
        /// </summary>
        /// <value>Gets or sets the AlbumArtPn.</value>
        [DataMember(Name="AlbumArtPn", EmitDefaultValue=true)]
        public string AlbumArtPn { get; set; }

        /// <summary>
        /// Gets or sets the CodecProfiles.
        /// </summary>
        /// <value>Gets or sets the CodecProfiles.</value>
        [DataMember(Name="CodecProfiles", EmitDefaultValue=true)]
        public List<CodecProfile> CodecProfiles { get; set; }

        /// <summary>
        /// Gets or sets the ContainerProfiles.
        /// </summary>
        /// <value>Gets or sets the ContainerProfiles.</value>
        [DataMember(Name="ContainerProfiles", EmitDefaultValue=true)]
        public List<ContainerProfile> ContainerProfiles { get; set; }

        /// <summary>
        /// Gets or sets the direct play profiles.
        /// </summary>
        /// <value>Gets or sets the direct play profiles.</value>
        [DataMember(Name="DirectPlayProfiles", EmitDefaultValue=true)]
        public List<DirectPlayProfile> DirectPlayProfiles { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether EnableAlbumArtInDidl.
        /// </summary>
        /// <value>Gets or sets a value indicating whether EnableAlbumArtInDidl.</value>
        [DataMember(Name="EnableAlbumArtInDidl", EmitDefaultValue=true)]
        public bool EnableAlbumArtInDidl { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether EnableMSMediaReceiverRegistrar.
        /// </summary>
        /// <value>Gets or sets a value indicating whether EnableMSMediaReceiverRegistrar.</value>
        [DataMember(Name="EnableMSMediaReceiverRegistrar", EmitDefaultValue=true)]
        public bool EnableMSMediaReceiverRegistrar { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether EnableSingleAlbumArtLimit.
        /// </summary>
        /// <value>Gets or sets a value indicating whether EnableSingleAlbumArtLimit.</value>
        [DataMember(Name="EnableSingleAlbumArtLimit", EmitDefaultValue=true)]
        public bool EnableSingleAlbumArtLimit { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether EnableSingleSubtitleLimit.
        /// </summary>
        /// <value>Gets or sets a value indicating whether EnableSingleSubtitleLimit.</value>
        [DataMember(Name="EnableSingleSubtitleLimit", EmitDefaultValue=true)]
        public bool EnableSingleSubtitleLimit { get; set; }

        /// <summary>
        /// Gets or sets the FriendlyName.
        /// </summary>
        /// <value>Gets or sets the FriendlyName.</value>
        [DataMember(Name="FriendlyName", EmitDefaultValue=true)]
        public string FriendlyName { get; set; }

        /// <summary>
        /// Gets or sets the Id.
        /// </summary>
        /// <value>Gets or sets the Id.</value>
        [DataMember(Name="Id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Identification
        /// </summary>
        [DataMember(Name="Identification", EmitDefaultValue=false)]
        public DeviceIdentification Identification { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether IgnoreTranscodeByteRangeRequests.
        /// </summary>
        /// <value>Gets or sets a value indicating whether IgnoreTranscodeByteRangeRequests.</value>
        [DataMember(Name="IgnoreTranscodeByteRangeRequests", EmitDefaultValue=true)]
        public bool IgnoreTranscodeByteRangeRequests { get; set; }

        /// <summary>
        /// Gets or sets the Manufacturer.
        /// </summary>
        /// <value>Gets or sets the Manufacturer.</value>
        [DataMember(Name="Manufacturer", EmitDefaultValue=true)]
        public string Manufacturer { get; set; }

        /// <summary>
        /// Gets or sets the ManufacturerUrl.
        /// </summary>
        /// <value>Gets or sets the ManufacturerUrl.</value>
        [DataMember(Name="ManufacturerUrl", EmitDefaultValue=true)]
        public string ManufacturerUrl { get; set; }

        /// <summary>
        /// Gets or sets the MaxAlbumArtHeight.
        /// </summary>
        /// <value>Gets or sets the MaxAlbumArtHeight.</value>
        [DataMember(Name="MaxAlbumArtHeight", EmitDefaultValue=true)]
        public int MaxAlbumArtHeight { get; set; }

        /// <summary>
        /// Gets or sets the MaxAlbumArtWidth.
        /// </summary>
        /// <value>Gets or sets the MaxAlbumArtWidth.</value>
        [DataMember(Name="MaxAlbumArtWidth", EmitDefaultValue=true)]
        public int MaxAlbumArtWidth { get; set; }

        /// <summary>
        /// Gets or sets the MaxIconHeight.
        /// </summary>
        /// <value>Gets or sets the MaxIconHeight.</value>
        [DataMember(Name="MaxIconHeight", EmitDefaultValue=true)]
        public int? MaxIconHeight { get; set; }

        /// <summary>
        /// Gets or sets the MaxIconWidth.
        /// </summary>
        /// <value>Gets or sets the MaxIconWidth.</value>
        [DataMember(Name="MaxIconWidth", EmitDefaultValue=true)]
        public int? MaxIconWidth { get; set; }

        /// <summary>
        /// Gets or sets the MaxStaticBitrate.
        /// </summary>
        /// <value>Gets or sets the MaxStaticBitrate.</value>
        [DataMember(Name="MaxStaticBitrate", EmitDefaultValue=true)]
        public int? MaxStaticBitrate { get; set; }

        /// <summary>
        /// Gets or sets the MaxStaticMusicBitrate.
        /// </summary>
        /// <value>Gets or sets the MaxStaticMusicBitrate.</value>
        [DataMember(Name="MaxStaticMusicBitrate", EmitDefaultValue=true)]
        public int? MaxStaticMusicBitrate { get; set; }

        /// <summary>
        /// Gets or sets the MaxStreamingBitrate.
        /// </summary>
        /// <value>Gets or sets the MaxStreamingBitrate.</value>
        [DataMember(Name="MaxStreamingBitrate", EmitDefaultValue=true)]
        public int? MaxStreamingBitrate { get; set; }

        /// <summary>
        /// Gets or sets the ModelDescription.
        /// </summary>
        /// <value>Gets or sets the ModelDescription.</value>
        [DataMember(Name="ModelDescription", EmitDefaultValue=true)]
        public string ModelDescription { get; set; }

        /// <summary>
        /// Gets or sets the ModelName.
        /// </summary>
        /// <value>Gets or sets the ModelName.</value>
        [DataMember(Name="ModelName", EmitDefaultValue=true)]
        public string ModelName { get; set; }

        /// <summary>
        /// Gets or sets the ModelNumber.
        /// </summary>
        /// <value>Gets or sets the ModelNumber.</value>
        [DataMember(Name="ModelNumber", EmitDefaultValue=true)]
        public string ModelNumber { get; set; }

        /// <summary>
        /// Gets or sets the ModelUrl.
        /// </summary>
        /// <value>Gets or sets the ModelUrl.</value>
        [DataMember(Name="ModelUrl", EmitDefaultValue=true)]
        public string ModelUrl { get; set; }

        /// <summary>
        /// Gets or sets the MusicStreamingTranscodingBitrate.
        /// </summary>
        /// <value>Gets or sets the MusicStreamingTranscodingBitrate.</value>
        [DataMember(Name="MusicStreamingTranscodingBitrate", EmitDefaultValue=true)]
        public int? MusicStreamingTranscodingBitrate { get; set; }

        /// <summary>
        /// Gets or sets the Name.
        /// </summary>
        /// <value>Gets or sets the Name.</value>
        [DataMember(Name="Name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or sets the ProtocolInfo.
        /// </summary>
        /// <value>Gets or sets the ProtocolInfo.</value>
        [DataMember(Name="ProtocolInfo", EmitDefaultValue=true)]
        public string ProtocolInfo { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether RequiresPlainFolders.
        /// </summary>
        /// <value>Gets or sets a value indicating whether RequiresPlainFolders.</value>
        [DataMember(Name="RequiresPlainFolders", EmitDefaultValue=true)]
        public bool RequiresPlainFolders { get; set; }

        /// <summary>
        /// Gets or sets a value indicating whether RequiresPlainVideoItems.
        /// </summary>
        /// <value>Gets or sets a value indicating whether RequiresPlainVideoItems.</value>
        [DataMember(Name="RequiresPlainVideoItems", EmitDefaultValue=true)]
        public bool RequiresPlainVideoItems { get; set; }

        /// <summary>
        /// Gets or sets the ResponseProfiles.
        /// </summary>
        /// <value>Gets or sets the ResponseProfiles.</value>
        [DataMember(Name="ResponseProfiles", EmitDefaultValue=true)]
        public List<ResponseProfile> ResponseProfiles { get; set; }

        /// <summary>
        /// Gets or sets the SerialNumber.
        /// </summary>
        /// <value>Gets or sets the SerialNumber.</value>
        [DataMember(Name="SerialNumber", EmitDefaultValue=true)]
        public string SerialNumber { get; set; }

        /// <summary>
        /// Gets or sets the content of the aggregationFlags element in the urn:schemas-sonycom:av namespace.
        /// </summary>
        /// <value>Gets or sets the content of the aggregationFlags element in the urn:schemas-sonycom:av namespace.</value>
        [DataMember(Name="SonyAggregationFlags", EmitDefaultValue=true)]
        public string SonyAggregationFlags { get; set; }

        /// <summary>
        /// Gets or sets the SubtitleProfiles.
        /// </summary>
        /// <value>Gets or sets the SubtitleProfiles.</value>
        [DataMember(Name="SubtitleProfiles", EmitDefaultValue=true)]
        public List<SubtitleProfile> SubtitleProfiles { get; set; }

        /// <summary>
        /// Gets or sets the SupportedMediaTypes.
        /// </summary>
        /// <value>Gets or sets the SupportedMediaTypes.</value>
        [DataMember(Name="SupportedMediaTypes", EmitDefaultValue=true)]
        public string SupportedMediaTypes { get; set; }

        /// <summary>
        /// Gets or sets the TimelineOffsetSeconds.
        /// </summary>
        /// <value>Gets or sets the TimelineOffsetSeconds.</value>
        [DataMember(Name="TimelineOffsetSeconds", EmitDefaultValue=true)]
        public int TimelineOffsetSeconds { get; set; }

        /// <summary>
        /// Gets or sets the transcoding profiles.
        /// </summary>
        /// <value>Gets or sets the transcoding profiles.</value>
        [DataMember(Name="TranscodingProfiles", EmitDefaultValue=true)]
        public List<TranscodingProfile> TranscodingProfiles { get; set; }

        /// <summary>
        /// Gets or sets the UserId.
        /// </summary>
        /// <value>Gets or sets the UserId.</value>
        [DataMember(Name="UserId", EmitDefaultValue=true)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or sets the XmlRootAttributes.
        /// </summary>
        /// <value>Gets or sets the XmlRootAttributes.</value>
        [DataMember(Name="XmlRootAttributes", EmitDefaultValue=true)]
        public List<XmlAttribute> XmlRootAttributes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DeviceProfile {\n");
            sb.Append("  AlbumArtPn: ").Append(AlbumArtPn).Append("\n");
            sb.Append("  CodecProfiles: ").Append(CodecProfiles).Append("\n");
            sb.Append("  ContainerProfiles: ").Append(ContainerProfiles).Append("\n");
            sb.Append("  DirectPlayProfiles: ").Append(DirectPlayProfiles).Append("\n");
            sb.Append("  EnableAlbumArtInDidl: ").Append(EnableAlbumArtInDidl).Append("\n");
            sb.Append("  EnableMSMediaReceiverRegistrar: ").Append(EnableMSMediaReceiverRegistrar).Append("\n");
            sb.Append("  EnableSingleAlbumArtLimit: ").Append(EnableSingleAlbumArtLimit).Append("\n");
            sb.Append("  EnableSingleSubtitleLimit: ").Append(EnableSingleSubtitleLimit).Append("\n");
            sb.Append("  FriendlyName: ").Append(FriendlyName).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Identification: ").Append(Identification).Append("\n");
            sb.Append("  IgnoreTranscodeByteRangeRequests: ").Append(IgnoreTranscodeByteRangeRequests).Append("\n");
            sb.Append("  Manufacturer: ").Append(Manufacturer).Append("\n");
            sb.Append("  ManufacturerUrl: ").Append(ManufacturerUrl).Append("\n");
            sb.Append("  MaxAlbumArtHeight: ").Append(MaxAlbumArtHeight).Append("\n");
            sb.Append("  MaxAlbumArtWidth: ").Append(MaxAlbumArtWidth).Append("\n");
            sb.Append("  MaxIconHeight: ").Append(MaxIconHeight).Append("\n");
            sb.Append("  MaxIconWidth: ").Append(MaxIconWidth).Append("\n");
            sb.Append("  MaxStaticBitrate: ").Append(MaxStaticBitrate).Append("\n");
            sb.Append("  MaxStaticMusicBitrate: ").Append(MaxStaticMusicBitrate).Append("\n");
            sb.Append("  MaxStreamingBitrate: ").Append(MaxStreamingBitrate).Append("\n");
            sb.Append("  ModelDescription: ").Append(ModelDescription).Append("\n");
            sb.Append("  ModelName: ").Append(ModelName).Append("\n");
            sb.Append("  ModelNumber: ").Append(ModelNumber).Append("\n");
            sb.Append("  ModelUrl: ").Append(ModelUrl).Append("\n");
            sb.Append("  MusicStreamingTranscodingBitrate: ").Append(MusicStreamingTranscodingBitrate).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ProtocolInfo: ").Append(ProtocolInfo).Append("\n");
            sb.Append("  RequiresPlainFolders: ").Append(RequiresPlainFolders).Append("\n");
            sb.Append("  RequiresPlainVideoItems: ").Append(RequiresPlainVideoItems).Append("\n");
            sb.Append("  ResponseProfiles: ").Append(ResponseProfiles).Append("\n");
            sb.Append("  SerialNumber: ").Append(SerialNumber).Append("\n");
            sb.Append("  SonyAggregationFlags: ").Append(SonyAggregationFlags).Append("\n");
            sb.Append("  SubtitleProfiles: ").Append(SubtitleProfiles).Append("\n");
            sb.Append("  SupportedMediaTypes: ").Append(SupportedMediaTypes).Append("\n");
            sb.Append("  TimelineOffsetSeconds: ").Append(TimelineOffsetSeconds).Append("\n");
            sb.Append("  TranscodingProfiles: ").Append(TranscodingProfiles).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  XmlRootAttributes: ").Append(XmlRootAttributes).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DeviceProfile)obj);
        }

        /// <summary>
        /// Returns true if DeviceProfile instances are equal
        /// </summary>
        /// <param name="other">Instance of DeviceProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeviceProfile other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AlbumArtPn == other.AlbumArtPn ||
                    AlbumArtPn != null &&
                    AlbumArtPn.Equals(other.AlbumArtPn)
                ) && 
                (
                    CodecProfiles == other.CodecProfiles ||
                    CodecProfiles != null &&
                    other.CodecProfiles != null &&
                    CodecProfiles.SequenceEqual(other.CodecProfiles)
                ) && 
                (
                    ContainerProfiles == other.ContainerProfiles ||
                    ContainerProfiles != null &&
                    other.ContainerProfiles != null &&
                    ContainerProfiles.SequenceEqual(other.ContainerProfiles)
                ) && 
                (
                    DirectPlayProfiles == other.DirectPlayProfiles ||
                    DirectPlayProfiles != null &&
                    other.DirectPlayProfiles != null &&
                    DirectPlayProfiles.SequenceEqual(other.DirectPlayProfiles)
                ) && 
                (
                    EnableAlbumArtInDidl == other.EnableAlbumArtInDidl ||
                    
                    EnableAlbumArtInDidl.Equals(other.EnableAlbumArtInDidl)
                ) && 
                (
                    EnableMSMediaReceiverRegistrar == other.EnableMSMediaReceiverRegistrar ||
                    
                    EnableMSMediaReceiverRegistrar.Equals(other.EnableMSMediaReceiverRegistrar)
                ) && 
                (
                    EnableSingleAlbumArtLimit == other.EnableSingleAlbumArtLimit ||
                    
                    EnableSingleAlbumArtLimit.Equals(other.EnableSingleAlbumArtLimit)
                ) && 
                (
                    EnableSingleSubtitleLimit == other.EnableSingleSubtitleLimit ||
                    
                    EnableSingleSubtitleLimit.Equals(other.EnableSingleSubtitleLimit)
                ) && 
                (
                    FriendlyName == other.FriendlyName ||
                    FriendlyName != null &&
                    FriendlyName.Equals(other.FriendlyName)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Identification == other.Identification ||
                    Identification != null &&
                    Identification.Equals(other.Identification)
                ) && 
                (
                    IgnoreTranscodeByteRangeRequests == other.IgnoreTranscodeByteRangeRequests ||
                    
                    IgnoreTranscodeByteRangeRequests.Equals(other.IgnoreTranscodeByteRangeRequests)
                ) && 
                (
                    Manufacturer == other.Manufacturer ||
                    Manufacturer != null &&
                    Manufacturer.Equals(other.Manufacturer)
                ) && 
                (
                    ManufacturerUrl == other.ManufacturerUrl ||
                    ManufacturerUrl != null &&
                    ManufacturerUrl.Equals(other.ManufacturerUrl)
                ) && 
                (
                    MaxAlbumArtHeight == other.MaxAlbumArtHeight ||
                    
                    MaxAlbumArtHeight.Equals(other.MaxAlbumArtHeight)
                ) && 
                (
                    MaxAlbumArtWidth == other.MaxAlbumArtWidth ||
                    
                    MaxAlbumArtWidth.Equals(other.MaxAlbumArtWidth)
                ) && 
                (
                    MaxIconHeight == other.MaxIconHeight ||
                    MaxIconHeight != null &&
                    MaxIconHeight.Equals(other.MaxIconHeight)
                ) && 
                (
                    MaxIconWidth == other.MaxIconWidth ||
                    MaxIconWidth != null &&
                    MaxIconWidth.Equals(other.MaxIconWidth)
                ) && 
                (
                    MaxStaticBitrate == other.MaxStaticBitrate ||
                    MaxStaticBitrate != null &&
                    MaxStaticBitrate.Equals(other.MaxStaticBitrate)
                ) && 
                (
                    MaxStaticMusicBitrate == other.MaxStaticMusicBitrate ||
                    MaxStaticMusicBitrate != null &&
                    MaxStaticMusicBitrate.Equals(other.MaxStaticMusicBitrate)
                ) && 
                (
                    MaxStreamingBitrate == other.MaxStreamingBitrate ||
                    MaxStreamingBitrate != null &&
                    MaxStreamingBitrate.Equals(other.MaxStreamingBitrate)
                ) && 
                (
                    ModelDescription == other.ModelDescription ||
                    ModelDescription != null &&
                    ModelDescription.Equals(other.ModelDescription)
                ) && 
                (
                    ModelName == other.ModelName ||
                    ModelName != null &&
                    ModelName.Equals(other.ModelName)
                ) && 
                (
                    ModelNumber == other.ModelNumber ||
                    ModelNumber != null &&
                    ModelNumber.Equals(other.ModelNumber)
                ) && 
                (
                    ModelUrl == other.ModelUrl ||
                    ModelUrl != null &&
                    ModelUrl.Equals(other.ModelUrl)
                ) && 
                (
                    MusicStreamingTranscodingBitrate == other.MusicStreamingTranscodingBitrate ||
                    MusicStreamingTranscodingBitrate != null &&
                    MusicStreamingTranscodingBitrate.Equals(other.MusicStreamingTranscodingBitrate)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    ProtocolInfo == other.ProtocolInfo ||
                    ProtocolInfo != null &&
                    ProtocolInfo.Equals(other.ProtocolInfo)
                ) && 
                (
                    RequiresPlainFolders == other.RequiresPlainFolders ||
                    
                    RequiresPlainFolders.Equals(other.RequiresPlainFolders)
                ) && 
                (
                    RequiresPlainVideoItems == other.RequiresPlainVideoItems ||
                    
                    RequiresPlainVideoItems.Equals(other.RequiresPlainVideoItems)
                ) && 
                (
                    ResponseProfiles == other.ResponseProfiles ||
                    ResponseProfiles != null &&
                    other.ResponseProfiles != null &&
                    ResponseProfiles.SequenceEqual(other.ResponseProfiles)
                ) && 
                (
                    SerialNumber == other.SerialNumber ||
                    SerialNumber != null &&
                    SerialNumber.Equals(other.SerialNumber)
                ) && 
                (
                    SonyAggregationFlags == other.SonyAggregationFlags ||
                    SonyAggregationFlags != null &&
                    SonyAggregationFlags.Equals(other.SonyAggregationFlags)
                ) && 
                (
                    SubtitleProfiles == other.SubtitleProfiles ||
                    SubtitleProfiles != null &&
                    other.SubtitleProfiles != null &&
                    SubtitleProfiles.SequenceEqual(other.SubtitleProfiles)
                ) && 
                (
                    SupportedMediaTypes == other.SupportedMediaTypes ||
                    SupportedMediaTypes != null &&
                    SupportedMediaTypes.Equals(other.SupportedMediaTypes)
                ) && 
                (
                    TimelineOffsetSeconds == other.TimelineOffsetSeconds ||
                    
                    TimelineOffsetSeconds.Equals(other.TimelineOffsetSeconds)
                ) && 
                (
                    TranscodingProfiles == other.TranscodingProfiles ||
                    TranscodingProfiles != null &&
                    other.TranscodingProfiles != null &&
                    TranscodingProfiles.SequenceEqual(other.TranscodingProfiles)
                ) && 
                (
                    UserId == other.UserId ||
                    UserId != null &&
                    UserId.Equals(other.UserId)
                ) && 
                (
                    XmlRootAttributes == other.XmlRootAttributes ||
                    XmlRootAttributes != null &&
                    other.XmlRootAttributes != null &&
                    XmlRootAttributes.SequenceEqual(other.XmlRootAttributes)
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
                    if (AlbumArtPn != null)
                    hashCode = hashCode * 59 + AlbumArtPn.GetHashCode();
                    if (CodecProfiles != null)
                    hashCode = hashCode * 59 + CodecProfiles.GetHashCode();
                    if (ContainerProfiles != null)
                    hashCode = hashCode * 59 + ContainerProfiles.GetHashCode();
                    if (DirectPlayProfiles != null)
                    hashCode = hashCode * 59 + DirectPlayProfiles.GetHashCode();
                    
                    hashCode = hashCode * 59 + EnableAlbumArtInDidl.GetHashCode();
                    
                    hashCode = hashCode * 59 + EnableMSMediaReceiverRegistrar.GetHashCode();
                    
                    hashCode = hashCode * 59 + EnableSingleAlbumArtLimit.GetHashCode();
                    
                    hashCode = hashCode * 59 + EnableSingleSubtitleLimit.GetHashCode();
                    if (FriendlyName != null)
                    hashCode = hashCode * 59 + FriendlyName.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Identification != null)
                    hashCode = hashCode * 59 + Identification.GetHashCode();
                    
                    hashCode = hashCode * 59 + IgnoreTranscodeByteRangeRequests.GetHashCode();
                    if (Manufacturer != null)
                    hashCode = hashCode * 59 + Manufacturer.GetHashCode();
                    if (ManufacturerUrl != null)
                    hashCode = hashCode * 59 + ManufacturerUrl.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxAlbumArtHeight.GetHashCode();
                    
                    hashCode = hashCode * 59 + MaxAlbumArtWidth.GetHashCode();
                    if (MaxIconHeight != null)
                    hashCode = hashCode * 59 + MaxIconHeight.GetHashCode();
                    if (MaxIconWidth != null)
                    hashCode = hashCode * 59 + MaxIconWidth.GetHashCode();
                    if (MaxStaticBitrate != null)
                    hashCode = hashCode * 59 + MaxStaticBitrate.GetHashCode();
                    if (MaxStaticMusicBitrate != null)
                    hashCode = hashCode * 59 + MaxStaticMusicBitrate.GetHashCode();
                    if (MaxStreamingBitrate != null)
                    hashCode = hashCode * 59 + MaxStreamingBitrate.GetHashCode();
                    if (ModelDescription != null)
                    hashCode = hashCode * 59 + ModelDescription.GetHashCode();
                    if (ModelName != null)
                    hashCode = hashCode * 59 + ModelName.GetHashCode();
                    if (ModelNumber != null)
                    hashCode = hashCode * 59 + ModelNumber.GetHashCode();
                    if (ModelUrl != null)
                    hashCode = hashCode * 59 + ModelUrl.GetHashCode();
                    if (MusicStreamingTranscodingBitrate != null)
                    hashCode = hashCode * 59 + MusicStreamingTranscodingBitrate.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (ProtocolInfo != null)
                    hashCode = hashCode * 59 + ProtocolInfo.GetHashCode();
                    
                    hashCode = hashCode * 59 + RequiresPlainFolders.GetHashCode();
                    
                    hashCode = hashCode * 59 + RequiresPlainVideoItems.GetHashCode();
                    if (ResponseProfiles != null)
                    hashCode = hashCode * 59 + ResponseProfiles.GetHashCode();
                    if (SerialNumber != null)
                    hashCode = hashCode * 59 + SerialNumber.GetHashCode();
                    if (SonyAggregationFlags != null)
                    hashCode = hashCode * 59 + SonyAggregationFlags.GetHashCode();
                    if (SubtitleProfiles != null)
                    hashCode = hashCode * 59 + SubtitleProfiles.GetHashCode();
                    if (SupportedMediaTypes != null)
                    hashCode = hashCode * 59 + SupportedMediaTypes.GetHashCode();
                    
                    hashCode = hashCode * 59 + TimelineOffsetSeconds.GetHashCode();
                    if (TranscodingProfiles != null)
                    hashCode = hashCode * 59 + TranscodingProfiles.GetHashCode();
                    if (UserId != null)
                    hashCode = hashCode * 59 + UserId.GetHashCode();
                    if (XmlRootAttributes != null)
                    hashCode = hashCode * 59 + XmlRootAttributes.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DeviceProfile left, DeviceProfile right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DeviceProfile left, DeviceProfile right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}