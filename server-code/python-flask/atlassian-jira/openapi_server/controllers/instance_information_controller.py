import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.license import License  # noqa: E501
from openapi_server import util


def get_license():  # noqa: E501
    """Get license

    Returns licensing information about the Jira instance.  **[Permissions](#permissions) required:** None. # noqa: E501


    :rtype: Union[License, Tuple[License, int], Tuple[License, int, Dict[str, str]]
    """
    return 'do some magic!'
