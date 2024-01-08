import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.action_collection import ActionCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def get_permissions(limit=None, offset=None):  # noqa: E501
    """List permissions

    Get a list of permissions.  *New in version 2.1.0*  # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: Union[ActionCollection, Tuple[ActionCollection, int], Tuple[ActionCollection, int, Dict[str, str]]
    """
    return 'do some magic!'
