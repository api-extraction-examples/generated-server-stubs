import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.plugin_collection import PluginCollection  # noqa: E501
from openapi_server import util


def get_plugins(limit=None, offset=None):  # noqa: E501
    """Get a list of loaded plugins

    Get a list of loaded plugins.  *New in version 2.1.0*  # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: Union[PluginCollection, Tuple[PluginCollection, int], Tuple[PluginCollection, int, Dict[str, str]]
    """
    return 'do some magic!'
