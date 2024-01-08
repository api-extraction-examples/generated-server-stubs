/*
 * Twilio - Notify
 *
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.52.0
 * Contact: support@twilio.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class NotifyV1NotificationApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="serviceSid">The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) to create the resource under.</param>
        /// <param name="action">The actions to display for the notification. For APNS, translates to the &#x60;aps.category&#x60; value. For GCM, translates to the &#x60;data.twi_action&#x60; value. For SMS, this parameter is not supported and is omitted from deliveries to those channels.</param>
        /// <param name="alexa">Deprecated.</param>
        /// <param name="apn">The APNS-specific payload that overrides corresponding attributes in the generic payload for APNS Bindings. This property maps to the APNS &#x60;Payload&#x60; item, therefore the &#x60;aps&#x60; key must be used to change standard attributes. Adds custom key-value pairs to the root of the dictionary. See the [APNS documentation](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CommunicatingwithAPNs.html) for more details. We reserve keys that start with &#x60;twi_&#x60; for future use. Custom keys that start with &#x60;twi_&#x60; are not allowed.</param>
        /// <param name="body">The notification text. For FCM and GCM, translates to &#x60;data.twi_body&#x60;. For APNS, translates to &#x60;aps.alert.body&#x60;. For SMS, translates to &#x60;body&#x60;. SMS requires either this &#x60;body&#x60; value, or &#x60;media_urls&#x60; attribute defined in the &#x60;sms&#x60; parameter of the notification.</param>
        /// <param name="data">The custom key-value pairs of the notification&#39;s payload. For FCM and GCM, this value translates to &#x60;data&#x60; in the FCM and GCM payloads. FCM and GCM [reserve certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref) that cannot be used in those channels. For APNS, attributes of &#x60;data&#x60; are inserted into the APNS payload as custom properties outside of the &#x60;aps&#x60; dictionary. In all channels, we reserve keys that start with &#x60;twi_&#x60; for future use. Custom keys that start with &#x60;twi_&#x60; are not allowed and are rejected as 400 Bad request with no delivery attempted. For SMS, this parameter is not supported and is omitted from deliveries to those channels.</param>
        /// <param name="deliveryCallbackUrl">URL to send webhooks.</param>
        /// <param name="facebookMessenger">Deprecated.</param>
        /// <param name="fcm">The FCM-specific payload that overrides corresponding attributes in the generic payload for FCM Bindings. This property maps to the root JSON dictionary. See the [FCM documentation](https://firebase.google.com/docs/cloud-messaging/http-server-ref#downstream) for more details. Target parameters &#x60;to&#x60;, &#x60;registration_ids&#x60;, &#x60;condition&#x60;, and &#x60;notification_key&#x60; are not allowed in this parameter. We reserve keys that start with &#x60;twi_&#x60; for future use. Custom keys that start with &#x60;twi_&#x60; are not allowed. FCM also [reserves certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref), which cannot be used in that channel.</param>
        /// <param name="gcm">The GCM-specific payload that overrides corresponding attributes in the generic payload for GCM Bindings.  This property maps to the root JSON dictionary. See the [GCM documentation](https://firebase.google.com/docs/cloud-messaging/http-server-ref) for more details. Target parameters &#x60;to&#x60;, &#x60;registration_ids&#x60;, and &#x60;notification_key&#x60; are not allowed. We reserve keys that start with &#x60;twi_&#x60; for future use. Custom keys that start with &#x60;twi_&#x60; are not allowed. GCM also [reserves certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref).</param>
        /// <param name="identity">The &#x60;identity&#x60; value that uniquely identifies the new resource&#39;s [User](https://www.twilio.com/docs/chat/rest/user-resource) within the [Service](https://www.twilio.com/docs/notify/api/service-resource). Delivery will be attempted only to Bindings with an Identity in this list. No more than 20 items are allowed in this list.</param>
        /// <param name="priority"></param>
        /// <param name="segment">The Segment resource is deprecated. Use the &#x60;tag&#x60; parameter, instead.</param>
        /// <param name="sms">The SMS-specific payload that overrides corresponding attributes in the generic payload for SMS Bindings.  Each attribute in this value maps to the corresponding &#x60;form&#x60; parameter of the Twilio [Message](https://www.twilio.com/docs/sms/quickstart) resource.  These parameters of the Message resource are supported in snake case format: &#x60;body&#x60;, &#x60;media_urls&#x60;, &#x60;status_callback&#x60;, and &#x60;max_price&#x60;.  The &#x60;status_callback&#x60; parameter overrides the corresponding parameter in the messaging service, if configured. The &#x60;media_urls&#x60; property expects a JSON array.</param>
        /// <param name="sound">The name of the sound to be played for the notification. For FCM and GCM, this Translates to &#x60;data.twi_sound&#x60;.  For APNS, this translates to &#x60;aps.sound&#x60;.  SMS does not support this property.</param>
        /// <param name="tag">A tag that selects the Bindings to notify. Repeat this parameter to specify more than one tag, up to a total of 5 tags. The implicit tag &#x60;all&#x60; is available to notify all Bindings in a Service instance. Similarly, the implicit tags &#x60;apn&#x60;, &#x60;fcm&#x60;, &#x60;gcm&#x60;, &#x60;sms&#x60; and &#x60;facebook-messenger&#x60; are available to notify all Bindings in a specific channel.</param>
        /// <param name="title">The notification title. For FCM and GCM, this translates to the &#x60;data.twi_title&#x60; value. For APNS, this translates to the &#x60;aps.alert.title&#x60; value. SMS does not support this property. This field is not visible on iOS phones and tablets but appears on Apple Watch and Android devices.</param>
        /// <param name="toBinding">The destination address specified as a JSON string.  Multiple &#x60;to_binding&#x60; parameters can be included but the total size of the request entity should not exceed 1MB. This is typically sufficient for 10,000 phone numbers.</param>
        /// <param name="ttl">How long, in seconds, the notification is valid. Can be an integer between 0 and 2,419,200, which is 4 weeks, the default and the maximum supported time to live (TTL). Delivery should be attempted if the device is offline until the TTL elapses. Zero means that the notification delivery is attempted immediately, only once, and is not stored for future delivery. SMS does not support this property.</param>
        /// <response code="201">Created</response>
        [HttpPost]
        [Route("/v1/Services/{ServiceSid}/Notifications")]
        [Consumes("application/x-www-form-urlencoded")]
        [ValidateModelState]
        [SwaggerOperation("CreateNotification")]
        [SwaggerResponse(statusCode: 201, type: typeof(NotifyV1ServiceNotification), description: "Created")]
        public virtual IActionResult CreateNotification([FromRoute (Name = "ServiceSid")][Required][RegularExpression("^IS[0-9a-fA-F]{32}$")][StringLength(34, MinimumLength=34)]string serviceSid, [FromForm (Name = "Action")]string action, [FromForm (Name = "Alexa")]Object alexa, [FromForm (Name = "Apn")]Object apn, [FromForm (Name = "Body")]string body, [FromForm (Name = "Data")]Object data, [FromForm (Name = "DeliveryCallbackUrl")]string deliveryCallbackUrl, [FromForm (Name = "FacebookMessenger")]Object facebookMessenger, [FromForm (Name = "Fcm")]Object fcm, [FromForm (Name = "Gcm")]Object gcm, [FromForm (Name = "Identity")]List<string> identity, [FromForm (Name = "Priority")]NotificationEnumPriority priority, [FromForm (Name = "Segment")]List<string> segment, [FromForm (Name = "Sms")]Object sms, [FromForm (Name = "Sound")]string sound, [FromForm (Name = "Tag")]List<string> tag, [FromForm (Name = "Title")]string title, [FromForm (Name = "ToBinding")]List<string> toBinding, [FromForm (Name = "Ttl")]int? ttl)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(NotifyV1ServiceNotification));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : \"\",\n  \"date_created\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"sound\" : \"sound\",\n  \"facebook_messenger\" : \"\",\n  \"alexa\" : \"\",\n  \"body\" : \"body\",\n  \"priority\" : \"priority\",\n  \"title\" : \"title\",\n  \"ttl\" : 0,\n  \"segments\" : [ \"segments\", \"segments\" ],\n  \"sid\" : \"sid\",\n  \"tags\" : [ \"tags\", \"tags\" ],\n  \"gcm\" : \"\",\n  \"service_sid\" : \"service_sid\",\n  \"fcm\" : \"\",\n  \"identities\" : [ \"identities\", \"identities\" ],\n  \"sms\" : \"\",\n  \"account_sid\" : \"account_sid\",\n  \"action\" : \"action\",\n  \"apn\" : \"\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<NotifyV1ServiceNotification>(exampleJson)
            : default(NotifyV1ServiceNotification);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}