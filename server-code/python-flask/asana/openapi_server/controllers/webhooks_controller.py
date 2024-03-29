import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_webhook201_response import CreateWebhook201Response  # noqa: E501
from openapi_server.models.create_webhook_request import CreateWebhookRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_webhooks200_response import GetWebhooks200Response  # noqa: E501
from openapi_server.models.update_webhook_request import UpdateWebhookRequest  # noqa: E501
from openapi_server import util


def create_webhook(create_webhook_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Establish a webhook

    Establishing a webhook is a two-part process. First, a simple HTTP POST request initiates the creation similar to creating any other resource.  Next, in the middle of this request comes the confirmation handshake. When a webhook is created, we will send a test POST to the target with an &#x60;X-Hook-Secret&#x60; header. The target must respond with a &#x60;200 OK&#x60; or &#x60;204 No Content&#x60; and a matching &#x60;X-Hook-Secret&#x60; header to confirm that this webhook subscription is indeed expected. We strongly recommend storing this secret to be used to verify future webhook event signatures.  The POST request to create the webhook will then return with the status of the request. If you do not acknowledge the webhook’s confirmation handshake it will fail to setup, and you will receive an error in response to your attempt to create it. This means you need to be able to receive and complete the webhook *while* the POST request is in-flight (in other words, have a server that can handle requests asynchronously).  Invalid hostnames like localhost will recieve a 403 Forbidden status code.  &#x60;&#x60;&#x60; # Request curl -H \&quot;Authorization: Bearer &lt;personal_access_token&gt;\&quot; \\ -X POST https://app.asana.com/api/1.0/webhooks \\ -d \&quot;resource&#x3D;8675309\&quot; \\ -d \&quot;target&#x3D;https://example.com/receive-webhook/7654\&quot; &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; # Handshake sent to https://example.com/ POST /receive-webhook/7654 X-Hook-Secret: b537207f20cbfa02357cf448134da559e8bd39d61597dcd5631b8012eae53e81 &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; # Handshake response sent by example.com HTTP/1.1 200 X-Hook-Secret: b537207f20cbfa02357cf448134da559e8bd39d61597dcd5631b8012eae53e81 &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; # Response HTTP/1.1 201 {   \&quot;data\&quot;: {     \&quot;gid\&quot;: \&quot;43214\&quot;,     \&quot;resource\&quot;: {       \&quot;gid\&quot;: \&quot;8675309\&quot;,       \&quot;name\&quot;: \&quot;Bugs\&quot;     },     \&quot;target\&quot;: \&quot;https://example.com/receive-webhook/7654\&quot;,     \&quot;active\&quot;: false,     \&quot;last_success_at\&quot;: null,     \&quot;last_failure_at\&quot;: null,     \&quot;last_failure_content\&quot;: null   } } &#x60;&#x60;&#x60; # noqa: E501

    :param create_webhook_request: The webhook workspace and target.
    :type create_webhook_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateWebhook201Response, Tuple[CreateWebhook201Response, int], Tuple[CreateWebhook201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_webhook_request = CreateWebhookRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_webhook(webhook_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a webhook

    This method *permanently* removes a webhook. Note that it may be possible to receive a request that was already in flight after deleting the webhook, but no further requests will be issued. # noqa: E501

    :param webhook_gid: Globally unique identifier for the webhook.
    :type webhook_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_webhook(webhook_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a webhook

    Returns the full record for the given webhook. # noqa: E501

    :param webhook_gid: Globally unique identifier for the webhook.
    :type webhook_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateWebhook201Response, Tuple[CreateWebhook201Response, int], Tuple[CreateWebhook201Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_webhooks(workspace, opt_pretty=None, opt_fields=None, limit=None, offset=None, resource=None):  # noqa: E501
    """Get multiple webhooks

    Get the compact representation of all webhooks your app has registered for the authenticated user in the given workspace. # noqa: E501

    :param workspace: The workspace to query for webhooks in.
    :type workspace: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str
    :param resource: Only return webhooks for the given resource.
    :type resource: str

    :rtype: Union[GetWebhooks200Response, Tuple[GetWebhooks200Response, int], Tuple[GetWebhooks200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_webhook(webhook_gid, update_webhook_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a webhook

    An existing webhook&#39;s filters can be updated by making a PUT request on the URL for that webhook. Note that the webhook&#39;s previous &#x60;filters&#x60; array will be completely overwritten by the &#x60;filters&#x60; sent in the PUT request. # noqa: E501

    :param webhook_gid: Globally unique identifier for the webhook.
    :type webhook_gid: str
    :param update_webhook_request: The updated filters for the webhook.
    :type update_webhook_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateWebhook201Response, Tuple[CreateWebhook201Response, int], Tuple[CreateWebhook201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_webhook_request = UpdateWebhookRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
