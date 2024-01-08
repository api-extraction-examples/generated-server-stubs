import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.custom_role import CustomRole  # noqa: E501
from openapi_server.models.custom_roles import CustomRoles  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_custom_role_request import PostCustomRoleRequest  # noqa: E501
from openapi_server import util


def delete_custom_role(custom_role_key):  # noqa: E501
    """Delete a custom role by key.

     # noqa: E501

    :param custom_role_key: The custom role key.
    :type custom_role_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_custom_role(custom_role_key):  # noqa: E501
    """Get one custom role by key.

     # noqa: E501

    :param custom_role_key: The custom role key.
    :type custom_role_key: str

    :rtype: Union[CustomRole, Tuple[CustomRole, int], Tuple[CustomRole, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_custom_roles():  # noqa: E501
    """Return a complete list of custom roles.

     # noqa: E501


    :rtype: Union[CustomRoles, Tuple[CustomRoles, int], Tuple[CustomRoles, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_custom_role(custom_role_key, patch_delta):  # noqa: E501
    """Modify a custom role by key.

     # noqa: E501

    :param custom_role_key: The custom role key.
    :type custom_role_key: str
    :param patch_delta: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;
    :type patch_delta: list | bytes

    :rtype: Union[CustomRole, Tuple[CustomRole, int], Tuple[CustomRole, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_delta = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_custom_role(custom_role_body):  # noqa: E501
    """Create a new custom role.

     # noqa: E501

    :param custom_role_body: New role or roles to create.
    :type custom_role_body: dict | bytes

    :rtype: Union[CustomRole, Tuple[CustomRole, int], Tuple[CustomRole, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        custom_role_body = PostCustomRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
