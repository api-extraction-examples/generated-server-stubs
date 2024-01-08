import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.integration import Integration  # noqa: E501
from openapi_server.models.integration_subscription import IntegrationSubscription  # noqa: E501
from openapi_server.models.integrations import Integrations  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_integration_subscription_request import PostIntegrationSubscriptionRequest  # noqa: E501
from openapi_server.models.usage_error import UsageError  # noqa: E501
from openapi_server import util


def delete_integration_subscription(integration_key, integration_id):  # noqa: E501
    """Delete an integration subscription by ID.

     # noqa: E501

    :param integration_key: The key used to specify the integration kind.
    :type integration_key: str
    :param integration_id: The integration ID.
    :type integration_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_integration_subscription(integration_key, integration_id):  # noqa: E501
    """Get a single integration subscription by ID.

     # noqa: E501

    :param integration_key: The key used to specify the integration kind.
    :type integration_key: str
    :param integration_id: The integration ID.
    :type integration_id: str

    :rtype: Union[IntegrationSubscription, Tuple[IntegrationSubscription, int], Tuple[IntegrationSubscription, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_integration_subscriptions(integration_key):  # noqa: E501
    """Get a list of all configured integrations of a given kind.

     # noqa: E501

    :param integration_key: The key used to specify the integration kind.
    :type integration_key: str

    :rtype: Union[Integration, Tuple[Integration, int], Tuple[Integration, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_integrations():  # noqa: E501
    """Get a list of all configured audit log event integrations associated with this account.

     # noqa: E501


    :rtype: Union[Integrations, Tuple[Integrations, int], Tuple[Integrations, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_integration_subscription(integration_key, integration_id, patch_delta):  # noqa: E501
    """Modify an integration subscription by ID.

     # noqa: E501

    :param integration_key: The key used to specify the integration kind.
    :type integration_key: str
    :param integration_id: The integration ID.
    :type integration_id: str
    :param patch_delta: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;
    :type patch_delta: list | bytes

    :rtype: Union[IntegrationSubscription, Tuple[IntegrationSubscription, int], Tuple[IntegrationSubscription, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_delta = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_integration_subscription(integration_key, subscription_body):  # noqa: E501
    """Create a new integration subscription of a given kind.

     # noqa: E501

    :param integration_key: The key used to specify the integration kind.
    :type integration_key: str
    :param subscription_body: Create a new integration subscription.
    :type subscription_body: dict | bytes

    :rtype: Union[IntegrationSubscription, Tuple[IntegrationSubscription, int], Tuple[IntegrationSubscription, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        subscription_body = PostIntegrationSubscriptionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
