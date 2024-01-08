import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_workspace_membership200_response import GetWorkspaceMembership200Response  # noqa: E501
from openapi_server.models.get_workspace_memberships_for_user200_response import GetWorkspaceMembershipsForUser200Response  # noqa: E501
from openapi_server import util


def get_workspace_membership(workspace_membership_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a workspace membership

    Returns the complete workspace record for a single workspace membership. # noqa: E501

    :param workspace_membership_gid: 
    :type workspace_membership_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetWorkspaceMembership200Response, Tuple[GetWorkspaceMembership200Response, int], Tuple[GetWorkspaceMembership200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workspace_memberships_for_user(user_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get workspace memberships for a user

    Returns the compact workspace membership records for the user. # noqa: E501

    :param user_gid: A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user.
    :type user_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetWorkspaceMembershipsForUser200Response, Tuple[GetWorkspaceMembershipsForUser200Response, int], Tuple[GetWorkspaceMembershipsForUser200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workspace_memberships_for_workspace(workspace_gid, user=None, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get the workspace memberships for a workspace

    Returns the compact workspace membership records for the workspace. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param user: A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user.
    :type user: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetWorkspaceMembershipsForUser200Response, Tuple[GetWorkspaceMembershipsForUser200Response, int], Tuple[GetWorkspaceMembershipsForUser200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
