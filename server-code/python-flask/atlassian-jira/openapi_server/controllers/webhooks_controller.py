import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.container_for_registered_webhooks import ContainerForRegisteredWebhooks  # noqa: E501
from openapi_server.models.container_for_webhook_ids import ContainerForWebhookIDs  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.failed_webhooks import FailedWebhooks  # noqa: E501
from openapi_server.models.page_bean_webhook import PageBeanWebhook  # noqa: E501
from openapi_server.models.webhook_registration_details import WebhookRegistrationDetails  # noqa: E501
from openapi_server.models.webhooks_expiration_date import WebhooksExpirationDate  # noqa: E501
from openapi_server import util


def delete_webhook_by_id(container_for_webhook_ids):  # noqa: E501
    """Delete webhooks by ID

    Removes webhooks by ID. Only webhooks registered by the calling app are removed. If webhooks created by other apps are specified, they are ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation. # noqa: E501

    :param container_for_webhook_ids: 
    :type container_for_webhook_ids: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        container_for_webhook_ids = ContainerForWebhookIDs.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_dynamic_webhooks_for_app(start_at=None, max_results=None):  # noqa: E501
    """Get dynamic webhooks for app

    Returns a [paginated](#pagination) list of the webhooks registered by the calling app.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation. # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageBeanWebhook, Tuple[PageBeanWebhook, int], Tuple[PageBeanWebhook, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_failed_webhooks(max_results=None, after=None):  # noqa: E501
    """Get failed webhooks

    Returns webhooks that have recently failed to be delivered to the requesting app after the maximum number of retries.  After 72 hours the failure may no longer be returned by this operation.  The oldest failure is returned first.  This method uses a cursor-based pagination. To request the next page use the failure time of the last webhook on the list as the &#x60;failedAfter&#x60; value or use the URL provided in &#x60;next&#x60;.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) can use this operation. # noqa: E501

    :param max_results: The maximum number of webhooks to return per page. If obeying the maxResults directive would result in records with the same failure time being split across pages, the directive is ignored and all records with the same failure time included on the page.
    :type max_results: int
    :param after: The time after which any webhook failure must have occurred for the record to be returned, expressed as milliseconds since the UNIX epoch.
    :type after: int

    :rtype: Union[FailedWebhooks, Tuple[FailedWebhooks, int], Tuple[FailedWebhooks, int, Dict[str, str]]
    """
    return 'do some magic!'


def refresh_webhooks(container_for_webhook_ids):  # noqa: E501
    """Extend webhook life

    Extends the life of webhook. Webhooks registered through the REST API expire after 30 days. Call this operation to keep them alive.  Unrecognized webhook IDs (those that are not found or belong to other apps) are ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation. # noqa: E501

    :param container_for_webhook_ids: 
    :type container_for_webhook_ids: dict | bytes

    :rtype: Union[WebhooksExpirationDate, Tuple[WebhooksExpirationDate, int], Tuple[WebhooksExpirationDate, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        container_for_webhook_ids = ContainerForWebhookIDs.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def register_dynamic_webhooks(webhook_registration_details):  # noqa: E501
    """Register dynamic webhooks

    Registers webhooks.  **NOTE:** for non-public OAuth apps, webhooks are delivered only if there is a match between the app owner and the user who registered a dynamic webhook.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation. # noqa: E501

    :param webhook_registration_details: 
    :type webhook_registration_details: dict | bytes

    :rtype: Union[ContainerForRegisteredWebhooks, Tuple[ContainerForRegisteredWebhooks, int], Tuple[ContainerForRegisteredWebhooks, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        webhook_registration_details = WebhookRegistrationDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
