import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server import util


def get_valid_project_key(key=None):  # noqa: E501
    """Get valid project key

    Validates a project key and, if the key is invalid or in use, generates a valid random string for the project key.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param key: The project key.
    :type key: str

    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_valid_project_name(name):  # noqa: E501
    """Get valid project name

    Checks that a project name isn&#39;t in use. If the name isn&#39;t in use, the passed string is returned. If the name is in use, this operation attempts to generate a valid project name based on the one supplied, usually by adding a sequence number. If a valid project name cannot be generated, a 404 response is returned.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param name: The project name.
    :type name: str

    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def validate_project_key(key=None):  # noqa: E501
    """Validate project key

    Validates a project key by confirming the key is a valid string and not in use.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param key: The project key.
    :type key: str

    :rtype: Union[ErrorCollection, Tuple[ErrorCollection, int], Tuple[ErrorCollection, int, Dict[str, str]]
    """
    return 'do some magic!'
