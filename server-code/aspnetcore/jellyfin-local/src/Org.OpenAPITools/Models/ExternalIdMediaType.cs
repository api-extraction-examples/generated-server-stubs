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
        /// The specific media type of an MediaBrowser.Model.Providers.ExternalIdInfo.
        /// </summary>
        /// <value>The specific media type of an MediaBrowser.Model.Providers.ExternalIdInfo.</value>
        [TypeConverter(typeof(CustomEnumConverter<ExternalIdMediaType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ExternalIdMediaType
        {
            
            /// <summary>
            /// Enum AlbumEnum for Album
            /// </summary>
            [EnumMember(Value = "Album")]
            AlbumEnum = 1,
            
            /// <summary>
            /// Enum AlbumArtistEnum for AlbumArtist
            /// </summary>
            [EnumMember(Value = "AlbumArtist")]
            AlbumArtistEnum = 2,
            
            /// <summary>
            /// Enum ArtistEnum for Artist
            /// </summary>
            [EnumMember(Value = "Artist")]
            ArtistEnum = 3,
            
            /// <summary>
            /// Enum BoxSetEnum for BoxSet
            /// </summary>
            [EnumMember(Value = "BoxSet")]
            BoxSetEnum = 4,
            
            /// <summary>
            /// Enum EpisodeEnum for Episode
            /// </summary>
            [EnumMember(Value = "Episode")]
            EpisodeEnum = 5,
            
            /// <summary>
            /// Enum MovieEnum for Movie
            /// </summary>
            [EnumMember(Value = "Movie")]
            MovieEnum = 6,
            
            /// <summary>
            /// Enum OtherArtistEnum for OtherArtist
            /// </summary>
            [EnumMember(Value = "OtherArtist")]
            OtherArtistEnum = 7,
            
            /// <summary>
            /// Enum PersonEnum for Person
            /// </summary>
            [EnumMember(Value = "Person")]
            PersonEnum = 8,
            
            /// <summary>
            /// Enum ReleaseGroupEnum for ReleaseGroup
            /// </summary>
            [EnumMember(Value = "ReleaseGroup")]
            ReleaseGroupEnum = 9,
            
            /// <summary>
            /// Enum SeasonEnum for Season
            /// </summary>
            [EnumMember(Value = "Season")]
            SeasonEnum = 10,
            
            /// <summary>
            /// Enum SeriesEnum for Series
            /// </summary>
            [EnumMember(Value = "Series")]
            SeriesEnum = 11,
            
            /// <summary>
            /// Enum TrackEnum for Track
            /// </summary>
            [EnumMember(Value = "Track")]
            TrackEnum = 12
        }
}