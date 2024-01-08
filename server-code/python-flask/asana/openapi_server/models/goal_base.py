from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GoalBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, due_on=None, html_notes=None, is_workspace_level=None, liked=None, name=None, notes=None, start_on=None, status=None):  # noqa: E501
        """GoalBase - a model defined in OpenAPI

        :param gid: The gid of this GoalBase.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this GoalBase.  # noqa: E501
        :type resource_type: str
        :param due_on: The due_on of this GoalBase.  # noqa: E501
        :type due_on: str
        :param html_notes: The html_notes of this GoalBase.  # noqa: E501
        :type html_notes: str
        :param is_workspace_level: The is_workspace_level of this GoalBase.  # noqa: E501
        :type is_workspace_level: bool
        :param liked: The liked of this GoalBase.  # noqa: E501
        :type liked: bool
        :param name: The name of this GoalBase.  # noqa: E501
        :type name: str
        :param notes: The notes of this GoalBase.  # noqa: E501
        :type notes: str
        :param start_on: The start_on of this GoalBase.  # noqa: E501
        :type start_on: str
        :param status: The status of this GoalBase.  # noqa: E501
        :type status: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'due_on': str,
            'html_notes': str,
            'is_workspace_level': bool,
            'liked': bool,
            'name': str,
            'notes': str,
            'start_on': str,
            'status': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'due_on': 'due_on',
            'html_notes': 'html_notes',
            'is_workspace_level': 'is_workspace_level',
            'liked': 'liked',
            'name': 'name',
            'notes': 'notes',
            'start_on': 'start_on',
            'status': 'status'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._due_on = due_on
        self._html_notes = html_notes
        self._is_workspace_level = is_workspace_level
        self._liked = liked
        self._name = name
        self._notes = notes
        self._start_on = start_on
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'GoalBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GoalBase of this GoalBase.  # noqa: E501
        :rtype: GoalBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this GoalBase.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this GoalBase.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this GoalBase.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this GoalBase.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this GoalBase.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this GoalBase.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this GoalBase.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this GoalBase.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def due_on(self) -> str:
        """Gets the due_on of this GoalBase.

        The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.  # noqa: E501

        :return: The due_on of this GoalBase.
        :rtype: str
        """
        return self._due_on

    @due_on.setter
    def due_on(self, due_on: str):
        """Sets the due_on of this GoalBase.

        The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.  # noqa: E501

        :param due_on: The due_on of this GoalBase.
        :type due_on: str
        """

        self._due_on = due_on

    @property
    def html_notes(self) -> str:
        """Gets the html_notes of this GoalBase.

        The notes of the goal with formatting as HTML.  # noqa: E501

        :return: The html_notes of this GoalBase.
        :rtype: str
        """
        return self._html_notes

    @html_notes.setter
    def html_notes(self, html_notes: str):
        """Sets the html_notes of this GoalBase.

        The notes of the goal with formatting as HTML.  # noqa: E501

        :param html_notes: The html_notes of this GoalBase.
        :type html_notes: str
        """

        self._html_notes = html_notes

    @property
    def is_workspace_level(self) -> bool:
        """Gets the is_workspace_level of this GoalBase.

        *Conditional*. This property is only present when the `workspace` provided is an organization. Whether the goal belongs to the `workspace` (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.  # noqa: E501

        :return: The is_workspace_level of this GoalBase.
        :rtype: bool
        """
        return self._is_workspace_level

    @is_workspace_level.setter
    def is_workspace_level(self, is_workspace_level: bool):
        """Sets the is_workspace_level of this GoalBase.

        *Conditional*. This property is only present when the `workspace` provided is an organization. Whether the goal belongs to the `workspace` (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.  # noqa: E501

        :param is_workspace_level: The is_workspace_level of this GoalBase.
        :type is_workspace_level: bool
        """

        self._is_workspace_level = is_workspace_level

    @property
    def liked(self) -> bool:
        """Gets the liked of this GoalBase.

        True if the goal is liked by the authorized user, false if not.  # noqa: E501

        :return: The liked of this GoalBase.
        :rtype: bool
        """
        return self._liked

    @liked.setter
    def liked(self, liked: bool):
        """Sets the liked of this GoalBase.

        True if the goal is liked by the authorized user, false if not.  # noqa: E501

        :param liked: The liked of this GoalBase.
        :type liked: bool
        """

        self._liked = liked

    @property
    def name(self) -> str:
        """Gets the name of this GoalBase.

        The name of the goal.  # noqa: E501

        :return: The name of this GoalBase.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this GoalBase.

        The name of the goal.  # noqa: E501

        :param name: The name of this GoalBase.
        :type name: str
        """

        self._name = name

    @property
    def notes(self) -> str:
        """Gets the notes of this GoalBase.

        Free-form textual information associated with the goal (i.e. its description).  # noqa: E501

        :return: The notes of this GoalBase.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes: str):
        """Sets the notes of this GoalBase.

        Free-form textual information associated with the goal (i.e. its description).  # noqa: E501

        :param notes: The notes of this GoalBase.
        :type notes: str
        """

        self._notes = notes

    @property
    def start_on(self) -> str:
        """Gets the start_on of this GoalBase.

        The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.  # noqa: E501

        :return: The start_on of this GoalBase.
        :rtype: str
        """
        return self._start_on

    @start_on.setter
    def start_on(self, start_on: str):
        """Sets the start_on of this GoalBase.

        The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.  # noqa: E501

        :param start_on: The start_on of this GoalBase.
        :type start_on: str
        """

        self._start_on = start_on

    @property
    def status(self) -> str:
        """Gets the status of this GoalBase.

        The current status of this goal. When the goal is open, its status can be `green`, `yellow`, and `red` to reflect \"On Track\", \"At Risk\", and \"Off Track\", respectively. When the goal is closed, the value can be `missed`, `achieved`, `partial`, or `dropped`. *Note* you can only write to this property if `metric` is set.  # noqa: E501

        :return: The status of this GoalBase.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this GoalBase.

        The current status of this goal. When the goal is open, its status can be `green`, `yellow`, and `red` to reflect \"On Track\", \"At Risk\", and \"Off Track\", respectively. When the goal is closed, the value can be `missed`, `achieved`, `partial`, or `dropped`. *Note* you can only write to this property if `metric` is set.  # noqa: E501

        :param status: The status of this GoalBase.
        :type status: str
        """

        self._status = status
