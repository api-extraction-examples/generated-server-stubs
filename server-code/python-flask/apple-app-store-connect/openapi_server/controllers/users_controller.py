import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.apps_response import AppsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.user_response import UserResponse  # noqa: E501
from openapi_server.models.user_update_request import UserUpdateRequest  # noqa: E501
from openapi_server.models.user_visible_apps_linkages_request import UserVisibleAppsLinkagesRequest  # noqa: E501
from openapi_server.models.user_visible_apps_linkages_response import UserVisibleAppsLinkagesResponse  # noqa: E501
from openapi_server.models.users_response import UsersResponse  # noqa: E501
from openapi_server import util


def users_delete_instance(id):  # noqa: E501
    """users_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_get_collection(filter_roles=None, filter_username=None, filter_visible_apps=None, sort=None, fields_users=None, limit=None, include=None, fields_apps=None, limit_visible_apps=None):  # noqa: E501
    """users_get_collection

     # noqa: E501

    :param filter_roles: filter by attribute &#39;roles&#39;
    :type filter_roles: List[str]
    :param filter_username: filter by attribute &#39;username&#39;
    :type filter_username: List[str]
    :param filter_visible_apps: filter by id(s) of related &#39;visibleApps&#39;
    :type filter_visible_apps: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_users: the fields to include for returned resources of type users
    :type fields_users: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_visible_apps: maximum number of related visibleApps returned (when they are included)
    :type limit_visible_apps: int

    :rtype: Union[UsersResponse, Tuple[UsersResponse, int], Tuple[UsersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_get_instance(id, fields_users=None, include=None, fields_apps=None, limit_visible_apps=None):  # noqa: E501
    """users_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_users: the fields to include for returned resources of type users
    :type fields_users: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_visible_apps: maximum number of related visibleApps returned (when they are included)
    :type limit_visible_apps: int

    :rtype: Union[UserResponse, Tuple[UserResponse, int], Tuple[UserResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_update_instance(id, user_update_request):  # noqa: E501
    """users_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param user_update_request: User representation
    :type user_update_request: dict | bytes

    :rtype: Union[UserResponse, Tuple[UserResponse, int], Tuple[UserResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_update_request = UserUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def users_visible_apps_create_to_many_relationship(id, user_visible_apps_linkages_request):  # noqa: E501
    """users_visible_apps_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param user_visible_apps_linkages_request: List of related linkages
    :type user_visible_apps_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_visible_apps_linkages_request = UserVisibleAppsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def users_visible_apps_delete_to_many_relationship(id, user_visible_apps_linkages_request):  # noqa: E501
    """users_visible_apps_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param user_visible_apps_linkages_request: List of related linkages
    :type user_visible_apps_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_visible_apps_linkages_request = UserVisibleAppsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def users_visible_apps_get_to_many_related(id, fields_apps=None, limit=None):  # noqa: E501
    """users_visible_apps_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[AppsResponse, Tuple[AppsResponse, int], Tuple[AppsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_visible_apps_get_to_many_relationship(id, limit=None):  # noqa: E501
    """users_visible_apps_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[UserVisibleAppsLinkagesResponse, Tuple[UserVisibleAppsLinkagesResponse, int], Tuple[UserVisibleAppsLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_visible_apps_replace_to_many_relationship(id, user_visible_apps_linkages_request):  # noqa: E501
    """users_visible_apps_replace_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param user_visible_apps_linkages_request: List of related linkages
    :type user_visible_apps_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_visible_apps_linkages_request = UserVisibleAppsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
