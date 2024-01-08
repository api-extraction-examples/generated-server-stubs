import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_favorites_for_user200_response import GetFavoritesForUser200Response  # noqa: E501
from openapi_server.models.get_user200_response import GetUser200Response  # noqa: E501
from openapi_server.models.get_users_for_team200_response import GetUsersForTeam200Response  # noqa: E501
from openapi_server import util


def get_favorites_for_user(user_gid, resource_type, workspace, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a user&#39;s favorites

    Returns all of a user&#39;s favorites in the given workspace, of the given type. Results are given in order (The same order as Asana&#39;s sidebar). # noqa: E501

    :param user_gid: A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user.
    :type user_gid: str
    :param resource_type: The resource type of favorites to be returned.
    :type resource_type: str
    :param workspace: The workspace in which to get favorites.
    :type workspace: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetFavoritesForUser200Response, Tuple[GetFavoritesForUser200Response, int], Tuple[GetFavoritesForUser200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user(user_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a user

    Returns the full user record for the single user with the provided ID. # noqa: E501

    :param user_gid: A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user.
    :type user_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetUser200Response, Tuple[GetUser200Response, int], Tuple[GetUser200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_users(workspace=None, team=None, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get multiple users

    Returns the user records for all users in all workspaces and organizations accessible to the authenticated user. Accepts an optional workspace ID parameter. Results are sorted by user ID. # noqa: E501

    :param workspace: The workspace or organization ID to filter users on.
    :type workspace: str
    :param team: The team ID to filter users on.
    :type team: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetUsersForTeam200Response, Tuple[GetUsersForTeam200Response, int], Tuple[GetUsersForTeam200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_users_for_team(team_gid, opt_pretty=None, opt_fields=None, offset=None):  # noqa: E501
    """Get users in a team

    Returns the compact records for all users that are members of the team. Results are sorted alphabetically and limited to 2000. For more results use the &#x60;/users&#x60; endpoint. # noqa: E501

    :param team_gid: Globally unique identifier for the team.
    :type team_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetUsersForTeam200Response, Tuple[GetUsersForTeam200Response, int], Tuple[GetUsersForTeam200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_users_for_workspace(workspace_gid, opt_pretty=None, opt_fields=None, offset=None):  # noqa: E501
    """Get users in a workspace or organization

    Returns the compact records for all users in the specified workspace or organization. Results are sorted alphabetically and limited to 2000. For more results use the &#x60;/users&#x60; endpoint. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetUsersForTeam200Response, Tuple[GetUsersForTeam200Response, int], Tuple[GetUsersForTeam200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
