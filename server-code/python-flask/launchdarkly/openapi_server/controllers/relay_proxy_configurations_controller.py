import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_relay_auto_config_request import PostRelayAutoConfigRequest  # noqa: E501
from openapi_server.models.relay_proxy_config import RelayProxyConfig  # noqa: E501
from openapi_server.models.relay_proxy_configs import RelayProxyConfigs  # noqa: E501
from openapi_server import util


def delete_relay_proxy_config(id):  # noqa: E501
    """Delete a relay proxy configuration by ID.

     # noqa: E501

    :param id: The relay proxy configuration ID
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_relay_proxy_config(id):  # noqa: E501
    """Get a single relay proxy configuration by ID.

     # noqa: E501

    :param id: The relay proxy configuration ID
    :type id: str

    :rtype: Union[RelayProxyConfig, Tuple[RelayProxyConfig, int], Tuple[RelayProxyConfig, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_relay_proxy_configs():  # noqa: E501
    """Returns a list of relay proxy configurations in the account.

     # noqa: E501


    :rtype: Union[RelayProxyConfigs, Tuple[RelayProxyConfigs, int], Tuple[RelayProxyConfigs, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_relay_proxy_config(id, patch_delta):  # noqa: E501
    """Modify a relay proxy configuration by ID.

     # noqa: E501

    :param id: The relay proxy configuration ID
    :type id: str
    :param patch_delta: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;
    :type patch_delta: list | bytes

    :rtype: Union[RelayProxyConfig, Tuple[RelayProxyConfig, int], Tuple[RelayProxyConfig, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_delta = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_relay_auto_config(relay_proxy_config_body):  # noqa: E501
    """Create a new relay proxy config.

     # noqa: E501

    :param relay_proxy_config_body: Create a new relay proxy configuration
    :type relay_proxy_config_body: dict | bytes

    :rtype: Union[RelayProxyConfig, Tuple[RelayProxyConfig, int], Tuple[RelayProxyConfig, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        relay_proxy_config_body = PostRelayAutoConfigRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def reset_relay_proxy_config(id, expiry=None):  # noqa: E501
    """Reset a relay proxy configuration&#39;s secret key with an optional expiry time for the old key.

     # noqa: E501

    :param id: The relay proxy configuration ID
    :type id: str
    :param expiry: An expiration time for the old relay proxy configuration key, expressed as a Unix epoch time in milliseconds. By default, the relay proxy configuration will expire immediately
    :type expiry: int

    :rtype: Union[RelayProxyConfig, Tuple[RelayProxyConfig, int], Tuple[RelayProxyConfig, int, Dict[str, str]]
    """
    return 'do some magic!'
