from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_duplicate_request_schedule_dates import ProjectDuplicateRequestScheduleDates
from openapi_server import util

from openapi_server.models.project_duplicate_request_schedule_dates import ProjectDuplicateRequestScheduleDates  # noqa: E501

class ProjectDuplicateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, include=None, name=None, schedule_dates=None, team=None):  # noqa: E501
        """ProjectDuplicateRequest - a model defined in OpenAPI

        :param include: The include of this ProjectDuplicateRequest.  # noqa: E501
        :type include: str
        :param name: The name of this ProjectDuplicateRequest.  # noqa: E501
        :type name: str
        :param schedule_dates: The schedule_dates of this ProjectDuplicateRequest.  # noqa: E501
        :type schedule_dates: ProjectDuplicateRequestScheduleDates
        :param team: The team of this ProjectDuplicateRequest.  # noqa: E501
        :type team: str
        """
        self.openapi_types = {
            'include': str,
            'name': str,
            'schedule_dates': ProjectDuplicateRequestScheduleDates,
            'team': str
        }

        self.attribute_map = {
            'include': 'include',
            'name': 'name',
            'schedule_dates': 'schedule_dates',
            'team': 'team'
        }

        self._include = include
        self._name = name
        self._schedule_dates = schedule_dates
        self._team = team

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectDuplicateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectDuplicateRequest of this ProjectDuplicateRequest.  # noqa: E501
        :rtype: ProjectDuplicateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def include(self) -> str:
        """Gets the include of this ProjectDuplicateRequest.

        The elements that will be duplicated to the new project. Tasks are always included.  # noqa: E501

        :return: The include of this ProjectDuplicateRequest.
        :rtype: str
        """
        return self._include

    @include.setter
    def include(self, include: str):
        """Sets the include of this ProjectDuplicateRequest.

        The elements that will be duplicated to the new project. Tasks are always included.  # noqa: E501

        :param include: The include of this ProjectDuplicateRequest.
        :type include: str
        """
        allowed_values = ["members", "notes", "forms", "task_notes", "task_assignee", "task_subtasks", "task_attachments", "task_dates", "task_dependencies", "task_followers", "task_tags", "task_projects"]  # noqa: E501
        if include not in allowed_values:
            raise ValueError(
                "Invalid value for `include` ({0}), must be one of {1}"
                .format(include, allowed_values)
            )

        self._include = include

    @property
    def name(self) -> str:
        """Gets the name of this ProjectDuplicateRequest.

        The name of the new project.  # noqa: E501

        :return: The name of this ProjectDuplicateRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ProjectDuplicateRequest.

        The name of the new project.  # noqa: E501

        :param name: The name of this ProjectDuplicateRequest.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def schedule_dates(self) -> ProjectDuplicateRequestScheduleDates:
        """Gets the schedule_dates of this ProjectDuplicateRequest.


        :return: The schedule_dates of this ProjectDuplicateRequest.
        :rtype: ProjectDuplicateRequestScheduleDates
        """
        return self._schedule_dates

    @schedule_dates.setter
    def schedule_dates(self, schedule_dates: ProjectDuplicateRequestScheduleDates):
        """Sets the schedule_dates of this ProjectDuplicateRequest.


        :param schedule_dates: The schedule_dates of this ProjectDuplicateRequest.
        :type schedule_dates: ProjectDuplicateRequestScheduleDates
        """

        self._schedule_dates = schedule_dates

    @property
    def team(self) -> str:
        """Gets the team of this ProjectDuplicateRequest.

        Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.  # noqa: E501

        :return: The team of this ProjectDuplicateRequest.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this ProjectDuplicateRequest.

        Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.  # noqa: E501

        :param team: The team of this ProjectDuplicateRequest.
        :type team: str
        """

        self._team = team