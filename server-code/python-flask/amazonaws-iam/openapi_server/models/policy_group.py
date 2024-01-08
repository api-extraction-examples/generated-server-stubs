from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PolicyGroup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group_name=None, group_id=None):  # noqa: E501
        """PolicyGroup - a model defined in OpenAPI

        :param group_name: The group_name of this PolicyGroup.  # noqa: E501
        :type group_name: str
        :param group_id: The group_id of this PolicyGroup.  # noqa: E501
        :type group_id: str
        """
        self.openapi_types = {
            'group_name': str,
            'group_id': str
        }

        self.attribute_map = {
            'group_name': 'GroupName',
            'group_id': 'GroupId'
        }

        self._group_name = group_name
        self._group_id = group_id

    @classmethod
    def from_dict(cls, dikt) -> 'PolicyGroup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PolicyGroup of this PolicyGroup.  # noqa: E501
        :rtype: PolicyGroup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group_name(self) -> str:
        """Gets the group_name of this PolicyGroup.


        :return: The group_name of this PolicyGroup.
        :rtype: str
        """
        return self._group_name

    @group_name.setter
    def group_name(self, group_name: str):
        """Sets the group_name of this PolicyGroup.


        :param group_name: The group_name of this PolicyGroup.
        :type group_name: str
        """

        self._group_name = group_name

    @property
    def group_id(self) -> str:
        """Gets the group_id of this PolicyGroup.


        :return: The group_id of this PolicyGroup.
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: str):
        """Sets the group_id of this PolicyGroup.


        :param group_id: The group_id of this PolicyGroup.
        :type group_id: str
        """

        self._group_id = group_id