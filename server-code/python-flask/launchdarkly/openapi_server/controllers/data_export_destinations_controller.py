import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.destination import Destination  # noqa: E501
from openapi_server.models.destinations import Destinations  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_destination_request import PostDestinationRequest  # noqa: E501
from openapi_server import util


def delete_destination(project_key, environment_key, destination_id):  # noqa: E501
    """Get a single data export destination by ID

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param destination_id: The data export destination ID.
    :type destination_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_destination(project_key, environment_key, destination_id):  # noqa: E501
    """Get a single data export destination by ID

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param destination_id: The data export destination ID.
    :type destination_id: str

    :rtype: Union[Destination, Tuple[Destination, int], Tuple[Destination, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_destinations():  # noqa: E501
    """Returns a list of all data export destinations.

     # noqa: E501


    :rtype: Union[Destinations, Tuple[Destinations, int], Tuple[Destinations, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_destination(project_key, environment_key, destination_id, patch_only):  # noqa: E501
    """Perform a partial update to a data export destination.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param destination_id: The data export destination ID.
    :type destination_id: str
    :param patch_only: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; Feature flag patches also support JSON Merge Patch format. &#39;https://tools.ietf.org/html/rfc7386&#39; The addition of comments is also supported.
    :type patch_only: list | bytes

    :rtype: Union[Destination, Tuple[Destination, int], Tuple[Destination, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_only = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_destination(project_key, environment_key, destination_body):  # noqa: E501
    """Create a new data export destination

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param destination_body: Create a new data export destination.
    :type destination_body: dict | bytes

    :rtype: Union[Destination, Tuple[Destination, int], Tuple[Destination, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        destination_body = PostDestinationRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
