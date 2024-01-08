from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectRoleGroup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, display_name=None, group_id=None, name=None):  # noqa: E501
        """ProjectRoleGroup - a model defined in OpenAPI

        :param display_name: The display_name of this ProjectRoleGroup.  # noqa: E501
        :type display_name: str
        :param group_id: The group_id of this ProjectRoleGroup.  # noqa: E501
        :type group_id: str
        :param name: The name of this ProjectRoleGroup.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'display_name': str,
            'group_id': str,
            'name': str
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'group_id': 'groupId',
            'name': 'name'
        }

        self._display_name = display_name
        self._group_id = group_id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectRoleGroup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectRoleGroup of this ProjectRoleGroup.  # noqa: E501
        :rtype: ProjectRoleGroup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def display_name(self) -> str:
        """Gets the display_name of this ProjectRoleGroup.

        The display name of the group.  # noqa: E501

        :return: The display_name of this ProjectRoleGroup.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name: str):
        """Sets the display_name of this ProjectRoleGroup.

        The display name of the group.  # noqa: E501

        :param display_name: The display_name of this ProjectRoleGroup.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def group_id(self) -> str:
        """Gets the group_id of this ProjectRoleGroup.

        The ID of the group.  # noqa: E501

        :return: The group_id of this ProjectRoleGroup.
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: str):
        """Sets the group_id of this ProjectRoleGroup.

        The ID of the group.  # noqa: E501

        :param group_id: The group_id of this ProjectRoleGroup.
        :type group_id: str
        """

        self._group_id = group_id

    @property
    def name(self) -> str:
        """Gets the name of this ProjectRoleGroup.

        The name of the group. As a group's name can change, use of `groupId` is recommended to identify the group.  # noqa: E501

        :return: The name of this ProjectRoleGroup.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ProjectRoleGroup.

        The name of the group. As a group's name can change, use of `groupId` is recommended to identify the group.  # noqa: E501

        :param name: The name of this ProjectRoleGroup.
        :type name: str
        """

        self._name = name