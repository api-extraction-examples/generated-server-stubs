import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.list_service_response import ListServiceResponse  # noqa: E501
from openapi_server.models.notify_v1_service import NotifyV1Service  # noqa: E501
from openapi_server import util


def create_service(alexa_skill_id=None, apn_credential_sid=None, default_alexa_notification_protocol_version=None, default_apn_notification_protocol_version=None, default_fcm_notification_protocol_version=None, default_gcm_notification_protocol_version=None, delivery_callback_enabled=None, delivery_callback_url=None, facebook_messenger_page_id=None, fcm_credential_sid=None, friendly_name=None, gcm_credential_sid=None, log_enabled=None, messaging_service_sid=None):  # noqa: E501
    """create_service

     # noqa: E501

    :param alexa_skill_id: Deprecated.
    :type alexa_skill_id: str
    :param apn_credential_sid: The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for APN Bindings.
    :type apn_credential_sid: str
    :param default_alexa_notification_protocol_version: Deprecated.
    :type default_alexa_notification_protocol_version: str
    :param default_apn_notification_protocol_version: The protocol version to use for sending APNS notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
    :type default_apn_notification_protocol_version: str
    :param default_fcm_notification_protocol_version: The protocol version to use for sending FCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
    :type default_fcm_notification_protocol_version: str
    :param default_gcm_notification_protocol_version: The protocol version to use for sending GCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
    :type default_gcm_notification_protocol_version: str
    :param delivery_callback_enabled: Callback configuration that enables delivery callbacks, default false
    :type delivery_callback_enabled: bool
    :param delivery_callback_url: URL to send delivery status callback.
    :type delivery_callback_url: str
    :param facebook_messenger_page_id: Deprecated.
    :type facebook_messenger_page_id: str
    :param fcm_credential_sid: The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for FCM Bindings.
    :type fcm_credential_sid: str
    :param friendly_name: A descriptive string that you create to describe the resource. It can be up to 64 characters long.
    :type friendly_name: str
    :param gcm_credential_sid: The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for GCM Bindings.
    :type gcm_credential_sid: str
    :param log_enabled: Whether to log notifications. Can be: &#x60;true&#x60; or &#x60;false&#x60; and the default is &#x60;true&#x60;.
    :type log_enabled: bool
    :param messaging_service_sid: The SID of the [Messaging Service](https://www.twilio.com/docs/sms/quickstart#messaging-services) to use for SMS Bindings. This parameter must be set in order to send SMS notifications.
    :type messaging_service_sid: str

    :rtype: Union[NotifyV1Service, Tuple[NotifyV1Service, int], Tuple[NotifyV1Service, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_service(sid):  # noqa: E501
    """delete_service

     # noqa: E501

    :param sid: The Twilio-provided string that uniquely identifies the Service resource to delete.
    :type sid: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def fetch_service(sid):  # noqa: E501
    """fetch_service

     # noqa: E501

    :param sid: The Twilio-provided string that uniquely identifies the Service resource to fetch.
    :type sid: str

    :rtype: Union[NotifyV1Service, Tuple[NotifyV1Service, int], Tuple[NotifyV1Service, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_service(friendly_name=None, page_size=None, page=None, page_token=None):  # noqa: E501
    """list_service

     # noqa: E501

    :param friendly_name: The string that identifies the Service resources to read.
    :type friendly_name: str
    :param page_size: How many resources to return in each list page. The default is 50, and the maximum is 1000.
    :type page_size: int
    :param page: The page index. This value is simply for client state.
    :type page: int
    :param page_token: The page token. This is provided by the API.
    :type page_token: str

    :rtype: Union[ListServiceResponse, Tuple[ListServiceResponse, int], Tuple[ListServiceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_service(sid, alexa_skill_id=None, apn_credential_sid=None, default_alexa_notification_protocol_version=None, default_apn_notification_protocol_version=None, default_fcm_notification_protocol_version=None, default_gcm_notification_protocol_version=None, delivery_callback_enabled=None, delivery_callback_url=None, facebook_messenger_page_id=None, fcm_credential_sid=None, friendly_name=None, gcm_credential_sid=None, log_enabled=None, messaging_service_sid=None):  # noqa: E501
    """update_service

     # noqa: E501

    :param sid: The Twilio-provided string that uniquely identifies the Service resource to update.
    :type sid: str
    :param alexa_skill_id: Deprecated.
    :type alexa_skill_id: str
    :param apn_credential_sid: The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for APN Bindings.
    :type apn_credential_sid: str
    :param default_alexa_notification_protocol_version: Deprecated.
    :type default_alexa_notification_protocol_version: str
    :param default_apn_notification_protocol_version: The protocol version to use for sending APNS notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
    :type default_apn_notification_protocol_version: str
    :param default_fcm_notification_protocol_version: The protocol version to use for sending FCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
    :type default_fcm_notification_protocol_version: str
    :param default_gcm_notification_protocol_version: The protocol version to use for sending GCM notifications. Can be overridden on a Binding by Binding basis when creating a [Binding](https://www.twilio.com/docs/notify/api/binding-resource) resource.
    :type default_gcm_notification_protocol_version: str
    :param delivery_callback_enabled: Callback configuration that enables delivery callbacks, default false
    :type delivery_callback_enabled: bool
    :param delivery_callback_url: URL to send delivery status callback.
    :type delivery_callback_url: str
    :param facebook_messenger_page_id: Deprecated.
    :type facebook_messenger_page_id: str
    :param fcm_credential_sid: The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for FCM Bindings.
    :type fcm_credential_sid: str
    :param friendly_name: A descriptive string that you create to describe the resource. It can be up to 64 characters long.
    :type friendly_name: str
    :param gcm_credential_sid: The SID of the [Credential](https://www.twilio.com/docs/notify/api/credential-resource) to use for GCM Bindings.
    :type gcm_credential_sid: str
    :param log_enabled: Whether to log notifications. Can be: &#x60;true&#x60; or &#x60;false&#x60; and the default is &#x60;true&#x60;.
    :type log_enabled: bool
    :param messaging_service_sid: The SID of the [Messaging Service](https://www.twilio.com/docs/sms/quickstart#messaging-services) to use for SMS Bindings. This parameter must be set in order to send SMS notifications.
    :type messaging_service_sid: str

    :rtype: Union[NotifyV1Service, Tuple[NotifyV1Service, int], Tuple[NotifyV1Service, int, Dict[str, str]]
    """
    return 'do some magic!'
