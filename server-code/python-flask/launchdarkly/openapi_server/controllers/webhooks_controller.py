import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_webhook_request import PostWebhookRequest  # noqa: E501
from openapi_server.models.webhook import Webhook  # noqa: E501
from openapi_server.models.webhooks import Webhooks  # noqa: E501
from openapi_server import util


def delete_webhook(resource_id):  # noqa: E501
    """Delete a webhook by ID.

     # noqa: E501

    :param resource_id: The resource ID.
    :type resource_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_webhook(resource_id):  # noqa: E501
    """Get a webhook by ID.

     # noqa: E501

    :param resource_id: The resource ID.
    :type resource_id: str

    :rtype: Union[Webhook, Tuple[Webhook, int], Tuple[Webhook, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_webhooks():  # noqa: E501
    """Fetch a list of all webhooks.

     # noqa: E501


    :rtype: Union[Webhooks, Tuple[Webhooks, int], Tuple[Webhooks, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_webhook(resource_id, patch_delta):  # noqa: E501
    """Modify a webhook by ID.

     # noqa: E501

    :param resource_id: The resource ID.
    :type resource_id: str
    :param patch_delta: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;
    :type patch_delta: list | bytes

    :rtype: Union[Webhook, Tuple[Webhook, int], Tuple[Webhook, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_delta = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_webhook(webhook_body):  # noqa: E501
    """Create a webhook.

     # noqa: E501

    :param webhook_body: New webhook.
    :type webhook_body: dict | bytes

    :rtype: Union[Webhook, Tuple[Webhook, int], Tuple[Webhook, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        webhook_body = PostWebhookRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
