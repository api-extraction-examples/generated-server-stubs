import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.role import Role  # noqa: E501
from openapi_server.models.role_collection import RoleCollection  # noqa: E501
from openapi_server import util


def delete_role(role_name):  # noqa: E501
    """Delete a role

    Delete a role.  *New in version 2.1.0*  # noqa: E501

    :param role_name: The role name
    :type role_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_role(role_name):  # noqa: E501
    """Get a role

    Get a role.  *New in version 2.1.0*  # noqa: E501

    :param role_name: The role name
    :type role_name: str

    :rtype: Union[Role, Tuple[Role, int], Tuple[Role, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_roles(limit=None, offset=None, order_by=None):  # noqa: E501
    """List roles

    Get a list of roles.  *New in version 2.1.0*  # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[RoleCollection, Tuple[RoleCollection, int], Tuple[RoleCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_role(role_name, role, update_mask=None):  # noqa: E501
    """Update a role

    Update a role.  *New in version 2.1.0*  # noqa: E501

    :param role_name: The role name
    :type role_name: str
    :param role: 
    :type role: dict | bytes
    :param update_mask: The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Union[Role, Tuple[Role, int], Tuple[Role, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        role = Role.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_role(role):  # noqa: E501
    """Create a role

    Create a new role.  *New in version 2.1.0*  # noqa: E501

    :param role: 
    :type role: dict | bytes

    :rtype: Union[Role, Tuple[Role, int], Tuple[Role, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        role = Role.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
