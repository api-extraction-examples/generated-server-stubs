import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.credential_enum_push_service import CredentialEnumPushService  # noqa: E501
from openapi_server.models.list_credential_response import ListCredentialResponse  # noqa: E501
from openapi_server.models.notify_v1_credential import NotifyV1Credential  # noqa: E501
from openapi_server import util


def create_credential(type, api_key=None, certificate=None, friendly_name=None, private_key=None, sandbox=None, secret=None):  # noqa: E501
    """create_credential

     # noqa: E501

    :param type: 
    :type type: str
    :param api_key: [GCM only] The &#x60;Server key&#x60; of your project from Firebase console under Settings / Cloud messaging.
    :type api_key: str
    :param certificate: [APN only] The URL-encoded representation of the certificate. Strip everything outside of the headers, e.g. &#x60;-----BEGIN CERTIFICATE-----MIIFnTCCBIWgAwIBAgIIAjy9H849+E8wDQYJKoZIhvcNAQEFBQAwgZYxCzAJBgNV.....A&#x3D;&#x3D;-----END CERTIFICATE-----&#x60;
    :type certificate: str
    :param friendly_name: A descriptive string that you create to describe the resource. It can be up to 64 characters long.
    :type friendly_name: str
    :param private_key: [APN only] The URL-encoded representation of the private key. Strip everything outside of the headers, e.g. &#x60;-----BEGIN RSA PRIVATE KEY-----MIIEpQIBAAKCAQEAuyf/lNrH9ck8DmNyo3fGgvCI1l9s+cmBY3WIz+cUDqmxiieR\\\\n.-----END RSA PRIVATE KEY-----&#x60;
    :type private_key: str
    :param sandbox: [APN only] Whether to send the credential to sandbox APNs. Can be &#x60;true&#x60; to send to sandbox APNs or &#x60;false&#x60; to send to production.
    :type sandbox: bool
    :param secret: [FCM only] The &#x60;Server key&#x60; of your project from Firebase console under Settings / Cloud messaging.
    :type secret: str

    :rtype: Union[NotifyV1Credential, Tuple[NotifyV1Credential, int], Tuple[NotifyV1Credential, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_credential(sid):  # noqa: E501
    """delete_credential

     # noqa: E501

    :param sid: The Twilio-provided string that uniquely identifies the Credential resource to delete.
    :type sid: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def fetch_credential(sid):  # noqa: E501
    """fetch_credential

     # noqa: E501

    :param sid: The Twilio-provided string that uniquely identifies the Credential resource to fetch.
    :type sid: str

    :rtype: Union[NotifyV1Credential, Tuple[NotifyV1Credential, int], Tuple[NotifyV1Credential, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_credential(page_size=None, page=None, page_token=None):  # noqa: E501
    """list_credential

     # noqa: E501

    :param page_size: How many resources to return in each list page. The default is 50, and the maximum is 1000.
    :type page_size: int
    :param page: The page index. This value is simply for client state.
    :type page: int
    :param page_token: The page token. This is provided by the API.
    :type page_token: str

    :rtype: Union[ListCredentialResponse, Tuple[ListCredentialResponse, int], Tuple[ListCredentialResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_credential(sid, api_key=None, certificate=None, friendly_name=None, private_key=None, sandbox=None, secret=None):  # noqa: E501
    """update_credential

     # noqa: E501

    :param sid: The Twilio-provided string that uniquely identifies the Credential resource to update.
    :type sid: str
    :param api_key: [GCM only] The &#x60;Server key&#x60; of your project from Firebase console under Settings / Cloud messaging.
    :type api_key: str
    :param certificate: [APN only] The URL-encoded representation of the certificate. Strip everything outside of the headers, e.g. &#x60;-----BEGIN CERTIFICATE-----MIIFnTCCBIWgAwIBAgIIAjy9H849+E8wDQYJKoZIhvcNAQEFBQAwgZYxCzAJBgNV.....A&#x3D;&#x3D;-----END CERTIFICATE-----&#x60;
    :type certificate: str
    :param friendly_name: A descriptive string that you create to describe the resource. It can be up to 64 characters long.
    :type friendly_name: str
    :param private_key: [APN only] The URL-encoded representation of the private key. Strip everything outside of the headers, e.g. &#x60;-----BEGIN RSA PRIVATE KEY-----MIIEpQIBAAKCAQEAuyf/lNrH9ck8DmNyo3fGgvCI1l9s+cmBY3WIz+cUDqmxiieR\\\\n.-----END RSA PRIVATE KEY-----&#x60;
    :type private_key: str
    :param sandbox: [APN only] Whether to send the credential to sandbox APNs. Can be &#x60;true&#x60; to send to sandbox APNs or &#x60;false&#x60; to send to production.
    :type sandbox: bool
    :param secret: [FCM only] The &#x60;Server key&#x60; of your project from Firebase console under Settings / Cloud messaging.
    :type secret: str

    :rtype: Union[NotifyV1Credential, Tuple[NotifyV1Credential, int], Tuple[NotifyV1Credential, int, Dict[str, str]]
    """
    return 'do some magic!'
