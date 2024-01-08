/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * The version of the OpenAPI document: v1.9.0
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
    /// This type is used to provide details about any KYC check that is applicable to the managed payments seller.
    /// </summary>
    [DataContract]
    public partial class KycCheck : IEquatable<KycCheck>
    {
        /// <summary>
        /// This field gives a short summary of what is required from the seller. An example might be, &#39;&lt;code&gt;Upload bank document now.&lt;/code&gt;&#39;. The &lt;b&gt;detailMessage&lt;/b&gt; field will often provide more details on what is required of the seller.
        /// </summary>
        /// <value>This field gives a short summary of what is required from the seller. An example might be, &#39;&lt;code&gt;Upload bank document now.&lt;/code&gt;&#39;. The &lt;b&gt;detailMessage&lt;/b&gt; field will often provide more details on what is required of the seller.</value>
        [DataMember(Name="alert", EmitDefaultValue=false)]
        public string Alert { get; set; }

        /// <summary>
        /// The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the &lt;b&gt;detailMessage&lt;/b&gt; and other applicable, corresponding fields. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType&#39;&gt;eBay API documentation&lt;/a&gt;
        /// </summary>
        /// <value>The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the &lt;b&gt;detailMessage&lt;/b&gt; and other applicable, corresponding fields. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType&#39;&gt;eBay API documentation&lt;/a&gt;</value>
        [DataMember(Name="dataRequired", EmitDefaultValue=false)]
        public string DataRequired { get; set; }

        /// <summary>
        /// This field gives a detailed message about what is required from the seller. An example might be, &#39;&lt;code&gt;Please upload a bank document by 2020-08-01 to get your account back in good standing.&lt;/code&gt;&#39;.
        /// </summary>
        /// <value>This field gives a detailed message about what is required from the seller. An example might be, &#39;&lt;code&gt;Please upload a bank document by 2020-08-01 to get your account back in good standing.&lt;/code&gt;&#39;.</value>
        [DataMember(Name="detailMessage", EmitDefaultValue=false)]
        public string DetailMessage { get; set; }

        /// <summary>
        /// The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.&lt;br&gt;&lt;br&gt;The timestamp in this field uses the UTC date and time format described in the &lt;a href&#x3D;\&quot;https://www.iso.org/iso-8601-date-and-time-format.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 8601 Standard&lt;/a&gt;. See below for this format and an example: &lt;br&gt;&lt;br&gt;&lt;i&gt;MM-DD-YYYY HH:MM:SS&lt;/i&gt;&lt;br/&gt;&lt;code&gt;06-05-2020 10:34:18&lt;/code&gt;
        /// </summary>
        /// <value>The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.&lt;br&gt;&lt;br&gt;The timestamp in this field uses the UTC date and time format described in the &lt;a href&#x3D;\&quot;https://www.iso.org/iso-8601-date-and-time-format.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 8601 Standard&lt;/a&gt;. See below for this format and an example: &lt;br&gt;&lt;br&gt;&lt;i&gt;MM-DD-YYYY HH:MM:SS&lt;/i&gt;&lt;br/&gt;&lt;code&gt;06-05-2020 10:34:18&lt;/code&gt;</value>
        [DataMember(Name="dueDate", EmitDefaultValue=false)]
        public string DueDate { get; set; }

        /// <summary>
        /// If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.
        /// </summary>
        /// <value>If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.</value>
        [DataMember(Name="remedyUrl", EmitDefaultValue=false)]
        public string RemedyUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KycCheck {\n");
            sb.Append("  Alert: ").Append(Alert).Append("\n");
            sb.Append("  DataRequired: ").Append(DataRequired).Append("\n");
            sb.Append("  DetailMessage: ").Append(DetailMessage).Append("\n");
            sb.Append("  DueDate: ").Append(DueDate).Append("\n");
            sb.Append("  RemedyUrl: ").Append(RemedyUrl).Append("\n");
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
            return obj.GetType() == GetType() && Equals((KycCheck)obj);
        }

        /// <summary>
        /// Returns true if KycCheck instances are equal
        /// </summary>
        /// <param name="other">Instance of KycCheck to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KycCheck other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Alert == other.Alert ||
                    Alert != null &&
                    Alert.Equals(other.Alert)
                ) && 
                (
                    DataRequired == other.DataRequired ||
                    DataRequired != null &&
                    DataRequired.Equals(other.DataRequired)
                ) && 
                (
                    DetailMessage == other.DetailMessage ||
                    DetailMessage != null &&
                    DetailMessage.Equals(other.DetailMessage)
                ) && 
                (
                    DueDate == other.DueDate ||
                    DueDate != null &&
                    DueDate.Equals(other.DueDate)
                ) && 
                (
                    RemedyUrl == other.RemedyUrl ||
                    RemedyUrl != null &&
                    RemedyUrl.Equals(other.RemedyUrl)
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
                    if (Alert != null)
                    hashCode = hashCode * 59 + Alert.GetHashCode();
                    if (DataRequired != null)
                    hashCode = hashCode * 59 + DataRequired.GetHashCode();
                    if (DetailMessage != null)
                    hashCode = hashCode * 59 + DetailMessage.GetHashCode();
                    if (DueDate != null)
                    hashCode = hashCode * 59 + DueDate.GetHashCode();
                    if (RemedyUrl != null)
                    hashCode = hashCode * 59 + RemedyUrl.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(KycCheck left, KycCheck right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(KycCheck left, KycCheck right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
