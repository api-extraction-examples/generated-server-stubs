/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    /// Information about the type of change that has occurred. This field is only present when the value of the property &#x60;action&#x60;, describing the action taken on the **resource**, is &#x60;changed&#x60;.
    /// </summary>
    [DataContract]
    public partial class EventResponseChange : IEquatable<EventResponseChange>
    {
        /// <summary>
        /// The type of action taken on the **field** which has been changed.  This can be one of &#x60;changed&#x60;, &#x60;added&#x60;, or &#x60;removed&#x60; depending on the nature of the change.
        /// </summary>
        /// <value>The type of action taken on the **field** which has been changed.  This can be one of &#x60;changed&#x60;, &#x60;added&#x60;, or &#x60;removed&#x60; depending on the nature of the change.</value>
        /// <example>changed</example>
        [DataMember(Name="action", EmitDefaultValue=false)]
        public string Action { get; set; }

        /// <summary>
        /// *Conditional.* This property is only present when the **field&#39;s** &#x60;action&#x60; is &#x60;added&#x60; _and_ the &#x60;added_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.
        /// </summary>
        /// <value>*Conditional.* This property is only present when the **field&#39;s** &#x60;action&#x60; is &#x60;added&#x60; _and_ the &#x60;added_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.</value>
        /// <example>{&quot;gid&quot;:&quot;12345&quot;,&quot;resource_type&quot;:&quot;user&quot;}</example>
        [DataMember(Name="added_value", EmitDefaultValue=true)]
        public Object AddedValue { get; set; }

        /// <summary>
        /// The name of the field that has changed in the resource.
        /// </summary>
        /// <value>The name of the field that has changed in the resource.</value>
        /// <example>assignee</example>
        [DataMember(Name="field", EmitDefaultValue=false)]
        public string Field { get; set; }

        /// <summary>
        /// *Conditional.* This property is only present when the **field&#39;s** &#x60;action&#x60; is &#x60;changed&#x60; _and_ the &#x60;new_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.
        /// </summary>
        /// <value>*Conditional.* This property is only present when the **field&#39;s** &#x60;action&#x60; is &#x60;changed&#x60; _and_ the &#x60;new_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.</value>
        /// <example>{&quot;gid&quot;:&quot;12345&quot;,&quot;resource_type&quot;:&quot;user&quot;}</example>
        [DataMember(Name="new_value", EmitDefaultValue=true)]
        public Object NewValue { get; set; }

        /// <summary>
        /// *Conditional.* This property is only present when the **field&#39;s** &#x60;action&#x60; is &#x60;removed&#x60; _and_ the &#x60;removed_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.
        /// </summary>
        /// <value>*Conditional.* This property is only present when the **field&#39;s** &#x60;action&#x60; is &#x60;removed&#x60; _and_ the &#x60;removed_value&#x60; is an Asana resource. This will be only the &#x60;gid&#x60; and &#x60;resource_type&#x60; of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.</value>
        /// <example>{&quot;gid&quot;:&quot;12345&quot;,&quot;resource_type&quot;:&quot;user&quot;}</example>
        [DataMember(Name="removed_value", EmitDefaultValue=true)]
        public Object RemovedValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EventResponseChange {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  AddedValue: ").Append(AddedValue).Append("\n");
            sb.Append("  Field: ").Append(Field).Append("\n");
            sb.Append("  NewValue: ").Append(NewValue).Append("\n");
            sb.Append("  RemovedValue: ").Append(RemovedValue).Append("\n");
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
            return obj.GetType() == GetType() && Equals((EventResponseChange)obj);
        }

        /// <summary>
        /// Returns true if EventResponseChange instances are equal
        /// </summary>
        /// <param name="other">Instance of EventResponseChange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EventResponseChange other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Action == other.Action ||
                    Action != null &&
                    Action.Equals(other.Action)
                ) && 
                (
                    AddedValue == other.AddedValue ||
                    AddedValue != null &&
                    AddedValue.Equals(other.AddedValue)
                ) && 
                (
                    Field == other.Field ||
                    Field != null &&
                    Field.Equals(other.Field)
                ) && 
                (
                    NewValue == other.NewValue ||
                    NewValue != null &&
                    NewValue.Equals(other.NewValue)
                ) && 
                (
                    RemovedValue == other.RemovedValue ||
                    RemovedValue != null &&
                    RemovedValue.Equals(other.RemovedValue)
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
                    if (Action != null)
                    hashCode = hashCode * 59 + Action.GetHashCode();
                    if (AddedValue != null)
                    hashCode = hashCode * 59 + AddedValue.GetHashCode();
                    if (Field != null)
                    hashCode = hashCode * 59 + Field.GetHashCode();
                    if (NewValue != null)
                    hashCode = hashCode * 59 + NewValue.GetHashCode();
                    if (RemovedValue != null)
                    hashCode = hashCode * 59 + RemovedValue.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(EventResponseChange left, EventResponseChange right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EventResponseChange left, EventResponseChange right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}