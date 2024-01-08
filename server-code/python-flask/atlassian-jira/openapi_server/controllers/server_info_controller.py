import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.server_information import ServerInformation  # noqa: E501
from openapi_server import util


def get_server_info():  # noqa: E501
    """Get Jira instance info

    Returns information about the Jira instance.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501


    :rtype: Union[ServerInformation, Tuple[ServerInformation, int], Tuple[ServerInformation, int, Dict[str, str]]
    """
    return 'do some magic!'
