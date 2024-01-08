import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.apps_response import AppsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.user_invitation_create_request import UserInvitationCreateRequest  # noqa: E501
from openapi_server.models.user_invitation_response import UserInvitationResponse  # noqa: E501
from openapi_server.models.user_invitations_response import UserInvitationsResponse  # noqa: E501
from openapi_server import util


def user_invitations_create_instance(user_invitation_create_request):  # noqa: E501
    """user_invitations_create_instance

     # noqa: E501

    :param user_invitation_create_request: UserInvitation representation
    :type user_invitation_create_request: dict | bytes

    :rtype: Union[UserInvitationResponse, Tuple[UserInvitationResponse, int], Tuple[UserInvitationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_invitation_create_request = UserInvitationCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def user_invitations_delete_instance(id):  # noqa: E501
    """user_invitations_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_invitations_get_collection(filter_email=None, filter_roles=None, filter_visible_apps=None, sort=None, fields_user_invitations=None, limit=None, include=None, fields_apps=None, limit_visible_apps=None):  # noqa: E501
    """user_invitations_get_collection

     # noqa: E501

    :param filter_email: filter by attribute &#39;email&#39;
    :type filter_email: List[str]
    :param filter_roles: filter by attribute &#39;roles&#39;
    :type filter_roles: List[str]
    :param filter_visible_apps: filter by id(s) of related &#39;visibleApps&#39;
    :type filter_visible_apps: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_user_invitations: the fields to include for returned resources of type userInvitations
    :type fields_user_invitations: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_visible_apps: maximum number of related visibleApps returned (when they are included)
    :type limit_visible_apps: int

    :rtype: Union[UserInvitationsResponse, Tuple[UserInvitationsResponse, int], Tuple[UserInvitationsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_invitations_get_instance(id, fields_user_invitations=None, include=None, fields_apps=None, limit_visible_apps=None):  # noqa: E501
    """user_invitations_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_user_invitations: the fields to include for returned resources of type userInvitations
    :type fields_user_invitations: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_visible_apps: maximum number of related visibleApps returned (when they are included)
    :type limit_visible_apps: int

    :rtype: Union[UserInvitationResponse, Tuple[UserInvitationResponse, int], Tuple[UserInvitationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_invitations_visible_apps_get_to_many_related(id, fields_apps=None, limit=None):  # noqa: E501
    """user_invitations_visible_apps_get_to_many_related

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
