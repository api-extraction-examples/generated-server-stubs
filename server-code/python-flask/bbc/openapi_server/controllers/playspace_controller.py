import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.playspace_container import PlayspaceContainer  # noqa: E501
from openapi_server import util


def get_container(authorization, x_api_key, id):  # noqa: E501
    """Playspace Container by ID

    Playspace Container by ID  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param id: Playspace Container ID
    :type id: str

    :rtype: Union[PlayspaceContainer, Tuple[PlayspaceContainer, int], Tuple[PlayspaceContainer, int, Dict[str, str]]
    """
    return 'do some magic!'


def suggest_container(authorization, x_api_key, previous_pid, previous_container=None):  # noqa: E501
    """Suggested Playspace Container

    Suggested Playspace Container  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param previous_pid: Clip or Episode PID of the previous or first content item in the Playspace stream.
    :type previous_pid: str
    :param previous_container: Container ID of the previous container in the Playspace stream.
    :type previous_container: str

    :rtype: Union[PlayspaceContainer, Tuple[PlayspaceContainer, int], Tuple[PlayspaceContainer, int, Dict[str, str]]
    """
    return 'do some magic!'
