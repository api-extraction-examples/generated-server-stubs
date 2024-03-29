import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.notification_enum_priority import NotificationEnumPriority  # noqa: E501
from openapi_server.models.notify_v1_service_notification import NotifyV1ServiceNotification  # noqa: E501
from openapi_server import util


def create_notification(service_sid, action=None, alexa=None, apn=None, body=None, data=None, delivery_callback_url=None, facebook_messenger=None, fcm=None, gcm=None, identity=None, priority=None, segment=None, sms=None, sound=None, tag=None, title=None, to_binding=None, ttl=None):  # noqa: E501
    """create_notification

     # noqa: E501

    :param service_sid: The SID of the [Service](https://www.twilio.com/docs/notify/api/service-resource) to create the resource under.
    :type service_sid: str
    :param action: The actions to display for the notification. For APNS, translates to the &#x60;aps.category&#x60; value. For GCM, translates to the &#x60;data.twi_action&#x60; value. For SMS, this parameter is not supported and is omitted from deliveries to those channels.
    :type action: str
    :param alexa: Deprecated.
    :type alexa: dict | bytes
    :param apn: The APNS-specific payload that overrides corresponding attributes in the generic payload for APNS Bindings. This property maps to the APNS &#x60;Payload&#x60; item, therefore the &#x60;aps&#x60; key must be used to change standard attributes. Adds custom key-value pairs to the root of the dictionary. See the [APNS documentation](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CommunicatingwithAPNs.html) for more details. We reserve keys that start with &#x60;twi_&#x60; for future use. Custom keys that start with &#x60;twi_&#x60; are not allowed.
    :type apn: dict | bytes
    :param body: The notification text. For FCM and GCM, translates to &#x60;data.twi_body&#x60;. For APNS, translates to &#x60;aps.alert.body&#x60;. For SMS, translates to &#x60;body&#x60;. SMS requires either this &#x60;body&#x60; value, or &#x60;media_urls&#x60; attribute defined in the &#x60;sms&#x60; parameter of the notification.
    :type body: str
    :param data: The custom key-value pairs of the notification&#39;s payload. For FCM and GCM, this value translates to &#x60;data&#x60; in the FCM and GCM payloads. FCM and GCM [reserve certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref) that cannot be used in those channels. For APNS, attributes of &#x60;data&#x60; are inserted into the APNS payload as custom properties outside of the &#x60;aps&#x60; dictionary. In all channels, we reserve keys that start with &#x60;twi_&#x60; for future use. Custom keys that start with &#x60;twi_&#x60; are not allowed and are rejected as 400 Bad request with no delivery attempted. For SMS, this parameter is not supported and is omitted from deliveries to those channels.
    :type data: dict | bytes
    :param delivery_callback_url: URL to send webhooks.
    :type delivery_callback_url: str
    :param facebook_messenger: Deprecated.
    :type facebook_messenger: dict | bytes
    :param fcm: The FCM-specific payload that overrides corresponding attributes in the generic payload for FCM Bindings. This property maps to the root JSON dictionary. See the [FCM documentation](https://firebase.google.com/docs/cloud-messaging/http-server-ref#downstream) for more details. Target parameters &#x60;to&#x60;, &#x60;registration_ids&#x60;, &#x60;condition&#x60;, and &#x60;notification_key&#x60; are not allowed in this parameter. We reserve keys that start with &#x60;twi_&#x60; for future use. Custom keys that start with &#x60;twi_&#x60; are not allowed. FCM also [reserves certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref), which cannot be used in that channel.
    :type fcm: dict | bytes
    :param gcm: The GCM-specific payload that overrides corresponding attributes in the generic payload for GCM Bindings.  This property maps to the root JSON dictionary. See the [GCM documentation](https://firebase.google.com/docs/cloud-messaging/http-server-ref) for more details. Target parameters &#x60;to&#x60;, &#x60;registration_ids&#x60;, and &#x60;notification_key&#x60; are not allowed. We reserve keys that start with &#x60;twi_&#x60; for future use. Custom keys that start with &#x60;twi_&#x60; are not allowed. GCM also [reserves certain keys](https://firebase.google.com/docs/cloud-messaging/http-server-ref).
    :type gcm: dict | bytes
    :param identity: The &#x60;identity&#x60; value that uniquely identifies the new resource&#39;s [User](https://www.twilio.com/docs/chat/rest/user-resource) within the [Service](https://www.twilio.com/docs/notify/api/service-resource). Delivery will be attempted only to Bindings with an Identity in this list. No more than 20 items are allowed in this list.
    :type identity: List[str]
    :param priority: 
    :type priority: str
    :param segment: The Segment resource is deprecated. Use the &#x60;tag&#x60; parameter, instead.
    :type segment: List[str]
    :param sms: The SMS-specific payload that overrides corresponding attributes in the generic payload for SMS Bindings.  Each attribute in this value maps to the corresponding &#x60;form&#x60; parameter of the Twilio [Message](https://www.twilio.com/docs/sms/quickstart) resource.  These parameters of the Message resource are supported in snake case format: &#x60;body&#x60;, &#x60;media_urls&#x60;, &#x60;status_callback&#x60;, and &#x60;max_price&#x60;.  The &#x60;status_callback&#x60; parameter overrides the corresponding parameter in the messaging service, if configured. The &#x60;media_urls&#x60; property expects a JSON array.
    :type sms: dict | bytes
    :param sound: The name of the sound to be played for the notification. For FCM and GCM, this Translates to &#x60;data.twi_sound&#x60;.  For APNS, this translates to &#x60;aps.sound&#x60;.  SMS does not support this property.
    :type sound: str
    :param tag: A tag that selects the Bindings to notify. Repeat this parameter to specify more than one tag, up to a total of 5 tags. The implicit tag &#x60;all&#x60; is available to notify all Bindings in a Service instance. Similarly, the implicit tags &#x60;apn&#x60;, &#x60;fcm&#x60;, &#x60;gcm&#x60;, &#x60;sms&#x60; and &#x60;facebook-messenger&#x60; are available to notify all Bindings in a specific channel.
    :type tag: List[str]
    :param title: The notification title. For FCM and GCM, this translates to the &#x60;data.twi_title&#x60; value. For APNS, this translates to the &#x60;aps.alert.title&#x60; value. SMS does not support this property. This field is not visible on iOS phones and tablets but appears on Apple Watch and Android devices.
    :type title: str
    :param to_binding: The destination address specified as a JSON string.  Multiple &#x60;to_binding&#x60; parameters can be included but the total size of the request entity should not exceed 1MB. This is typically sufficient for 10,000 phone numbers.
    :type to_binding: List[str]
    :param ttl: How long, in seconds, the notification is valid. Can be an integer between 0 and 2,419,200, which is 4 weeks, the default and the maximum supported time to live (TTL). Delivery should be attempted if the device is offline until the TTL elapses. Zero means that the notification delivery is attempted immediately, only once, and is not stored for future delivery. SMS does not support this property.
    :type ttl: int

    :rtype: Union[NotifyV1ServiceNotification, Tuple[NotifyV1ServiceNotification, int], Tuple[NotifyV1ServiceNotification, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        alexa = object.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        apn = object.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        data = object.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        facebook_messenger = object.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        fcm = object.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        gcm = object.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        sms = object.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
