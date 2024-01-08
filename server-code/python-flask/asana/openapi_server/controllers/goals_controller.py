import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_followers_request import AddFollowersRequest  # noqa: E501
from openapi_server.models.create_goal201_response import CreateGoal201Response  # noqa: E501
from openapi_server.models.create_goal_metric_request import CreateGoalMetricRequest  # noqa: E501
from openapi_server.models.create_goal_request import CreateGoalRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_goals200_response import GetGoals200Response  # noqa: E501
from openapi_server.models.update_goal_metric_request import UpdateGoalMetricRequest  # noqa: E501
from openapi_server import util


def add_followers(goal_gid, add_followers_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Add a collaborator to a goal

    Adds followers to a goal. Returns the goal the followers were added to. Each goal can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated goal record, described above. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param add_followers_request: The followers to be added as collaborators
    :type add_followers_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateGoal201Response, Tuple[CreateGoal201Response, int], Tuple[CreateGoal201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_followers_request = AddFollowersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_goal(create_goal_request, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Create a goal

    Creates a new goal in a workspace or team.  Returns the full record of the newly created goal. # noqa: E501

    :param create_goal_request: The goal to create.
    :type create_goal_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[CreateGoal201Response, Tuple[CreateGoal201Response, int], Tuple[CreateGoal201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_goal_request = CreateGoalRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_goal_metric(goal_gid, create_goal_metric_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Create a goal metric

    Creates and adds a goal metric to a specified goal. Note that this replaces an existing goal metric if one already exists. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param create_goal_metric_request: The goal metric to create.
    :type create_goal_metric_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateGoal201Response, Tuple[CreateGoal201Response, int], Tuple[CreateGoal201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_goal_metric_request = CreateGoalMetricRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_goal(goal_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a goal

    A specific, existing goal can be deleted by making a DELETE request on the URL for that goal.  Returns an empty data record. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_goal(goal_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a goal

    Returns the complete goal record for a single goal. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateGoal201Response, Tuple[CreateGoal201Response, int], Tuple[CreateGoal201Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_goals(opt_pretty=None, opt_fields=None, limit=None, offset=None, portfolio=None, project=None, is_workspace_level=None, team=None, workspace=None, time_periods=None):  # noqa: E501
    """Get goals

    Returns compact goal records. # noqa: E501

    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str
    :param portfolio: Globally unique identifier for supporting portfolio.
    :type portfolio: str
    :param project: Globally unique identifier for supporting project.
    :type project: str
    :param is_workspace_level: Filter to goals with is_workspace_level set to query value. Must be used with the workspace parameter.
    :type is_workspace_level: bool
    :param team: Globally unique identifier for the team.
    :type team: str
    :param workspace: Globally unique identifier for the workspace.
    :type workspace: str
    :param time_periods: Globally unique identifiers for the time periods.
    :type time_periods: List[str]

    :rtype: Union[GetGoals200Response, Tuple[GetGoals200Response, int], Tuple[GetGoals200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_parent_goals_for_goal(goal_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get parent goals from a goal

    Returns a compact representation of all of the parent goals of a goal. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetGoals200Response, Tuple[GetGoals200Response, int], Tuple[GetGoals200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_followers(goal_gid, add_followers_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Remove a collaborator from a goal

    Removes followers from a goal. Returns the goal the followers were removed from. Each goal can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated goal record, described above. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param add_followers_request: The followers to be removed as collaborators
    :type add_followers_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateGoal201Response, Tuple[CreateGoal201Response, int], Tuple[CreateGoal201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_followers_request = AddFollowersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_goal(goal_gid, create_goal_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a goal

    An existing goal can be updated by making a PUT request on the URL for that goal. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal record. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param create_goal_request: The updated fields for the goal.
    :type create_goal_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateGoal201Response, Tuple[CreateGoal201Response, int], Tuple[CreateGoal201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_goal_request = CreateGoalRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_goal_metric(goal_gid, update_goal_metric_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a goal metric

    Updates a goal&#39;s existing metric&#39;s &#x60;current_number_value&#x60; if one exists, otherwise responds with a 400 status code.  Returns the complete updated goal metric record. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param update_goal_metric_request: The updated fields for the goal metric.
    :type update_goal_metric_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateGoal201Response, Tuple[CreateGoal201Response, int], Tuple[CreateGoal201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_goal_metric_request = UpdateGoalMetricRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
