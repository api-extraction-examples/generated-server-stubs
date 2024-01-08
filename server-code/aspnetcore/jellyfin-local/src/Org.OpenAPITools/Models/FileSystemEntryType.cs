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
        /// Enum FileSystemEntryType.
        /// </summary>
        /// <value>Enum FileSystemEntryType.</value>
        [TypeConverter(typeof(CustomEnumConverter<FileSystemEntryType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum FileSystemEntryType
        {
            
            /// <summary>
            /// Enum FileEnum for File
            /// </summary>
            [EnumMember(Value = "File")]
            FileEnum = 1,
            
            /// <summary>
            /// Enum DirectoryEnum for Directory
            /// </summary>
            [EnumMember(Value = "Directory")]
            DirectoryEnum = 2,
            
            /// <summary>
            /// Enum NetworkComputerEnum for NetworkComputer
            /// </summary>
            [EnumMember(Value = "NetworkComputer")]
            NetworkComputerEnum = 3,
            
            /// <summary>
            /// Enum NetworkShareEnum for NetworkShare
            /// </summary>
            [EnumMember(Value = "NetworkShare")]
            NetworkShareEnum = 4
        }
}
