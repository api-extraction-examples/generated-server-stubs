import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_supporting_relationship_request import AddSupportingRelationshipRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_goal_relationship200_response import GetGoalRelationship200Response  # noqa: E501
from openapi_server.models.get_goal_relationships200_response import GetGoalRelationships200Response  # noqa: E501
from openapi_server.models.remove_supporting_relationship_request import RemoveSupportingRelationshipRequest  # noqa: E501
from openapi_server.models.update_goal_relationship_request import UpdateGoalRelationshipRequest  # noqa: E501
from openapi_server import util


def add_supporting_relationship(goal_gid, add_supporting_relationship_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Add a supporting goal relationship

    Creates a goal relationship by adding a supporting resource to a given goal.  Returns the newly created goal relationship record. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param add_supporting_relationship_request: The supporting resource to be added to the goal
    :type add_supporting_relationship_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetGoalRelationship200Response, Tuple[GetGoalRelationship200Response, int], Tuple[GetGoalRelationship200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_supporting_relationship_request = AddSupportingRelationshipRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_goal_relationship(goal_relationship_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a goal relationship

    Returns the complete updated goal relationship record for a single goal relationship. # noqa: E501

    :param goal_relationship_gid: Globally unique identifier for the goal relationship.
    :type goal_relationship_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetGoalRelationship200Response, Tuple[GetGoalRelationship200Response, int], Tuple[GetGoalRelationship200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_goal_relationships(supported_goal, opt_pretty=None, opt_fields=None, resource_subtype=None):  # noqa: E501
    """Get goal relationships

    Returns compact goal relationship records. # noqa: E501

    :param supported_goal: Globally unique identifier for the supported goal in the goal relationship.
    :type supported_goal: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param resource_subtype: If provided, filter to goal relationships with a given resource_subtype.
    :type resource_subtype: str

    :rtype: Union[GetGoalRelationships200Response, Tuple[GetGoalRelationships200Response, int], Tuple[GetGoalRelationships200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_supporting_relationship(goal_gid, remove_supporting_relationship_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Removes a supporting goal relationship

    Removes a goal relationship for a given parent goal. # noqa: E501

    :param goal_gid: Globally unique identifier for the goal.
    :type goal_gid: str
    :param remove_supporting_relationship_request: The supporting resource to be removed from the goal
    :type remove_supporting_relationship_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_supporting_relationship_request = RemoveSupportingRelationshipRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_goal_relationship(goal_relationship_gid, update_goal_relationship_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a goal relationship

    An existing goal relationship can be updated by making a PUT request on the URL for that goal relationship. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal relationship record. # noqa: E501

    :param goal_relationship_gid: Globally unique identifier for the goal relationship.
    :type goal_relationship_gid: str
    :param update_goal_relationship_request: The updated fields for the goal relationship.
    :type update_goal_relationship_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetGoalRelationship200Response, Tuple[GetGoalRelationship200Response, int], Tuple[GetGoalRelationship200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_goal_relationship_request = UpdateGoalRelationshipRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
