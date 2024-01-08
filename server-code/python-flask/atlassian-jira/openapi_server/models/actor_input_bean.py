from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ActorInputBean(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group=None, group_id=None, user=None):  # noqa: E501
        """ActorInputBean - a model defined in OpenAPI

        :param group: The group of this ActorInputBean.  # noqa: E501
        :type group: List[str]
        :param group_id: The group_id of this ActorInputBean.  # noqa: E501
        :type group_id: List[str]
        :param user: The user of this ActorInputBean.  # noqa: E501
        :type user: List[str]
        """
        self.openapi_types = {
            'group': List[str],
            'group_id': List[str],
            'user': List[str]
        }

        self.attribute_map = {
            'group': 'group',
            'group_id': 'groupId',
            'user': 'user'
        }

        self._group = group
        self._group_id = group_id
        self._user = user

    @classmethod
    def from_dict(cls, dikt) -> 'ActorInputBean':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ActorInputBean of this ActorInputBean.  # noqa: E501
        :rtype: ActorInputBean
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group(self) -> List[str]:
        """Gets the group of this ActorInputBean.

        The name of the group to add as a default actor. This parameter cannot be used with the `groupId` parameter. As a group's name can change,use of `groupId` is recommended. This parameter accepts a comma-separated list. For example, `\"group\":[\"project-admin\", \"jira-developers\"]`.  # noqa: E501

        :return: The group of this ActorInputBean.
        :rtype: List[str]
        """
        return self._group

    @group.setter
    def group(self, group: List[str]):
        """Sets the group of this ActorInputBean.

        The name of the group to add as a default actor. This parameter cannot be used with the `groupId` parameter. As a group's name can change,use of `groupId` is recommended. This parameter accepts a comma-separated list. For example, `\"group\":[\"project-admin\", \"jira-developers\"]`.  # noqa: E501

        :param group: The group of this ActorInputBean.
        :type group: List[str]
        """

        self._group = group

    @property
    def group_id(self) -> List[str]:
        """Gets the group_id of this ActorInputBean.

        The ID of the group to add as a default actor. This parameter cannot be used with the `group` parameter This parameter accepts a comma-separated list. For example, `\"groupId\":[\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\", \"0c011f85-69ed-49c4-a801-3b18d0f771bc\"]`.  # noqa: E501

        :return: The group_id of this ActorInputBean.
        :rtype: List[str]
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: List[str]):
        """Sets the group_id of this ActorInputBean.

        The ID of the group to add as a default actor. This parameter cannot be used with the `group` parameter This parameter accepts a comma-separated list. For example, `\"groupId\":[\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\", \"0c011f85-69ed-49c4-a801-3b18d0f771bc\"]`.  # noqa: E501

        :param group_id: The group_id of this ActorInputBean.
        :type group_id: List[str]
        """

        self._group_id = group_id

    @property
    def user(self) -> List[str]:
        """Gets the user of this ActorInputBean.

        The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, `\"user\":[\"5b10a2844c20165700ede21g\", \"5b109f2e9729b51b54dc274d\"]`.  # noqa: E501

        :return: The user of this ActorInputBean.
        :rtype: List[str]
        """
        return self._user

    @user.setter
    def user(self, user: List[str]):
        """Sets the user of this ActorInputBean.

        The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, `\"user\":[\"5b10a2844c20165700ede21g\", \"5b109f2e9729b51b54dc274d\"]`.  # noqa: E501

        :param user: The user of this ActorInputBean.
        :type user: List[str]
        """

        self._user = user
