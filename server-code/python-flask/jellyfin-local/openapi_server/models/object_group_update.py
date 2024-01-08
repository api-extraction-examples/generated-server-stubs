from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.group_update_type import GroupUpdateType
from openapi_server import util

from openapi_server.models.group_update_type import GroupUpdateType  # noqa: E501

class ObjectGroupUpdate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, group_id=None, type=None):  # noqa: E501
        """ObjectGroupUpdate - a model defined in OpenAPI

        :param data: The data of this ObjectGroupUpdate.  # noqa: E501
        :type data: object
        :param group_id: The group_id of this ObjectGroupUpdate.  # noqa: E501
        :type group_id: str
        :param type: The type of this ObjectGroupUpdate.  # noqa: E501
        :type type: GroupUpdateType
        """
        self.openapi_types = {
            'data': object,
            'group_id': str,
            'type': GroupUpdateType
        }

        self.attribute_map = {
            'data': 'Data',
            'group_id': 'GroupId',
            'type': 'Type'
        }

        self._data = data
        self._group_id = group_id
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'ObjectGroupUpdate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ObjectGroupUpdate of this ObjectGroupUpdate.  # noqa: E501
        :rtype: ObjectGroupUpdate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> object:
        """Gets the data of this ObjectGroupUpdate.

        Gets the update data.  # noqa: E501

        :return: The data of this ObjectGroupUpdate.
        :rtype: object
        """
        return self._data

    @data.setter
    def data(self, data: object):
        """Sets the data of this ObjectGroupUpdate.

        Gets the update data.  # noqa: E501

        :param data: The data of this ObjectGroupUpdate.
        :type data: object
        """

        self._data = data

    @property
    def group_id(self) -> str:
        """Gets the group_id of this ObjectGroupUpdate.

        Gets the group identifier.  # noqa: E501

        :return: The group_id of this ObjectGroupUpdate.
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: str):
        """Sets the group_id of this ObjectGroupUpdate.

        Gets the group identifier.  # noqa: E501

        :param group_id: The group_id of this ObjectGroupUpdate.
        :type group_id: str
        """

        self._group_id = group_id

    @property
    def type(self) -> GroupUpdateType:
        """Gets the type of this ObjectGroupUpdate.


        :return: The type of this ObjectGroupUpdate.
        :rtype: GroupUpdateType
        """
        return self._type

    @type.setter
    def type(self, type: GroupUpdateType):
        """Sets the type of this ObjectGroupUpdate.


        :param type: The type of this ObjectGroupUpdate.
        :type type: GroupUpdateType
        """

        self._type = type
